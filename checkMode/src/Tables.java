import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tables{
    JFrame frame = new JFrame();
    JPanel topPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JPanel bottomToolbar = new JPanel();
    JButton table1 = new JButton("Table 1");
    JButton table2 = new JButton("Table 2");
    JButton table3 = new JButton("Table 3");
    JButton table4 = new JButton("Table 4");
    JButton table5 = new JButton("Table 5");
    JButton table6 = new JButton("Table 6");
    JButton table7 = new JButton("Table 7");
    JButton table8 = new JButton("Table 8");
    JButton table9 = new JButton("Table 9");
    JButton table10 = new JButton("Table 10");
    JButton table11 = new JButton("Table 11");
    JButton table12 = new JButton("Table 12");
    JButton table13 = new JButton("Table 13");
    JButton table14 = new JButton("Table 14");
    JButton table15 = new JButton("Table 15");
    JButton mainMenu = new JButton("Main Menu");

    

    public Tables() {
        frame.setTitle("Store Front");
        frame.setLayout(new GridLayout(4, 1, 0, 100));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
        frame.add(topPanel);
        frame.add(centerPanel);
        //centerPanel.setLayout(new GridLayout(1, 3, 50, 0));
        frame.add(bottomPanel);
        frame.add(bottomToolbar);

        // Design for checkMode
        frame.getContentPane().setBackground(Color.GRAY);
        topPanel.setBackground(Color.GRAY);
        centerPanel.setBackground(Color.GRAY);
        bottomPanel.setBackground(Color.GRAY);
        bottomToolbar.setBackground(Color.GRAY);

        topPanel.setLayout(new GridLayout(1,7, 50, 0));
        topPanel.add(table1);
        topPanel.add(table2);
        topPanel.add(table3);
        topPanel.add(table4);
        topPanel.add(table5);
        topPanel.add(table6);
        topPanel.add(table7);
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 125, 0));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 125, 0));
        JPanel table8Panel = new JPanel();
        table8Panel.setLayout(new GridBagLayout());
        table8Panel.setPreferredSize(new Dimension(150, 150));
        table8.setPreferredSize(new Dimension(150, 150));
        table8Panel.add(table8);
        centerPanel.add(table8Panel);

        JPanel table9Panel = new JPanel();
        table9Panel.setLayout(new GridBagLayout());
        table9Panel.setPreferredSize(new Dimension(150, 150));
        table9.setPreferredSize(new Dimension(150, 150));
        table9Panel.add(table9);
        centerPanel.add(table9Panel);

        JPanel table10Panel = new JPanel();
        table10Panel.setLayout(new GridBagLayout());
        table10Panel.setPreferredSize(new Dimension(150, 150));
        table10.setPreferredSize(new Dimension(150, 150));
        table10Panel.add(table10);
        centerPanel.add(table10Panel);

        JPanel table11Panel = new JPanel();
        table11Panel.setLayout(new GridBagLayout());
        table11Panel.setPreferredSize(new Dimension(325, 150));
        table11.setPreferredSize(new Dimension(325, 150));
        table11Panel.add(table11);
        centerPanel.add(table11Panel);

        JPanel table12Panel = new JPanel();
        table12Panel.setLayout(new GridBagLayout());
        table12Panel.setPreferredSize(new Dimension(150, 150));
        table12.setPreferredSize(new Dimension(150, 150));
        table12Panel.add(table12);
        bottomPanel.add(table12);

        JPanel table13Panel = new JPanel();
        table13Panel.setLayout(new GridBagLayout());
        table13Panel.setPreferredSize(new Dimension(150, 150));
        table13.setPreferredSize(new Dimension(150, 150));
        table13Panel.add(table13);
        bottomPanel.add(table13);

        JPanel table14Panel = new JPanel();
        table14Panel.setLayout(new GridBagLayout());
        table14Panel.setPreferredSize(new Dimension(150, 150));
        table14.setPreferredSize(new Dimension(150, 150));
        table14Panel.add(table14);
        bottomPanel.add(table14);

        JPanel table15Panel = new JPanel();
        table15Panel.setLayout(new GridBagLayout());
        table15Panel.setPreferredSize(new Dimension(325, 150));
        table15.setPreferredSize(new Dimension(325, 150));
        table15Panel.add(table15);
        bottomPanel.add(table15);

        
        bottomToolbar.setLayout(new GridBagLayout());
        //bottomToolbar.setPreferredSize(new Dimension(300 , 50));
        mainMenu.setPreferredSize(new Dimension(300 , 50));
        bottomToolbar.add(mainMenu);

        // Button Backend
        table1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });
        table15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              checkMode checkMode = new checkMode();
            }
          });

        mainMenu.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new MainMenu();
          }
        });


    }
}
