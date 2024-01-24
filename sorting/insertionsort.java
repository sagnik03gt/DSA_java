package arrays;

import java.util.*;

public class insertionsort {
    static void insertion(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && a[j-1]>a[j])
            {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;

                    j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=6;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        insertion(a,n);

    }
}
