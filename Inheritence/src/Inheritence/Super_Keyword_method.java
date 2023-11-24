////package Inheritence;
////class AA {
////   void display() {
////       System.out.println("Inside The A");
////   }
////}
////class BB extends AA {
////    void display() {
////        System.out.println("Inside the B");
////    }
////}
////public class Super_Keyword_method {
////    public static void main(String[] args) {
////        BB ob = new BB();
////        ob.display();
////    }
////}
////// output : inside the B;
//
////package Inheritence;
////class AA {
////    void display() {
////        System.out.println("Inside The A");
////    }
////}
////class BB extends AA {
////    // display() // access the parent class display
////    //@Override
////    void display() {
////        super.display();
////        System.out.println("Inside the B");
////    }
////}
////public class Super_Keyword_method {
////    public static void main(String[] args) {
////        BB ob = new BB();
////        ob.display();
////    }
////}
//// output : inside the A; inside the B
//
////package Inheritence;
////class AA {
////    void message() {
////        System.out.println("Inside The A");
////    }
////}
////class BB extends AA {
////    // message() // access the parent class message
////    void message() {
////        System.out.println("Inside The B");
////    }
////    void display() {
////        message();
////    }
////}
////public class Super_Keyword_method {
////    public static void main(String[] args) {
////        BB ob = new BB();
////        ob.display();
////    }
////}
////// inside the B;
//
//package Inheritence;
//class AA {
//    void message() {
//        System.out.println("Inside The A");
//    }
//}
//class BB extends AA {
//    // message() // access the parent class message
//    void message() {
//        System.out.println("Inside The B");
//    }
//    void display() {
//        super.message();
//    }
//}
//public class Super_Keyword_method {
//    public static void main(String[] args) {
//        BB ob = new BB();
//        ob.display();
//    }
//}
//// inside the A;
//
//// Java program to show use of super with methods
//
//// superclass Person
//class Person {
//    void message()
//    {
//        System.out.println("This is person class\n");
//    }
//}
//// Subclass Student
//class Student extends Person {
//    void message()
//    {
//        System.out.println("This is student class");
//    }
//    // Note that display() is
//    // only in Student class
//    void display()
//    {
//        // will invoke or call current
//        // class message() method
//        message();
//
//        // will invoke or call parent
//        // class message() method
//        super.message();
//    }
//}
//// Driver Program
//class Test {
//    public static void main(String args[])
//    {
//        Student s = new Student();
//
//        // calling display() of Student
//        s.display();
//    }
//}
////This is person class
////This is student class
//
////https://youtu.be/gs5aWsbsej4?si=MOJ518yLUxa9QxMF