import java.io.*;
import java.io.ObjectStreamException;
import java.util.*;
public class EmpList
{
    Map<String, Employee> list = new HashMap<>();
    int id,sales,table;
    String n;
    double hours;
    public EmpList()
    {
        try {
            System.out.println(new File("emplist.txt").getAbsolutePath());
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\isaia\\OneDrive\\Documents\\GitHub\\POS-System\\emplist.txt"), 16*1024);
            Scanner s = new Scanner(in);
            s.useDelimiter(",");
            while(s.hasNext())
            {
                id = s.nextInt();
                n = s.next();
                hours = s.nextDouble();
                sales = s.nextInt();
                table = s.nextInt();

                Employee person = new Employee(n, sales, hours, table);
                list.put(String.valueOf(id),person);
                s.nextLine();
            }
            s.close();
            System.out.println("done");
        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        
    }
}
