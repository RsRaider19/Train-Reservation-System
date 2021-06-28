import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;
public class loginPage implements ActionListener 
{
    JFrame f;   
    JLabel label1;
    JLabel label2;
    JLabel bg;
    JTextField t;
    JPasswordField p;
    JButton b1;
    JButton b2;
    public loginPage() 
    {  
        f=new JFrame("Login Page");//creating instance of JFrame  
        label1=new JLabel("Username");
        label1.setBounds(10,100, 200,30);
        label2=new JLabel("Password");
        label2.setBounds(10,150, 200,30);
        t=new JTextField(); 
        p=new JPasswordField();
        b1=new JButton("Login");//creating instance of JButton
        t.setBounds(100,100, 200,30); 
        p.setBounds(100,150, 200,30);             
        b1.setBounds(130,200,100, 40);//x axis, y axis, width, height 
        b1.addActionListener(this);
        b2=new JButton("Sign Up");
        b2.setBounds(130,245,100, 40);
        b2.addActionListener(this);
        ImageIcon img=new ImageIcon("D:/Codes & Simulation/Java/GUI_Project/back.jpg");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,400,500);
        
        f.add(t);
        f.add(p);          
        f.add(b1);//adding button in JFrame 
        f.add(b2);
        f.add(label1);
        f.add(label2);
        f.add(bg);
        f.setSize(400,500);//400 width and 500 height  
        f.setLocationRelativeTo(null);
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();
        if(str.equals("Login"))
        {
            String pass=p.getText();
            String name=t.getText();
            
            //temp.initialise();
            //temp.currentUser1(name,0);
            //temp.print();
            Read rs=new Read();
            currentUser temp=new currentUser(name);
            //dataset dt=new dataset();
            if(rs.check(name,pass))
            {
                f.dispose();
        //mess1 m1=new mess1();
                stations st=new stations();
            }
            if(!rs.check(name,pass))
            {
                JOptionPane.showMessageDialog(f,"Invalid Details");
                f.dispose();
            }
            
        }
        if(str.equals("Sign Up"))
        {
            f.dispose();
            signupPage obj=new signupPage();
        }
    }
    public static void main()
    {
        loginPage start=new loginPage();
    }
} 
