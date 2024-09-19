package string;

import java.util.Scanner;

public class replaceI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println("original: "+s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                s=s.replace('e','i');
            }
        }
        System.out.println("newString: "+s);
    }
}
