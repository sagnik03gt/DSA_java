package Others;

public class max_min {
    public static void main(String[] args) {
        maxdigit(25);
    }
    static void maxdigit(int number){
    
        int maxdigit=0;
        int digit;
        while(number>0){

         digit = number%10;
        maxdigit = Math.max(maxdigit, digit);
        }

        System.out.println(maxdigit);
        
    }
}
