import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Time 
{
    Calendar calendar;
    SimpleDateFormat timeFormat;
    String time;
    public Time()
    {
        timeFormat = new SimpleDateFormat("hh:mm:ss a");      
    }
    public void updateTime(JLabel timeLabel) 
    {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = timeFormat.format(Calendar.getInstance().getTime());
                timeLabel.setText(time);
            }
        });
        timer.start();
    }
    public String currentTime()
    {
        return timeFormat.format(Calendar.getInstance().getTime());
    }
}
