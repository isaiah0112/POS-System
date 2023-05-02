import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
class EmpListGUI 
{
    JFrame empWindow = new JFrame();
    JPanel itemPanel = new JPanel();
    JLabel header = new JLabel("Working Employees");
    //Employee john = new Employee(200,"Long John Silvers", 5, 20, 0);
    //Employee hut = new Employee(201,"Pizza Hut", 3, 10,0);
    //Employee burg = new Employee(202,"What A. Burger", 34, 35.5, 0);
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
        
        String[] tables = new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        EmpList l = new EmpList();
        Map<String,Employee> empList = l.getMap();
        Map<String, JButton> buttons = new HashMap<String,JButton>();
        
        for(Map.Entry<String,Employee> entry : empList.entrySet())
        {
            Employee temp = entry.getValue();
            JButton butt = new JButton("Assign to Table");
            buttons.put(temp.name, butt);
            //addEmployee(temp, butt);
        }
        for(Map.Entry<String,JButton> entry : buttons.entrySet())
        {
            entry.getValue().addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    JLabel tablelabel = new JLabel("Assign to Table");
                    tablelabel.setHorizontalAlignment(JLabel.CENTER);
                    JButton assign = new JButton("Confirm Assignment");
                    JButton back = new JButton("Back");
                    JFrame TableAssign = new JFrame();
                    JPanel TableSelect = new JPanel();
                    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                    back.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent x)
                        {
                            TableAssign.dispose();
                        }
                    });
                    
                    bottomPanel.add(assign);
                    bottomPanel.add(back);
                    JComboBox tableBox = new JComboBox(tables);
                    assign.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent l)
                        {
                            updateTable(entry.getKey(), tableBox.getSelectedItem().toString());
                            TableAssign.dispose();
                            empWindow.dispose();
                        }
                    });
                    TableAssign.setLayout(new BorderLayout());
                    TableSelect.add(tableBox);
                    TableAssign.getContentPane().add(TableSelect, BorderLayout.CENTER);
                    TableAssign.getContentPane().add(tablelabel, BorderLayout.NORTH);
                    TableAssign.getContentPane().add(bottomPanel,BorderLayout.SOUTH);
                    TableAssign.pack();
                    TableAssign.setVisible(true);
                    System.out.println("Set table for: " + entry.getKey());
                }
            });

        }
        for(Map.Entry<String,Employee> entry : empList.entrySet())
        {
            Employee temp = entry.getValue();
            JButton butt;
            for(Map.Entry<String,JButton> nen : buttons.entrySet())
            {
                if(temp.name.equals(nen.getKey()))
                {
                    butt = nen.getValue();
                    addEmployee(temp, butt);
                }
                
            }
            
        }
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
    public void addEmployee(Employee emp, JButton button)
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
        lay.gridx = 1;
        lay.gridy = location-1;
        lay.fill = GridBagConstraints.BOTH;
        lay.gridwidth = 1;
        lay.weightx = 1;
        lay.insets = new Insets(15, 15, 15, 15);
        itemPanel.add(button,lay);
        location = location + 1;
    }
    public void updateTable(String emp, String table)
    {

        EmpList list = new EmpList();
        Employee updater = list.getEmployee(emp);
        String oldString = updater.id + "," + updater.name + "," + updater.weeklyHours + "," + updater.totalSales + "," + updater.currentTable + "," + System.lineSeparator();
        String oldContent = "";
        String newString = updater.id + "," + updater.name + "," + updater.weeklyHours + "," + updater.totalSales + "," + table + "," + System.lineSeparator();
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
            System.out.println(count);
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
