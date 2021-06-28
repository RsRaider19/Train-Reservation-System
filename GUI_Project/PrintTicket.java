import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintTicket extends JFrame
{
    public PrintTicket(String From, String To, String Coach, Integer nop, String Date, Integer Price, String Time, String name)    {
        

       JFrame f=new JFrame("E-Ticket");
        JLabel bg1;


        JLabel LTitle = new JLabel("<html><b><font color=\"#000000\",size=\"18\">Train Ticket</font></b></html>");
        JLabel LFrom = new JLabel( "From Station: "+From );
        JLabel LTo = new JLabel("To Station: "+To);
        JLabel LClass = new JLabel("Coach: "+Coach );
        JLabel LBookingDate = new JLabel("Date: "+Date);
        JLabel LPrice = new JLabel("Fare: "+Integer.toString(Price));
        JLabel LTime = new JLabel("Time: "+Time);
        LFrom.setFont(new Font("Times New Roman", Font.BOLD, 22));LTo.setFont(new Font("Times New Roman", Font.BOLD, 22));
        LTime.setFont(new Font("Times New Roman", Font.BOLD, 22));LClass.setFont(new Font("Times New Roman", Font.BOLD, 22));
        LPrice.setFont(new Font("Times New Roman", Font.BOLD, 22));LBookingDate.setFont(new Font("Times New Roman", Font.BOLD, 22));
        JLabel LTicketNo=new JLabel("PNR: QS_287190");
        JLabel LBookedBy=new JLabel("Booked By:"+name);LTicketNo.setFont(new Font("Times New Roman", Font.BOLD, 22));LBookedBy.setFont(new Font("Times New Roman", Font.BOLD, 22));

        JLabel LDemo = new JLabel("<html><U><font size=\"6\" color=\"#000000\">Railway Reservation-Project Developed By</font></html>");
        JLabel m=new JLabel("<html><I><font size=\"6\" color=\"#000000\">Kunal,Rishabh,Akriti</font></html>");
        
   
        LTitle.setBounds(600,15,500,45);
        LFrom.setBounds(400,80,300,30);

        LTo.setBounds(400,120,300,30);
        LClass.setBounds(400,160,300,30);
        LBookingDate.setBounds(400,200,300,30);
        LPrice.setBounds(400,240,300,30);
        LTime.setBounds(400,280,300,30);


        LTicketNo.setBounds(900,80,350,40);
        LBookedBy.setBounds(900,120,350,40);

        
        LDemo.setBounds(50,500,300,30);
        m.setBounds(100,550,300,30);
        f.add(LTitle);
        f.add(LFrom);
        f.add(LTo);
        f.add(LClass);
        f.add(LBookingDate);
        
        f.add(LPrice);
        f.add(LTime);
        f.add(LTicketNo);
        f.add(LBookedBy);
        f.add(LDemo);
        f.add(m);
        
        ImageIcon img=new ImageIcon("D:/Codes & Simulation/Java/GUI_Project/back.jpg");
        bg1=new JLabel("",img,JLabel.CENTER);
        bg1.setBounds(0,0,1920,1080);
        f.add(bg1);f.setLayout(null);

        //pack();
        f.setSize(1378,720);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
}