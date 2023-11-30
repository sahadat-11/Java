package Java__Practice_set_OOP;
import java.util.Scanner;
class Square {
    double side;
    void setSide(double s) {
        side = s;
    }
    void display_area() {
        System.out.println("Area = " +(side * side));
    }
    void display_parameter() {
        System.out.println("Parameter = " + (4 * side));
    }
}
public class Square_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square ob = new Square();
        double side = sc.nextDouble();
        ob.setSide(side);
        ob.display_area();
        ob.display_parameter();
    }
}
