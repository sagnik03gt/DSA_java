package matrix;

import java.util.Scanner;

public class search2darray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();


        int[][] md_arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                md_arr[i][j] = sc.nextInt();
            }
        }
        int key = 45;

//        System.out.println("Wave printing");
       int ans =  search(md_arr,col,row,key);
        System.out.println("cdnskncs"+ans);
    }

    static int search(int[][] arr,int col,int row,int key){
        int start = 0;
        int end=(row*col)-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            int element = arr[mid/col][mid%col];
            if(element == key){
                return 1;
            }
            else if(key > element){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
