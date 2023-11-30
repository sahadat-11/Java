package Java_Practice_Set_Constructor;
import java.util.Scanner;
class Cylinder {
    final double Pi = 3.1415926536;
    double height, radius;
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    double getRadius() {
        return  radius;
    }
    double getHeight() {
        return height;
    }
    void display_surface() {
        double surface = 2 * Pi * radius * (radius + height);
        System.out.println("Surface = " +surface);
    }
    void display_volume() {
        double volume = Pi * radius * radius * height;
        System.out.println("Volume = " +volume);
    }
}
public class Cylinder_Claculate_With_Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        Cylinder ob = new Cylinder(r, h);
        System.out.println("Radius = " +ob.getRadius());
        System.out.println("Radius = " +ob.getHeight());
        ob.display_surface();
        ob.display_volume();
    }
}

