package hardwarestore;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author LENOVO
 */
public class adminlog extends JFrame implements ActionListener
{
    JButton b1,b2;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    public adminlog(String title)
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
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==b2) 
        {
            dispose();
        }
        if(ae.getSource()==b1)
        { 
            if((t1.getText().equals("admin"))&&(p1.getText().equals("perry123")))
            {
                JOptionPane.showMessageDialog(null,"Welcome Admin");
                dispose();
                admintable admin = new admintable("Stock");
                admin.getContentPane().setBackground(Color.white);
                admin.setSize(500,400);
                admin.setLocation(400,150);
                admin.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, ID and Password donot match");
            }
        }
    }
    
 
    public static void main(String[] args)
    {
        adminlog alog = new adminlog("login");  
        alog.setSize(300,200);
        alog.setLocation(450,150);
        alog.setDefaultCloseOperation(EXIT_ON_CLOSE);
        alog.setVisible(true);
    }
}    