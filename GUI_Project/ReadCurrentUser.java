import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.File; 
import java.io.FileNotFoundException;  
public class ReadCurrentUser
{
        List<String> datalist;
    public ReadCurrentUser()
        {
        datalist = Collections.emptyList();
        try 
        {
                datalist = Files.readAllLines(Paths.get("D:/Codes & Simulation/Java/GUI_Project/Database/Data.txt"));
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void main() 
    {
        ReadCurrentUser s1=new ReadCurrentUser();
        for(int i=0;i<19;i++)
        {
            System.out.println(s1.datalist.get(i));
        }
    }
}