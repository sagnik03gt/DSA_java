package OOPs;

class A{
    int a;
    public void printa(int a){
        System.out.println("THIS IS A CLASS");
        System.out.println("The value of a is: "+a);
    }
}
class B extends A{
    int b;
    public void printb(int b){
        System.out.println("THIS IS B CLASS");
        System.out.println("The value of b is: "+b);
    }
}
class C extends A{
    int c;
    public void printc(int c){
        System.out.println("THIS IS C CLASS");
        System.out.println("The value of a is: "+c);
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {

        B b = new B();
        C c = new C();
        b.printb(2);
        b.printa(5);
        c.printc(7);
        c.printa(5);
    }
}
