//package Inheritence;
//class Base {
//    int x;// default
//    public int getX() {
//        return  x;
//    }
//    public void setX(int x) {
//        System.out.println("I am base and set x");
//        this.x = x;
//    }
//}
//class Derived extends Base{
//    int y;// default
//    public int getY() {
//        return  y;
//    }
//    public void setY(int y) {
//        System.out.println("I am derived and set y");
//        this.y = y;
//    }
//}
//public class Basic {
//    public static void main(String[] args) {
//        Base b = new Base();//create base class object
//        b.setX(4);
//        System.out.println(b.getX());
//
//        Derived d = new Derived();//create derived class object;
//        d.setX(43);// we can acess base class set and get function;
//        System.out.println(d.getX());
//
////        Base b1 = new Base();//create derived class object
////        b1.setY(5);// sety and gety are derived class function so we cannot use in base class;
////        System.out.println(b1.getY());
//
//        Derived d1 = new Derived();//create derived class object;
//        d1.setY(40);// we can acess derived class set and get function;
//        System.out.println(d1.getY());
//
//    }
//}

package Inheritence;
class Person {
    String name;
    int age;
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
class Student extends Person {
    // name, age, display();// access in here
    String qualification;
    void displayinformationstudent () {
        //System.out.println("Name : " + name);
        //System.out.println("Age : " + age);
        display();// print name and age
        System.out.println("Qualification : " + qualification);
    }
}
public class Basic {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.name = "Sahadat";
        ob.age = 34;
        ob.qualification = "Bs.c";
        ob.displayinformationstudent();

        Student ob2 = new Student();
        ob2.name = "Sharif";
        ob2.age = 53;
        ob2.qualification = "Bs.c";
        ob2.displayinformationstudent();
    }
}

// MOST IMPORTANT
//// Java program to illustrate the
//// concept of inheritance
//
//// base class
//class Bicycle {
//    // the Bicycle class has two fields
//    public int gear;
//    public int speed;
//
//    // the Bicycle class has one constructor
//    public Bicycle(int gear, int speed)
//    {
//        this.gear = gear;
//        this.speed = speed;
//    }
//
//    // the Bicycle class has three methods
//    public void applyBrake(int decrement)
//    {
//        speed -= decrement;
//    }
//
//    public void speedUp(int increment)
//    {
//        speed += increment;
//    }
//
//    // toString() method to print info of Bicycle
//    public String toString()
//    {
//        return ("No of gears are " + gear + "\n"
//                + "speed of bicycle is " + speed);
//    }
//}
//
//// derived class
//class MountainBike extends Bicycle {
//
//    // the MountainBike subclass adds one more field
//    public int seatHeight;
//
//    // the MountainBike subclass has one constructor
//    public MountainBike(int gear, int speed,
//                        int startHeight)
//    {
//        // invoking base-class(Bicycle) constructor
//        super(gear, speed);
//        seatHeight = startHeight;
//    }
//
//    // the MountainBike subclass adds one more method
//    public void setHeight(int newValue)
//    {
//        seatHeight = newValue;
//    }
//
//    // overriding toString() method
//    // of Bicycle to print more info
//    @Override public String toString()
//    {
//        return (super.toString() + "\nseat height is "
//                + seatHeight);
//    }
//}
//
//// driver class
//public class Test {
//    public static void main(String args[])
//    {
//
//        MountainBike mb = new MountainBike(3, 100, 25);
//        System.out.println(mb.toString());
//    }
//}
