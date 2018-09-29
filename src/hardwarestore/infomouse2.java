package hardwarestore;
import javax.swing.*;
import java.awt.*;

public class infomouse2 extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,limage;
    Font f1,f2;
    public infomouse2(String title)
    {
        super(title);
        
        f1 = new Font("Arial",Font.BOLD,30);
        f2 = new Font("Arial",Font.PLAIN,20);
        
        l1 = new JLabel("Product Description");
        l2 = new JLabel("Logitech Wireless Mouse M235 is definitely the feel-good, reliable mouse -that'll make you forget ");
        l3 = new JLabel("the touchpad.The plug-and-forget nano-receiver keeps you connected with reliable 2.4 GHz wireless.");
        l4 = new JLabel("From surfing the Web to updating your Facebook®-you'll be mousing on more surfaces thanks to ");
        l5 = new JLabel("Logitech® Advanced Optical. It has three years limited warranty.");
        l9 = new JLabel("Technical Specifications");
        limage = new JLabel(new ImageIcon("mouse2.jpg"));
        
        setLayout(null);
        
        l1.setBounds(450,35,400,30);
        l2.setBounds(470,80,800,30);
        l3.setBounds(470,110,800,30);
        l4.setBounds(470,140,800,30);
        l5.setBounds(470,170,800,30);
        l9.setBounds(450,365,450,30);
        limage.setBounds(10,40,400,350);
        
        l1.setFont(f1);
        l9.setFont(f1);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l9);
        add(limage);
        
        String data[][]={{"Brand","Logitech"},
                {"Colour","Grey"},
                {"Form Factor","Hand Held"},
                {"Item Weight","86g"},
                {"Hardware Platform","Wireless"},
                {"Batteries","1 AA batteries required. (included)"},
                {"Model Number","910-002201"}};
        String column[]={"",""};
                
        JTable jt = new JTable(data,column);
        jt.setBounds(40,450,1100,210);
        jt.setFont(f2);
        jt.setRowHeight(30);
        jt.setBackground(Color.LIGHT_GRAY);
        add(jt);
    }
    
    public static void main(String[] args)
    {
        infomouse2 obj = new infomouse2("Wireless Mouse");  
        obj.setSize(1200,700);
        //obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);        
    }
}
