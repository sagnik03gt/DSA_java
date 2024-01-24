public class constructor {
    // Java Program to demonstrate
// Constructor
        // Constructor
        constructor()
        {
//            super(); //refers to the parent Object class
//            (The first line of a constructor is a call to super() or this(), (a call to a constructor of a super-class or an overloaded constructor)
//            , if you don’t type in the call to super in your constructor the compiler will provide you with a non-argument call to super at the first line of your code
//            , the super constructor must be called to create an object:)
            System.out.println("Constructor Called");
        }

        // main function
        public static void main(String[] args)
        {
            constructor geek = new constructor();
        }
    }


