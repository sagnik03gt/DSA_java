package Others;

abstract class animal{
    abstract void getType();
}
class dog extends animal{
    int legs;
    int weight;
    public dog(int legs,int weight){
        this.legs=legs;
        this.weight = weight;
    }

    @Override
    void getType() {
        System.out.println("this is a dog with "+legs+" and "+" weight is "+weight);
    }
}
class cow extends animal{
    int legs;
    int weight;
    public cow(int legs,int weight){
        this.legs=legs;
        this.weight=weight;
    }

    @Override
    void getType() {
        System.out.println("this is a domestic animal with "+legs+" and "+" weight is "+weight);
    }
}
public class abstraction2 {
    public static void main(String[] args) {
        dog d = new dog(4,40);
        cow c = new cow(4,80);

        d.getType();
        c.getType();
    }
}
