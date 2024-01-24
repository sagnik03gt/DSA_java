public class recursion2 {
    public static void main(String[] args) {
       sum(3,0);
       int a=sum2(3);
        System.out.println(a);
    }
    static void sum(int n,int sum)
    {
        if(n<1)
        {
            return;
        }
        sum(n-1,sum+n);
        return;
    }
    static int sum2(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum2(n-1);
    }
}
