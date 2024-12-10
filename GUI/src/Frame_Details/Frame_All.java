package this_Details;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
public class Frame_All {
    public static void main(String[] args) {
        // Jframe = a GUI window to add component
        JFrame frame = new  JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420, 420);// x and y dimension
        frame.setVisible(true); // make frame visible
        ImageIcon image = new ImageIcon("logo.jpeg");// create an image icon
        frame.setIconImage(image.getImage());// change icon of frame
        //frame.getContentPane().setBackground(Color.green); // change color fo background
        frame.getContentPane().setBackground(new Color(255, 255, 0));

    }
}
