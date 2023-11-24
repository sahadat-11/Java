//package Inheritence;
//class Animal {
//
//}
//class People extends Animal {
//
//}
//class Teacher1 extends People {
//
//}
//public class Instanceof_Keyword {
//    public static void main(String[] args) {
//        Animal a = new Animal();
//        People p = new People();
//        Teacher1 t = new Teacher1();
//        System.out.println(t instanceof People);
//        System.out.println(t instanceof Animal);
//        System.out.println(p instanceof Animal);
//        System.out.println(a instanceof People);
//        System.out.println(a instanceof Teacher1);
//    }
//}
//
//
//
//// Java program to demonstrate working of instanceof Keyword
//
//// Class 1
//// Parent class
//class Parent {
//}
//
//// Class 2
//// Child class
//class Child extends Parent {
//}
//
//// Class 3
//// Main class
//class GFG {
//
//    // Main driver method
//    public static void main(String[] args)
//    {
//
//        // Creating object of child class
//        Child cobj = new Child();
//
//        // A simple case
//        if (cobj instanceof Child)
//            System.out.println("cobj is instance of Child");
//        else
//            System.out.println(
//                    "cobj is NOT instance of Child");
//
//        // instanceof returning true for Parent class also
//        if (cobj instanceof Parent)
//            System.out.println(
//                    "cobj is instance of Parent");
//        else
//            System.out.println(
//                    "cobj is NOT instance of Parent");
//
//        // instanceof returns true for all ancestors
//
//        // Note : Object is ancestor of all classes in Java
//        if (cobj instanceof Object)
//            System.out.println(
//                    "cobj is instance of Object");
//        else
//            System.out.println(
//                    "cobj is NOT instance of Object");
//    }
//}
//
//
//
//// Java program to demonstrate that instanceof
//// returns false for null
//
//class Test {
//}
//
//class Main {
//    public static void main(String[] args)
//    {
//        Test tobj = null;
//
//        // A simple case
//        if (tobj instanceof Test)
//            System.out.println("tobj is instance of Test");
//        else
//            System.out.println(
//                    "tobj is NOT instance of Test");
//    }
//}
//
//
//
//// A Java program to show that a parent object is
//// not an instance of Child
//
//class Parent1 {
//}
//class Child extends Parent {
//}
//
//// Driver Class
//class Test {
//    // main function
//    public static void main(String[] args)
//    {
//        Parent pobj = new Parent();
//        if (pobj instanceof Child)
//            System.out.println("pobj is instance of Child");
//        else
//            System.out.println(
//                    "pobj is NOT instance of Child");
//    }
//}
//
//
//
//// A Java program to show that a parent reference
//// referring to a Child is an instance of Child
//
//class Parent {
//}
//class Child extends Parent {
//}
//
//// Driver class
//class Test {
//    // main function
//    public static void main(String[] args)
//    {
//        // Reference is Parent type but object is
//        // of child type.
//        Parent cobj = new Child();
//        if (cobj instanceof Child)
//            System.out.println("cobj is instance of Child");
//        else
//            System.out.println(
//                    "cobj is NOT instance of Child");
//    }
//}
