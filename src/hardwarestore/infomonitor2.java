package hardwarestore;
import javax.swing.*;
import java.awt.*;

public class infomonitor2 extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,limage;
    Font f1,f2;
    public infomonitor2(String title)
    {
        super(title);
        
        f1 = new Font("Arial",Font.BOLD,30);
        f2 = new Font("Arial",Font.PLAIN,20);
        
        l1 = new JLabel("Product Description");
        l2 = new JLabel("The first display made precisely for a MacBook. The new 24-inch Apple LED Cinema Display doesnt ");
        l3 = new JLabel("just expand the screen of your new MacBook, MacBook Pro, or MacBook Air, it expands your whole");
        l4 = new JLabel("experience. Plug in three simple connectors on one cable the new industry-standard Mini DisplayPort,");
        l5 = new JLabel("MagSafe, and USB and suddenly you have more room to work and play, power for your notebook, and ");
        l6 = new JLabel("access to peripherals. The built-in iSight camera, microphone, and speaker system let you video chat");
        l7 = new JLabel("or listen to your music whether your MacBook is open or closed. And it features a mercury-free LED-");
        l8 = new JLabel("backlit display that delivers stunning 1920-by-1200-pixel resolution.");
        l9 = new JLabel("Technical Specifications");
        limage = new JLabel(new ImageIcon("led.jpg"));
        
        setLayout(null);
        
        l1.setBounds(450,35,400,30);
        l2.setBounds(470,80,800,30);
        l3.setBounds(470,110,800,30);
        l4.setBounds(470,140,800,30);
        l5.setBounds(470,170,800,30);
        l6.setBounds(470,200,800,30);
        l7.setBounds(470,230,800,30);
        l8.setBounds(470,260,800,30);
        l9.setBounds(450,365,450,30);
        limage.setBounds(10,40,400,350);
        
        l1.setFont(f1);
        l9.setFont(f1);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(limage);
        
        String data[][]={{"Brand","Apple"},
                {"Screen Resolution","1920x1200"},
                {"Screen Size","24 inches"},
                {"Item Weight","21 pounds"},
                {"Dimensions","7.8 x 22.6 x 18.8 inches"},
                {"Model Number","MB382LL/A"}};
        String column[]={"",""};
                
        JTable jt = new JTable(data,column);
        jt.setBounds(40,450,1100,180);
        jt.setFont(f2);
        jt.setRowHeight(30);
        jt.setBackground(Color.LIGHT_GRAY);
        add(jt);
    }
    
    public static void main(String[] args)
    {
        infomonitor2 obj = new infomonitor2("LED Monitor");  
        obj.setSize(1200,700);
        //obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);        
    }        
}
