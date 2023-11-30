package Java_Practice_Set_Inheritence;
import java.util.Scanner;
class Circle2 {
    //final double Pi = 3.1415926536;
    double radius;
    Circle2(double r) {
        System.out.println("I am circle parameterized constructor");
        radius = r;
    }
    void display_circle() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " +area);
    }
}
class Cylinder2 extends Circle2 {
  double height;
  Cylinder2(double h, double r) {
      super(r);
      System.out.println("I am cylinder1 parameterized constructor");
      height = h;
  }
    void display_Cylinder() {
        double area = Math.PI * radius * radius * height;
        System.out.println("Area of Cylinder = " +area);
    }
}
public class Circle_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder2 ob = new Cylinder2(3.5, 2.4);
        ob.display_circle();
        ob.display_Cylinder();
    }
}
