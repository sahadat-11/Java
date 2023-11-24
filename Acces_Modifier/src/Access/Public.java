// Java program to illustrate
// public modifier
package p1;
public class A
{
    public void display()
    {
        System.out.println("GeeksforGeeks");
    }
}


package p2;
        import p1.*;
class B {
    public static void main(String args[])
    {
        A obj = new A();
        obj.display();
    }
}
