package OOPs;

public class poly1 {

    void myself(int age){
        System.out.println("i am "+age+" years old");
    }

    void myself(char name,int year) {
        System.out.println("my name is " + name + " and i am in " + year + "nd year");
    }

    public static void main(String[] args) {
        poly1 p1 = new poly1();
        p1.myself(20);
        p1.myself('s',3);
    }
}

