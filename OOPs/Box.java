package OOPs;

public class Box {


    double w;
    double h;
    double l;

    Box(){
        super();
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    Box(double w,double h,double l){
        System.out.println("I AM A CONSTRUCTOR WITH 3 ARGUMENTS");
    }

    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println(box1.h+","+ box1.w+","+ box1.l);
        Box box2 = new Box(5.0);
        System.out.println(box2.h+","+ box2.w+","+ box2.l);
        Box box3 = new Box(3.2,5.1,8.1);

    }
}
