public class oops {
    class A{
        int a=45;
        int b=98;
        int c=30;
        void result(int a,int b,int c)
        {
            int sum=a+b+c;
            System.out.println("Total marks is: "+sum);
        }

    }
    class B extends A{
        int student;
        int a=45;
        int b=98;
        int c=30;
//        result(a,b,c);
    }
}
