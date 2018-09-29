package hardwarestore;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class login extends JFrame implements ActionListener
{
 JButton b1,b2;
 JLabel l1,l2;
 JTextField t1;
 JPasswordField p1;
 public login(String title)
 {
     super(title);
     b1=new JButton("Login");
     b2=new JButton("Cancel");
     l1=new JLabel("Login Id");
     l2=new JLabel("Password");
     t1=new JTextField();
     p1=new JPasswordField();
     setLayout(null);
     l1.setBounds(5,10,100,30);
     l2.setBounds(5,45,100,30);
     t1.setBounds(110,10,150,30);
     p1.setBounds(110,45,150,30);
     add(l1);add(l2);
     add(t1);add(p1);
     b1.setBounds(40,100,80,30);
     b2.setBounds(150,100,80,30);
     add(b1);add(b2);
     b1.addActionListener(this);
     b2.addActionListener(this);
 }
    String name,pass;
 @Override
    public void actionPerformed(ActionEvent ae) 
    {
      if(ae.getSource()==b2) 
      {
        dispose();
      }
      if(ae.getSource()==b1)
      {    
          try {
              name=t1.getText();
              pass=p1.getText();
              
              Class.forName("com.mysql.jdbc.Driver");
             
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
              
              PreparedStatement pss=con.prepareStatement("select * from login where username = '"+name+"' and passworde = '"+pass+"';");
              System.out.println(name);
              ResultSet rs = pss.executeQuery();
              if(rs.next())
              {
                  JOptionPane.showMessageDialog(rootPane,"welcome");
                    Catalogue cat = new Catalogue("Catalogue");
                    cat.show(true);
                    cat.setSize(1370,730);
                    this.show(false);
              }
              else
              {
                  JOptionPane.showMessageDialog(rootPane,"Invalid Username or password");
                  
              }
              
              
              
               }
               catch(Exception e)
          {
            JOptionPane.showMessageDialog(null,"Sorry no such record"+e);
                 
          }
          }
    }
    
 
 public static void main(String[] args)
    {
      login log=new login("login");  
        log.setSize(300,200);
        log.setLocation(450,150);
        log.setDefaultCloseOperation(EXIT_ON_CLOSE);
        log.setVisible(true);
    }
}