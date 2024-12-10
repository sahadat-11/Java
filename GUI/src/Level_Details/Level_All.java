package Level_Details;

import javax.swing.*;
import java.awt.*;

public class Level_All {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("logo.jpeg");

        JLabel label = new JLabel();
        label.setText("HI");
        label.setIcon(icon);
        //label.setVerticalTextPosition(JLabel.BOTTOM);
        //label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setBounds(100, 100, 75, 75);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(null);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);
        bluepanel.setLayout(null);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(new BorderLayout());
        greenpanel.setLayout(null);

        JFrame frame = new  JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //frame.setResizable(false); // prevent frame from being resized
        frame.setLayout(null);
        frame.setSize(750, 750);// x and y dimension
        frame.setVisible(true); // make frame visible
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
}
