package matrix;

import java.util.Scanner;

public class addition2darr {
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

        int [][] md_arr2 = new int[row][col];
        System.out.println("enter 2nd array element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                md_arr2[i][j] = sc.nextInt();
            }
        }
        add(md_arr1,md_arr2,row,col);
    }
    static void add(int[][]a,int[][]b,int row,int col){
        for(int i =0;i<row;i++){
            int add = 0;
            for(int j=0;j<col;j++){
                add= (a[i][j]+b[i][j]);
                System.out.print(add+" ");
            }
            System.out.println();
        }

    }
}
