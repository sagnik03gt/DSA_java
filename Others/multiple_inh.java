package Others;


interface first{
    default void me(){
        System.out.println("this is the first");
    }
}
interface second{
    default void me(){
        System.out.println("this is the second");
    }
}
public class multiple_inh implements first,second{

    @Override
    public void me() {
        first.super.me();
        second.super.me();
    }
    public void firstme(){
        first.super.me();
    }
    public void secondme(){
        second.super.me();
    }

    public static void main(String[] args) {
        multiple_inh m = new multiple_inh();
        m.me();
        System.out.println("diff");
        m.firstme();
        m.secondme();

    }
}
