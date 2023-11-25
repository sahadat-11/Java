//public method
//        Example:
//public class Example5 {
//    //public method
//    public void fruits() {
//        String fruits[] = {"Apple", "Banana", "Mango", "Strawberry"};
//        System.out.println("Fruits:");
//        for (int i=0; i<fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }
//    }
//
//    static method
//    static void vegetables() {
//        String vegies[] = {"Onion", "Potato", "Carrot", "Raddish"};
//        System.out.println("Vegetables:");
//        for (int i=0; i<vegies.length; i++) {
//            System.out.println(vegies[i]);
//        }
//    }
//
//    public static void main(String[] args) {// main function
//        Example5 ex5 = new Example5();        //need to create object
//        ex5.fruits();
//        System.out.println();
//
//        vegetables();                        // no need to create object
//    }
//}
//
////output:
////        java -cp /tmp/tMsQaHhx27 Example5
////        Fruits:
////        Apple
////        Banana
////        Mango
////        Strawberry
////
////        Vegetables:
////        Onion
////        Potato
////        Carrot
////        Raddish
//
//
//
//// Example to illustrate Accessing
//// the Static method(s) of the class.
//import java.io.*;
//
//class Geek {
//
//    public static String geekName = "";
//
//    public static void geek(String name)
//    {
//        geekName = name;
//    }
//}
//
//class GFG {
//    public static void main(String[] args)
//    {
//
//        // Accessing the static method geek()
//        // and field by class name itself.
//        Geek.geek("vaibhav");
//        System.out.println(Geek.geekName);
//
//        // Accessing the static method geek()
//        // by using Object's reference.
//        Geek obj = new Geek();
//        obj.geek("mohit");
//        System.out.println(obj.geekName);
//    }
//}
