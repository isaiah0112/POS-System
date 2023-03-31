import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockGUI 
{
    JFrame clockWindow = new JFrame();
    JPanel itemPanel = new JPanel();
    //JPanel buttonPanel = new JPanel();
    //JPanel logPanel = new JPanel();
    JButton clockIn =  new JButton("Clock In");
    JButton clockOut = new JButton("Clock Out");
    //JTextArea time = new JTextArea("This is th eCurrent time");
    JLabel timeIn = new JLabel("Time clocked in: ");
    JLabel timeOut = new JLabel("Time clocked out: ");
    JLabel inTime = new JLabel("");
    JLabel outTime = new JLabel("");
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;
    public ClockGUI()
    {
        clockWindow.setSize(400, 500);
        clockIn.setPreferredSize(new Dimension(200, 250));
        itemPanel.setLayout(new GridBagLayout());

        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        
        timeLabel.setPreferredSize(new Dimension(400, 250));
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 60));
        clockIn.setFont(new Font("Verdana", Font.PLAIN, 35));

        clockIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                inTime.setText(timeFormat.format(Calendar.getInstance().getTime()));
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
        whole.fill = GridBagConstraints.HORIZONTAL;
        whole.gridx = 1;
        whole.gridy = 1;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(timeIn, whole);
        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.HORIZONTAL;
        whole.gridx = 1;
        whole.gridy = 3;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(timeOut, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.HORIZONTAL;
        whole.gridx = 1;
        whole.gridy = 2;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(inTime, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.HORIZONTAL;
        whole.gridx = 1;
        whole.gridy = 4;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(outTime, whole);

        clockWindow.getContentPane().add(itemPanel);
        clockWindow.pack();
        clockWindow.setVisible(true);
        updateTime();
    }
    public void updateTime()
    {
        while(true)
        {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
    }
}
