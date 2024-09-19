package Threading;

import javax.sound.midi.Track;

public class Thread_prac {
    public static void main(String[] args) {

        Task t1 = new Task("Thread-A");
        t1.start();

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
