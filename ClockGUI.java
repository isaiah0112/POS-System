import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockGUI 
{
    JFrame clockWindow = new JFrame();
    JPanel itemPanel = new JPanel();
    JButton clockIn =  new JButton("Clock In");
    JButton clockOut = new JButton("Clock Out");
    JLabel timeIn = new JLabel("Time clocked in: ");
    JLabel timeOut = new JLabel("Time clocked out: ");
    JLabel inTime = new JLabel("");
    JLabel outTime = new JLabel("");
    Time clock = new Time();
    JLabel timeLabel = new JLabel();

    public ClockGUI()
    {
        
        clockIn.setPreferredSize(new Dimension(200, 250));
        itemPanel.setLayout(new GridBagLayout());

        timeIn.setPreferredSize(new Dimension(107, 62));
        timeOut.setPreferredSize(new Dimension(107, 62));
        inTime.setPreferredSize(new Dimension(107, 62));
        outTime.setPreferredSize(new Dimension(107, 62));
        

        timeLabel.setPreferredSize(new Dimension(430, 250));
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 60));
        clockIn.setFont(new Font("Verdana", Font.PLAIN, 35));

        clockIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(clockIn.getText() == "Clock In")
                {
                    clockIn.setText("Clock Out");
                    inTime.setText(clock.currentTime());
                }
                else if(clockIn.getText() == "Clock Out")
                {
                    clockIn.setText("Clock In");
                    outTime.setText(clock.currentTime());
                }
                    
                
            }
        });
   
        GridBagConstraints whole = new GridBagConstraints();
        whole.gridx = 0;
        whole.gridy = 0;
        whole.weightx = 1.0;
        whole.gridwidth = 3;
        whole.fill = GridBagConstraints.BOTH;
        itemPanel.add(timeLabel, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 0;
        whole.gridy = 1;
        whole.gridheight = 4;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(clockIn, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 1;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(timeIn, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 3;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(timeOut, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 2;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(inTime, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 4;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(outTime, whole);

        clockWindow.getContentPane().add(itemPanel);
        clockWindow.pack();
        clockWindow.setVisible(true);
        clock.updateTime(timeLabel);
    }
   
}
