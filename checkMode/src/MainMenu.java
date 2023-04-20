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
    JPanel p = new JPanel();
    JFrame security = new JFrame();
    JPanel northj = new JPanel();
    JPanel centerj = new JPanel();
    JPanel blank = new JPanel();
    JTextArea managerCode = new JTextArea();
    JButton go = new JButton("GO");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton buttonDot = new JButton(".");
    JButton clear = new JButton("Clear");

    public MainMenu() {

        l = new JLabel("Welcome!");
        b = new JButton("Waiter login");
        b1 = new JButton("Manager Mode");
        b2 = new JButton("Time clock");
        b3 = new JButton("Register new User");
        b4 = new JButton("Store Front");
        b5 = new JButton("Settings");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
        frame.add(center);
        
        // Adding panel to frame
        frame.add(p);

        center.add(test);

        
        


        
        p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);

        

        // security for manager mode

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                security.setTitle("Store Front");
        security.setSize(300, 300); 
        security.setVisible(true);
        security.setLayout(new BorderLayout(0, 0));

        security.add(northj, BorderLayout.NORTH);
        security.add(centerj, BorderLayout.CENTER);

        northj.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // set bottom gap to 20 pixels
        

        northj.setLayout(new GridLayout(2, 1, 15, 10));

        managerCode.setFont(new Font("Arial", Font.PLAIN, 35));
        northj.add(managerCode);
        //north.add(blank);
        northj.add(go);

        centerj.setLayout(new GridLayout(4, 3, 0, 0));
        centerj.add(button1);
        centerj.add(button2);
        centerj.add(button3);
        centerj.add(button4);
        centerj.add(button5);
        centerj.add(button6);
        centerj.add(button7);
        centerj.add(button8);
        centerj.add(button9);
        centerj.add(clear);
        centerj.add(button0);
        centerj.add(buttonDot);
            }
        });
  
        // setbackground of panel
       // p.setBackground(Color.blue);
  
        
  
        //f.show();
        //System.out.println();

        // ACTIN LISTENERS FOR BUTTONS ON MAIN MENU
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
          b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                EmpListGUI list = new EmpListGUI();
            }
          });   
          
          // ACTION LISTENERS FOR BUTTONS SECURITY MANAGER MODE
          button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("9");
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append("0");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.setText("");
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.append(".");
            }
        });
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                security.dispose();
                //frame.dispose();
                //FOR SECURITY ADD PASSABLE CODES/ID NUMBERS
                managerMode manager = new managerMode();
            }
        });
    }
}
