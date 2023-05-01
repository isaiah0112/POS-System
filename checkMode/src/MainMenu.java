import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.Font.*;
import java.awt.Color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.ObjectStreamException;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;

public class MainMenu {
    JFrame frame = new JFrame();
    JPanel north = new JPanel();
    //JPanel center = new JPanel();
    JTextArea test = new JTextArea();
    JButton b, b1, b2,b3,b4,b5,logout;
    static JLabel welcomeLabel;
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
    JButton buttonExit = new JButton("Exit");
    JButton clear = new JButton("Clear");
    JButton go2 = new JButton("GO");


    public MainMenu() {
        welcomeLabel = new JLabel("Welcome!");
        b = new JButton("Waiter login");

        b1 = new JButton("Manager Mode");
        b1.setBackground(Color.GRAY);
        b1.setBorder(new LineBorder(Color.BLACK));
        b1.setForeground(Color.white);
        b1.setFocusPainted(false);
        b1.setFont(new Font("Verdana", Font.BOLD, 20));
        b2 = new JButton("Time clock");
        b2.setBackground(Color.GRAY);
        b2.setBorder(new LineBorder(Color.BLACK));
        b2.setForeground(Color.white);
        b2.setFocusPainted(false);
        b2.setFont(new Font("Verdana", Font.BOLD, 20));
        b3 = new JButton("Register new User");
        b3.setBackground(Color.GRAY);
        b3.setBorder(new LineBorder(Color.BLACK));
        b3.setForeground(Color.white);
        b3.setFocusPainted(false);
        b3.setFont(new Font("Verdana", Font.BOLD, 20));
        b4 = new JButton("Store Front");
        b4.setBackground(Color.GRAY);
        b4.setBorder(new LineBorder(Color.BLACK));
        b4.setForeground(Color.white);
        b4.setFocusPainted(false);
        b4.setFont(new Font("Verdana", Font.BOLD, 20));
        b5 = new JButton("Settings");
        b5.setBackground(Color.GRAY);
        b5.setBorder(new LineBorder(Color.BLACK));
        b5.setForeground(Color.white);
        b5.setFocusPainted(false);
        b5.setFont(new Font("Verdana", Font.BOLD, 20));
        logout = new JButton("Log Out");
        logout.setBackground(Color.GRAY);
        logout.setBorder(new LineBorder(Color.BLACK));
        logout.setForeground(Color.white);
        logout.setFocusPainted(false);
        logout.setFont(new Font("Verdana", Font.BOLD, 20));
        
        b1.setPreferredSize(new Dimension(250, 200));
        b2.setPreferredSize(new Dimension(250, 200));
        b3.setPreferredSize(new Dimension(250, 200));
        b4.setPreferredSize(new Dimension(250, 200));
        b5.setPreferredSize(new Dimension(250, 200));
        logout.setPreferredSize(new Dimension(250, 200));

        /*
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.pack();
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setVisible(true);
         */
        //frame.add(center);
        p.setLayout(new GridBagLayout());
        //p.setPreferredSize(new Dimension(500, 500));
        p.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        // Adding panel to frame
        welcomeLabel.setPreferredSize(new Dimension(450, 250));
        welcomeLabel.setFont(new Font("Verdana", Font.PLAIN, 45));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setForeground(Color.WHITE);
        
        
        

        //center.add(test);

        
        
        GridBagConstraints sett = new GridBagConstraints();

        
        sett = new GridBagConstraints();
        sett.gridx = 0;
        sett.gridy = 3;
        //sett.weightx = 1.0;
        sett.gridwidth = 1;
        sett.fill = GridBagConstraints.BOTH;
        p.add(b1, sett);
        sett = new GridBagConstraints();
        sett.gridx = 1;
        sett.gridy = 3;
        //sett.weightx = 1.0;
        sett.gridwidth = 1;
        sett.fill = GridBagConstraints.BOTH;
        p.add(b2, sett);
        sett = new GridBagConstraints();
        sett.gridx = 2;
        sett.gridy = 3;
        //sett.weightx = 1.0;
        sett.gridwidth = 1;
        sett.fill = GridBagConstraints.BOTH;
        p.add(b3, sett);
        sett = new GridBagConstraints();
        sett.gridx = 0;
        sett.gridy = 4;
        //sett.weightx = 1.0;
        sett.gridwidth = 1;
        sett.fill = GridBagConstraints.BOTH;
        p.add(b4, sett);
        sett = new GridBagConstraints();
        sett.gridx = 1;
        sett.gridy = 4;
        //sett.weightx = 1.0;
        sett.gridwidth = 1;
        sett.fill = GridBagConstraints.BOTH;
        p.add(b5, sett);
        sett = new GridBagConstraints();
        sett.gridx = 2;
        sett.gridy = 4;
        //sett.weightx = 1.0;
        sett.gridwidth = 1;
        sett.fill = GridBagConstraints.BOTH;
        p.add(logout, sett);
        p.setBackground(Color.LIGHT_GRAY);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.add(welcomeLabel, BorderLayout.NORTH);
        frame.getContentPane().add(p,BorderLayout.CENTER);
        frame.pack();
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);

        // security for manager mode

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                security.dispose();
                northj.removeAll();
                northj.revalidate();
                northj.repaint();

                
        security.setTitle("Security - Manager Mode");
        security.setSize(300, 300); 
        security.setVisible(true);
        security.setLayout(new BorderLayout(0, 0));
        security.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        
        northj.revalidate();
        northj.repaint();
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
        centerj.add(buttonExit);

        security.add(northj, BorderLayout.NORTH);
        security.add(centerj, BorderLayout.CENTER);
            }
        });
  
        // setbackground of panel
       // p.setBackground(Color.blue);
  
        
  
        //f.show();
        //System.out.println();

        // ACTIN LISTENERS FOR BUTTONS ON MAIN MENU
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.dispose();
                    PrintWriter kill = new PrintWriter("current.txt");
                    kill.print("");
                    kill.close();
                    loginPage login = new loginPage();
                } catch (Exception k) {
                    // TODO: handle exception
                }
                
            }
          });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("9");
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (managerCode.getText().equals("Invalid Code"))
                {
                    managerCode.setText("");  
                }
                managerCode.append("0");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerCode.setText("");
            }
        });
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                security.dispose();
                managerCode.setText("");
            }
        });
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (managerCode.getText().equals("258"))
                {
                    managerCode.setText("");
                    security.dispose();
                    managerMode manager = new managerMode();   
                }
                else
                {
                    managerCode.setText("Invalid Code");
                }
                
            }
        });
        go2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (managerCode.getText().equals("258"))
                {
                    security.dispose();
                    managerCode.setText("");
                    registerNewUser newUser = new registerNewUser();   
                }
                else
                {
                    managerCode.setText("Invalid Code");
                }
                
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                security.dispose();
                northj.removeAll();
                northj.revalidate();
                northj.repaint();
                security.setTitle("Security - Register New User");
                security.setSize(300, 300); 
                security.setVisible(true);
                security.setLayout(new BorderLayout(0, 0));

                
                northj.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // set bottom gap to 20 pixels
                

                northj.setLayout(new GridLayout(2, 1, 15, 10));

                managerCode.setFont(new Font("Arial", Font.PLAIN, 35));
                northj.add(managerCode);
                //north.add(blank);
                northj.add(go2);

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
                centerj.add(buttonExit);


                security.add(northj, BorderLayout.NORTH);
                security.add(centerj, BorderLayout.CENTER);
            }
        });
    }
}
