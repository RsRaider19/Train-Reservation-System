import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;

public class trainData implements ActionListener
    {    
    JFrame f;   int i,a=100,c=10,d=10,y;
    JRadioButton r[] =new JRadioButton[10]; 
    JLabel l[]=new JLabel[10];
    JLabel lt[]=new JLabel[10];
    JLabel l1=new JLabel("Train Name");
    JLabel l2=new JLabel("Train Number");
    JLabel l3=new JLabel("Time");
    ButtonGroup bg;
    JLabel bg1;
    dataset dt=new dataset();
    public trainData()
    {    
        f=new JFrame("Train List");   
        JButton button=new JButton("Next");
        button.setBounds(320,400,100,20);
        button.setFont(new Font("Times New Roman", Font.BOLD, 18));
        f.add(button);
        dt.database();
        button.addActionListener(this); 
        //radiobutton
        for(i=0;i<10;i++)
        {
            r[i]=new JRadioButton(dt.trainName[i]);
            
        }
        for (i=0;i<10;i++)
        {
            r[i].setBounds(130,a,190,20);
            r[i].setFont(new Font("Times New Roman", Font.BOLD, 18));
            a=a+25;
        } 
        bg=new ButtonGroup();
        for(i=0;i<10;i++)
        {
            bg.add(r[i]);
        } 
        for(i=0;i<10;i++)
        {
            f.add(r[i]);
        }//Radiobutton ends
        /*l1.setBounds(80,70,80,20);
        f.add(l1);
        a=100;
        l2.setBounds(220,70,80,20);
        f.add(l2);
        l3.setBounds(360,70,80,20);
        f.add(l3);*/
        l1.setBounds(170,70,150,20);
        f.add(l1);
        a=100;
        l2.setBounds(340,70,150,20);
        f.add(l2);
        l3.setBounds(480,70,150,20);
        f.add(l3);
        //Train number label
        l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        for(i=0;i<10;i++)
        {
            l[i]=new JLabel(dt.trainNumber[i]);
        }
        for (i=0;i<10;i++)
        {
            l[i].setBounds(380,a,60,20);
            l[i].setFont(new Font("Times New Roman", Font.BOLD, 18));
            a=a+25;
        }
        for(i=0;i<10;i++)
        {
            f.add(l[i]);
        } //train number Label ends
        //train time label
        a=100;
        for(i=0;i<10;i++)
        {
            lt[i]=new JLabel(dt.trainTime[i]);
        }
        for (i=0;i<10;i++)
        {
            lt[i].setBounds(480,a,60,20);
            lt[i].setFont(new Font("Times New Roman", Font.BOLD, 18));
            a=a+25;
        }
        for(i=0;i<10;i++)
        {
            f.add(lt[i]);
        }//train time label ends
        ImageIcon img=new ImageIcon("D:/Codes & Simulation/Java/GUI_Project/back.jpg");
        bg1=new JLabel("",img,JLabel.CENTER);
        bg1.setBounds(0,0,1320,720);
        f.add(bg1);
        f.setSize(1000,720); 
        f.setLocationRelativeTo(null);
        f.setLayout (null);   
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){   
        String str="";
        dt.database();
        int i;
        for (i=0;i<10;i++)
        {
            if(r[i].isSelected())
            { 
                str=dt.trainName[i];
                break;
            }
        }
        currentUser U1=new currentUser(str);
        currentUser U2=new currentUser(dt.trainNumber[i]);
        currentUser U3=new currentUser(dt.trainTime[i]);
        f.dispose();
        //U1.print();
        details d=new details();
    }

    public static void main(String[] args) 
    {    
        new trainData();
    }
}