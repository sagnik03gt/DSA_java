import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class recursion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        f(a,0,4);
        System.out.println(Arrays.toString(a));


    }
    static void f(int[] a,int l,int r)
    {

//        int[] a = new int[5];
        if(l<r)
        {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
        }
        if(l>=r)
        {
            return;
        }
        f(a,1,r-1);
    }
}
