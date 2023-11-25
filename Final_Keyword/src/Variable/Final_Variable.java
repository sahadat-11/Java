// Java Program to Demonstrate Re-assigning
// Final Variable will throw Compile-time Error

// Main class
class GFG {

    // Declaring and customly initializing
    // static final variable
    static final int CAPACITY = 4;

    // Main driver method
    public static void main(String args[])
    {

        // Re-assigning final variable
        // will throw compile-time error
        CAPACITY = 5;
    }
}
// error