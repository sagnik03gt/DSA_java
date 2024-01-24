package Others;
class A
{
    private int x= 50;
    void m1()
    {
        System.out.println(x);
    }
}
class B extends A
{

}
public class C
{
    public static void main(String args[])
    {
        A a= new B();
        a.m1();
    }
}

