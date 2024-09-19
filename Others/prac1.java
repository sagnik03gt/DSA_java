package Others;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the max limit: ");
        int limit=sc.nextInt();
        printPosNegZeros(limit);

    }
    static void printPosNegZeros(int limit){
        int pos=0,neg=0,zero=0;
        for(int i=0;i<limit;i++){
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();

            if(num>0){
                pos++;
            } else if (num<0) {
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println(pos+" are positive, "+neg+" are negative, "+zero+" are zeroes");
    }
}
