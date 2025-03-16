package Threading;

import java.util.ArrayList;
import java.util.List;

public class Prod_Cons_APP {
    public static void main(String[] args) {

        List <Integer> questionList=new ArrayList<>();

        Thread t1 = new Thread(new Producer(questionList));
        Thread t2 = new Thread(new Consumer(questionList));

        t1.start();
        t2.start();

    }
}

class Producer implements Runnable{
    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNo;

    Object myObject = new Object();

    public Producer(List<Integer> questionList){
        this.questionList=questionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {
        synchronized (questionList){
            while(questionList.size() == LIMIT){
                System.out.println("Questio have pilled up...");
                questionList.wait();
            }
        }
        synchronized (questionList){
            System.out.println("New Question: "+questionNo);
            questionList.add(questionNo);
            Thread.sleep(100);
            questionList.notify();
        }
    }

    @Override
    public void run() {

        while(true){
            try{
                readQuestion(questionNo++);
            }catch (InterruptedException e){

            }
        }
    }
}



class Consumer implements Runnable{
    List<Integer> questionList = null;

    public Consumer(List<Integer> questionList){
        this.questionList=questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList){
            while(questionList.isEmpty()){
                System.out.println("No question to answer..");
                questionList.wait();
            }
        }
        synchronized (questionList){
            Thread.sleep(5000);
            System.out.println("Answered question: "+questionList.remove(0));
            questionList.notify();
        }
    }

    @Override
    public void run() {

        while(true){
            try{
                answerQuestion();
            }catch (InterruptedException e){

            }
        }
    }
}