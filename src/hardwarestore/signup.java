package hardwarestore;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static jdk.nashorn.tools.ShellFunctions.input;
/**
 *
 * @author LENOVO
 */
public class signup extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4;
    JPasswordField p1;
    JButton b1,b2;
//    private Connection con;
//    private PreparedStatement ps,ps1;
//    private ResultSet rs;
    public signup(String title)
    {
        super(title);
        l1=new JLabel("Enter the Details to create your LOGIN ID:");
        l2=new JLabel("Name");
        l3=new JLabel("Password");
        l4=new JLabel("Email Id");
        l5=new JLabel("Address");
        l6=new JLabel("Phone no.");
        b1=new JButton("Submit");
        b2=new JButton("Cancel");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        p1=new JPasswordField();
        setLayout(null);
        l1.setBounds(10,10,300,30);
        l2.setBounds(10,50,100,30);
        t1.setBounds(120,50,150,30);
        add(l1);add(l2);add(t1);
        l3.setBounds(10,90,100,30);
        p1.setBounds(120, 90, 150, 30);
        l4.setBounds(10,130,100,30);
        t2.setBounds(120, 130, 150, 30);
        add(l3);add(p1);add(l4);add(t2);
        l5.setBounds(10,170,100,30);
        t3.setBounds(120, 170, 150, 30);
        l6.setBounds(10,210,100,30);
        t4.setBounds(120, 210, 150, 30);
        add(l5);add(t3);add(l6);add(t4);
        b1.setBounds(40, 260, 100, 30);
        b2.setBounds(150, 260, 100, 30);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
     String name,pass,email,addr,phone1;
     long phone;
   
    public void actionPerformed(ActionEvent ae) 
    {
     if(ae.getSource()==b2)
     {
         dispose();
     }
     if(ae.getSource()==b1)
     {
         
        try 
         {
    
          name=t1.getText();
            email=t2.getText();
            addr=t3.getText();
            phone1=t4.getText();
          pass=p1.getText();
          phone=Long.parseLong(phone1);
         
            
          
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("insert into login(username,passworde,email,address,phone) values('"+name+"','"+pass+"','"+email+"','"+addr+"',"+phone1+")");
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "Inserted");
               dispose();
             
           
    
         }
    catch (Exception e) 
         {
              System.out.println(e.toString());
               JOptionPane.showMessageDialog(null,"something went wrong"+e);
             
           
         }
     }
    
    }

    public static void main(String[] args)
    {
     signup sign=new signup("Sign up");
     sign.setSize(300,350);
     sign.setLocation(420,240);
     sign.setDefaultCloseOperation(EXIT_ON_CLOSE);
     sign.setVisible(true);
    }

   /*String name,pass,email,addr,phone1;
   int phone;
   */
   /* public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2)
            dispose();
        if(e.getSource()==b1)
        {
            name=t1.getText();
            email=t2.getText();
            addr=t3.getText();
            phone1=t4.getText();
          pass=p1.getText();
          phone=Integer.parseInt(phone1);
            try 
            {
                Class.forName("com.mysql.jdbc.driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("insert into login(username,passworde,email,address,address,phone) values('"+name+"','"+email+"','"+addr+"','"+phone1+"','"+pass+"')");
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "Inserted");
               
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            } 
              
        }
        
        
    }*/
}