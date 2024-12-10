package Grid_Layout_Details;

import javax.swing.*;
import java.awt.*;

public class Grid_Layout_All {
    public static void main(String[] args) {
        JFrame frame = new  JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //frame.setResizable(false); // prevent frame from being resized
        frame.setSize(500, 500);// x and y dimension
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);
    }
}
