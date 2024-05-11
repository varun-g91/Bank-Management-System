package bank.management.system;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class SignUp extends JFrame implements ActionListener  {

    JTextField textName, textFatherName, textEmail, textCity, textAddress, textPincode, textState, textPhone;
    JDateChooser dateChooser;
    JRadioButton gender1, gender2, married, unmarried, other;
    JButton next;


    Random rand = new Random();

    long first4 = (rand.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    SignUp(){
        super("APPLICATION FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(25, 10, 100, 100);
        add(image2);



        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details:");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelName.setBounds(70, 180, 100, 30);
        add(labelName);

        textName = new  JTextField();
        textName.setFont(new Font("Arial", Font.BOLD, 14));
        textName.setBounds(300, 180, 400, 30);
        add(textName);

        JLabel labelFathersName = new JLabel("Father's Name:");
        labelFathersName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelFathersName.setBounds(70, 230, 200, 30);
        add(labelFathersName);

        textFatherName = new JTextField();
        textFatherName.setFont(new Font("Arial", Font.BOLD, 14));
        textFatherName.setBounds(300, 230, 400, 30);
        add(textFatherName);


        JLabel labelGender = new JLabel("Gender:");
        labelGender.setFont(new Font("Raleway", Font.BOLD, 20));
        labelGender.setBounds(70, 280, 200, 30);
        add(labelGender);

        gender1 = new JRadioButton("Male");
        gender1.setFont(new Font("Arial", Font.BOLD, 14));
        gender1.setBackground(new Color(190,230, 190));
        gender1.setBounds(300, 280, 100, 30);
        add(gender1);

        gender2 = new JRadioButton("Female");
        gender2.setFont(new Font("Arial", Font.BOLD, 14));
        gender2.setBackground(new Color(190,230, 190));
        gender2.setBounds(450, 280, 100, 30);
        add(gender2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(gender1);
        buttonGroup.add(gender2);


        JLabel dateOfBirth = new JLabel("Date of Birth:");
        dateOfBirth.setFont(new Font("Raleway", Font.BOLD, 22));
        dateOfBirth.setBounds(70, 330, 200, 30);
        add(dateOfBirth);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 330, 400, 30);
        add(dateChooser);

        JLabel labelEmail = new JLabel("Email Address:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 22));
        labelEmail.setBounds(70, 380, 200, 30);
        add(labelEmail);



        textEmail = new JTextField();
        textEmail.setFont(new Font("Arial", Font.BOLD, 14));
        textEmail.setBounds(300, 380, 400, 30);
        add(textEmail);

        JLabel labelMaritalStatus = new JLabel("Marital Status:");
        labelMaritalStatus.setFont(new Font("Raleway", Font.BOLD, 22));
        labelMaritalStatus.setBounds(70, 430, 200, 30);
        add(labelMaritalStatus);

        married = new JRadioButton("Married");
        married.setFont(new Font("Arial", Font.BOLD, 14));
        married.setBackground(new Color(190,230, 190));
        married.setBounds(300, 430, 150, 30);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Arial", Font.BOLD, 14));
        unmarried.setBackground(new Color(190,230, 190));
        unmarried.setBounds(460, 430, 150, 30);
        add(unmarried);

        other =  new JRadioButton("Other");
        other.setFont(new Font("Arial", Font.BOLD, 14));
        other.setBackground(new Color(190,230, 190));
        other.setBounds(620, 430, 150, 30);
        add(other);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(married);
        buttonGroup1.add(unmarried);
        buttonGroup1.add(other);

    
        JLabel labelAddress = new JLabel("Address:");
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 22));
        labelAddress.setBounds(70, 480, 200, 30);
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Arial", Font.BOLD, 14));
        textAddress.setBounds(300, 480, 400, 30);
        add(textAddress);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 22));
        labelCity.setBounds(70, 530, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Arial", Font.BOLD, 14));
        textCity.setBounds(300, 530, 400, 30);
        add(textCity);

        JLabel labelPincode = new JLabel("Pin code:");
        labelPincode.setFont(new Font("Raleway", Font.BOLD, 22));
        labelPincode.setBounds(70, 580, 200, 30);
        add(labelPincode);

        textPincode = new JTextField();
        textPincode.setFont(new Font("Arial", Font.BOLD, 14));
        textPincode.setBounds(300, 580, 400, 30);
        add(textPincode);

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway", Font.BOLD, 22));
        labelState.setBounds(70, 630, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Arial", Font.BOLD, 14));
        textState.setBounds(300, 630, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(560, 750, 140, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(190,230, 190));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNum = first;
        String name = textName.getText();
        String fatherName = textFatherName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (gender1.isSelected()) {
            gender = "Male";
        } else if (gender2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String maritalStatus = null;
        if (married.isSelected()) {
            maritalStatus = "Married";
        } else if (unmarried.isSelected()) {
            maritalStatus = "Unmarried";
        } else if (other.isSelected()) {
            maritalStatus = "Other";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();
        //String


        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Name cannot be empty");
            } else {
                Connection con1 = new Connection();
                String q = "insert into signup values('" + formNum + "', '" + name + "', '" +fatherName+"', '" + dob +"', '" +gender + "', '"+email+"', '" +maritalStatus+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"' )";
                con1.statement.executeUpdate(q);
                new SignUp2(formNum);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
    new SignUp();
    }

}
