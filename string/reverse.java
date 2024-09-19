package string;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sagnik");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char fchar = sb.charAt(front);
            char bchar=sb.charAt(back);

            sb.setCharAt(front,bchar);
            sb.setCharAt(back,fchar);
        }
        System.out.println(sb);
    }
}
