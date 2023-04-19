import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.awt.Font.*;
import java.awt.Color.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkMode {
    JFrame frame = new JFrame();
    double total = 0;
    double given = 0;
    boolean partialPay = false;
    String[] itemName = new String[20];
    double[] itemPrice = new double[20];
    
    public checkMode() {

        
        // -----------------------    CREATE Each Button
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
    
        JPanel foodPanel = new JPanel();
        JPanel checkPanel = new JPanel();
        JPanel bottomToolbar = new JPanel();
        JTextArea check = new JTextArea(50,30);
        JButton mainMenuButton = new JButton("Store Front");
        JButton closeCheckButton = new JButton("Close");
        JButton splitCheckButton = new JButton("Split");
        JButton editButtons = new JButton("Edit Buttons");
        JButton chickenButton = new JButton(itemName[6]);
        JButton steakButton = new JButton(itemName[5]);
        JButton fishButton = new JButton(itemName[7]);
        JButton riceButton = new JButton(itemName[8]);
        JButton mashButton = new JButton(itemName[9]);
        JButton friesButton = new JButton(itemName[13]);
        JButton pizzaButton = new JButton(itemName[10]);
        JButton burgerButton = new JButton(itemName[11]);
        JButton sandwichButton = new JButton(itemName[12]);
        JButton saladButton = new JButton(itemName[14]);
        JButton cakeButton = new JButton(itemName[15]);
        JButton milkshakeButton = new JButton(itemName[16]);
        JButton soupButton = new JButton(itemName[19]);
        JButton slushyButton = new JButton(itemName[17]);
        JButton iceCreamButton = new JButton(itemName[18]);

        JButton fountainDrinkButton = new JButton(itemName[0]);
        JButton sweetTeaButton = new JButton(itemName[1]);
        JButton lemonadeButton = new JButton(itemName[2]);
        JButton icedTeaButton = new JButton(itemName[3]);
        JButton waterButton = new JButton(itemName[4]);
        checkLogic logic = new checkLogic();
        
        //------------------------------Design each Button
        Font buttonFont = new Font("Arial", Font.BOLD, 16);

        fountainDrinkButton.setFont(buttonFont);
        fountainDrinkButton.setBackground(Color.BLACK);
        fountainDrinkButton.setForeground(Color.WHITE);

        sweetTeaButton.setFont(buttonFont);
        sweetTeaButton.setBackground(Color.BLACK);
        sweetTeaButton.setForeground(Color.WHITE);

        lemonadeButton.setFont(buttonFont);
        lemonadeButton.setBackground(Color.BLACK);
        lemonadeButton.setForeground(Color.WHITE);

        icedTeaButton.setFont(buttonFont);
        icedTeaButton.setBackground(Color.BLACK);
        icedTeaButton.setForeground(Color.WHITE);

        waterButton.setFont(buttonFont);
        waterButton.setBackground(Color.BLACK);
        waterButton.setForeground(Color.WHITE);

        fishButton.setFont(buttonFont);
        fishButton.setBackground(new Color(59, 89, 182));
        fishButton.setForeground(Color.WHITE);
        
        chickenButton.setFont(buttonFont);
        chickenButton.setBackground(new Color(59, 89, 182));
        chickenButton.setForeground(Color.WHITE);

        steakButton.setFont(buttonFont);
        steakButton.setBackground(new Color(59, 89, 182));
        steakButton.setForeground(Color.WHITE);

        riceButton.setFont(buttonFont);
        riceButton.setBackground(new Color(239,227,11));
        riceButton.setForeground(Color.BLACK);

        mashButton.setFont(buttonFont);
        mashButton.setBackground(new Color(239,227,11));
        mashButton.setForeground(Color.BLACK);

        friesButton.setFont(buttonFont);
        friesButton.setBackground(new Color(239,227,11));
        friesButton.setForeground(Color.BLACK);

        pizzaButton.setFont(buttonFont);
        pizzaButton.setBackground(new Color(59, 89, 182));
        pizzaButton.setForeground(Color.WHITE);

        burgerButton.setFont(buttonFont);
        burgerButton.setBackground(new Color(59, 89, 182));
        burgerButton.setForeground(Color.WHITE);

        sandwichButton.setFont(buttonFont);
        sandwichButton.setBackground(new Color(59, 89, 182));
        sandwichButton.setForeground(Color.WHITE);

        saladButton.setFont(buttonFont);
        saladButton.setBackground(new Color(239,227,11));
        saladButton.setForeground(Color.BLACK);

        cakeButton.setFont(buttonFont);
        cakeButton.setBackground(new Color(202,57,235));
        cakeButton.setForeground(Color.WHITE);

        milkshakeButton.setFont(buttonFont);
        milkshakeButton.setBackground(new Color(202,57,235));
        milkshakeButton.setForeground(Color.WHITE);

        soupButton.setFont(buttonFont);
        soupButton.setBackground(new Color(239,227,11));
        soupButton.setForeground(Color.BLACK);

        slushyButton.setFont(buttonFont);
        slushyButton.setBackground(new Color(202,57,235));
        slushyButton.setForeground(Color.WHITE);

        iceCreamButton.setFont(buttonFont);
        iceCreamButton.setBackground(new Color(202,57,235));
        iceCreamButton.setForeground(Color.WHITE);
        
        check.setFont(buttonFont);

        //---------------------------- Setup checkMode FRAME
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS Table: ");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
        check.append("Table: " + "\n");

        //----------- Give Each Button Logic
        // ----------- Steak Button Backend
        chickenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[6] + " - " +itemPrice[6] + "\n");
              total = logic.add(itemPrice[6], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
        // ----------- Steak Button Backend
        steakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[5] + " - " + itemPrice[5] + "\n");
              total = logic.add(itemPrice[5], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
        // ----------- fishButton Backend
        fishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[7] + " - " + itemPrice[7] + "\n");
              total = logic.add(itemPrice[7], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Rice Button Backend
        riceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[8] + " - " + itemPrice[8] + "\n");
              total = logic.add(itemPrice[8], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Mash Button Backend
        mashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[9] + " - " + itemPrice[9] + "\n");
              total = logic.add(itemPrice[9], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- fries Button Backend
        friesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[13] + " - " + itemPrice[13] + "\n");
              total = logic.add(itemPrice[13], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Pizza Button Backend
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[10] + " - " + itemPrice[10] + "\n");
              total = logic.add(itemPrice[10], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Burger Button Backend
        burgerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[11] + " - " + itemPrice[11] + "\n");
              total = logic.add(itemPrice[11], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- sandwich Button Backend
        sandwichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[12] + " - " + itemPrice[12] + "\n");
              total = logic.add(itemPrice[12], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Salad Button Backend
        saladButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[14] + " - " + itemPrice[14] + "\n");
              total = logic.add(itemPrice[14], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- cake Button Backend
        cakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[15] + " - " + itemPrice[15] + "\n");
              total = logic.add(itemPrice[15], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- milkshake Button Backend
        milkshakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[16] + " - " + itemPrice[16] + "\n");
              total = logic.add(itemPrice[16], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Soup Button Backend
        soupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[19] + " - " + itemPrice[19] + "\n");
              total = logic.add(itemPrice[19], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- slushy Button Backend
        slushyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[17] + " - " + itemPrice[17] + "\n");
              total = logic.add(itemPrice[17], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Ice Cream Button Backend
        iceCreamButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            check.append(itemName[18] + " - " + itemPrice[19] + "\n");
            total = logic.add(itemPrice[18], total);
            System.out.println("Total is " + String.format("%.2f", total));
          }
        });
          // ------------- Fountain Drink Button Backend
        fountainDrinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[0] + " - " + itemPrice[0] + "\n");
              total = logic.add(itemPrice[0], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Sweet Tea Button Backend
        sweetTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[1] + " - " + itemPrice[1] + "\n");
              total = logic.add(itemPrice[1], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Lemonade Button Backend
        lemonadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[2] + " - " + itemPrice[2] + "\n");
              total = logic.add(itemPrice[2], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Iced Tea Button Backend
        icedTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[3] + " - " + itemPrice[3] + "\n");
              total = logic.add(itemPrice[3], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Water Button Backend
        waterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append(itemName[4] + " - " + itemPrice[4] + "\n");
              total = logic.add(itemPrice[4], total);
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- editButtons Button Backend
        editButtons.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            JFrame edit = new JFrame();
            JButton save = new JButton("SAVE");
            JPanel north = new JPanel();
            JPanel center = new JPanel();
            JTextArea newName = new JTextArea(1, 25);
            
            edit.setTitle("Edit Buttons");
            edit.setSize(300,200);
            edit.setVisible(true);
            edit.setLayout(new BorderLayout());

            
            

            String[] buttons = {"Fountain Drinks", "Sweet Tea", "Lemonade", "Iced Tea", "Water",
                                  "Fish", "Chicken", "Steak", "Rice", "Mashed Potatoes", "fries",
                                  "Pizza", "Burger", "sandwich", "Salad", "Cake", "milkshake", "Soup",
                                  "slushy"};
            JComboBox comboBox = new JComboBox(buttons);
            
            comboBox.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedItem().toString());
                newName.setText("");
                newName.append(comboBox.getSelectedItem().toString());
              }
            });

            north.add(comboBox);
            center.add(newName);
            center.add(save);



            edit.add(north, BorderLayout.NORTH);
            edit.add(center, BorderLayout.CENTER);
  
          }
        });
        // ----------- Main Menu Button Backend
        mainMenuButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            frame.dispose();
            // frame.getContentPane().removeAll();
            // frame.setContentPane(foodPanel);
            // frame.revalidate();
            // frame.repaint();
            
          }
        });
        // ----------- Close Button Backend
        closeCheckButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            JFrame closeCheckFrame = new JFrame();
            JPanel north = new JPanel();
            JPanel center = new JPanel();
            JPanel south = new JPanel();
            JTextArea totalCost = new JTextArea();
            JTextArea textholder = new JTextArea();
            JTextArea totalGiven = new JTextArea();
            JTextArea change = new JTextArea();
            JButton calculate = new JButton("Close Check");
            JButton button1 = new JButton("1");
            JButton button2 = new JButton("2");
            JButton button3 = new JButton("3");
            JButton button4 = new JButton("4");
            JButton button5 = new JButton("5");
            JButton button6 = new JButton("6");
            JButton button7 = new JButton("7");
            JButton button8 = new JButton("8");
            JButton button9 = new JButton("9");
            JButton button0 = new JButton("0");
            JButton buttonDot = new JButton(".");
            JButton clear = new JButton("Clear");
            JPanel topCenter = new JPanel();
            JPanel centerCenter= new JPanel();

            totalCost.setFont(buttonFont);

            center.setLayout(new BorderLayout());
            center.add(topCenter, BorderLayout.NORTH);
            center.add(centerCenter, BorderLayout.CENTER);



            topCenter.add(textholder);
            topCenter.add(totalGiven);
            centerCenter.add(calculate);

            textholder.setFont(buttonFont);
            totalGiven.setFont(buttonFont);
            textholder.append("Given: $");


            // Add the buttons to the south panel
            south.setLayout(new GridLayout(4, 3)); // 4 rows, 3 columns
            south.add(button1);
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("1");
                }
            });
            south.add(button2);
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("2");
                }
            });
            south.add(button3);
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("3");
                }
            });
            south.add(button4);
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("4");
                }
            });
            south.add(button5);
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("5");
                }
            });
            south.add(button6);
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("6");
                }
            });
            south.add(button7);
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("7");
                }
            });
            south.add(button8);
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("8");
                }
            });
            south.add(button9);
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("9");
                }
            });
            south.add(buttonDot);
            buttonDot.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append(".");
                }
            });
            south.add(button0);
            button0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalGiven.append("0");
                }
            });
            south.add(clear); // Empty cell
            clear.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                totalGiven.setText("");
              }
            });
            calculate.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {

              given = Double.parseDouble(totalGiven.getText());
              double change = given - total;
              closeCheckFrame.dispose();

              JFrame changeFrame = new JFrame();
              JPanel mainPanel = new JPanel();
              JTextArea totalText = new JTextArea();
              JTextArea givenText = new JTextArea();
              JTextArea changeText = new JTextArea();
              JButton closeWindow = new JButton("OK");

              changeFrame.setTitle("Change");
              changeFrame.setSize(300,200);
              changeFrame.setVisible(true);
              changeFrame.setLayout(new BorderLayout());
              
              changeFrame.add(mainPanel);

              mainPanel.setLayout(new GridLayout(4, 1));

              mainPanel.add(givenText);
              mainPanel.add(totalText);
              givenText.setFont(buttonFont);
              totalText.setFont(buttonFont);
              changeText.setFont(buttonFont);
              totalText.setEditable(false);
              changeText.setEditable(false);
              mainPanel.add(changeText);
              mainPanel.add(closeWindow);

              totalText.setText("Total: " + String.format("%.2f", total));
              givenText.setText("Given: $" + String.format("%.2f", given));
              changeText.setText("Change: " + String.format("%.2f", change));
              
              //RESETS FRAME FOR A NEW ORDER, CAN SAVE ALL ELEMENTS OF ORDER THROUGH THIS BUTTON AS WELL
              closeWindow.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  
                  if (given >= total)
                  {
                    total = 0;
                    check.setText("");
                    changeFrame.dispose();
                    logic.partialPayFalse();
                    partialPay = false;
                    frame.dispose();
                  }
                  else {
                    
                    changeText.setText("Change: " + String.format("%.2f" + " NEED MORE MONEY", change));
                    total = total - given;
                    totalText.setText("NEW TOTAL: " + String.format("%.2f", total));
                    given = 0;
                    closeWindow.setVisible(false);
                    logic.partialPayTrue();
                    partialPay = true;
                  }
                  
                }
              });

              }
            });


            double salesTax = .0825;
            if (partialPay == false) {
              total = total + (salesTax * total);
            }
            closeCheckFrame.setTitle("Close Check");
            closeCheckFrame.setSize(300, 250);
            closeCheckFrame.setVisible(true);
            closeCheckButton.setLayout(new BorderLayout());


            totalCost.setText("Total: " + String.format("%.2f", total));
            totalCost.setEditable(false);
            north.add(totalCost);


            closeCheckFrame.add(north, BorderLayout.NORTH);
            closeCheckFrame.add(center, BorderLayout.CENTER);
            closeCheckFrame.add(south, BorderLayout.SOUTH);
          }
        });

        //--------------------------------- SETTING UP FOOD PANEL     
        int numCols = 5;
        int numRows = 4;
        int hgap = 5; // horizontal gap between cells
        int vgap = 5; // vertical gap between cells
        foodPanel.setLayout(new GridLayout(numRows, numCols, hgap, vgap));
        foodPanel.setBackground(Color.DARK_GRAY);
        foodPanel.add(fountainDrinkButton);
        foodPanel.add(sweetTeaButton);
        foodPanel.add(lemonadeButton);
        foodPanel.add(icedTeaButton);
        foodPanel.add(waterButton);
        foodPanel.add(steakButton);
        foodPanel.add(chickenButton);
        foodPanel.add(fishButton);
        foodPanel.add(riceButton);
        foodPanel.add(mashButton);
        foodPanel.add(pizzaButton);
        foodPanel.add(burgerButton);
        foodPanel.add(sandwichButton);
        foodPanel.add(friesButton);
        foodPanel.add(saladButton);
        foodPanel.add(cakeButton);
        foodPanel.add(milkshakeButton);
        foodPanel.add(slushyButton);
        foodPanel.add(iceCreamButton);
        foodPanel.add(soupButton);

        // ---------------------Setting up checkPanel
        checkPanel.setBackground(Color.DARK_GRAY);
        JScrollPane scrollPane = new JScrollPane(check);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneLayout.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneLayout.HORIZONTAL_SCROLLBAR_NEVER);
        checkPanel.add(scrollPane);



        // ---------------- Setting up bottomToolbar
        JPanel toolbarCenter = new JPanel();
        JPanel toolbarWest = new JPanel();
        bottomToolbar.setLayout(new BorderLayout());
        toolbarCenter.setBackground(Color.GRAY);
        toolbarWest.setBackground(Color.GRAY);
        toolbarCenter.add(closeCheckButton);
        toolbarCenter.add(splitCheckButton);
        //toolbarCenter.add(editButtons);
        toolbarWest.add(mainMenuButton);
        closeCheckButton.setFont(buttonFont);
        splitCheckButton.setFont(buttonFont);

        bottomToolbar.add(toolbarCenter, BorderLayout.CENTER);
        bottomToolbar.add(toolbarWest, BorderLayout.WEST);


        frame.add(foodPanel, BorderLayout.CENTER);
        frame.add(checkPanel, BorderLayout.WEST);
        frame.add(bottomToolbar, BorderLayout.SOUTH);

    }
}