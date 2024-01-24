public class backtracking {
    public static void main(String[] args) {
        int n=3;
        f(n,n);

    }
    static void f(int i,int n)
    {
        if(i<1)
        {
            return;
        }
        f(i-1,n);
        System.out.println(i);
    }
    //here we first f(3,3) then it will call f(2,3) then again it
    //will call f(1,3) then again it will call f(0,3) now it will check
    // that i is less than 1 or not and yes it is so it will return
    // to the previous function and execute the remainng part and print i=1
    // then again it will back to its previous function and print i=2 and
    // back to the previous call and print i=3.
    //output: 1 2 3(by backtracking)
}
