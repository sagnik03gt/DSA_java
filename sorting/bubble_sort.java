package arrays;
import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("original array");
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-2;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
