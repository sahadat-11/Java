// Define an interface with a public static final variable
interface MyInterface {
    int MY_CONSTANT = 42; // Implicitly public, static, and final

    void myMethod(); // Abstract method
}

// Implementing the interface in a class
class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Implementing myMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        // Access the interface variable without creating an instance
        System.out.println("Constant value: " + MyInterface.MY_CONSTANT);

        // Attempting to modify the interface variable (results in a compilation error)
        // MyInterface.MY_CONSTANT = 99; // Error: cannot assign a value to final variable MY_CONSTANT
    }
}
