import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.Font.*;
import java.awt.Color.*;


public class managerMode extends checkMode{
    
    JFrame frame = new JFrame();
    public managerMode() {
        managerMode mgr = new managerMode();
        //edit.setVisible(false);
        frame.setTitle("Manager Mode");
        frame.setLayout(new GridLayout(4, 1, 0, 100));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);

        mgr.fishButton.setText("Poop");
    }
    
}
