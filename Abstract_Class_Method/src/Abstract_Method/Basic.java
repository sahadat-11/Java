package Abstract_Method;
abstract class A {
    void getName() {
        System.out.println("In getname method");
    }
    abstract void display();
}
class B extends A {
    void display() {
        System.out.println("in display method");
    }
}
public class Basic {
    public static void main(String[] args) {
        B ob = new B();
        ob.getName();
        ob.display();
    }
}
//In getname method
//in display method