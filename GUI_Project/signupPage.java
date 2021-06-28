import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;
class signupPage implements ActionListener
{
    JFrame f;   
    JLabel label1;
    JLabel label2;
    JLabel label3,bg;
    JTextField t1;
    JPasswordField p1;
    JPasswordField p2;
    JButton b;
    public signupPage()
    {
        f=new JFrame("SignUp Page");//creating instance of JFrame  
        label1=new JLabel("Enter Username");
        label1.setBounds(10,100, 200,30);
        label2=new JLabel("Enter Password");
        label2.setBounds(10,150, 200,30);
        label3=new JLabel("Confirm Password");
        label3.setBounds(10,200, 200,30);
        t1=new JTextField(); 
        p1=new JPasswordField();
        p2=new JPasswordField();
        b=new JButton("Sign Up");//creating instance of JButton
        t1.setBounds(120,100, 200,30); 
        p1.setBounds(120,150, 200,30);             
        p2.setBounds(120,200,200, 30);//x axis, y axis, width, height 
        b.setBounds(150,300,100,40);
        b.addActionListener(this);
        ImageIcon img=new ImageIcon("D:/Codes & Simulation/Java/GUI_Project/back.jpg");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,400,500);
        f.add(t1);
        f.add(p1);   
        f.add(p2); 
        f.add(b);//adding button in JFrame  
        f.add(label1);
        f.add(label2);
        f.add(label3);
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
        if(str.equals("Sign Up"))
        {   
            f.dispose();
            String name=t1.getText();
            String pass1=p1.getText();
            String pass2=p2.getText();
            store obj;
            if(pass1.equals(pass2))
                obj=new store(name,pass1);
        }
    }
    public static void main()
    {   
        signupPage start=new signupPage();
    }
}