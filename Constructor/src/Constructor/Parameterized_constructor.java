package Constructor;
class Myclass2 {
    String name;
    int id;
    Myclass2(String x, int i) {
        name = x;
        id = i;
    }
}
public class Parameterized_constructor {
    public static void main(String[] args) {
       Myclass2 obj = new Myclass2("sahadat", 10);
        System.out.println(obj.name + obj.id);
    }
}

// Java Program for Parameterized Constructor
//import java.io.*;
//class Geek {
//    // data members of the class.
//    String name;
//    int id;
//    Geek(String name, int id)
//    {
//        this.name = name;
//        this.id = id;
//    }
//}
//class GFG {
//    public static void main(String[] args)
//    {
//        // This would invoke the parameterized constructor.
//        Geek geek1 = new Geek("avinash", 68);
//        System.out.println("GeekName :" + geek1.name
//                + " and GeekId :" + geek1.id);
//    }
//}
