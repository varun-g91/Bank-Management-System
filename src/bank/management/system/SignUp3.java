package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import java.util.*;

public class SignUp3 extends JFrame implements ActionListener {


    private final String[] services = {"ATM CARD", "Internet Banking", "Mobile Banking",
            "Email Alerts", "Cheque book", "E-Statement"};
    private final boolean[] serviceStatus = new boolean[services.length];
    private final JCheckBox[] serviceBoxes = new JCheckBox[services.length];
    private JCheckBox serviceBox;

    private JRadioButton savings, current, fixedDeposit, recurringDeposit;

    private JButton s, c;
    public static String formnumber;

    SignUp3(String formnumber) {
        this.formnumber = formnumber;

        // Image setup
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        if (imageIcon != null) {
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setBounds(150, 5, 100, 100);
            add(imageLabel);
        } else {
            System.err.println("Error: Unable to load image.");
        }

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details:");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        savings = new JRadioButton("Savings Account");
        savings.setFont(new Font("Arial", Font.BOLD, 14));
        savings.setBackground(new Color(215, 252, 252));
        savings.setBounds(100, 190, 150, 30);
        add(savings);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Arial", Font.BOLD, 14));
        current.setBackground(new Color(215, 252, 252));
        current.setBounds(300, 190, 150, 30);
        add(current);

        fixedDeposit = new JRadioButton("Fixed Deposit");
        fixedDeposit.setFont(new Font("Arial", Font.BOLD, 14));
        fixedDeposit.setBackground(new Color(215, 252, 252));
        fixedDeposit.setBounds(100, 260, 150, 30);
        add(fixedDeposit);

        recurringDeposit = new JRadioButton("Recurring Deposit");
        recurringDeposit.setFont(new Font("Arial", Font.BOLD, 14));
        recurringDeposit.setBounds(300, 260, 200, 30);
        recurringDeposit.setBackground(new Color(215, 252, 252));
        add(recurringDeposit);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(savings);
        buttonGroup.add(current);
        buttonGroup.add(fixedDeposit);
        buttonGroup.add(recurringDeposit);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 330, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 14));
        l5.setBounds(100, 360, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(330, 330, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("(it will only appear on atm cards, cheque book and statements)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setBounds(330, 360, 500, 30);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 430, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(330, 430, 100, 30);
        add(l9);

        JLabel l10 = new JLabel("(Your 4-digit PIN)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setBounds(100, 460, 250, 30);
        add(l10);

        JLabel l11 = new JLabel("Desired Banking Services:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 510, 300, 30);
        add(l11);

        //initializing checkBoxes
        int startXPosition = 100;
        int startYPosition = 560;
        int xSpacing = 200;
        int ySpacing = 50;

        for (int i = 0; i < services.length; i++) {
            serviceBox = new JCheckBox(services[i]);
            serviceBox.setBackground(new Color(215, 252, 252));
            serviceBox.setFont(new Font("Raleway", Font.BOLD, 16));

            // Calculate the x and y positions based on the arrangement
            int xPosition = startXPosition + (i % 2) * xSpacing;
            int yPosition = startYPosition + (i / 2) * ySpacing;

            serviceBox.setBounds(xPosition, yPosition, 170, 30);

            // Set the checkbox state based on serviceStatus array
            serviceBox.setSelected(serviceStatus[i]);

            add(serviceBox);
            serviceBoxes[i] = serviceBox;
        }

        JCheckBox C = new JCheckBox("I hereby declare that the above entered  are correct to the best of my knowledge.", true);
        C.setBackground(new Color(215, 252, 252));
        C.setFont(new Font("Raleway", Font.BOLD, 12));
        C.setBounds(100, 750, 505, 20);
        add(C);

        JLabel formNum = new JLabel("Form Number:");
        formNum.setFont(new Font("Raleway", Font.BOLD, 18));
        formNum.setBounds(600, 10, 200, 30);
        add(formNum);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD, 12));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250, 780, 150, 30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420, 780, 150, 30);
        c.addActionListener(this);
        add(c);


        getContentPane().setBackground(new Color(215, 252, 252));
        setLayout(null);
        setSize(850, 850);
        setLocation(400, 20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        String accType = "";
        String formnum = formnumber;
        Random random = new Random();

        //generating card number
        long first7 = (random.nextLong() % 90000000L) + 1409963000000000L;
        String cardNumber = "" + Math.abs(first7);

        long first3 = (random.nextLong() % 9000L) + 1000L;
        String pinNumber = "" + Math.abs(first3);

        //initializing account type
        if (savings.isSelected())
            accType = "Savings";
        else if (current.isSelected())
            accType = "Current";
        else if (fixedDeposit.isSelected())
            accType = "Fixed Deposit";
        else if (recurringDeposit.isSelected())
            accType = "Recurring Deposit";


        //setting selected checkBox
        for (int i = 0; i < serviceBoxes.length; i++) {
            JCheckBox checkBox = serviceBoxes[i];
            if (checkBox.isSelected()) {
                serviceStatus[i] = true;  // Set to true if selected
            } else {
                serviceStatus[i] = false; // Set to false if not selected
            }
        }
        try {
            if (e.getSource() == s) {
                if (accType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select desired account type.");
                } else {
//                  //  Arrays.fill(serviceStatus, false);
//                    // Setting selected checkBox
//                    for (int i = 0; i < services.length; i++) {
//                        JCheckBox checkBox = serviceBoxes[i];
//                        serviceStatus[i] = checkBox.isSelected();
//                    }

                    Connection c1 = new Connection();
                    String q1 = "INSERT INTO signup13 VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    String q2 = "INSERT INTO login VALUES (?, ?, ?)";
                    PreparedStatement pstmt1 = c1.connection.prepareStatement(q1);
                    PreparedStatement pstmt2 = c1.connection.prepareStatement(q2);

                    // Set parameters for the signup13 table
                    pstmt1.setString(1, formnum);
                    pstmt1.setString(2, accType);
                    pstmt1.setString(3, cardNumber);
                    pstmt1.setString(4, pinNumber);

                    // Iterate through the checkboxes and set corresponding parameters
                    for (int i = 0; i < serviceBoxes.length; i++) {
                        boolean selected = serviceBoxes[i].isSelected();
                        pstmt1.setBoolean(5 + i, selected);
                    }

                    // Set parameters for the login table
                    pstmt2.setString(1, formnum);
                    pstmt2.setString(2, cardNumber);
                    pstmt2.setString(3, pinNumber);

                    // Execute the updates
                    pstmt1.executeUpdate();
                    pstmt2.executeUpdate();

                    pstmt1.close();
                    pstmt2.close();

                    // Display card number and pin
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin Number:" + pinNumber);
                    new Deposit(pinNumber);
                    setVisible(false);
                }
            } else if (e.getSource() == c) {
                System.exit(0);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
        } catch (Exception E) {

        }

    }
        public static void main (String[]args){
            new SignUp3("");
        }
    }

