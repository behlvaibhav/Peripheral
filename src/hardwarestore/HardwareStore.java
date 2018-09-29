package hardwarestore;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author LENOVO
 */
public class HardwareStore extends JFrame implements MouseListener
{
    JMenuBar MB;
    JMenu Homeb,Customerb,Ownerb,Contactb;
    JMenuItem blog1,blog2,bsign;
    JPanel p1, p2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    Font f1,f2,f3;
    public HardwareStore()
    {
        l1=new JLabel(" Peripheral");
	l2=new JLabel(" Store");
        l3=new JLabel("Easy, quick and secure");
        l4=new JLabel("Our peripheral store features a wide range of computer and desktop accessories like keyboards,"); 
        l5=new JLabel("mouse, monitors, storage devices and others. These accessories enrich your working experience while");
        l6=new JLabel("simplifying your tasks. Select high quality computer peripherals from popular digital computing ");
        l7=new JLabel("brands like Sandisk, Lenovo, Sony, Targus available at our peripheral store. Irrespective of whether ");
        l8=new JLabel("you are a retailer or end user you have access to complete and up-to-date product information, ");
        l9=new JLabel("photos. It is easy to find information and just as easy to place orders. Add to that world-class ");
        l10=new JLabel("delivery assurance and you get a winning concept. It is perhaps no coincidence that we have over ");
        l11=new JLabel("1 thousand order inquiries per month.");
        l12=new JLabel(new ImageIcon("mainpic.jpg"));
	p1=new JPanel();
	p2=new JPanel();
        MB=new JMenuBar();
        Homeb=new JMenu("     Home     ");
        Customerb=new JMenu("   Customer   ");
        blog1=new JMenuItem("Login");
        bsign=new JMenuItem("Signup");
        Ownerb=new JMenu("    Owner     ");
        blog2=new JMenuItem("Login");
        Contactb=new JMenu("  Contact us  ");
        Customerb.add(blog1);
        Customerb.add(bsign);
        Ownerb.add(blog2);
        MB.add(Homeb);
        MB.add(Customerb);
        MB.add(Ownerb);
        MB.add(Contactb);
        f1 = new Font("Algerian", Font.BOLD,40);
        f2 = new Font("Arial", Font.BOLD,30);
	f3 = new Font("Arial", Font.BOLD,18);
        l1.setForeground(Color.YELLOW);
	l2.setForeground(Color.YELLOW);
        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f2);
        l4.setFont(f3);
        l5.setFont(f3);
        l6.setFont(f3);
        l7.setFont(f3);
        l8.setFont(f3);
        l9.setFont(f3);
        l10.setFont(f3);
	l11.setFont(f3);
        l3.setForeground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        l5.setForeground(Color.BLACK);
        l6.setForeground(Color.BLACK);
        l7.setForeground(Color.BLACK);
        l8.setForeground(Color.BLACK);
        l9.setForeground(Color.BLACK);
        l10.setForeground(Color.BLACK);
        l11.setForeground(Color.BLACK);
        setLayout(null);
        l1.setBounds(220,5,230,50);
        l2.setBounds(448,10,150,50);
        l3.setBounds(220,400,1000,50);
        l4.setBounds(220,450,1000,30);
        l5.setBounds(220,480,1000,30);
        l6.setBounds(220,510,1000,30);
        l7.setBounds(220,540,1000,30);
        l8.setBounds(220,570,1000,30);
        l9.setBounds(220,600,1000,30);
        l10.setBounds(220,630,1000,30);
        l11.setBounds(220,660,1000,30);
	l12.setBounds(220,70,900,310);
	p1.setBounds(0,0,200,730);
	p2.setBounds(1140,0,250,730);
        MB.setBounds(720,15,400,40);
        MB.setBackground(Color.lightGray);
        MB.setForeground(Color.BLACK);    
	l1.setBackground(Color.BLACK);
	l2.setBackground(Color.BLACK);
	p1.setBackground(Color.CYAN);
	p2.setBackground(Color.CYAN);
	l1.setOpaque(true);
	l2.setOpaque(true);
	p1.setOpaque(true);
	p2.setOpaque(true);
        add(l1);add(l2);
        add(l3);add(l4);
        add(l5);add(l6);
        add(l7);add(l8);
        add(l9);add(l10);
        add(l11);add(MB);
	add(l12);
	add(p1);add(p2);
        Contactb.addMouseListener(this);
        blog1.addMouseListener(this);
        blog2.addMouseListener(this);
        bsign.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent me)
    {
        if(me.getSource()==Contactb)
        {
            contacts obj=new contacts("Contact Us");  
            obj.setSize(320,200);
            obj.setLocation(500,150);
            obj.setVisible(true);
        }
    }
    @Override
    public void mousePressed(MouseEvent me)
    {
      if(me.getSource()==blog1)
      {
          login log=new login("Login");  
          log.setSize(300,200);
          log.setLocation(450,150);
          log.setVisible(true);  
       }
      if(me.getSource()==blog2)
      {
         adminlog alog = new adminlog("Login");
         alog.setSize(300,200);
         alog.setLocation(450,150);
         alog.setVisible(true);
      }
       if(me.getSource()==bsign)
       {
           signup sign=new signup("Signup");
           sign.setSize(300,350);
           sign.setLocation(420,240);
           sign.setVisible(true);
       }
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
        HardwareStore obj = new HardwareStore();
        obj.getContentPane().setBackground(Color.white);
        obj.setSize(1370,730);
        obj.setLocation(0,0);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
}