import java.io.*;
interface Building {
    // abstract methods
    void heightDisplay();

    // final methods
    final void widthDisplay()
    {
        System.out.pritnln("width is 1");
    }
}

class GFG implements Building {
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }
    public static void main(String[] args)
    {
        GFG gfg = new GFG();
        gfg.heightDisplay();
    }
}
// prog.java:9: error: modifier final not allowed here
//    final void widthDisplay()
//               ^
//prog.java:10: error: interface abstract methods cannot have body