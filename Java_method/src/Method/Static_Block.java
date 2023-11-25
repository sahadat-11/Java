//package Method;
//class test {
//    static int i;
//    static String name;
//    static {
//        i = 10;
//        name = "sahadat";
//    }
//    void display() {
//        System.out.println("id = " + i + " name = "+name);
//    }
//}
//public class Static_Block {
//    public static void main(String[] args) {
//        test ob = new test();
//        ob.display();
//    }
//}
//
//
//
//// Java Program Running on JDK version 1.6 of Previous
//// Main class
//class GFG {
//
//    // Static block
//    static
//    {
//        // Print statement
//        System.out.print(
//                "Static block can be printed without main method");
//    }
//}
//
//
//// Java Program Running on JDK version 1.6 and Later
//// Main class
//class GFG {
//
//    // Static block
//    static
//    {
//        // Print statement
//        System.out.print(
//                "Static block can be printed without main method");
//    }
//}
//
//
//// Java Program to Illustrate How Static block is Called
//
//// Class 1
//// Helper class
//class Test {
//
//    // Case 1: Static variable
//    static int i;
//    // Case 2: non-static variables
//    int j;
//
//    // Case 3: Static block
//    // Start of static block
//    static
//    {
//        i = 10;
//        System.out.println("static block called ");
//    }
//    // End of static block
//}
//
//// Class 2
//// Main class
//class GFG {
//
//    // Main driver method
//    public static void main(String args[])
//    {
//
//        // Although we don't have an object of Test, static
//        // block is called because i is being accessed in
//        // following statement.
//        System.out.println(Test.i);
//    }
//}
////static block called
////10



// Java Program to Illustrate Execution of Static Block
// Before Constructors

// Class 1
// Helper class
class Test {

    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;

    // Case 3: Static blocks
    static
    {
        i = 10;
        System.out.println("static block called ");
        System.out.println(i);
    }

    // Constructor calling
    Test() { System.out.println("Constructor called"); }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {

        // Although we have two objects, static block is
        // executed only once.
        Test t1 = new Test();
        Test t2 = new Test();
    }
}
//static block called
//10;
//Constructor called
//Constructor called





