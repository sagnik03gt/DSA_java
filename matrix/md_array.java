package matrix;
import java.util.*;


public class md_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] md_arr = new int[row][col];

        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                md_arr[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(md_arr[i][j]+" ");
            }
            System.out.println();
        }

        int x = sc.nextInt();
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(md_arr[i][j]== x) {
                    System.out.print(x +" is at "+i+","+j+" th index");
                }
            }
        }

    }

}
