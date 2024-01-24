
import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        digit(n);

    }
    static void digit(int n){
        int sum=0;
        int count=0;
        while(n>0){
            int ld =n%10;
            count++;
            n=n/10;
            System.out.println(ld+" ");
            sum=sum+ld;
        }
        System.out.println("sumof the digits: "+sum);
        System.out.println("noof the digits: "+count);

    }
}
