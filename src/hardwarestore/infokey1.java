package hardwarestore;
import javax.swing.*;
import java.awt.*;

public class infokey1 extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,limage;
    Font f1,f2;
    public infokey1(String title)
    {
        super(title);
        
        f1 = new Font("Arial",Font.BOLD,30);
        f2 = new Font("Arial",Font.PLAIN,20);
        
        l1 = new JLabel("Product Description");
        l2 = new JLabel("This Wired Keyboard provides a convenient keyboard solution for everyday home or office computing");
        l3 = new JLabel("uses. The keyboard's full layout with chiclet style keys allows for efficient, comfortable typing - ");
        l4 = new JLabel("excellent for everyday usage on virtually any task at hand. With a compact design that still features");
        l5 = new JLabel("a full-sized keyboard and number pad, the Wired Keyboard is ideal for home and office environments.");
        l6 = new JLabel("With a durable build and quiet keys, it's designed to provide comfort for the everyday demands of ");
        l7 = new JLabel("desktop usage. The convenient multimedia keys let you easily access functions such as play, pause,");
        l8 = new JLabel("rewind, and fast-forward plus volume control. ");
        l9 = new JLabel("Technical Specifications");
        limage = new JLabel(new ImageIcon("key1.jpg"));
        
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
        
        String data[][]={{"Brand","Dell"},
                {"Colour","Black"},
                {"Form Factor","Qwerty"},
                {"Item Weight","306g"},
                {"Dimensions","18x7x3cm"},
                {"Model Number","580-ADGM"}};
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
        infokey1 obj = new infokey1("Wireless Keyboard");  
        obj.setSize(1200,700);
        //obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
}
}