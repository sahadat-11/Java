import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    Myframe() {
        this.setTitle("Jfrme title goes here"); // set title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent this from being resized
        this.setSize(420, 420);// x and y dimension
        this.setVisible(true); // make this visible
        ImageIcon image = new ImageIcon("logo.jpeg");// create an image icon
        this.setIconImage(image.getImage());// change icon of this
        //this.getContentPane().setBackground(Color.green); // change color fo background
        this.getContentPane().setBackground(new Color(255, 255, 0));
    }
}

