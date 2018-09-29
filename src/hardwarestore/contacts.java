package hardwarestore;
import javax.swing.*;
import java.awt.Color;
/**
 *
 * @author LENOVO
 */
public class contacts extends JFrame
{
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
   public contacts(String title)
   {
    super(title);
    l1=new JLabel("Peripheral Store");
    l2=new JLabel("Address:");
    l3=new JLabel("F-43, Okhla Indl Area Phase-II,");
    l4=new JLabel("Near C-Lal Chowk,");
    l5=new JLabel("New Delhi-110020");
    l6=new JLabel("Phone(s):");
    l7=new JLabel("01144589200");
    l8=new JLabel("01144589300");
    l9=new JLabel("Email Id:");
    l10=new JLabel("allperipherals@gmail.com");
    setLayout(null);
    l1.setBounds(95,0,300,30);
    l1.setForeground(Color.BLUE);
    l2.setBounds(5,25,200,30);
    l2.setForeground(Color.red);
    l3.setBounds(110,25,200,30);
    l4.setBounds(110,40,200,30);
    l5.setBounds(110,55,200,30);
    l6.setBounds(5,75,200,30);
    l6.setForeground(Color.red);
    l7.setBounds(110,75,200,30);
    l8.setBounds(110,90,200,30);
    l9.setBounds(5,110,200,30);
    l9.setForeground(Color.red);
    l10.setBounds(110,110,200,30);
    add(l1);add(l2);
    add(l3);add(l4);
    add(l5);add(l6);
    add(l7);add(l8);
    add(l9);add(l10);
   }
    public static void main(String[] args)
    {
     contacts obj=new contacts("Contact Us");  
        obj.setSize(320,200);
        obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
  }       
}