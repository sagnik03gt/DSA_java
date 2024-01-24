import java.util.HashSet;
import java.util.Set;

public class gcd {
    public static void main(String[] args) {

        int res=gcd(9,12);
        System.out.println(res);

    }
    static int gcd(int m,int n)
    {
        while(m>0 && n>0)
        {
            if(m>n)
            {
                m=m%n;
            }
            else {
                n=n%m;
            }
        }
        if(m==0){
            return n;
        }
        return m;
    }
}
