////package Inheritence;
////class AAA {
////      AAA() {
////          System.out.println("A constructor");
////      }
////}
////class BBB extends AAA {
////    BBB(){
////        System.out.println("B constructor");
////    }
////}
////public class Super_keyword_constructor {
////    public static void main(String[] args) {
////        BBB ob = new BBB();
////    }
////}
//////output: A constructor B constructor
//
////package Inheritence;
////class AAA {
////    AAA() {
////        System.out.println("A constructor");
////    }
////}
////class BBB extends AAA {
////    BBB(){
////        super();// parent class constructor call;
////        System.out.println("B constructor");
////    }
////}
////public class Super_keyword_constructor {
////    public static void main(String[] args) {
////        BBB ob = new BBB();
////    }
////}
//////output: A constructor B constructor
//
//package Inheritence;
//class AAA {
//    AAA(int a) {
//        System.out.println("A constructor" + a );
//    }
//}
//class BBB extends AAA {
//    BBB(int a){
//        super(a);// parent class constructor call;
//        System.out.println("B constructor");
//    }
//}
//public class Super_keyword_constructor {
//    public static void main(String[] args) {
//        BBB ob = new BBB(5);
//    }
//}
////output: A constructor 5 , B constructor
//
//// Java Code to show use of
//// super keyword with constructor
//
//// superclass Person
//class Person {
//    Person()
//    {
//        System.out.println("Person class Constructor");
//    }
//}
//
//// subclass Student extending the Person class
//class Student extends Person {
//    Student()
//    {
//        // invoke or call parent class constructor
//        super();
//
//        System.out.println("Student class Constructor");
//    }
//}
//
//// Driver Program
//class Test {
//    public static void main(String[] args)
//    {
//        Student s = new Student();
//    }
//}
////Person class Constructor
////Student class Constructor
//https://youtu.be/fD2wJtoaQGI?si=oHZ-tuthQBr9m7s_