package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
//import bank.management.system.TransparentTextField;

public class Deposit extends JFrame implements ActionListener {
    String pinNumber;
    private TextField depositAmount= new TextField();

    private JButton deposit, back;



    public String generateTransactionId(){
        String transactionId = "";
        for(int i = 0; i < 10; i++){
            transactionId += (int)(Math.random() * 10);
        }
        return transactionId;
    }

    Deposit(String pinNumber){
        this.pinNumber = pinNumber;
        // Image setup
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        JLabel imageLabel;
        Image image = imageIcon.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 1550, 830);
        add(imageLabel);


        JLabel label1 = new JLabel("ENTER THE DESIRED AMOUNT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460, 180, 400, 35);
        imageLabel.add(label1);

        depositAmount = new TextField();
        depositAmount.setBounds(460, 230, 320, 25);
        depositAmount.setBackground(new Color(65, 125, 128));
        depositAmount.setForeground(Color.WHITE);
        depositAmount.setFont(new Font("Raleway", Font.BOLD, 16));
        imageLabel.add(depositAmount);


        deposit = new JButton("DEPOSIT");
        deposit.setBounds(700, 362, 150, 35);
        deposit.setBackground(new Color(65, 125, 128));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        imageLabel.add(deposit);

        back = new JButton("BACK");
        back.setBounds(700, 406, 150, 35);
        back.setBackground(new Color(65, 125, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        imageLabel.add(back);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            long transactionId = Long.parseLong(generateTransactionId());
            double amount;
            String tempAmt = depositAmount.getText();
            try{
            amount = Double.parseDouble(tempAmt);
            }catch (Exception E){
                if(depositAmount.getText().isEmpty() && e.getSource()!=back)
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Amount");
                if(depositAmount.getText().isEmpty() && e.getSource() == back)
                    setVisible(false);

                return;
            }
            Date datetime = new Date();
            if(e.getSource()==deposit){
                    if(tempAmt.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter Amount to Deposit");
                    }else{
                        Connection c = new Connection();
                        if (pinNumber.isEmpty()) {
                            c.statement.executeUpdate("insert into bank (transaction_id, date_time, transaction_type, amount) values ('" + transactionId + "', '" + datetime + "', 'Deposit', '" + amount + "')");
                        } else {
                            c.statement.executeUpdate("insert into bank (transaction_id, pin_number, date_time, transaction_type, amount) values ('" + transactionId + "', '" + pinNumber + "', '" + datetime + "', 'Deposit', '" + amount + "')");
                        }
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + "/- Deposited Successfully");
                        setVisible(false);
                }
            }else if(e.getSource() == back){
                if(depositAmount.getText().isEmpty())
                    setVisible(false);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }


    public static void main(String[] args) {
        new Deposit("");
    }


}
