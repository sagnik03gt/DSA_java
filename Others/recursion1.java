import java.util.Scanner;

public class recursion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    static void print(int n) {
        System.out.println("sagnik");
        n++;
        if(n<=5)
        {
            print(n);
        }
    }

}
