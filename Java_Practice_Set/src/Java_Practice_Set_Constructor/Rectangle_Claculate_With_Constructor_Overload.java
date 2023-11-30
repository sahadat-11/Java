
package Java_Practice_Set_Constructor;
import java.util.Scanner;
class rectangle {
   double weight, height;
   rectangle() {
       this.height = 5;
       this.weight = 4;
   }
   // this is constructor overload
   rectangle(double h, double w) {
       this.height = h;
       this.weight = w;
   }
   double getHeight() {
       return  height;
   }
    double getWeight() {
        return  weight;
    }
    void area() {
        System.out.println(weight * height);
    }
}
public class Rectangle_Claculate_With_Constructor_Overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        rectangle ob = new rectangle(height, weight);
        System.out.println("Height = " +ob.getHeight());
        System.out.println("Weight = " +ob.getWeight());
        ob.area();
    }
}
