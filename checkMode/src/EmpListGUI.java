import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class EmpListGUI 
{
    JFrame empWindow = new JFrame();
    JPanel itemPanel = new JPanel();
    JLabel header = new JLabel("Working Employees");
    Employee john = new Employee("Long John Silvers", 5, 20, 0);
    Employee hut = new Employee("Pizza Hut", 3, 10,0);
    Employee burg = new Employee("What A. Burger", 34, 35.5, 0);
    int location = 2;
    JButton backHome = new JButton("Back");
    public EmpListGUI()
    {
        EmpList list = new EmpList();
        itemPanel.setLayout(new GridBagLayout());
        empWindow.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        itemPanel.setBorder(new EmptyBorder(25, 5, 5, 5));
        header.setFont(new Font("Verdana", Font.BOLD, 32));
        backHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                MainMenu back = new MainMenu();
                empWindow.dispose();
            }
        });
        GridBagConstraints emp = new GridBagConstraints();
        emp.gridx = 0;
        emp.gridy = 0;
        emp.fill = GridBagConstraints.BOTH;
        emp.gridwidth = 1;
        emp.weightx = 1;
        emp.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(header, emp);
        addEmployee(john);
        addEmployee(burg);
        emp = new GridBagConstraints();
        emp.fill = GridBagConstraints.HORIZONTAL;
        emp.gridx = 1;
        emp.gridy = location;
        emp.weightx = 1.0;
        emp.insets = new Insets(15,15,15,15);
        itemPanel.add(backHome, emp);
        
        empWindow.getContentPane().add(itemPanel);
        empWindow.pack();
        empWindow.setVisible(true);
    }
    public void addEmployee(Employee emp)
    {
        GridBagConstraints lay = new GridBagConstraints();
        lay.gridx = 0;
        lay.gridy = location-1;
        lay.fill = GridBagConstraints.BOTH;
        lay.gridwidth = 1;
        lay.weightx = 1;
        lay.insets = new Insets(15, 15, 15, 15);
        JLabel latest = new JLabel(emp.getInfo());
        latest.setFont(new Font("Verdana", Font.PLAIN, 15));
        itemPanel.add(latest, lay);
        location = location + 1;
    }
}
