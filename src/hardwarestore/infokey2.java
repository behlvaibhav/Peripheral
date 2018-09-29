package hardwarestore;
import javax.swing.*;
import java.awt.*;

public class infokey2 extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l9,limage;
    Font f1,f2;
    public infokey2(String title)
    {
        super(title);
        
        f1 = new Font("Arial",Font.BOLD,30);
        f2 = new Font("Arial",Font.PLAIN,18);
        
        l1 = new JLabel("Product Description");
        l2 = new JLabel("Wireless Keyboard KM113. Sleek design with fully functional HOT keys for Internet Search, Email and");
        l3 = new JLabel("Calculator. Keyboard is spill resistant. Key Features Advanced 2.4 GHz Wireless Combo Full-size layout");
        l4 = new JLabel("with instant-access hot keys Quite and good tactile feel Functional Keyboard tilt angle Sturdy and ");
        l5 = new JLabel("Robust for office usage Durable Keyboard constructed with a life Durable keyboard life with 5 million ");
        l6 = new JLabel("keystrokes System Requirements MS Windows XP/Vista/Windows 7 Linux Ubuntu.");
        l9 = new JLabel("Technical Specifications");
        limage = new JLabel(new ImageIcon("key2.jpg"));
        
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
        
        String data[][]={{"Brand","Dell"},
                {"Colour","Black"},
                {"Item Weight","306g"},
                {"Dimensions","18x7x3cm"},
                {"Multimedia Keys","Volume +-, Mute, Play/Pause, Skip Forward/Backward"},
                {"Battery","2 AAA Alkaline batteries"},
                {"Model Number","590-ADGM"}};
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
        infokey2 obj = new infokey2("Wireless Keyboard");  
        obj.setSize(1210,720);
        //obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
}