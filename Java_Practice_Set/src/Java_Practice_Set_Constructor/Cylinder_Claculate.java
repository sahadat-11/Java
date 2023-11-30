package Java_Practice_Set_Constructor;
import java.util.Scanner;
class Cylinder2 {
    final double Pi = 3.1415926536;
    double height, radius;
    void setRadius(double r) {
        radius = r;
    }
    void setHeight(double h) {
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
public class Cylinder_Claculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder2 ob = new Cylinder2();
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        ob.setRadius(r);
        ob.setHeight(h);
        System.out.println("Radius = " +ob.getRadius());
        System.out.println("Radius = " +ob.getHeight());
        ob.display_surface();
        ob.display_volume();
    }
}
