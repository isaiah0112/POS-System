import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.Font.*;
import java.awt.Color.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class registerNewUser {

    public JFrame frame = new JFrame();
    public JPanel top = new JPanel();
    public JPanel middle = new JPanel();
    public JPanel bottom = new JPanel();
    JTextArea newEmployeeName = new JTextArea();
    JTextArea newUserID = new JTextArea();
    JTextArea enterName = new JTextArea();
    JTextArea employeeID = new JTextArea();
    JButton addEmployee = new JButton("Add Employee");
    Font customFont = new Font("Arial", Font.BOLD, 20);

    public registerNewUser() {
        frame.setTitle("Register New User");
        frame.setSize(800, 800); 
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
        top.setBackground(Color.GRAY);
        middle.setBackground(Color.GRAY);
        bottom.setBackground(Color.GRAY);

        frame.setLayout(new GridLayout(3, 1));

        newEmployeeName.setText("New Employee's Name: ");
        newEmployeeName.setBackground(Color.GRAY);
        newEmployeeName.setEditable(false);
        newEmployeeName.setFont(customFont);
        enterName.setPreferredSize(new Dimension(200, 20));
        enterName.setFont(customFont);
        enterName.setBackground(Color.lightGray);
        enterName.setText("");
        top.add(newEmployeeName);
        top.add(enterName);

        int grabNewID = getNextID("emplist.txt");
        newUserID.setFont(customFont);
        newUserID.setBackground(Color.lightGray);
        newUserID.setText("New User's ID: ");
        employeeID.setText(Integer.toString(grabNewID));
        employeeID.setFont(customFont);
        employeeID.setBackground(Color.lightGray);
        middle.add(newUserID);
        middle.add(employeeID);

        addEmployee.setFont(customFont);
        addEmployee.setBackground(Color.lightGray);
        bottom.add(addEmployee);
        
        frame.add(top);
        frame.add(middle);
        frame.add(bottom);

        frame.getRootPane().setDefaultButton(addEmployee);

        addEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (enterName.getText().length() != 0)
                {

                    Employee temp = new Employee(grabNewID, enterName.getText(), 0, 0, 0);
                    EmpList add = new EmpList();
                    add.addEmployee(temp);
                    //appendLineToFile("emplist.txt", grabNewID, enterName.getText(), 0, 0, 0);
                    frame.dispose();

                    try {
                        File inputFile = new File("emplist.txt");
                        File tempFile = new File("temp.txt");
            
                        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
                        String currentLine;
            
                        while ((currentLine = reader.readLine()) != null) {
                            if (currentLine.trim().isEmpty()) {
                                continue;  // Skip empty line
                            }
                            writer.write(currentLine + System.getProperty("line.separator"));
                        }
            
                        writer.close();
                        reader.close();
            
                        // Replace the input file with the temporary file
                        inputFile.delete();
                        tempFile.renameTo(inputFile);
                    } catch (IOException k) {
                        k.printStackTrace();
                    }
                }

            }
        });

        enterName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if (enterName.getText().length() != 0)
                {
                    appendLineToFile("emplist.txt", grabNewID, enterName.getText(), 0, 0, 0);
                    frame.dispose();

                    try {
                        File inputFile = new File("emplist.txt");
                        File tempFile = new File("temp.txt");
            
                        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
                        String currentLine;
            
                        while ((currentLine = reader.readLine()) != null) {
                            if (currentLine.trim().isEmpty()) {
                                continue;  // Skip empty line
                            }
                            writer.write(currentLine + System.getProperty("line.separator"));
                        }
            
                        writer.close();
                        reader.close();
            
                        // Replace the input file with the temporary file
                        inputFile.delete();
                        tempFile.renameTo(inputFile);
                    } catch (IOException k) {
                        k.printStackTrace();
                    }
                }
              }
            }
        });

    }
    
    public static int getNextID(String filePath) {
        int nextID = 0;
        
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            String lastLine = "";

            while (scanner.hasNextLine()) {
                lastLine = scanner.nextLine();
            }

            scanner.close();

            String[] fields = lastLine.split(",");
            int lastID = Integer.parseInt(fields[0]);

            // Increment last ID by 1
            nextID = lastID + 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return nextID;
    }

    public static void appendLineToFile(String filePath, int id, String name, double sales, int hours, int tables) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(id + "," + name + "," + sales + "," + hours + "," + tables + "," +  "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
