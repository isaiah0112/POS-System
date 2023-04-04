import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
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
    public String currentTime()
    {
        return timeFormat.format(Calendar.getInstance().getTime());
    }
}
