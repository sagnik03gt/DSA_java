package Others;


abstract class abs{
    abstract void m1();

    public void m2(){
        System.out.println("this is a concrete method");
    }
}
class nrm1 extends abs{
    @Override
    void m1() {
        System.out.println("this is abstract overridden method m1");
    }
}
public class abstraction1 {
    public static void main(String[] args) {

        nrm1 n1 = new nrm1();
        n1.m1();
        n1.m2();
    }
}
