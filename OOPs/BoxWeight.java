package OOPs;

public class BoxWeight extends Box{

    double weight;

    BoxWeight(){
        this.weight=-1;
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    public static void main(String[] args) {

        BoxWeight b1 = new BoxWeight();
        System.out.println(b1.weight);
        Box b2 = new BoxWeight();  //here b2 is the reference of the Box type class so b2 can't access the properties of BoxWeight class

    }
}
