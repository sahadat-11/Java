////package Inheritence;
////class A {
////   int x = 10;
////}
////class B extends A {
////    int x = 5;
////    void display() {
////        System.out.println(x);
////    }
////}
////public class Super_keyword_variable {
////    public static void main(String[] args) {
////       B ob = new B();
////       ob.display();
////    }
////}
////// output : 5; derived class value


//package Inheritence;
//class A {
//    int x = 10;
//}
//class B extends A {
//    int x = 5;
//    void display() {
//        System.out.println(super.x);
//    }
//}
//public class Super_keyword_variable {
//    public static void main(String[] args) {
//        B ob = new B();
//        ob.display();
//    }
//}
//// output : 10; parent class value


//// Java code to show use of super
//// keyword with variables
//
//// Base class vehicle
//class Vehicle {
//    int maxSpeed = 120;
//}
//
//// sub class Car extending vehicle
//class Car extends Vehicle {
//    int maxSpeed = 180;
//
//    void display()
//    {
//        // print maxSpeed of base class (vehicle)
//        System.out.println("Maximum Speed: "
//                + super.maxSpeed);
//    }
//}
//
//// Driver Program
//class Test {
//    public static void main(String[] args)
//    {
//        Car small = new Car();
//        small.display();
//    }
//}
// 120

////https://youtu.be/_ZrRORCIev4?si=liPDwCvfng-WwcxQ