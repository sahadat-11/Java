package Inheritence;
class Vehicle {
    String color;
    double weight;
    Vehicle(String c, Double w) {
        color = c;
        weight = w;
    }
    void attribute() {
        System.out.println("Color : " + color);
        System.out.println("Weight : " + weight);
    }
}
class Car extends Vehicle {
    // color, weight, attribute();
    int gear;
    Car(String c, double w, int g) {
        // color = c;
        //weight = w;
        super(c, w);// call vehicle class constructor; always first line a call dite hobe;
        gear = g;
    }
    void attribute () {
        super.attribute();
        System.out.println("Gear : " +gear);
    }
}
public class Super_Keyword {
    public static void main(String[] args) {
       Car ob = new Car("white", 350, 8);
       ob.attribute();
    }
}
//https://youtu.be/RBRmfPWJvhw?si=MKcEUCVQ1WBwHm7H