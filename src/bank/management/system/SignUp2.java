package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp2 extends JFrame implements ActionListener {
    String formnum;
    public String getFormNum() {
        return formnum;
    }
    JTextField textPan, textAadhar, textFn;
    JRadioButton yes, no, yes1, no1;
    JButton next;
    JComboBox<String> comboBox, comboBox2, comboBox3, comboBox4, comboBox5;

    SignUp2(String formnum) {


        super("APPLICATION FORM");

        this.formnum = formnum;

        // Set frame properties
        setSize(850, 800);  // Increase the height if necessary to accommodate all components
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(222, 123, 200));
        setResizable(false);

        // Add the icon and title
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(image);
        JLabel image1 = new JLabel(icon1);
        image1.setBounds(150, 5, 100, 100);
        add(image1);

        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details:");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        // Add form number label and text field
        JLabel lFn = new JLabel("Form Number:");
        lFn.setFont(new Font("Raleway", Font.BOLD, 18));
        lFn.setBounds(100, 110, 150, 30);
        add(lFn);

        textFn = new JTextField(formnum);
        textFn.setFont(new Font("Raleway", Font.BOLD, 14));
        textFn.setBounds(350, 110, 350, 30);
        textFn.setBackground(Color.LIGHT_GRAY);
        add(textFn);

        // Define an offset value to shift all components down from the form number section
        int yOffset = 60;

        // Add other components with shifted y-coordinates
        JLabel lR = new JLabel("Religion:");
        lR.setFont(new Font("Raleway", Font.BOLD, 18));
        lR.setBounds(100, 170 + yOffset, 100, 30);
        add(lR);

        String religion[] = {"Hindu", "Islam", "Sikh", "Christian", "Jain", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(222, 123, 200));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 170 + yOffset, 350, 30);
        add(comboBox);

        JLabel lC = new JLabel("Category:");
        lC.setFont(new Font("Raleway", Font.BOLD, 18));
        lC.setBounds(100, 220 + yOffset, 100, 30);
        add(lC);

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(222, 123, 200));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 220 + yOffset, 350, 30);
        add(comboBox2);

        JLabel lI = new JLabel("Income:");
        lI.setFont(new Font("Raleway", Font.BOLD, 18));
        lI.setBounds(100, 270 + yOffset, 100, 30);
        add(lI);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000>", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(222, 123, 200));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 270 + yOffset, 350, 30);
        add(comboBox3);

        JLabel lE = new JLabel("Education:");
        lE.setFont(new Font("Raleway", Font.BOLD, 18));
        lE.setBounds(100, 320 + yOffset, 350, 30);
        add(lE);

        String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(222, 123, 200));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 320 + yOffset, 350, 30);
        add(comboBox4);

        JLabel lO = new JLabel("Occupation:");
        lO.setFont(new Font("Raleway", Font.BOLD, 18));
        lO.setBounds(100, 370 + yOffset, 350, 30);
        add(lO);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(222, 123, 200));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 370 + yOffset, 350, 30);
        add(comboBox5);

        JLabel lP = new JLabel("Pan Card Number:");
        lP.setFont(new Font("Raleway", Font.BOLD, 18));
        lP.setBounds(100, 420 + yOffset, 350, 30);
        add(lP);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        textPan.setBounds(350, 420 + yOffset, 350, 30);
        add(textPan);

        JLabel lAd = new JLabel("Aadhar Card Number:");
        lAd.setFont(new Font("Raleway", Font.BOLD, 18));
        lAd.setBounds(100, 470 + yOffset, 350, 30);
        add(lAd);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        textAadhar.setBounds(350, 470 + yOffset, 350, 30);
        add(textAadhar);

        JLabel lSr = new JLabel("Senior Citizen:");
        lSr.setFont(new Font("Raleway", Font.BOLD, 18));
        lSr.setBounds(100, 520 + yOffset, 350, 30);
        add(lSr);

        yes = new JRadioButton("Yes");
        yes.setFont(new Font("Raleway", Font.BOLD, 14));
        yes.setBackground(new Color(222, 123, 200));
        yes.setBounds(350, 520 + yOffset, 50, 30);
        add(yes);

        no = new JRadioButton("No");
        no.setFont(new Font("Raleway", Font.BOLD, 14));
        no.setBackground(new Color(222, 123, 200));
        no.setBounds(410, 520 + yOffset, 50, 30);
        add(no);

        ButtonGroup group = new ButtonGroup();
        group.add(yes);
        group.add(no);

        JLabel lEa = new JLabel("Existing Account:");
        lEa.setFont(new Font("Raleway", Font.BOLD, 18));
        lEa.setBounds(100, 570 + yOffset, 350, 30);
        add(lEa);

        yes1 = new JRadioButton("Yes");
        yes1.setFont(new Font("Raleway", Font.BOLD, 14));
        yes1.setBackground(new Color(222, 123, 200));
        yes1.setBounds(350, 570 + yOffset, 50, 30);
        add(yes1);

        no1 = new JRadioButton("No");
        no1.setFont(new Font("Raleway", Font.BOLD, 14));
        no1.setBackground(new Color(222, 123, 200));
        no1.setBounds(410, 570 + yOffset, 50, 30);
        add(no1);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(yes1);
        group1.add(no1);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(605, 620 + yOffset, 100, 30);
        next.addActionListener(this);
        add(next);



        // Set up the frame
        setVisible(true);
        setLayout(null);
        setSize(850, 800);
        getContentPane().setBackground(new Color(222, 123, 200));
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SignUp2 obj = new SignUp2("");
        String formnum = obj.getFormNum();
        String religion = (String)comboBox.getSelectedItem();
        String category = (String)comboBox2.getSelectedItem();
        String income = (String)comboBox3.getSelectedItem();
        String education = (String)comboBox4.getSelectedItem();
        String occupation = (String)comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String seniorCitizen = "";
        if((yes.isSelected())){
            seniorCitizen = "Yes";
        }else if((no.isSelected())){
            seniorCitizen = "No";
        }
        else {
            seniorCitizen = "";
        }
        String existingAccount = "";
        if((yes1.isSelected())){
            existingAccount = "Yes";
        }else if((no1.isSelected())){
            existingAccount = "No";
        }
        else {
            existingAccount = "";
        }

        try{
            if(e.getSource() == next){
                if(textPan.getText().equals(" ") || textAadhar.getText().equals("") || existingAccount == "" || seniorCitizen == "")
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                else{
                    Connection c1 = new Connection();
                    String q = "insert into signup2 values('"+formnum+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pan+"', '"+aadhar+"', '"+seniorCitizen+"', '"+existingAccount+"' )";
                    c1.statement.executeUpdate(q);
                    setVisible(false);
                    new SignUp3(formnum);
                }
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUp2("");



    }
}
