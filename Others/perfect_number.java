import java.util.*;
public class perfect_number {
    public static void main(String[] args) {
        divisor(256);
    }
    static void divisor(int number){

        ArrayList<Integer> divArray = new ArrayList<>();
        for(int i =1;i<number;i++){

            if(number%i==0){
                 divArray.add(i);
            }
            
        }
        System.out.println(divArray.toString());
        int perfectsum = 0;
        for(int i =0;i<divArray.size();i++){
            perfectsum+= divArray.get(i);
        }
        System.out.println(perfectsum);

        if(perfectsum == number){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("NOt perfect number");
        }
        
    }
}
