package Java__Practice_set_OOP;
import java.util.Scanner;
class Rectangular {
    double side1, side2;
    void setSides(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }
    void display_area() {
        System.out.println("Area = " +(side1 * side1));
    }
    void display_parameter() {
        System.out.println("Parameter = " + (2 * (side1 + side2)));
    }
}
public class Rectangular_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangular ob = new Rectangular();
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        ob.setSides(side1, side2);
        ob.display_area();
        ob.display_parameter();
    }
}
