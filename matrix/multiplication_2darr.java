package matrix;

import java.util.Scanner;

public class multiplication_2darr {
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

mul(md_arr1,md_arr2,row,col);

    }

    //multiplication works 1st array's 1st row * 2nd array's 1st and 2nd and 3rd column and so on...
    static void mul(int[][] a,int[][] b,int row,int col){

        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                int sum=0;
                for(int k=0;k<row;k++){
                    sum += (a[i][k]*b[k][j]);
                }
                System.out.println(sum);
            }

        }
    }
}
