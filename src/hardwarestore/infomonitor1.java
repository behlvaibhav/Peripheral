package hardwarestore;
import javax.swing.*;
import java.awt.*;

public class infomonitor1 extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l9,limage;
    Font f1,f2;
    public infomonitor1(String title)
    {
        super(title);
        
        f1 = new Font("Arial",Font.BOLD,30);
        f2 = new Font("Arial",Font.PLAIN,20);
        
        l1 = new JLabel("Product Description");
        l2 = new JLabel("This white CRT(Cathode Ray Tube) Monitor is of Sony make. A CRT monitor contains millions of tiny red,");
        l3 = new JLabel("green, and blue phosphor dots that glow when struck by an electron beam that travels across the ");
        l4 = new JLabel("screen to create a visible image. It consumes very less power and also UV protected. It's screen ");
        l5 = new JLabel("diagonal length is 15 inches. It is available at discounted price from the market. It is very compact ");
        l6 = new JLabel("and light weight. It has 5years limited warranty from SONY official service center.");
        l9 = new JLabel("Technical Specifications");
        limage = new JLabel(new ImageIcon("crt.jpg"));
        
        setLayout(null);
        
        l1.setBounds(450,35,400,30);
        l2.setBounds(470,80,800,30);
        l3.setBounds(470,110,800,30);
        l4.setBounds(470,140,800,30);
        l5.setBounds(470,170,800,30);
        l6.setBounds(470,200,800,30);
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
        add(l9);
        add(limage);
        
        String data[][]={{"Brand","Sony"},
                {"Colour","White"},
                {"Screen Size","17 inches"},
                {"Item Weight","45 pounds"},
                {"Dimensions","20 x 20 x 20 inches"},
                {"Model Number","E773C"}};
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
        infomonitor1 obj = new infomonitor1("CRT Monitor");  
        obj.setSize(1200,700);
        //obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);        
    }        
}