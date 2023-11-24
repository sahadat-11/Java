// Java program to illustrate default modifier
package p1;

// Class Geek is having Default access modifier
class Geek
{
    void display()
    {
        System.out.println("Hello World!");
    }
}
//Output : Hello World

// Java program to illustrate error while
// using class from different package with
// default modifier
package p2;
        import p1.*;

// This class is having default access modifier
class GeekNew
{
    public static void main(String args[])
    {
        // Accessing class Geek from package p1
        Geek obj = new Geek();

        obj.display();
    }
}
//Output: Compile time error