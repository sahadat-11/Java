package Level_Details;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        //JLevel = a GUI display area for a string of test, an image, or both
        JLabel label = new JLabel(); // crate a level
        label.setText("Bro, do you even code?");// set text of label

        ImageIcon image = new ImageIcon("logo.jpeg");// create an image icon
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        label.setIcon(image);// change icon of frame
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, right, center
        label.setVerticalTextPosition(JLabel.TOP); // set text top, botton, center
        label.setForeground(new Color(255, 0, 0));
        label.setFont(new Font("My boli", Font.PLAIN, 20));// set font of text
        label.setIconTextGap(-25); // set gap of text of image;
        label.setBackground(Color.black);
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBounds(100,100, 250, 250);// set x, y position with dimension

        JFrame frame = new  JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //frame.setResizable(false); // prevent frame from being resized
        //frame.setLayout(null);
        frame.setSize(420, 420);// x and y dimension
        frame.setVisible(true); // make frame visible
        frame.add(label);
        //frame.pack();
    }
}
