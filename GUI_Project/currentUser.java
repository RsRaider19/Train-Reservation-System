import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; 
public class currentUser 
{
    public currentUser(String s)
    {
        // Creating an object of a file
        File folder = new File("D:/Codes & Simulation/Java/GUI_Project/Database");
          folder.mkdir();
        File data = new File("D:/Codes & Simulation/Java/GUI_Project/Database/Data.txt");
        if (data.exists()) 
        {
               try 
                {
                    FileWriter writedata = new FileWriter("D:/Codes & Simulation/Java/GUI_Project/Database/Data.txt",true);
                    writedata.write(System.getProperty( "line.separator" ));
                    writedata.write(s);
                    writedata.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        } 
    }
    public static void main(String[] args) 
    {
        String str1="";
        String str2="";
        currentUser s1=new currentUser(str1);
    }
}