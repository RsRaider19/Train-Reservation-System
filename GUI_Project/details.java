import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;

public class details implements ActionListener 
{
    JFrame f;   
    JLabel label1;
    JLabel label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,x,bg1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    
    JRadioButton b1;
    JRadioButton b2;
    JRadioButton b3;
    JButton Proceed;
    ButtonGroup bg=new ButtonGroup();
    ReadCurrentUser obj;
    String st1;
    currentUser obj12;currentUser obj13;
    public details() 
    {  
        f=new JFrame("Passenger Details");//creating instance of JFrame 
        //currentUser U=new currentUser();
        obj=new ReadCurrentUser();
        label1=new JLabel("Train name:"+obj.datalist.get(5));
        label1.setBounds(100,100, 300,30);
        label2=new JLabel("Number:"+obj.datalist.get(6));
        label2.setBounds(400,100, 200,30);
         label3=new JLabel("Time:"+obj.datalist.get(7));  label3.setBounds(700,100, 200,30);
          label4=new JLabel("From:"+obj.datalist.get(2)); label4.setBounds(100,200, 200,30);
          label5=new JLabel("To:"+obj.datalist.get(3));  label5.setBounds(400,200, 200,30);
          label6=new JLabel("Date:"+obj.datalist.get(4)); label6.setBounds(700,200, 200,30);
          
          label7=new JLabel("No of passengers");  
                                        label7.setBounds(50,300, 150,30);
          label8=new JLabel("Name");    label8.setBounds(200,350, 100,30);
          label9=new JLabel("Gender");  label9.setBounds(200,400, 100,30);
          label10=new JLabel("Age");    label10.setBounds(200,450, 100,30);
          label11=new JLabel("Name");   label11.setBounds(400,350, 100,30);
          label12=new JLabel("Gender"); label12.setBounds(400,400, 100,30);
          label13=new JLabel("Age");    label13.setBounds(400,450, 100,30);
            label14=new JLabel("Name");   label14.setBounds(600,350, 100,30);
          label15=new JLabel("Gender"); label15.setBounds(600,400, 100,30);
          label16=new JLabel("Age");    label16.setBounds(600,450, 100,30);
              x=new JLabel("COACH TYPE");    x.setBounds(450,500,150,30);
         t1=new JTextField(); 
         t2=new JTextField(); 
         t3=new JTextField(); 
         t4=new JTextField(); 
         t5=new JTextField();  
         t6=new JTextField();
         t7=new JTextField(); 
        t8=new JTextField(); 
        t9=new JTextField(); 
        t10=new JTextField(); 
      
        t1.setBounds(200,300, 70,30);// no of passenger
        t2.setBounds(300,350, 70,30);
        t3.setBounds(300,400, 70,30);
        t4.setBounds(300,450, 70,30);
        t5.setBounds(500,350, 70,30);
        t6.setBounds(500,400, 70,30);
        t7.setBounds(500,450, 70,30);t8.setBounds(700,450, 70,30);t9.setBounds(700,350,70,30);t10.setBounds(700,400, 70,30);
        b1=new JRadioButton("A/C");
        b1.setBounds(800,500,100, 40);
        b1.addActionListener(this);
        b2=new JRadioButton("Sleeper");
        b2.setBounds(600,500,100, 40);
        b2.addActionListener(this);
        b3=new JRadioButton("General");    
        b3.setBounds(1000,500,100, 40);
        b3.addActionListener(this);
        bg.add(b1);bg.add(b2);bg.add(b3);
        
        Proceed=new JButton("Proceed for Payment");
        Proceed.setBounds(600,600,250, 40);
        Proceed.addActionListener(this);
        ImageIcon img=new ImageIcon("D:/Codes & Simulation/Java/GUI_Project/back.jpg");
        bg1=new JLabel("",img,JLabel.CENTER);
        bg1.setBounds(0,0,1920,1080);
        f.add(t1);
        f.add(t2); f.add(t5);
        f.add(t3);        
        f.add(t4); f.add(t6);f.add(t9);f.add(t10);
        f.add(t7); f.add(t8);
        f.add(b1);//adding button in JFrame 
        f.add(b2);
        f.add(b3);
        f.add(Proceed);
        f.add(label1);
        f.add(label2);   f.add(x);
        f.add(label3); f.add(label4); f.add(label5); f.add(label6); f.add(label7); f.add(label8); f.add(label9); f.add(label10);f.add(label11);
        f.add(label12);f.add(label13);
        f.add(label14);f.add(label15);f.add(label16);
        f.add(bg1);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 18));label2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label3.setFont(new Font("Times New Roman", Font.BOLD, 18));label4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label5.setFont(new Font("Times New Roman", Font.BOLD, 18));label6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label7.setFont(new Font("Times New Roman", Font.BOLD, 18));label8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label9.setFont(new Font("Times New Roman", Font.BOLD, 18));label10.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label11.setFont(new Font("Times New Roman", Font.BOLD, 18));label12.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label13.setFont(new Font("Times New Roman", Font.BOLD, 18));label14.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label15.setFont(new Font("Times New Roman", Font.BOLD, 18));label16.setFont(new Font("Times New Roman", Font.BOLD, 18));
        x.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b1.setFont(new Font("Times New Roman", Font.BOLD, 18));b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b3.setFont(new Font("Times New Roman", Font.BOLD, 18));Proceed.setFont(new Font("Times New Roman", Font.BOLD, 18));
        f.setSize(1378,720);
        f.setLocationRelativeTo(null);
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
            
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int i;
        currentUser obj1;currentUser obj2;currentUser obj3;currentUser obj4;
        currentUser obj5;currentUser obj6;currentUser obj7;currentUser obj8;
        currentUser obj9;currentUser obj10;currentUser obj11;
        String str = e.getActionCommand();
        int price=0;
            if(str.equals("Proceed for Payment"))
        {
            obj1=new currentUser(t1.getText());obj2=new currentUser(t2.getText());
            obj3=new currentUser(t3.getText());obj4=new currentUser(t4.getText());
            obj5=new currentUser(t5.getText());obj6=new currentUser(t6.getText());
            obj7=new currentUser(t7.getText());obj8=new currentUser(t8.getText());
            obj9=new currentUser(t9.getText());obj10=new currentUser(t10.getText());
            if(b1.isSelected())
            {
            st1="AC";
            price=2000;
            }
            if(b2.isSelected())
            {
            st1="Sleeper";
            price=900;
            }
            if(b3.isSelected())
            {
            st1="General";
            price=500;
            }
            obj11=new currentUser(st1);
            ReadCurrentUser ob=new ReadCurrentUser();
            /*for(int k=0;k<19;k++)
            {
            System.out.println(ob.datalist.get(k));
            }*/
            f.dispose();
            PrintTicket p=new PrintTicket(ob.datalist.get(2),ob.datalist.get(3),ob.datalist.get(18),Integer.parseInt(ob.datalist.get(8)),ob.datalist.get(4),(price*Integer.parseInt(ob.datalist.get(8))),ob.datalist.get(7),ob.datalist.get(1));
 
        }
           }
    
    public static void main()
    {
        details start=new details();
    }
}