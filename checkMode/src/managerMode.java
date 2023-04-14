import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.Font.*;
import java.awt.Color.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class managerMode {
    
    JFrame frame = new JFrame();
    JPanel north = new JPanel();
    JTextArea employeeName = new JTextArea();
    JTextArea nameInput = new JTextArea();
    JTextArea employeeID = new JTextArea();
    JTextArea IdInput = new JTextArea();

    public managerMode() {
        //edit.setVisible(false);
        frame.setTitle("Manager Mode");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
        
        north.add(employeeName);
        north.add(nameInput);
        north.add(employeeID);
        north.add(IdInput);
        employeeName.setText("Employee Name: ");
        employeeName.setEditable(false);
        employeeID.setText("Employee ID: ");
        employeeID.setEditable(false);



        frame.add(north , BorderLayout.NORTH);

        modifyFile("D:/Git/POS-System/checkMode/src/menu.txt", "85", "95");

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
}
 

