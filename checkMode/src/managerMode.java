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
import java.util.ArrayList;
import java.io.*;


public class managerMode {

    String[] itemName = new String[20];
    double[] itemPrice = new double[20];
    JFrame frame = new JFrame();
    JPanel topPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    JPanel thirdPanel = new JPanel();
    JButton submit = new JButton("Submit");
    Font customFont = new Font("Arial", Font.BOLD, 20);
    

    public managerMode() {
        //edit.setVisible(false);
        
        File file = new File("menu.txt");
        Scanner sc;
        try {
          sc = new Scanner(file);
          for (int i = 0; i < 20; i++) {
            itemName[i] = sc.nextLine();
            itemPrice[i] = Double.valueOf(sc.nextLine());
            System.out.println(i + itemName[i] + " " + itemPrice[i]);
          }
             
        } catch (FileNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }


        JTextArea foodItem = new JTextArea();
        JComboBox foodBox = new JComboBox(itemName);
        foodBox.addActionListener(foodBox);
        JTextArea prompt = new JTextArea();
        JTextField changeTo = new JTextField();
        foodBox.setPreferredSize(new Dimension(200, 30));
        changeTo.setPreferredSize(new Dimension(200, 30));
        frame.setTitle("Manager Mode");
        frame.setLayout(new GridLayout(3, 1));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
        topPanel.setBackground(Color.GRAY);
        secondPanel.setBackground(Color.GRAY);
        thirdPanel.setBackground(Color.GRAY);

        JComboBox foodName = new JComboBox(itemName);
        foodName.setPreferredSize(new Dimension(200, 30));
        JTextArea foodPrice = new JTextArea();
        JTextField priceChange = new JTextField();
        JTextArea prompt2 = new JTextArea();
        JTextArea to = new JTextArea();
        JButton priceSubmit = new JButton("Submit");
        JTextArea removeEmployee = new JTextArea("Remove Employee:");

        JComboBox employeeBox = new JComboBox(getNames("emplist.txt"));
        JButton delete = new JButton("Delete");

        prompt2.setFont(customFont);
        prompt2.setBackground(Color.GRAY);
        prompt2.setText("Price Change: ");
        to.setFont(customFont);
        to.setBackground(Color.GRAY);
        to.setText(" Change Price to: ");
        
        foodPrice.setFont(customFont);
        foodPrice.setBackground(Color.GRAY);;
        foodPrice.setText(String.valueOf("$" + itemPrice[foodName.getSelectedIndex()]));
        foodName.setFont(customFont);
        foodName.setBackground(Color.lightGray);
        foodBox.setFont(customFont);
        foodBox.setBackground(Color.lightGray);
        foodBox.setPreferredSize(new Dimension(200, 30));
        foodName.setPreferredSize(new Dimension(200, 30));
        foodName.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        foodPrice.setText(String.valueOf("$" + itemPrice[foodName.getSelectedIndex()]));
                    }
                });

        priceChange.setFont(customFont);
        priceChange.setBackground(Color.lightGray);
        priceChange.setPreferredSize(new Dimension(200, 30));

        removeEmployee.setFont(customFont);
        removeEmployee.setBackground(Color.GRAY);
        thirdPanel.add(removeEmployee);
        employeeBox.setFont(customFont);
        employeeBox.setBackground(Color.lightGray);
        thirdPanel.add(employeeBox);
        delete.setFont(customFont);
        delete.setBackground(Color.lightGray);
        thirdPanel.add(delete);

        secondPanel.add(prompt2);
        secondPanel.add(foodName);
        secondPanel.add(foodPrice);
        secondPanel.add(to);
        secondPanel.add(priceChange);
        secondPanel.add(priceSubmit);
        
        topPanel.add(foodItem);
        topPanel.add(foodBox);
        topPanel.add(prompt);
        topPanel.add(changeTo);
        topPanel.add(submit);
        foodItem.setFont(customFont);
        foodItem.setBackground(Color.GRAY);
        foodItem.setText("Menu Item: ");
        foodItem.setEditable(false);
        prompt.setFont(customFont);
        changeTo.setBackground(Color.lightGray);
        changeTo.setFont(customFont);
        prompt.setText("Change To: ");
        prompt.setEditable(false);
        prompt.setBackground(Color.GRAY);
        submit.setFont(customFont);
        submit.setBackground(Color.lightGray);
        priceSubmit.setFont(customFont);
        priceSubmit.setBackground(Color.lightGray);


        //modifyPrice("D:/Git/POS-System/checkMode/src/menu.txt", "Lemonade", "4.99");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modifyFile("menu.txt", foodBox.getSelectedItem().toString(), changeTo.getText());
                System.out.println(foodBox.getSelectedIndex());
                int temp = foodBox.getSelectedIndex();
                foodBox.removeItemAt(foodBox.getSelectedIndex());
                foodBox.insertItemAt(changeTo.getText(), temp);
                foodBox.setEditable(true);
                foodBox.setSelectedItem(changeTo.getText());

                foodName.removeItemAt(foodBox.getSelectedIndex());
                foodName.insertItemAt(changeTo.getText(), temp);
                foodName.setEditable(true);
                foodName.setSelectedItem(changeTo.getText());

            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployee("emplist.txt", employeeBox.getSelectedItem().toString());
                employeeBox.removeItemAt(employeeBox.getSelectedIndex());

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
        });

        priceSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modifyPrice("menu.txt", foodName.getSelectedItem().toString(), priceChange.getText());
                foodPrice.setText("$" + priceChange.getText());
            }
        });



        frame.add(topPanel);
        frame.add(secondPanel);
        frame.add(thirdPanel);


    }
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }

    static void modifyPrice(String filePath, String oldString, String newString) {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                if (line.contains(oldString)) {
                    String nextLine = reader.readLine();
                    String newLine = nextLine.replaceAll("\\d+\\.\\d{2}", newString);
                    oldContent = oldContent + newLine + System.lineSeparator();
                    line = nextLine;
                }
                line = reader.readLine();
            }
            writer = new FileWriter(fileToBeModified);
            writer.write(oldContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteEmployee(String filePath, String employeeName) {
        try {
            File inputFile = new File(filePath);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = employeeName;
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // Check if the current line contains the employee name
                if (currentLine.contains(lineToRemove)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }

            writer.close();
            reader.close();

            // Replace the input file with the temporary file
            inputFile.delete();
            tempFile.renameTo(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String[] getNames(String filePath) {
        ArrayList<String> nameList = new ArrayList<String>();
        
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                String name = fields[1].trim();
                nameList.add(name);
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String[] names = nameList.toArray(new String[0]);
        return names;
    }
    
}
 

