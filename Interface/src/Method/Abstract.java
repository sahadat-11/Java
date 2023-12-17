import java.io.*;
interface Building {
    // abstract methods
    void heightDisplay();
}

class GFG implements Building {
    // implementing the abstract method
    // of building interface
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

// height is 5