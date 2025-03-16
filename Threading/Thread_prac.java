package Threading;

import javax.sound.midi.Track;

public class Thread_prac {
    public static void main(String[] args) {

        Task t1 = new Task("Thread-A");
        t1.start();

        Work w1 = new Work();

        Thread t3 = new Thread(w1);
        t3.start();

        Task t2 = new Task("Thread-B");
        t2.start();
        System.out.println("Hello World!");
    }

}
class Task extends Thread{

    String name;
    public Task(String name){
        this.name=name;
    }

    public void run(){
        Thread.currentThread().setName(this.name);
        for(int i=0;i<=100;i++){
            System.out.println("Number: "+i+Thread.currentThread().getName());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Work implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<=50;i++){
            System.out.println("i am runnable thread");
        }
    }
}
