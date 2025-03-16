package Threading;

public class Thread_sync {
    public static void main(String[] args) {

        Sequence s1 = new Sequence();
        int val =s1.getNext();
        System.out.println(val);

        Tasky t1 = new Tasky(s1);
        t1.start();

        Tasky t2 = new Tasky(s1);
        t2.start();


    }
}
class Tasky extends Thread{

    Sequence seq=null;
    public Tasky(Sequence seq){
        this.seq=seq;
    }
    public void run(){

        for(int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"got value"+seq.getNext());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Sequence{
    private int number=0;

    public int getNext(){
        synchronized (this){  //this is
            number++;
            return number;
        }

    }
}
