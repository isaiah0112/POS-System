import javax.swing.*;
import javax.awt.*;

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
        timePanel.setBackground(Color.green);
        buttonPanel.setBackground(Color.red);
        logPanel.setBackground(Color.yellow);

        clockWindow.setLayout(new GridBagLayout());
        GridBagConstraints whole = new GridBagConstraints();
        whole.fill = GridBagConstraints.HORIZONTAL;
        whole.gridx = 0;
        whole.gridy = 0;
        clockWindow.add(timePanel, whole);

        whole.fill = GridBagConstraints.HORIZONTAL;
        whole.gridx = 0;
        whole.gridy = 1;
        clockWindow.add(buttonPanel, whole);

        whole.fill = GridBagConstraints.HORIZONTAL;
        whole.gridx = 1;
        whole.gridy = 1;
        clockWindow.add(logPanel, whole);

        clockWindow.setVisible(true);

    }
}
