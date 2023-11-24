package Inheritence;
class granfather4 {
    public void display() {
        System.out.println("this is grandfather class");
    }
}
class father4 extends granfather4 {
   // display();
    public void display() {
        super.display();// father (father er super grandfather)
        System.out.println("this is father class");
    }

}
class child4 extends father4 {
    // display();
    public void display() {
        super.display();// father (child er super father)
        System.out.println("this is child class");
    }
}
public class Multi_level_inheritence {
    public static void main(String[] args) {
        child4 ob = new child4();
        ob.display();
    }
}
// https://prnt.sc/6VfIgfmvGNT4



//// Java program to illustrate the
//// concept of Multilevel inheritance
//import java.io.*;
//        import java.lang.*;
//        import java.util.*;
//
//class One {
//    public void print_geek()
//    {
//        System.out.println("Geeks");
//    }
//}
//
//class Two extends One {
      //print_geek()
//    public void print_for() { System.out.println("for"); }
//}
//
//class Three extends Two {
//    public void print_geek()
//    {
//        System.out.println("Geeks");
//    }
//}
//
//// Drived class
//public class Main {
//    public static void main(String[] args)
//    {
//        Three g = new Three();
//        g.print_geek();
//        g.print_for();
//        g.print_geek();
//    }
//}
