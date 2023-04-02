import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.Font.*;
import java.awt.Color.*;

public class MainMenu {
    JFrame frame = new JFrame();
    JPanel north = new JPanel();
    JPanel center = new JPanel();
    JTextArea test = new JTextArea();
    static JButton b, b1, b2;
    static JLabel l;
    static JFrame f;

    public MainMenu() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);

        center.add(test);

        frame.add(center);
        f = new JFrame("panel");
        l = new JLabel("Welcome!");
        b = new JButton("Waiter login");
        b1 = new JButton("Manager Mode");
        b2 = new JButton("Time clock");
        JPanel p = new JPanel();
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l);
  
        // setbackground of panel
        p.setBackground(Color.red);
  
        // Adding panel to frame
        f.add(p);
  
        // Setting the size of frame
        f.setSize(300, 300);
  
        f.show();
        System.out.println();
        
    }
}
