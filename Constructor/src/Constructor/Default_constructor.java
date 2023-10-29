//
//// Java Program to demonstrate
//// Default Constructor
//import java.io.*;
//
//// Driver class
//class GFG {
//
//    // Default Constructor
//    GFG() { System.out.println("Default constructor"); } // we call create constructor in main class
//
//    // Driver function
//    public static void main(String[] args)
//    {
//        GFG hello = new GFG();
//    }
//}


package Constructor;
class Myclass {
    Myclass() { // constructor created
        System.out.println("This is default constructor\n");
    }
}
public class Default_constructor {
    public static void main(String[] args) {
        Myclass obj = new Myclass();// constructor called
    }
}
