import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import java.awt.Font.*;
import java.awt.Color.*;

public class loginPage implements ActionListener{

        private static JLabel waiterlabel;
        private static JTextField waiterText;
        private static JLabel passwordLabel ;
        private static JPasswordField passwordText;
        private static JButton button;
        private static JLabel success;

     public loginPage (){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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

        button = new JButton("Login");//creating login in button 
        button.setBounds(10,80,80,25);
        button.addActionListener(new loginPage() );
        panel.add(button);

        success = new JLabel("");// creating text for correct input
        success.setBounds(10,110,300,25);
        panel.add(success);
        //success.setText
        
        frame.setVisible(true);
     }
    @Override
    public void actionPerformed(ActionEvent e) {// created button to check user name and pass
        String user = waiterText.getText();
        String password = passwordText.getText();
        //System.out.println(user + "," + password); In case you need the login in informating printed to terminal 

        if(user.getText().equals("Rodrigo") && password.equals("3993rh21") ){
            success.setText("Login successful!");
        }
        if(user.getText().equals("Tendai") && password.equals("3993th21") ){
            success.setText("Login successful!");
        }
        else{
            success.setText("Wrong login!"); // tried to add error message but would not start over 
        }                                    // after bad login
    }
}
