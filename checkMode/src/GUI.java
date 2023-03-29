import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font.*;
import java.awt.Color.*;

public class GUI {
    JFrame frame = new JFrame();
    JPanel foodPanel = new JPanel();
    JPanel checkPanel = new JPanel();
    JPanel bottomToolbar = new JPanel();
    JTextArea check = new JTextArea(51,30);
    double total = 0;

    public GUI() {

        

        // -----------------------    CREATE Each Button
        JButton closeCheckButton = new JButton("Close");
        JButton splitCheckButton = new JButton("Split");
        JButton chickenButton = new JButton("Chicken");
        JButton steakButton = new JButton("Steak");
        JButton fishButton = new JButton("Fish");
        JButton riceButton = new JButton("Rice");
        JButton mashButton = new JButton("Mashed Potatoes");
        JButton beansButton = new JButton("Beans");
        JButton pizzaButton = new JButton("Pizza");
        JButton burgerButton = new JButton("Burger");
        JButton hotdogButton = new JButton("Hotdog");
        JButton saladButton = new JButton("Salad");
        JButton tacoButton = new JButton("Taco");
        JButton sandwichButton = new JButton("Sandwich");
        JButton soupButton = new JButton("Soup");
        JButton sushiButton = new JButton("Sushi");

        JButton fountainDrinkButton = new JButton("Fountain Drink");
        JButton sweetTeaButton = new JButton("Sweet Tea");
        JButton lemonadeButton = new JButton("Lemonade");
        JButton icedTeaButton = new JButton("Iced Tea");
        JButton waterButton = new JButton("Water");

        //------------------------------Design each Button
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        fountainDrinkButton.setFont(buttonFont);
        sweetTeaButton.setFont(buttonFont);
        lemonadeButton.setFont(buttonFont);
        icedTeaButton.setFont(buttonFont);
        waterButton.setFont(buttonFont);
        fishButton.setFont(buttonFont);
        chickenButton.setFont(buttonFont);
        steakButton.setFont(buttonFont);
        riceButton.setFont(buttonFont);
        mashButton.setFont(buttonFont);
        beansButton.setFont(buttonFont);
        pizzaButton.setFont(buttonFont);
        burgerButton.setFont(buttonFont);
        hotdogButton.setFont(buttonFont);
        saladButton.setFont(buttonFont);
        tacoButton.setFont(buttonFont);
        sandwichButton.setFont(buttonFont);
        soupButton.setFont(buttonFont);
        sushiButton.setFont(buttonFont);
        check.setFont(buttonFont);

        //---------------------------- Setup GUI FRAME
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS");
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);

        //----------- Give Each Button Logic
        // ----------- Steak Button Backend
        chickenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Chicken - $13.99\n");
              total += 13.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
        // ----------- Steak Button Backend
        steakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Steak - $18.99\n");
              total += 18.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
        // ----------- fishButton Backend
        fishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Fish - $10.69\n");
              total += 10.69;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Rice Button Backend
        riceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Rice - $2.99\n");
              total += 2.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Mash Button Backend
        mashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Mashed Potatoes - $2.99\n");
              total += 2.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Beans Button Backend
        beansButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Beans- $2.99\n");
              total += 2.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Pizza Button Backend
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Pizza - $12.99\n");
              total += 12.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Burger Button Backend
        burgerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Burger - $11.99\n");
              total += 11.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Hotdog Button Backend
        hotdogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Hot Dog - $5.99\n");
              total += 5.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Salad Button Backend
        saladButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Salad - $5.99\n");
              total += 5.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Taco Button Backend
        tacoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Taco - $5.99\n");
              total += 5.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Sandwich Button Backend
        sandwichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Sandwich - $8.99\n");
              total += 8.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Soup Button Backend
        soupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Soup - $5.99\n");
              total += 5.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Sushi Button Backend
        sushiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Sushi - $10.99\n");
              total += 10.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ------------- Fountain Drink Button Backend
        fountainDrinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Fountain Drink - $3.99\n");
              total += 3.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Sweet Tea Button Backend
        sweetTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Sweet Tea - $3.99\n");
              total += 3.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Lemonade Button Backend
        lemonadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Lemonade - $3.99\n");
              total += 3.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Iced Tea Button Backend
        icedTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Iced Tea - $3.99\n");
              total += 3.99;
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });
          // ----------- Water Button Backend
        waterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              check.append("Water - $0.00\n");
              System.out.println("Total is " + String.format("%.2f", total));
            }
          });

        //--------------------------------- SETTING UP FOOD PANEL     
        int numCols = 5;
        int numRows = 5;
        int hgap = 5; // horizontal gap between cells
        int vgap = 5; // vertical gap between cells
        foodPanel.setLayout(new GridLayout(numRows, numCols, hgap, vgap));
        foodPanel.setBackground(Color.DARK_GRAY);
        foodPanel.add(fountainDrinkButton);
        foodPanel.add(sweetTeaButton);
        foodPanel.add(lemonadeButton);
        foodPanel.add(icedTeaButton);
        foodPanel.add(waterButton);
        foodPanel.add(fishButton);
        foodPanel.add(chickenButton);
        foodPanel.add(steakButton);
        foodPanel.add(riceButton);
        foodPanel.add(mashButton);
        foodPanel.add(beansButton);
        foodPanel.add(pizzaButton);
        foodPanel.add(burgerButton);
        foodPanel.add(hotdogButton);
        foodPanel.add(saladButton);
        foodPanel.add(tacoButton);
        foodPanel.add(sandwichButton);
        foodPanel.add(soupButton);
        foodPanel.add(sushiButton);
        

        // ---------------------Setting up checkPanel
        checkPanel.setBackground(Color.DARK_GRAY);
        JScrollPane scrollPane = new JScrollPane(check);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneLayout.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneLayout.HORIZONTAL_SCROLLBAR_NEVER);
        checkPanel.add(scrollPane);



        // ---------------- Setting up bottomToolbar
        bottomToolbar.setBackground(Color.GRAY);
        bottomToolbar.add(closeCheckButton);
        bottomToolbar.add(splitCheckButton);
        closeCheckButton.setFont(buttonFont);
        splitCheckButton.setFont(buttonFont);



        frame.add(foodPanel, BorderLayout.CENTER);
        frame.add(checkPanel, BorderLayout.WEST);
        frame.add(bottomToolbar, BorderLayout.SOUTH);
    }
}
