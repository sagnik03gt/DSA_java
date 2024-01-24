package arrays;
import java.util.*;
public class selection_sort {
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

        for(int i=0;i<=n-2;i++)
        {
            int mini=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini=j;
                }
                int temp;
                temp=arr[mini];
                arr[mini]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("selection sort");
        System.out.println(Arrays.toString(arr));

    }
}
