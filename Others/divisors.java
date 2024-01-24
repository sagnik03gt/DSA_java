import java.util.HashSet;
import java.util.Scanner;
import java.lang.Math;
import java.util.Set;

public class divisors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=in.nextInt();
//        divisor(n);
        divisor_optimal(n);
    }
    static void divisor(int n)
    {
        int i;
        for(i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
    }
    static void divisor_optimal(int n)
    {
        Set<Integer> div = new HashSet<Integer>();
        int i;
        for(i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                div.add(i);
                if((n/i)!=i){
                    div.add(n/i);
                }
            }
        }
        System.out.println(div);
//        System.out.println(HashSet.sort(div));
    }
}
