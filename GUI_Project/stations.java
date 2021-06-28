import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;
class stations implements ActionListener
{
    JFrame f;   
    JLabel label1;
    JLabel label2;
    JLabel label3,bg;
    JTextField t1,t2,t3;
    JButton b;
    public stations()
        {
            f=new JFrame("Train Search");//creating instance of JFrame
            label1=new JLabel("From Station:");
            label1.setBounds(10,100, 200,30);
            label2=new JLabel("To Station:");
            label2.setBounds(10,150, 200,30);
            label3=new JLabel("Date");
            label3.setBounds(10,200, 200,30);
            t1=new JTextField();
            t2=new JTextField(); 
            t3=new JTextField(); 
            b=new JButton("Search");//creating instance of JButton
            t1.setBounds(120,100, 200,30); 
            t2.setBounds(120,150, 200,30);
            t3.setBounds(120,200,200, 30);//x axis, y axis, width, height 
            b.setBounds(150,300,100,40);
            b.addActionListener(this);
            ImageIcon img=new ImageIcon("D:/Codes & Simulation/Java/GUI_Project/back.jpg");
            bg=new JLabel("",img,JLabel.CENTER);
            bg.setBounds(0,0,400,500);
            f.add(t1);
            f.add(t2);
            f.add(t3); 
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
        if(str.equals("Search"))
        {   
            
            String from=t1.getText();
            String to=t2.getText();
            String date=t3.getText();
            currentUser U1=new currentUser(from);
            currentUser U2=new currentUser(to);
            currentUser U3=new currentUser(date);
            ///U1.currentUser1(from,4);
            //U1.currentUser1(to,5);
            //U1.currentUser1(date,6);
            //U1.print();
            f.dispose();
            trainData td=new trainData();
            
        }
    }
    public static void main()
    {   
       stations s1=new stations();
    }
}