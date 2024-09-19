package stack;

import java.util.ArrayList;
import java.util.Scanner;



public class stack_opt {

    static void push(ArrayList stack,int value){
        int index=0;
        stack.add(index,value);
        index++;
        System.out.println(value+" pushed");

    }
    static void print(ArrayList stack){

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max=5;
        ArrayList stack = new ArrayList(max);

        push(stack,1);


    }
}
