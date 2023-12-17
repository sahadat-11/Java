import java.io.*;
interface Building {
    // abstract methods
    void heightDisplay();

    // default method
    default void widthDisplay()
    {
        System.out.println("width is 1");
    }
}

class GFG implements Building {
    // implementing abstract method
    // of Building interface
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }
    public static void main(String[] args)
    {
        GFG gfg = new GFG();
        gfg.heightDisplay();

        // calling default method
        gfg.widthDisplay();
    }
}
