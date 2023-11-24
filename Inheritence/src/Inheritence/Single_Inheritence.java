package Inheritence;
class parent3 {
    public void display1() {
        System.out.println("this is parent class");
    }
}
class child3 extends parent3 {
    // display1();
    public void display() {
        System.out.println("this is child class");
    }
}
public class Single_Inheritence {
    public static void main(String[] args) {
        child3 ob = new child3();
        ob.display();
        ob.display1(); //
    }
}


//// Java program to illustrate the
//// concept of single inheritance
//import java.io.*;
//import java.lang.*;
//import java.util.*;
//
//// Parent class
//class One {
//	public void print_geek()
//	{
//		System.out.println("Geeks");
//	}
//}
//
//class Two extends One {
      // print_geek is in here;
//	public void print_for() { System.out.println("for"); }
//}
//
//// Driver class
//public class Main {
//	// Main function
//	public static void main(String[] args)
//	{
//		Two g = new Two();
//		g.print_geek();
//		g.print_for();
//		g.print_geek();
//	}
//}