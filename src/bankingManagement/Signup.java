package bankingManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textName,textFName,textEmail,textAdd,textCity,textPn;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;


    Random ran=new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first = "" +Math.abs(first4);

    Signup()
    {
        super("APPLICATION  FORM");

        ImageIConnect i1= new ImageIConnect(ClassLoader.getSystemResource("iConnects/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIConnect i3= new ImageIConnect(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 =new JLabel("APPLICATION FORM NO. " + first);
        label1.setBounds(190,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,30));
        add(label1);

        JLabel label2 =new JLabel("Page  1.");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(350,70,600,30);
        add(label2);

        JLabel label3 =new JLabel("Personal  Details");
        label3.setBounds(300,100,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(150,150,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(310,150,400,30);
        add(textName);

        JLabel labelfName = new JLabel(" Father's Name:");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(150,200,200,20);
        add(labelfName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(310,200,400,30);
        add(textFName);

        JLabel  DOB = new JLabel(" Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(150,250,200,20);
        add(DOB);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("raleway",Font.BOLD,20));
        labelG.setBounds(150,300,200,20);
        add(labelG);

        r1 =new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(310,300,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,300,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Enter Email");
        labelEmail.setFont(new Font("raleway",Font.BOLD,20));
        labelEmail.setBounds(150,350,200,20);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(310,350,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("raleway",Font.BOLD,20));
        labelMs.setBounds(150,400,200,20);
        add(labelMs);

        m1 =new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(310,400,90,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(410,400,110,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(530,400,90,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("raleway",Font.BOLD,20));
        labelAdd.setBounds(150,450,200,20);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(310,450,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("raleway",Font.BOLD,20));
        labelCity.setBounds(150,500,200,20);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(310,500,400,30);
        add(textCity);

        JLabel labelPn = new JLabel("Pin Code:");
        labelPn.setFont(new Font("raleway",Font.BOLD,20));
        labelPn.setBounds(150,550,200,20);
        add(labelPn);

        textPn = new JTextField();
        textPn.setFont(new Font("Raleway",Font.BOLD,14));
        textPn.setBounds(310,550,400,30);
        add(textPn);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,600,90,40);
        next.addActionListener(this);
        add(next);



        getConnecttentPane().setBackground(new Color( 222,255,228));
        setLayout(null);
        setSize(800,790);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String foramno = first;
        String name = textName.getText();
        String fname =  textFName.getText();
        String gender =  null;
        if (r1.isSelected())
        {
            gender = "Male";
        }
        else if (r2.isSelected())
        {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected())
        {
            marital = "Married";
        } else if (m2.isSelected())
        {
           gender = "Unmarried";
        }
        else if (m3.isSelected())
        {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPn.getText();
        try{
            if (textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the field");
            }
            else {
                Connect Connect1 = new Connect();
                String q = "insert into signup values('" + foramno + "', '" + name + "','" + fname + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "' )";
                Connect1.statement.executeUpdate(q);
                new Sinup2();
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();

    }
}
