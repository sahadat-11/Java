package Java_Practice_Set_Constructor;
import java.util.Scanner;
class Sphere {
    final double Pi = 3.1415926536;
    double radius;
    void setRadius(double r) {
        radius = r;
    }
    double getRadius()  {
        return  radius;
    }
    void display_area() {
        double area = 4 * Pi * radius * radius;
        System.out.println("Area = " +area);
    }
    void display_volume() {
        double volume = 1.0 * 4 / 3 * Pi * radius * radius * radius;
        System.out.println("Volume = " +volume);
    }
}
public class Sphere_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sphere ob = new Sphere();
        double radius = sc.nextDouble();
        ob.setRadius(radius);
        System.out.println("Radius = " +radius);
        ob.display_area();
        ob.display_volume();
    }
}
