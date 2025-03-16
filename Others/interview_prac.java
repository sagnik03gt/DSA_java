package Others;
 abstract class abs1{
    abstract void printA(int a);

    void info(){
        System.out.println("this is abstarct class");
    }
}
class nrm extends abs1{
    @Override
    void printA(int a){
        System.out.println("this is abstract method "+a);
    }
    void info(){
        System.out.println("this is normal class");
    }

}

public class interview_prac {
    public static void main(String args[]){
        nrm n = new nrm();
        n.printA(7);
        n.info();
    }
}
