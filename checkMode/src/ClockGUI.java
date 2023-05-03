import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ClockGUI 
{
    static JFrame clockWindow = new JFrame();
    JPanel itemPanel = new JPanel();
    JButton clockIn =  new JButton("Clock In");
    JButton clockOut = new JButton("Clock Out");
    JLabel timeIn = new JLabel("Time clocked in: ");
    JLabel timeOut = new JLabel("Time clocked out: ");
    JLabel outTime = new JLabel("");
    Time clock = new Time();
    JLabel inTime = new JLabel("");
    JLabel timeLabel = new JLabel();
    JButton backHome = new JButton("Back");
    JLabel currentUser = new JLabel();
    JLabel totalTime = new JLabel();
    int counter = 0;
    public ClockGUI()
    {
        System.out.println("In clockgui");
        clockIn.setPreferredSize(new Dimension(200, 250));
        itemPanel.setLayout(new GridBagLayout());
        itemPanel.setBackground(Color.LIGHT_GRAY);
        timeIn.setPreferredSize(new Dimension(107, 62));
        timeOut.setPreferredSize(new Dimension(107, 62));
        inTime.setPreferredSize(new Dimension(107, 62));
        outTime.setPreferredSize(new Dimension(107, 62));
        clockIn.setBackground(Color.GRAY);
        clockIn.setBorder(new LineBorder(Color.BLACK));
        clockIn.setForeground(Color.white);
        clockIn.setFocusPainted(false);
        backHome.setBackground(Color.GRAY);
        backHome.setBorder(new LineBorder(Color.BLACK));
        clockWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        backHome.setForeground(Color.white);
        backHome.setFocusPainted(false);
        timeLabel.setPreferredSize(new Dimension(430, 250));
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 60));
        clockIn.setFont(new Font("Verdana", Font.BOLD, 35));

        clockIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(clockIn.getText() == "Clock In" && counter == 0)
                {   outTime.setText("");
                    currentUser.setText(new CurrentUser().current);
                    clockIn.setText("Clock Out");
                    inTime.setText(clock.currentTime());
                    counter++;
                }
                else if(clockIn.getText() == "Clock Out" && counter == 1)
                {

                    currentUser.setText(new CurrentUser().current);
                    clockIn.setText("Clock In");
                    outTime.setText(clock.currentTime());
                    try {
                        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                        Date one = format.parse(inTime.getText());
                        Date two = format.parse(outTime.getText());
                        double difference = two.getTime()-one.getTime();
                        
                        difference = difference/60000;
                        updateClocked(new CurrentUser().current, difference);
                        totalTime.setText("Total Time Clocked: " + getDiff(inTime.getText(), outTime.getText()));
                    } catch (Exception p) {
                        System.out.println("clock out error");
                    }
                    counter = 0;
                    inTime.setText("");
                    outTime.setText("");
                }
                    
                
            }
        });

        backHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clockWindow.setVisible(false);
                clockWindow.dispose();
                clockWindow.revalidate();
                clockWindow.repaint();
                
            }
        });
   
        
        GridBagConstraints whole = new GridBagConstraints();
        whole.gridx = 0;
        whole.gridy = 1;
        whole.weightx = 1.0;
        whole.gridwidth = 3;
        whole.fill = GridBagConstraints.BOTH;
        itemPanel.add(timeLabel, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 0;
        whole.gridy = 0;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        currentUser.setText(new CurrentUser().current);
        itemPanel.add(currentUser, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 0;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(totalTime, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 6;
        whole.weightx = 1.0;
        whole.insets = new Insets(15,15,15,15);
        itemPanel.add(backHome, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 0;
        whole.gridy = 2;
        whole.gridheight = 4;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(clockIn, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 2;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(timeIn, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 4;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(timeOut, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 3;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(inTime, whole);

        whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.BOTH;
        whole.gridx = 1;
        whole.gridy = 5;
        whole.gridwidth = 1;
        whole.weightx = 1;
        whole.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(outTime, whole);

        clockWindow.getContentPane().add(itemPanel);
        clockWindow.pack();
        clockWindow.setVisible(true);
        clock.updateTime(timeLabel);
    }
    public String getDiff(String time1, String time2)
    {
        try{
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Date one = format.parse(time1);
            Date two = format.parse(time2);
            
            double difference = two.getTime()-one.getTime();
            //System.out.println(difference + " This is difference");
            int seconds = (int) (difference / 1000) % 60 ;
            int minutes = (int) ((difference / (1000*60)) % 60);
            int hours   = (int) ((difference / (1000*60*60)) % 24);
            String s = String.valueOf(hours) + ":" + String.valueOf(minutes)+":"+String.valueOf(seconds);
            return s;
        }catch(java.text.ParseException e){
            e.printStackTrace();
            System.out.println("parsec excepted");
            return "error";
        }
        
    }
    public void updateClocked(String emp, Double diff)
    {

        double add = diff/60;
        EmpList list = new EmpList();
        Employee updater = list.getEmployee(emp);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(4);
        String oldString = updater.id + "," + updater.name + "," + updater.weeklyHours + "," + updater.totalSales + "," + updater.currentTable + "," + System.lineSeparator();
        String oldContent = "";
        String newString = updater.id + "," + updater.name + "," + df.format((updater.weeklyHours + add)) + "," + updater.totalSales + "," + updater.currentTable + "," + System.lineSeparator();
        System.out.println("Old: " + updater.weeklyHours + " New: " + df.format((updater.weeklyHours + add)));
        try{
            BufferedReader read = new BufferedReader(new FileReader("emplist.txt"));
            String line = read.readLine();
            int count = 0;
            while(line!=null)
            {
                count++;
                oldContent = oldContent + line + System.lineSeparator();
                line = read.readLine();
            }
            //System.out.println(count + "This is count");
            String newContent = oldContent.replaceAll(oldString, newString);
            FileWriter writer = new FileWriter("emplist.txt");
            writer.write(newContent);
            read.close();
            writer.close();
        }catch(Exception e)
        {
            System.out.println("error");
        }
    }   
    
}