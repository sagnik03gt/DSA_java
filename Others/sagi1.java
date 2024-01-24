import java.util.Scanner;
public class sagi1 {
    public static void main(String args[]){
        System.out.println("Good Morning!");
        Scanner input = new Scanner(System.in);
//        int rollno = input.nextInt();
//        System.out.println("your roll no is: "+rollno);
//
//        System.out.println("enter a number: ");
//        int a=input.nextInt();
//        System.out.println("enter a number: ");
//        int b=input.nextInt();
//        int c=a+b;
//        System.out.println("sum of a and b is: "+c);

        System.out.println("how many subjects do u have: ");
        int no_of_subject=input.nextInt();

        int num= (int)(45.65f);
        System.out.println(num);

        System.out.println("Enter the marks1: ");
        float a=input.nextFloat();
        System.out.println("Enter the marks2: ");
        float b=input.nextFloat();
        System.out.println("Enter the marks3: ");
        float c=input.nextFloat();
        System.out.println("Enter the marks4: ");
        float d=input.nextFloat();

        double total=a+b+c+d;
        System.out.println("Your total marks is: "+total);
        double average = total/4;
        System.out.println("Average is: "+average+"%");

        if(total<150){
            System.out.println("3rd dividion");
        }
        else if (total<220) {
            System.out.println("2nd division");
        }
        else if (total<280) {
            System.out.println("1st division");
        }
        else{
            System.out.println("Excellent");
        }

        for(int i=0;i<no_of_subject;i++)
        {
            System.out.println("enter the no of subject"+i+": ");

        }

    }

}
