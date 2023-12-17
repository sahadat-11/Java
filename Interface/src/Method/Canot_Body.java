import java.io.*;
interface Building {
    // abstract methods
    void heightDisplay();

    // instance method with body
    void widthDisplay()
    {
        System.out.pritnln("width is 1");
    }
}

class GFG implements Building {
    // implementing the abstract method
    // of Building interface
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }

    public static void main(String[] args)
    {
        GFG gfg = new GFG();
        gfg.heightDisplay();
        gfg.widthDisplay();
    }
}
// prog.java:10: error: interface abstract methods cannot have body
//    {
//    ^