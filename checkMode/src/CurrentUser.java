import java.io.*;
import java.io.ObjectStreamException;
import java.util.*;
public class CurrentUser 
{
    String current;
    public CurrentUser()
    {
        try {
            //System.out.println(new File("current.txt").getAbsolutePath());
            BufferedReader in = new BufferedReader(new FileReader("current.txt"), 16*1024);
            Scanner s = new Scanner(in);
            s.useDelimiter(",");
            current = s.next();
            System.out.println("Current User: " + current);
            s.close();
            System.out.println("got current user");
        } catch (Exception e){
            System.err.println("currentuser Error: " + e.getMessage());
        }
    }
}
