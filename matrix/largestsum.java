package matrix;

import java.util.Scanner;

public class largestsum {
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

        largestsum(md_arr,col,row);
    }
    static void largestsum(int [][] arr,int col,int row){

        int max = 0;
        for(int i=0;i<row;i++){
            int sum = 0;
            for(int j=0;j<col;j++){
                sum += arr[i][j];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
