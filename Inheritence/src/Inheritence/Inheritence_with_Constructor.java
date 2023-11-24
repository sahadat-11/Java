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
