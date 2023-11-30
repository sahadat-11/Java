class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }
    public void displayCoordinates() {
        System.out.println("Coordinates of Quadrilateral:");
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println("Point 3: (" + point3.getX() + ", " + point3.getY() + ")");
        System.out.println("Point 4: (" + point4.getX() + ", " + point4.getY() + ")");
    }
}

class Trapezoid extends Quadrilateral {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(Point point1, Point point2, Point point3, Point point4, double base1, double base2, double height) {
        super(point1, point2, point3, point4);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double area() {
        return 0.5 * (base1 + base2) * height;
    }
}

class Parallelogram extends Quadrilateral {
    private double base;
    private double height;

    public Parallelogram(Point point1, Point point2, Point point3, Point point4, double base, double height) {
        super(point1, point2, point3, point4);
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height;
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(Point point1, Point point2, Point point3, Point point4, double length, double width) {
        super(point1, point2, point3, point4, length, width);
    }
}
class Square extends Rectangle {
    public Square(Point point1, Point point2, Point point3, Point point4, double side) {
        super(point1, point2, point3, point4, side, side);
    }
}

class Main {
    public static void main(String[] args) {
        // Example instantiation and usage
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 4);
        Point pointC = new Point(3, 4);
        Point pointD = new Point(3, 0);

        Square square = new Square(pointA, pointB, pointC, pointD, 4.0);
        square.displayCoordinates();

        System.out.println("Area of the square: " + square.area());
    }
}



//Basic Geometry Formulas
//Perimeter of a Square = P = 4a
//Where a = Length of the sides of a Square
//
//Perimeter of a Rectangle = P = 2(l+b)
//Where, l = Length ; b = Breadth
//
//Area of a Square = A = a2
//Where a = Length of the sides of a Square
//
//Area of a Rectangle = A = l×b
//Where, l = Length ; b = Breadth
//
//Area of a Triangle = A = ½×b×h
//Where, b = base of the triangle; h = height of the triangle
//
//Area of a Trapezoid = A = ½×(b1 + b2)×h
//Where b1 & b2 are the bases of the Trapezoid; h = height of the Trapezoid
//
//Area of a Circle = A = π×r2
//Circumference of a Circle = A = 2πr
//Where, r = Radius of the Circle
//
//Surface Area of a Cube = S = 6a2
//Where, a = Length of the sides of a Cube
//
//Curved surface area of a Cylinder  = 2πrh
//Total surface area of a Cylinder = 2πr(r + h)
//Volume of a Cylinder = V = πr2h
//Where, r = Radius of the base of the Cylinder; h = Height of the Cylinder
//
//Curved surface area of a cone =  πrl
//Total surface area of a cone = πr(r+l) = πr[r+√(h2+r2)]
//Volume of a Cone = V = ⅓×πr2h
//Where, r = Radius of the base of the Cone, h = Height of the Cone
//
//Surface Area of a Sphere = S = 4πr2
//Volume of a Sphere = V = 4/3×πr3
//Where, r = Radius of the Sphere