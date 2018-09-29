package hardwarestore;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Catalogue extends JFrame implements ActionListener, MouseListener
{
    JTabbedPane tab;
    JPanel panel1, panel2, panel3;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18;
    JButton button1, button2, button3, button4, button5, button6;
    Font f;
    public Catalogue(String Title) {
    super(Title);
    tab = new JTabbedPane();
    f = new Font("Arial", Font.BOLD,30);
    panel1 = new JPanel();
    panel2 = new JPanel();
    panel3 = new JPanel();
  
    panel1.setLayout(null);
    panel2.setLayout(null);
    panel3.setLayout(null);
    
    label1 = new JLabel("Wired Keyboard");
    label2 = new JLabel("Wired Mouse");
    label3 = new JLabel("CRT Monitor");
    label10 = new JLabel("Wireless Keyboard");
    label11 = new JLabel("Wireless Mouse");
    label12 = new JLabel("LED Monitor");
    label13 = new JLabel("₹400");
    label14 = new JLabel("₹800");
    label15 = new JLabel("₹250");
    label16 = new JLabel("₹600");
    label17 = new JLabel("₹1500");
    label18 = new JLabel("₹4000");
    
    label1.setFont(f);
    label2.setFont(f);
    label3.setFont(f);
    label10.setFont(f);
    label11.setFont(f);
    label12.setFont(f);
    label13.setFont(f);
    label14.setFont(f);
    label15.setFont(f);
    label16.setFont(f);
    label17.setFont(f);
    label18.setFont(f);
    
    button1 = new JButton("Buy now");
    button2 = new JButton("Buy now");
    button3 = new JButton("Buy now");
    button4 = new JButton("Buy now");
    button5 = new JButton("Buy now");
    button6 = new JButton("Buy now");
    
    label4 = new JLabel(new ImageIcon("key1.jpg"));
    label5 = new JLabel(new ImageIcon("key2.jpg"));
  
    label6 = new JLabel(new ImageIcon("mouse1.jpg"));
    label7 = new JLabel(new ImageIcon("mouse2.jpg"));
    
    label8 = new JLabel(new ImageIcon("crt.jpg"));
    label9 = new JLabel(new ImageIcon("led.jpg"));
    
    label1.setBounds(250,5,270,50);
    label2.setBounds(270,5,270,50);
    label3.setBounds(270,5,270,50);
    label10.setBounds(790,5,400,50);
    label11.setBounds(820,5,270,50);
    label12.setBounds(840,5,270,50);

    label13.setBounds(230,500,200,30);
    label14.setBounds(790,500,200,30);
    label15.setBounds(230,500,200,30);
    label16.setBounds(790,500,200,30);
    label17.setBounds(230,500,200,30);
    label18.setBounds(790,500,200,30);
    
    label4.setBounds(180,70,400,400);
    label5.setBounds(750,70,400,400);
    label6.setBounds(180,70,400,400);
    label7.setBounds(750,70,400,400);
    label8.setBounds(180,70,400,400);
    label9.setBounds(750,70,400,400);
    
    button1.setBounds(340,500,200,30);    
    button2.setBounds(900,500,200,30);
    button3.setBounds(340,500,200,30);
    button4.setBounds(900,500,200,30);
    button5.setBounds(350,500,200,30);
    button6.setBounds(910,500,200,30);
        
    panel1.add(label1);
    panel1.add(label4);
    panel1.add(label5);
    panel1.add(label10);
    panel1.add(label13);
    panel1.add(label14);
    panel1.add(button1);
    panel1.add(button2);

    panel2.add(label2);
    panel2.add(label6);
    panel2.add(label7);
    panel2.add(label11);
    panel2.add(label15);
    panel2.add(label16);
    panel2.add(button3);
    panel2.add(button4);
  
    panel3.add(label3);
    panel3.add(label8);
    panel3.add(label9);
    panel3.add(label12);
    panel3.add(label17);
    panel3.add(label18);
    panel3.add(button5);
    panel3.add(button6);
  
    tab.addTab("Keyboard", panel1);
    tab.addTab("Mouse", panel2);
    tab.addTab("Monitor", panel3);
    add(tab);
    
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    
    label1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label11.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label9.setCursor(new Cursor(Cursor.HAND_CURSOR));
    label12.setCursor(new Cursor(Cursor.HAND_CURSOR));
    
    label1.addMouseListener(this);
    label4.addMouseListener(this);
    label5.addMouseListener(this);
    label10.addMouseListener(this);
    label2.addMouseListener(this);
    label6.addMouseListener(this);
    label7.addMouseListener(this);
    label11.addMouseListener(this);
    label3.addMouseListener(this);
    label8.addMouseListener(this);
    label9.addMouseListener(this);
    label12.addMouseListener(this);
  }

    
  public void mousePressed(MouseEvent me)
    {
      if((me.getSource()==label1)||(me.getSource()==label4))
      {
          infokey1 obj=new infokey1("Wired Keyboard");  
          obj.setSize(1200,700);
          //obj.setLocation(450,150);
          obj.setVisible(true);
      }
      else if((me.getSource()==label10)||(me.getSource()==label5))
      {
        infokey2 obj = new infokey2("Wireless Keyboard");  
        obj.setSize(1210,720);
        //obj.setLocation(500,150);
        obj.setVisible(true);
      }
      else if((me.getSource()==label2)||(me.getSource()==label6))
      {
        infomouse1 obj = new infomouse1("Wired Mouse");  
        obj.setSize(1190,700);
        //obj.setLocation(500,150);
        obj.setVisible(true);
      }
      else if((me.getSource()==label7)||(me.getSource()==label11))
      {
        infomouse2 obj = new infomouse2("Wireless Mouse");  
        obj.setSize(1200,700);
        //obj.setLocation(500,150);
        obj.setVisible(true);
      }
      else if((me.getSource()==label3)||(me.getSource()==label8))
      {
        infomonitor1 obj = new infomonitor1("CRT Monitor");  
        obj.setSize(1200,700);
        //obj.setLocation(500,150);
        obj.setVisible(true);        
      }
      else if((me.getSource()==label9)||(me.getSource()==label12))
      {
        infomonitor2 obj = new infomonitor2("LED Monitor");  
        obj.setSize(1200,700);
        //obj.setLocation(500,150);
        obj.setVisible(true);        
      }          
    }
  
  
  public void actionPerformed(ActionEvent ae)
  {
      if(ae.getSource()==button1)
      {
           try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity -1 where itemid=1;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(null,"Order Placed for Wired Keyboard worth ₹400");
               JOptionPane.showMessageDialog(rootPane, "Thank for the order");
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
          
      }
      else if(ae.getSource()==button2)
      {
           try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity -1 where itemid=2;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(null,"Order Placed for Wireless Keyboard worth ₹800");
               JOptionPane.showMessageDialog(rootPane, "Thank for the order");
             
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
          
      }
      else if(ae.getSource()==button3)
      {
          
           try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity -1 where itemid=3;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(null,"Order Placed for Wired Mouse worth ₹250");
               JOptionPane.showMessageDialog(rootPane, "Thank for the order");
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
      
      }
      else if(ae.getSource()==button4)
      {
          
           try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity -1 where itemid=4;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(null,"Order Placed for Wireless Mouse worth ₹600");
               JOptionPane.showMessageDialog(rootPane, "Thank for the order");
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
       
      }
      else if(ae.getSource()==button5)
      {
           try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity -1 where itemid=5;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(null,"Order Placed for CRT Monitor worth ₹1500");
               JOptionPane.showMessageDialog(rootPane, "Thank for the order");
           
    
         }
    catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
          
      }
          else if(ae.getSource()==button6)
          {
               try 
         {
    
      
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_work", "root","ayush");
                PreparedStatement pss=con.prepareStatement("update stock set quantity=quantity -1 where itemid=6;") ;
                
               int sss=pss.executeUpdate();
               JOptionPane.showMessageDialog(null,"Order Placed for LED Monitor worth ₹4000");
               JOptionPane.showMessageDialog(rootPane, "Thank for the order");

          } catch (SQLException | ClassNotFoundException ex) {
              Logger.getLogger(Catalogue.class.getName()).log(Level.SEVERE, null, ex);
          }
  }
  }
  
  
  public void mouseClicked(MouseEvent e)
    {
      
    }
  public void mouseReleased(MouseEvent e)
    {
        
    }

  public void mouseEntered(MouseEvent e) 
    {
        
    }

  public void mouseExited(MouseEvent e) 
    {
       
    }  
    
  public static void main(String[] args)
  {
    Catalogue cat = new Catalogue("Catalogue");
    cat.getContentPane().setBackground(Color.white);
    cat.setSize(1370,730);
    cat.setLocation(0,0);
    cat.setDefaultCloseOperation(EXIT_ON_CLOSE);
    cat.setVisible(true);
  }
}