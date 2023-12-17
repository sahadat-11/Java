import java.io.*;
interface Building {
    // abstract method
    void heightDisplay();

    // static method
    static void widthDisplay()
    {
        System.out.println("width is 1");
    }
}

class GFG implements Building {
    // implementing the abstract method
    // of Building interface
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }
    public static void main(String[] args)
    {

        GFG gfg = new GFG();
        gfg.heightDisplay();
        // accessing the static method
        // by using of interface name
        Building.widthDisplay();
    }
}


// Java program to demonstrate
// static method in Interface.

interface NewInterface {

    // static method
    static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }

    // Public and abstract method of Interface
    void overrideMethod(String str);
}

// Implementation Class
public class InterfaceDemo implements NewInterface {

    public static void main(String[] args)
    {
        InterfaceDemo interfaceDemo = new InterfaceDemo();

        // Calling the static method of interface
        NewInterface.hello();

        // Calling the abstract method of interface
        interfaceDemo.overrideMethod("Hello, Override Method here");
    }

    // Implementing interface method

    @Override
    public void overrideMethod(String str)
    {
        System.out.println(str);
    }
}



// Java program to demonstrate scope
// of static method in Interface.

interface PrintDemo {

    // Static Method
    static void hello()
    {
        System.out.println("Called from Interface PrintDemo");
    }
}

public class InterfaceDemo implements PrintDemo {

    public static void main(String[] args)
    {

        // Call Interface method as Interface
        // name is preceding with method
        PrintDemo.hello();

        // Call Class static method
        hello();
    }

    // Class Static method is defined
    static void hello()
    {
        System.out.println("Called from Class");
    }
}

// Interface with a static method
interface MyInterface {
    // Abstract method
    void myMethod();

    // Static method with a default implementation
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
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
        // Call the static method without creating an instance of the interface
        MyInterface.staticMethod();

        // Create an object of the implementing class
        MyClass myObject = new MyClass();

        // Call the implemented method
        myObject.myMethod();
    }
}
