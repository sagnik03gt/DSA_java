package string;
import java.util.Scanner;


public class basics {

    static int getLength(char ch[]){
        int count =0;
        for(int i=0;ch[i]!='\0';i++){
           count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("enter a name: ");
        s=sc.next();
        char[] ch = s.toCharArray();
        System.out.println(s);
        int length = getLength(ch);
        System.out.println(length);
    }
}
