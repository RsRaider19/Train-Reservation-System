import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.File; 
import java.io.FileNotFoundException;  
public class Read 
{
    boolean check(String user,String pass)
    {
        boolean flag=false;
        try 
        {
            List<String> userlist = Files.readAllLines(Paths.get("D:/Codes & Simulation/Java/GUI_Project/Database/Username.txt"));
            List<String> passlist = Files.readAllLines(Paths.get("D:/Codes & Simulation/Java/GUI_Project/Database/Password.txt"));
            if(userlist.contains(user) && passlist.contains(pass))
            {
                flag=true;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return flag;    
    }
    public static void main(String[] args) 
    {
        String str1="";
        String str2="";
        Read s1=new Read();
        s1.check(str1,str2);
    }
}