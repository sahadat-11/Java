package Flow_Layout_Details;

import javax.swing.*;
import java.awt.*;

public class Flow_Layout_All {
    public static void main(String[] args) {
        JFrame frame = new  JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //frame.setResizable(false); // prevent frame from being resized
        frame.setSize(500, 500);// x and y dimension
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true); // make frame visible
    }
}
