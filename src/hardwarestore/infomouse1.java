package hardwarestore;
import javax.swing.*;
import java.awt.*;

public class infomouse1 extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,limage;
    Font f1,f2;
    public infomouse1(String title)
    {
        super(title);
        
        f1 = new Font("Arial",Font.BOLD,30);
        f2 = new Font("Arial",Font.PLAIN,20);
        
        l1 = new JLabel("Product Description");
        l2 = new JLabel("This wired optical mouse is designed for optimal comfort, this mouse makes sure your palm has ");
        l3 = new JLabel("adequate support when you are using it. This optical mouse uses features three buttons as well as");
        l4 = new JLabel("a scrolling wheel for ease of use. Moreover, the dell wired optical mouse can be connected via a ");
        l5 = new JLabel("USB which is very dependable and gives you the kind of accuracy you desire without making you ");
        l6 = new JLabel("compromise on comfort. So, if you're looking for a good mouse to go along with your PC or Laptop, ");
        l7 = new JLabel("look no further than the Dell wired mouse.");
        l9 = new JLabel("Technical Specifications");
        limage = new JLabel(new ImageIcon("mouse1.jpg"));
        
        setLayout(null);
        
        l1.setBounds(450,35,400,30);
        l2.setBounds(470,80,800,30);
        l3.setBounds(470,110,800,30);
        l4.setBounds(470,140,800,30);
        l5.setBounds(470,170,800,30);
        l6.setBounds(470,200,800,30);
        l7.setBounds(470,230,800,30);
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
        add(l9);
        add(limage);
        
        String data[][]={{"Brand","Dell"},
                {"Colour","Matt Black"},
                {"Form Factor","Hand Held"},
                {"Item Weight","141g"},
                {"Hardware Platform","USB"},
                {"Model Number","MS-111"}};
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
        infomouse1 obj = new infomouse1("Wired Mouse");  
        obj.setSize(1190,700);
        //obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
}
}
