import java.util.Arrays;

public class func {
    public static void main(String[] args) {
        retireage(42);
        fun(1,2,2,3,6,8,6,8,6,5);
        boolean prime=isPrime(58);
        System.out.println(prime);
    }
    static void retireage(int age)
    {
        int retage=60;
        int remage=retage-age;
        System.out.println("his retirement will be within "+remage+" years");

    }
    static void fun(int ...v)//v is a variable length arguments
            // variable length arguments always will be the last argument
    {
        System.out.println(Arrays.toString(v));
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n %c == 0) {
                return false;
            }
            c++;
        }
        return c*c > n;

    }
}
