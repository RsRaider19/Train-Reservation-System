import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; 
public class store 
{
    public store(String user,String pass)
    {
        // Creating an object of a file
        File folder = new File("D:/Codes & Simulation/Java/GUI_Project/Database");
          folder.mkdir();
        File username = new File("D:/Codes & Simulation/Java/GUI_Project/Database/Username.txt");
        File password = new File("D:/Codes & Simulation/Java/GUI_Project/Database/Password.txt");
        if (username.exists() && password.exists()) 
        {
               try 
                {
                    FileWriter writeuser = new FileWriter("D:/Codes & Simulation/Java/GUI_Project/Database/Username.txt",true);
                    FileWriter writepass = new FileWriter("D:/Codes & Simulation/Java/GUI_Project/Database/Password.txt",true);
                    writeuser.write(System.getProperty( "line.separator" ));
                    writepass.write(System.getProperty( "line.separator" ));
                    writeuser.write(user);
                     writepass.write(pass);
                    writeuser.close();
                    writepass.close();
                    message m= new message();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        } 
        else
        { 
            try 
            {
                if (username.createNewFile() && password.createNewFile()) 
                {
                    try 
                    {
                        FileWriter writeuser = new FileWriter("D:/Codes & Simulation/Java/GUI_Project/Database/Username.txt");
                        FileWriter writepass = new FileWriter("D:/Codes & Simulation/Java/GUI_Project/Database/Password.txt");
                        user="\n"+user;
                        pass="\n"+pass;
                        writeuser.write(user);
                         writepass.write(pass);
                        writeuser.close();
                        writepass.close();
                        message m= new message();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                } 
            } 
            catch (IOException e) 
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } 
        }
    }
    public static void main(String[] args) 
    {
        String str1="";
        String str2="";
        store s1=new store(str1,str2);
    }
}