package Lab_Exam;
import java.util.Scanner;
class Shape {

}
class TwoDimensionalShape extends Shape {

}
class ThreeDimensionalShape extends Shape {

}
class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Square extends TwoDimensionalShape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }
}
class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
class Cuboid extends ThreeDimensionalShape {
    private double length;

    public Cuboid(double length) {
        this.length = length;
    }

    public double getSurfaceArea() {
        return 6.0 * length * length;
    }

    public double getVolume() {
        return Math.pow(length, 3);
    }
}
class Tetrahedron extends ThreeDimensionalShape {
    private double length;

    public Tetrahedron(double length) {
        this.length = length;
    }

    public double getSurfaceArea() {
        return Math.sqrt(3) * length * length;
    }

    public double getVolume() {
        return Math.pow(length, 3) / (1.0 * 6 * Math.sqrt(2));
    }
}
public class Experiment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape[] = {"Circle", "Square", "Triangle", "Sphere", "Cube", "Tetrahedron"};
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Sphere sphere = new Sphere(3.0);
        Cuboid cuboid = new Cuboid(2.0);
        Tetrahedron tetrahedron = new  Tetrahedron(4.0);

        System.out.println("Circle - Area: " + circle.getArea());
        System.out.println("Square - Area: " + square.getArea());
        System.out.println("Rectangle - Area: " + rectangle.getArea());
        System.out.println("Sphere - Surface Area: " + sphere.getSurfaceArea() + ", Volume: " + sphere.getVolume());
        System.out.println("Cuboid - Surface Area: " + cuboid.getSurfaceArea() + ", Volume: " + cuboid.getVolume());
        System.out.println("Tetrahedron - Surface Area: " + cuboid.getSurfaceArea() + ", Volume: " + tetrahedron.getVolume());
    }
}

