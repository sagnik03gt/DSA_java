package Others;

abstract class abc{

    abstract void printA(int a);

    public void det(){
        System.out.println("this is abstract class");
    }
}
interface in1{
    void display(int a);
    void age(int b);
}
class in2 implements in1{

    @Override
    public void age(int b) {
        System.out.println("my age is : "+b);
    }
    @Override
    public void display(int a) {
        System.out.println("this is interface "+a);
    }
}
class xyz extends abc{
    @Override
    void printA(int x) {
        System.out.println(x);
    }
}
public class abstraction3 {
    public static void main(String[] args) {

        xyz x = new xyz();
        x.printA(5);
        x.det();

        in2 i = new in2();
        i.age(20);
        i.display(5);
    }
}
