public class prime {
    public static void main(String[] args) {
        int n = 20;
    boolean ans = isPrime(n);
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non-Prime Number");
    }

    }
    static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++){
        if(n%i==0)
        {
            return true;
        }
        }
         return false;
        
    
    }
}
