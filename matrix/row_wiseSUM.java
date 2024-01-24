package matrix;
import java.util.*;
public class row_wiseSUM {
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
        printrowsum(md_arr,col,row);
        printcolsum(md_arr,col,row);
        
    }
    static void printrowsum(int [][] arr,int col,int row){

        for(int i=0;i<row;i++){
            int sum = 0;
            for(int j=0;j<col;j++){
                 sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }

    static void printcolsum(int [][] arr,int col,int row){
        for(int i=0;i<col;i++){
            int sum = 0;
            for(int j=0;j<row;j++){
                sum += arr[j][i];
            }
            System.out.println(sum);
        }
    }
}
