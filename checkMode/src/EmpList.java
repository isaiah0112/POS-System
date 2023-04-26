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
            BufferedReader in = new BufferedReader(new FileReader("emplist.txt"), 16*1024);
            Scanner s = new Scanner(in);
            s.useDelimiter(",");
            while(s.hasNext())
            {
                id = s.nextInt();
                n = s.next();
                hours = s.nextDouble();
                sales = s.nextInt();
                table = s.nextInt();

                Employee person = new Employee(id,n, sales, hours, table);
                list.put(String.valueOf(id),person);
                s.nextLine();
            }
            s.close();
            System.out.println("done");
        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        
    }
    public void addEmployee(Employee emp)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\isaia\\OneDrive\\Documents\\GitHub\\POS-System\\emplist.txt",true));
            bw.newLine();
            bw.write(emp.id +","+emp.name+","+emp.weeklyHours+","+emp.totalSales+","+emp.currentTable+",");
            bw.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public Employee getEmployee(String emp)
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
                if(n == emp)
                {
                    Employee person = new Employee(id,n, sales, hours, table);
                    return person;
                }
                s.nextLine();
            }
            s.close();
            System.out.println("done");
        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        Employee not = new Employee(0, "Employee does not exist", 0, 0, 0);
        return not;
    }
    public boolean employeeExists(String emp)
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
                if(n == emp)
                {
                    return true;
                }
                s.nextLine();
            }
            s.close();
            System.out.println("done");
        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        Employee not = new Employee(0, "Employee does not exist", 0, 0, 0);
        return false;
    }
    public Map<String, Employee> getMap()
    {
        return list;
    }
}
