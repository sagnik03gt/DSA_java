package matrix;

import java.util.Scanner;

public class spiralprint {
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

        System.out.println("spiral printing");
        spPrint(md_arr,col,row);

    }

    static void spPrint(int[][] arr,int col,int row){

        int top=0;
        int bottom = row-1;
        int left =0;
        int right = col-1;


        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.println(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.println(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.println(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(arr[i][left]+" ");
                }
                left++;
            }

        }

    }
}
