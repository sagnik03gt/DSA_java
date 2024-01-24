import java.math.*;
public class armstrong2 {
    public static void main(String[] args) {

        // int dig = no_of_digit(1250);
        // System.out.println(dig);
        int number = 153;

        int armstrongsum = armsum(number);
        System.out.println(armstrongsum);
        
        if(armstrongsum == number){
            System.out.println("this is an armstrong number");
        }
        else{
            System.out.println("this is not an armstrong number");
        }

        }   
        
    static int armsum(int number){

        int dig = no_of_digit(number);
        int armstrongsum = 0;
        int digi=0;
        while(number>0){
         digi = number%10;
        number=number/10;
        armstrongsum += Math.pow(digi, dig);
       
        // System.out.println(armstrongsum);
        // System.out.println(digi);
        }
        // System.out.println(dig);
        // System.out.println(digi);
        return armstrongsum;

    }
        
    
    static int no_of_digit(int number){

        int nodig = 0;
        while(number>0){
        int digit = number%10;
        nodig++;
        number=number/10;
        }
        return nodig;

    }
}
    
    // static void armstrong(int number){
    //     int digit = number%10;
    //     number=number/10;
    //     System.out.println(digit);
    // }

