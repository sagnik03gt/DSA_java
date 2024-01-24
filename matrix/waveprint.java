package matrix;

import java.util.Scanner;

public class waveprint {
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

        System.out.println("Wave printing");
        wvPrint(md_arr,col,row);
    }

    static void wvPrint(int[][] arr, int col, int row) {

        for (int i = 0; i < col; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < row; j++) {
                    System.out.print(" "+arr[j][i]+" ");
                    System.out.println();
                }

            } else {
                for (int j = row - 1; j >= 0; j--) {
                    System.out.print(" "+arr[j][i]+" ");
                    System.out.println();
                }

            }
        }
    }
}
