
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        palindrome(n);


    }
    static void palindrome(int n) {
        int revsum = 0;
        int dup=n;
        while (n > 0) {
            int ld = n % 10;
            revsum = (revsum * 10) + ld;
            n = n / 10;
            System.out.println(ld + " ");
        }
        System.out.println(revsum);
        if(revsum==dup)
        {
            System.out.println("it is a palindrome number");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
