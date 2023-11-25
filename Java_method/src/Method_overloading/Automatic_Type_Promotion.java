//package Method_overloading;
//class Type_Promotion {
//    void f(int x) {
//        System.out.println("Inside The integer");
//    }
//    void f(double x) {
//        System.out.println("Inside The double");
//    }
//}
//public class Automatic_Type_Promotion {
//    public static void main(String[] args) {
//       Type_Promotion ob = new Type_Promotion();
//       int x = 10;
//       double d = 10.1;
//       short s = 10;
//       byte b = 12;
//       float fl = 13.3f;
//       ob.f(x);
//       ob.f(d);
//       ob.f(s);
//       ob.f(b);
//       ob.f(fl);
//    }
//}
////Inside The integer
////Inside The double
////Inside The double
////Inside The integer
////Inside The integer
////Inside The double
//
//
////Let’s try to write a code to check whether the automatic type promotion happens
////from high size datatype to small size datatype.
//
//class GFG {
//
//    // A method that accept integer as parameter
//    public static void method(int i)
//    {
//        System.out.println(
//                "Automatic Type Promoted possible from high to small?");
//    }
//
//    public static void main(String[] args)
//    {
//        // method call with double as parameter
//        method(2.02);
//    }
//}
//// From this example, it is proven that Automatic Type Promotion is onl
////y applicable from small size datatype to big size datatype. As the double size is
//// large when compared to integer so large size to small size conversion fails.
//
//
//class GFG {
//
//    // A method that accept integer as parameter
//    public static void method(int i)
//    {
//        System.out.println(
//                "Automatic Type Promoted to Integer-" + i);
//    }
//
//    // A method that accept double as parameter
//    public static void method(double d)
//    {
//        System.out.println(
//                "Automatic Type Promoted to Double-" + d);
//    }
//
//    // A method that accept object as parameter
//    public static void method(Object o)
//    {
//        System.out.println("Object method called");
//    }
//
//    public static void main(String[] args)
//    {
//        // method call with char as parameter
//        method('a');
//
//        // method call with int as parameter
//        method(2);
//
//        // method call with float as parameter
//        method(2.0f);
//
//        // method call with a string as parameter
//        method("Geeks for Geeks");
//    }
//}
////Automatic Type Promoted to Integer-97
////Automatic Type Promoted to Integer-2
////Automatic Type Promoted to Double-2.0
////Object method called