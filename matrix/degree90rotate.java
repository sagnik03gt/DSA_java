package matrix;

import java.util.Scanner;

public class degree90rotate {
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

        int[][] ans = new int[row][col];
        ans= rotate(md_arr);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] rotation(int[][] arr,int row,int col){
        int n = arr.length;
        int[][] rotated = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                rotated[j][(n-1)-i]=arr[i][j];
            }
        }
        return rotated;
    }

    static int[][] rotate(int[][] matrix){

        int n = matrix.length;
        for(int i =0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        return matrix;

    }

}
