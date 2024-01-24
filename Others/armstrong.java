public class armstrong {
    public static void main(String[] args) {
        int n=371;
        armstrong(n);
    }
    static void armstrong(int n){
        int sum = 0;
        int dup=n;
        while (n > 0) {
            int ld = n % 10;
            sum=sum+(ld*ld*ld);
            n = n / 10;
            System.out.println(ld + " ");
        }
        System.out.println(sum);
        if(sum==dup)
        {
            System.out.println("it is a palindrome number");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
