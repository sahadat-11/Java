// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
abstract class Base {
    abstract void fun();
}

// Class 2
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}

// Class 3
// Main class
class Main {

    // Main driver method
    public static void main(String args[])
    {

        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}


// Java Program to Illustrate Abstract Class
// Can contain Constructors

// Class 1
// Abstract class
abstract class Base {

    // Constructor of class 1
    Base()
    {
        // Print statement
        System.out.println("Base Constructor Called");
    }

    // Abstract method inside class1
    abstract void fun();
}

// Class 2
class Derived extends Base {

    // Constructor of class2
    Derived()
    {
        System.out.println("Derived Constructor Called");
    }

    // Method of class2
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}

// Class 3
// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 2
        // inside main() method
        Derived d = new Derived();
        d.fun();
    }
}

// Java Program to illustrate Abstract class
// Without any abstract method

// Class 1
// An abstract class without any abstract method
abstract class Base {

    // Demo method. This is not an abstract method.
    void fun()
    {
        // Print message if class 1 function is called
        System.out.println(
                "Function of Base class is called");
    }
}

// Class 2
class Derived extends Base {
    // This class only inherits the Base class methods and
    // properties
}

// Class 3
class Main {

    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 2
        Derived d = new Derived();

        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
    }
}

// Java Program to Illustrate Abstract classes
// Can also have Final Methods

// Class 1
// Abstract class
abstract class Base {

    final void fun()
    {
        System.out.println("Base fun() called");
    }
}

// Class 2
class Derived extends Base {

}

// Class 3
// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        {
            // Creating object of abstract class

            Base b = new Derived();
            // Calling method on object created above
            // inside main method

            b.fun();
        }
    }
}


// Java Program to Illustrate Abstract Class

// Main class
// An abstract class
abstract class GFG {

    // Main driver method
    public static void main(String args[])
    {

        // Trying to create an object
        GFG gfg = new GFG(); // it is not possible
    }
}

// Java Program to Illustrate
// Static Methods in Abstract
// Class Can be called Independently

// Class 1
// Abstract class
abstract class Helper {

    // Abstract method
    static void demofun()
    {

        // Print statement
        System.out.println("Geeks for Geeks");
    }
}

// Class 2
// Main class extending Helper class
public class GFG extends Helper {

    // Main driver method
    public static void main(String[] args)
    {

        // Calling method inside main()
        // as defined in above class
        Helper.demofun(); // it in run without create an object
    }
}


//We can use the abstract keywordfor declaring top-level
// classes (Outer class) as well as inner classes as abstract

import java.io.*;

abstract class B {
    // declaring inner class as abstract with abstract
    // method
    abstract class C {
        abstract void myAbstractMethod();
    }
}
class D extends B {
    class E extends C {
        // implementing the abstract method
        void myAbstractMethod()
        {
            System.out.println(
                    "Inside abstract method implementation");
        }
    }
}

public class Main {

    public static void main(String args[])
    {
        // Instantiating the outer class
        D outer = new D();

        // Instantiating the inner class
        D.E inner = outer.new E();
        inner.myAbstractMethod();
    }
}


//If a class contains at least one abstract method then compulsory that we
//should declare the class as abstract otherwise we will get a compile-time error

/*package whatever //do not write package name here */

import java.io.*;

// here if we remove the abstract
// keyword then we will get compile
// time error due to abstract method
abstract class Demo {
    abstract void m1();
}

class Child extends Demo {
    public void m1()
    {
        System.out.print("Hello");
    }
}
class GFG {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.m1();
    }
}


//If the Child class is unable to provide implementation to all abstract methods
//of the Parent class then we should declare that Child class as abstract so
// that the next level Child class should provide implementation to the

// Java Program to demonstrate
// Observation
import java.io.*;

abstract class Demo {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstChild extends Demo {
    public void m1() {
        System.out.println("Inside m1");
    }
}

class SecondChild extends FirstChild {
    public void m2() {
        System.out.println("Inside m2");
    }
    public void m3() {
        System.out.println("Inside m3");
    }
}

class GFG {
    public static void main(String[] args)
    {
        // if we remove the abstract keyword from FirstChild
        // Class and uncommented below obj creation for
        // FirstChild then it will throw
        // compile time error as did't override all the
        // abstract methods

        // FirstChild f=new FirstChild();
        // f.m1();

        SecondChild s = new SecondChild();
        s.m1();
        s.m2();
        s.m3();
    }
}


