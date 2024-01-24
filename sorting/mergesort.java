package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class mergesort {
    static void mergesort(int a[],int low,int high)
    {
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort( a,low,mid);
        mergesort( a,mid+1,high);
        merge(a,low,mid,high);
    }
    static void merge(int a[],int low,int mid,int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(a[left]<=a[right])
            {
                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(a[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(a[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            a[i]=temp.get(i-low);
        }
//        System.out.println(Arrays.toString(a));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergesort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
