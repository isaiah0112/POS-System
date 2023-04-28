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
import java.awt.event.ActionListener;

public class loginPage{

        private static JLabel waiterlabel;
        JTextField waiterText;
        private static JLabel passwordLabel ;
        JPasswordField passwordText;
        JButton button = new JButton("Login");
        private static JLabel success;

     public loginPage (){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        // frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);

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

        button.setBounds(10,80,80,25);
        panel.add(button);

        success = new JLabel("");// creating text for correct input
        success.setBounds(10,110,300,25);
        panel.add(success);
        //success.setText
        
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = waiterText.getText();
                char[] passwordChars = passwordText.getPassword();
                String password = new String(passwordChars);
                System.out.println(user + "," + password);
        
                if(user.equals("Rodrigo") && password.equals("3993rh21") ){
                    success.setText("Login successful!");
                }
                else if(user.equals("Tendai") && password.equals("3993th21") ){
                    success.setText("Login successful!");
                }
                else{
                    success.setText("Wrong login!"); // tried to add error message but would not start over 
                } 
            }
        });

     }
     
    
}


                