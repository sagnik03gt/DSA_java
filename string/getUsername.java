package string;

import java.util.Scanner;

public class getUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email=sc.next();
        System.out.println("Email: "+email);
        String username="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                username=email.substring(0,i);
            }
        }
        System.out.println("Username: "+username);
    }
}
