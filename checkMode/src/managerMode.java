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


public class managerMode {

    String[] itemName = new String[20];
    double[] itemPrice = new double[20];
    JFrame frame = new JFrame();
    JPanel topPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    JButton submit = new JButton("Submit");
    

    public managerMode() {
        //edit.setVisible(false);
        
        File file = new File("D:/Git/POS-System/checkMode/src/menu.txt");
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
        foodBox.setPreferredSize(new Dimension(200, 20));
        changeTo.setPreferredSize(new Dimension(200, 20));
        frame.setTitle("Manager Mode");
        frame.setLayout(new GridLayout(3, 1));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);

        JComboBox foodName = new JComboBox(itemName);
        foodName.setPreferredSize(new Dimension(200, 20));
        JTextArea foodPrice = new JTextArea();
        JTextField priceChange = new JTextField();
        JTextArea prompt2 = new JTextArea();
        JTextArea to = new JTextArea();
        JButton priceSubmit = new JButton("Submit");

        prompt2.setText("Price Change: ");
        to.setText(" Change Price to: ");
        
        foodPrice.setText(String.valueOf("$" + itemPrice[foodName.getSelectedIndex()]));
        foodName.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        foodPrice.setText(String.valueOf("$" + itemPrice[foodName.getSelectedIndex()]));
                    }
                });

        priceChange.setPreferredSize(new Dimension(200, 20));

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
        foodItem.setText("Menu Item: ");
        foodItem.setEditable(false);
        prompt.setText("Change To: ");
        prompt.setEditable(false);

        //modifyPrice("D:/Git/POS-System/checkMode/src/menu.txt", "Lemonade", "4.99");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modifyFile("D:/Git/POS-System/checkMode/src/menu.txt", foodBox.getSelectedItem().toString(), changeTo.getText());
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

        priceSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modifyPrice("D:/Git/POS-System/checkMode/src/menu.txt", foodName.getSelectedItem().toString(), priceChange.getText());
                foodPrice.setText("$" + priceChange.getText());
            }
        });



        frame.add(topPanel);
        frame.add(secondPanel);


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
    
    
}
 

