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

    public MainMenu() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);

        center.add(test);

        frame.add(center);

        System.out.println();
        
    }
}
