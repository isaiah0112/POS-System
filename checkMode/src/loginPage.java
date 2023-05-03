import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Font.*;
import java.awt.Color.*;
import java.io.*;
import java.io.ObjectStreamException;
import java.util.*;

class loginPage implements ActionListener{

        private static JLabel waiterlabel;
        private static JTextField waiterText;
        private static JLabel passwordLabel ;
        private static JPasswordField passwordText;
        JButton button;
        private static JLabel success;
        JLabel login = new JLabel("LOGIN");

     public loginPage(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        
        login.setPreferredSize(new Dimension(450, 250));
        login.setFont(new Font("Verdana", Font.PLAIN, 45));
        login.setHorizontalAlignment(JLabel.CENTER);
        login.setForeground(Color.WHITE);
        panel.setLayout(new BorderLayout());

        waiterlabel = new JLabel("ID"); 
        waiterlabel.setBounds(10,20,80,25);
        panel.add(waiterlabel);

        waiterText = new JTextField();
        waiterText.setBounds(100,20,165,25);
        panel.add(waiterText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(); // creating password input
        passwordText.setBounds(100, 50, 165,25);
        panel.add(passwordText);
        

        button = new JButton("Login");//creating login in button 
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String user = waiterText.getText();
                String password = passwordText.getText();
                //System.out.println(user + "," + password); In case you need the login in informating printed to terminal 
                EmpList list = new EmpList();
                Map<String,Employee> emps= list.getMap();
                for(Map.Entry<String,Employee> entry : emps.entrySet())
                {
                    Employee temp = entry.getValue();
                    System.out.println(temp.name + " " + temp.password);
                    if(user.equals(temp.name) && password.equals(temp.password) ){
                        success.setText("Login successful!");
                        System.out.println("success");
                        try {
                            BufferedWriter bw = new BufferedWriter(new FileWriter("current.txt",true));
                            bw.write(user);
                            bw.close();
                
                        } catch (Exception k) {
                            // TODO: handle exception
                        }
                        MainMenu menu = new MainMenu();
                        frame.dispose();
                        break;
                    }
                }
                
            }
        });
        button.setBounds(10,80,80,25);
        button.setBackground(Color.GRAY);
        button.setBorder(new LineBorder(Color.BLACK));
        button.setForeground(Color.white);
        button.setFocusPainted(false);
        //button.addActionListener(new loginPage() );
        panel.add(button);

        success = new JLabel("");// creating text for correct input
        success.setBounds(10,110,300,25);
        panel.add(success);
        //success.setText
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setSize(350, 200);
        frame.getContentPane().add(login, BorderLayout.NORTH);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
     }
}