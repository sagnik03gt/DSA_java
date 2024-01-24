package matrix;

import java.util.Scanner;

public class maxin_row {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();


        int[][] md_arr1 = new int[row][col];

        System.out.println("enter 1st array element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                md_arr1[i][j] = sc.nextInt();
            }
        }

       maxsum(md_arr1,row,col);
    }
    static void maxsum(int[][] arr,int row,int col){
        for(int i =0;i<row;i++){
            int max= 0;
            for(int j=0;j<=col-1;j++){
                max=Math.max(max,arr[i][j]);
            }
            System.out.println("max element at"+i+"th row is: "+max);
        }
    }
}
