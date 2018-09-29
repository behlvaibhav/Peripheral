package hardwarestore;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author LENOVO
 */
public class admintable extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
    JButton b1,b2,b3,b4,b5,b6;
    Font f;
    public admintable(String Title)
    {
        super(Title);
        f = new Font("Arial", Font.BOLD,15);
        l1 = new JLabel("Item Number");
        l2 = new JLabel("101");
        l3 = new JLabel("102");
        l4 = new JLabel("103");
        l5 = new JLabel("104");
        l6 = new JLabel("105");
        l7 = new JLabel("106");
        l8 = new JLabel("Item Name");
        l9 = new JLabel("Wired Keyboard");
        l10 = new JLabel("Wireless Keyboard");
        l11 = new JLabel("Wired Mouse");
        l12 = new JLabel("Wireless Mouse");
        l13 = new JLabel("CRT Monitor");
        l14 = new JLabel("LED Monitor");
        l15 = new JLabel("Quantity");
        l16 = new JLabel("0");
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 1;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l16.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        l17 = new JLabel("0");
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 2;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l17.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        l18 = new JLabel("0");
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 3;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l18.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        l19 = new JLabel("0");
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 4;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l19.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        l20 = new JLabel("0");
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 5;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l20.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        l21 = new JLabel("0");
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 6;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l21.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        l1.setFont(f);
        l8.setFont(f);
        l15.setFont(f);
        b1 = new JButton("+10");
        b2 = new JButton("+10");
        b3 = new JButton("+10");
        b4 = new JButton("+10");
        b5 = new JButton("+10");
        b6 = new JButton("+10");
        setLayout(null);
        l1.setBounds(10,20,100,30);
        l2.setBounds(10,80,100,30);
        l3.setBounds(10,120,100,30);
        l4.setBounds(10,160,100,30);
        l5.setBounds(10,200,100,30);
        l6.setBounds(10,240,100,30);
        l7.setBounds(10,280,100,30);
        l8.setBounds(130,20,150,30);
        l9.setBounds(130,80,150,30);
        l10.setBounds(130,120,150,30);
        l11.setBounds(130,160,150,30);
        l12.setBounds(130,200,150,30);
        l13.setBounds(130,240,150,30);
        l14.setBounds(130,280,150,30);
        l15.setBounds(270,20,100,30);
        l16.setBounds(270,80,100,30);
        l17.setBounds(270,120,100,30);
        l18.setBounds(270,160,100,30);
        l19.setBounds(270,200,100,30);
        l20.setBounds(270,240,100,30);
        l21.setBounds(270,280,100,30);
        b1.setBounds(370,80,100,30);
        b2.setBounds(370,120,100,30);
        b3.setBounds(370,160,100,30);
        b4.setBounds(370,200,100,30);
        b5.setBounds(370,240,100,30);
        b6.setBounds(370,280,100,30);
        add(l1);add(l2);add(l3);
        add(l4);add(l5);add(l6);
        add(l7);add(l8);add(l9);
        add(l10);add(l11);add(l12);
        add(l13);add(l14);add(l15);
        add(l16);add(l17);add(l18);
        add(l19);add(l20);add(l21);
        add(b1);add(b2);add(b3);
        add(b4);add(b5);add(b6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }
    int a,b,c,d,e;
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==b1)
        {
          try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity +10 where itemid=1;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "updated");
               
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
          try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 1;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l16.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
     }
    
            
        
        if(ae.getSource()==b2) 
        {
             try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity +10 where itemid=2;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "updated");
               
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
             try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 2;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l17.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        }
        if(ae.getSource()==b3) 
        {
             try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity +10 where itemid=3;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "updated");
               
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
             try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 3;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l18.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        }
        if(ae.getSource()==b4) 
        {
             try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity +10 where itemid=4;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "updated");
               
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
             try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 4;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l19.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        }
        if(ae.getSource()==b5) 
        {
             try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity +10 where itemid=5;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "updated");
               
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
             try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 5;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l20.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        }
        if(ae.getSource()==b6) 
        {
             try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity +10 where itemid=6;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(rootPane, "updated");
               
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
             try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
            PreparedStatement pss=con.prepareStatement("select Quantity from stock where itemid = 6;") ;
            ResultSet rs = pss.executeQuery();
            rs.next();
            int a = rs.getInt("Quantity");
            l21.setText(String.valueOf(a));    
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"something went wrong"+e);
        }
        }
    }
    public static void main(String args[])
    {
        admintable admin = new admintable("Stock");
        admin.getContentPane().setBackground(Color.white);
        admin.setSize(500,400);
        admin.setLocation(400,150);
        admin.setDefaultCloseOperation(EXIT_ON_CLOSE);
        admin.setVisible(true);
    }
}