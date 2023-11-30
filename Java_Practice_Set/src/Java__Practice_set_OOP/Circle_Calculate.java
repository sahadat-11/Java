package Java__Practice_set_OOP;
import java.util.Scanner;
class Circle {
    final double Pi = 3.1415926536;
    double side;
    void setSide(double s) {
        side = s;
    }
    void display_area() {
        System.out.println("Area = " +(Pi * side * side));
    }
    void display_parameter() {
        System.out.println("Parameter = " + (2 * Pi * side));
    }
}
public class Circle_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle ob = new Circle();
        double side = sc.nextDouble();
        ob.setSide(side);
        ob.display_area();
        ob.display_parameter();
    }
}
