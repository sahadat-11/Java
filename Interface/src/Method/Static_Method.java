import java.io.*;
interface Building {
    // abstract method
    void heightDisplay();

    // static method
    static void widthDisplay()
    {
        System.out.println("width is 1");
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
        // accessing the static method
        // by using of interface name
        Building.widthDisplay();
    }
}
