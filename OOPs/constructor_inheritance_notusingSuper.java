package OOPs;

class Super {

    // Constructor of super class
    Super()
    {
        // Print statement
        System.out.println(
                "Super Class Constructor Called ");
    }
}

// Class 2
// Sub class
class child extends Super {

    // Constructor of sub class
    child()
    {

        // Print statement
        System.out.println(
                "child Class Constructor Called ");
    }
}
public class constructor_inheritance_notusingSuper {

    public static void main(String[] args)
    {

        // Creating an object of sub class
        // inside main() method
        child d = new child();

        // Note: Here first super class constructor will be
        // called there after derived(sub class) constructor
        // will be called
    }

}
