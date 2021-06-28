import javax.swing.*;  
public class message 
{  
    JFrame f;  
    public message()
    {  
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Registration Successfull");
        loginPage obj=new loginPage();
    }  
    public static void main(String[] args) 
    {  
        message m = new message();  
    }  
}  