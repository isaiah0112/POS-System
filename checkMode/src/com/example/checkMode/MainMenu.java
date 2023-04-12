import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.Font.*;
import java.awt.Color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;

public class MainMenu {
    JFrame frame = new JFrame();
    JPanel north = new JPanel();
    JPanel center = new JPanel();
    JTextArea test = new JTextArea();
    JButton b, b1, b2,b3,b4,b5;
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
        l = new JLabel("Welcome!");
        b = new JButton("Waiter login");
        b1 = new JButton("Manager Mode");
        b2 = new JButton("Time clock");
        b3 = new JButton("Register new User");
        b4 = new JButton("Store Front");
        b5 = new JButton("Settings");


        JPanel p = new JPanel();
        p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
  
        // setbackground of panel
       // p.setBackground(Color.blue);
  
        // Adding panel to frame
       frame.add(p);
  
        //f.show();
        System.out.println();

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                ClockGUI gui = new ClockGUI();
            }
          });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                Tables tables = new Tables();
            }
          });
        
    }
}
