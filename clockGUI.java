import javax.swing.*;
import java.awt.*;

public class ClockGUI 
{
    JFrame clockWindow = new JFrame();
    JPanel timePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel logPanel = new JPanel();
    JButton clockIn =  new JButton("Clock In");
    JButton clockOut = new JButton("Clock Out");
    public ClockGUI()
    {
        clockWindow.setSize(400, 500);
        timePanel.setBackground(Color.green);
        //timePanel.setSize(400, 250);
        buttonPanel.setBackground(Color.red);
       // buttonPanel.setSize(200, 250);
        logPanel.setBackground(Color.yellow);
        //logPanel.setSize(200, 250);

        clockWindow.setLayout(new GridBagLayout());
        timePanel.setLayout(new GridBagLayout());
        buttonPanel.setLayout(new GridBagLayout());
        logPanel.setLayout(new GridBagLayout());

        GridBagConstraints whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        
        whole.gridx = 0;
        whole.gridy = 0;
        whole.weightx = 1.0;
        whole.gridwidth = 2;
        clockWindow.add(timePanel, whole);
        JTextArea time = new JTextArea("This is th eCurrent time");
        timePanel.add(time, new GridBagConstraints());

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 0;
        whole.gridy = 1;
        whole.gridwidth = 1;
        whole.weightx = 1;
        clockWindow.add(buttonPanel, whole);
        buttonPanel.add(clockIn, new GridBagConstraints());

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 1;
        whole.gridwidth = 1;
        whole.weightx = 1;
        clockWindow.add(logPanel, whole);
        JTextArea timeIn = new JTextArea("Time clocked in: ");
        JTextArea timeOut = new JTextArea("Time clocked out: ");
        GridBagConstraints logTime = new GridBagConstraints();
        logTime.gridx = 0;
        logTime.gridy = 0;
        logTime.gridwidth = 1;
        logTime.weightx = 1;
        logPanel.add(timeIn, logTime);
        logTime = new GridBagConstraints();
        logTime.gridx = 0;
        logTime.gridy = 1;
        logTime.gridwidth = 1;
        logTime.weightx = 1;
        logPanel.add(timeOut, logTime);

        clockWindow.setVisible(true);

        

    }
}
