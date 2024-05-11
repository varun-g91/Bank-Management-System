package bank.management.system;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;

    JTextField text1;

    JPasswordField password;

    JButton button1, button2, button3;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380, 10, 100, 100);
        add(image);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image i12 = i11.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel image1 = new JLabel(i13);
        image1.setBounds(650, 380, 100, 100);
        add(image1);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(250, 125,450, 40);
        add(label1);

        label2 = new JLabel("Card Number:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);


        text1 = new JTextField(15);
        text1.setBounds(360, 190, 230, 30);
        text1.setFont(new Font("Arial", Font.BOLD, 14));
        add(text1);


        label3 = new JLabel("Pin Number:");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        password = new JPasswordField(15);
        password.setBounds(360, 250, 230, 30);
        password.setFont(new Font("Arial", Font.BOLD, 14));
        add(password);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.BLUE);
        button1.setBackground(Color.ORANGE);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);


        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.BLUE);
        button2.setBackground(Color.ORANGE);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.BLUE);
        button3.setBackground(Color.ORANGE);
        button3.setBounds(300, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);




        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image i22 = i21.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel image21 = new JLabel(i23);
        image21.setBounds(0, 0, 850, 480);
        add(image21);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){

            }else if(e.getSource() == button2){
                text1.setText("");
                password.setText("");
            }else if(e.getSource() == button3){
                new SignUp();
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
