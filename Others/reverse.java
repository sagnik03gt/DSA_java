public class reverse {
    public static void main(String[] args) {
        int n=78561;
        reverse(n);

    }
    static void reverse(int n) {
        int revsum = 0;
        while (n > 0) {
            int ld = n % 10;
            revsum = (revsum * 10) + ld;
            n = n / 10;
            System.out.println(ld + " ");

        }
        System.out.println("reverse of the number: "+revsum);
    }
}
