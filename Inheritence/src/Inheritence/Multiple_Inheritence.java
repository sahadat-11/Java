//package Inheritence;
//class p {
//   void foo(){
//
//    }
//}
//class q extends p {
//    void foo(){
//
//    }
//}
//class r extends P {
//    void foo(){
//
//    }
//}
//class s extends q, r {
//    void foo(){
//        System.out.println("sahadat");
//    }
//}
//public class Multiple_Inheritence {
//    public static void main(String[] args) {
//        s ob = new ob;
//        ob.foo();
//    }
//}


//// Java Program to Illustrate Unsupportance of
//// Multiple Inheritance
//
//// Importing input output classes
//import java.io.*;
//
//// Class 1
//// First Parent class
//class Parent1 {
//
//    // Method inside first parent class
//    void fun() {
//
//        // Print statement if this method is called
//        System.out.println("Parent1");
//    }
//}
//
//// Class 2
//// Second Parent Class
//class Parent2 {
//
//    // Method inside first parent class
//    void fun() {
//
//        // Print statement if this method is called
//        System.out.println("Parent2");
//    }
//}
//
//// Class 3
//// Trying to be child of both the classes
//class Test extends Parent1, Parent2 {
//
//    // Main driver method
//    public static void main(String args[]) {
//
//        // Creating object of class in main() method
//        Test t = new Test();
//
//        // Trying to call above functions of class where
//        // Error is thrown as this class is inheriting
//        // multiple classes
//        t.fun();
//    }
//}


//class Class1{
//    public void display(){
//        System.out.println("Display method inside Class1.");
//    }
//}
//
//class Class2{
//    public void display(){
//        System.out.println("Display method inside Class2.");
//    }
//}
//
////let multiple inheritance is possible.
//public class Test extends Class1, Class2{
//    public static void main(String args[]){
//        Test obj = new Test();
//        //Ambiguity problem in method call which class display() method will be called.
//        obj.display();
//    }
//}
//Output:
        //Exception in thread "main" java.lang.Error:
        //Unresolved compilation problem:
       // at com.w3spoint.business.Test.main(Test.java:19)