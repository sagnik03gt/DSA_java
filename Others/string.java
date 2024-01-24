package Others;

public class string {
    public static void main(String[] args) {
        String s = "This is my class";
        char arr[]= new char[16];
        s.getChars(6,9,arr,0);
        System.out.println(arr);
    }
}
