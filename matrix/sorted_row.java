package matrix;

import java.util.Scanner;
public class sorted_row {
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

        sorted(md_arr1,row,col);
    }
    static void sorted(int[][] arr,int row,int col){

        int count=0;
        for(int i =0;i<row;i++){
            boolean flag=false;
            for(int j=0;j<col-1;j++){

                if(arr[i][j]<=arr[i][j+1]){
                    flag=true;
//                    System.out.println(i+"th row is sorted");
                }

            }
            if (flag==true){
                count++;
            }
        }
        System.out.println("no of sorted rows: "+count);
    }
}
