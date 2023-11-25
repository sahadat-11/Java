package Inheritence;
class Base2 {
    Base2() {
        System.out.println("I am Base Constructor");
    }
    Base2(int a) {
        System.out.println("I am Base overloaded Constructor with value a : " + a);
    }
    public int x;
    public int getX() {
        return  x;
    }
    public void setX(int x) {
        System.out.println("I am base and set x");
        this.x = x;
    }
}
class derived1 extends Base2 {
    derived1() {
        System.out.println("I am derived class Constructor");
    }
    int y;// default
    public int getY() {
        return  y;
    }
    public void setY(int y) {
        System.out.println("I am derived and set y");
        this.y = y;
    }
}
public class Inheritence_with_Constructor {
    public static void main(String[] args) {
       // Base2 b1 = new Base2();// create object for base class and constructor called
        derived1 d1 = new derived1();// create object for derived class and constructor called automatically
        // first base class constructor call then derived class
      //  Base2 b2 = new Base2(3);
    }
}


// Java Program to Illustrate
// Invocation of Constructor
// Calling Without Usage of super Keyword
// Super class
class Base {

    // Constructor of super class
    Base()
    {
        // Print statement
        System.out.println(
                "Base Class Constructor Called ");
    }
}

// Class 2
// Sub class
class Derived extends Base {

    // Constructor of sub class
    Derived()
    {

        // Print statement
        System.out.println(
                "Derived Class Constructor Called ");
    }
}

// Class 3
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of sub class
        // inside main() method
        Derived d = new Derived();

        // Note: Here first super class constructor will be
        // called there after derived(sub class) constructor
        // will be called
    }
}
//Base Class Constructor Called
//Derived Class Constructor Called




// Java program to illustrate the
// concept of inheritance
// base class
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// driver class
public class Test {
    public static void main(String args[])
    {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
//No of gears are 3
//speed of bicycle is 100
//seat height is 25



