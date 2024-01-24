public class largestnumber {

    public static void main(String args[]) {
        int num1=10;
        int num2=6;
        int num3=8;
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("greatest number: "+num1);
            }
            else{
                System.out.println("greatest number: "+num3);
            }
        }
        else{
            if(num2>num3)
            {
                System.out.println("greatest number: "+num2);
            }
            else{
                System.out.println("greatest number: "+num3);
            }
        }

    }
}
