// A simple program to Test Interface default
// methods in java
interface TestInterface
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}

class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);

        // default method executed
        d.show();
    }
}




// Define an interface with a default method
interface MyInterface {
    // Abstract method
    void myMethod();

    // Default method with a default implementation
    default void defaultMethod() {
        System.out.println("Default implementation of defaultMethod");
    }
}

// Implementing the interface in a class
class MyClass implements MyInterface {
    // Provide concrete implementation for the abstract method
    public void myMethod() {
        System.out.println("Implementing myMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the implementing class
        MyClass myObject = new MyClass();

        // Call the implemented method
        myObject.myMethod();

        // Call the default method provided by the interface
        myObject.defaultMethod();
    }
}




// A simple Java program to demonstrate multiple
// inheritance through default methods.
interface TestInterface1
{
    // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2
{
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}

// Implementation class code
class TestClass implements TestInterface1, TestInterface2
{
    // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface1.super.show();

        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface2.super.show();
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.show();
    }
}


