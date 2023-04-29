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
            
            System.out.println("in emplist");
            BufferedReader in = new BufferedReader(new FileReader("emplist.txt"), 16*1024);
            Scanner s = new Scanner(in);
            s.useDelimiter(",");
            System.out.println("getting lines");
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
            System.err.println("emplist Error: " + e.getMessage());
        }
        
    }
    public void addEmployee(Employee emp)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("emplist.txt",true));
            bw.newLine();
            bw.write(emp.id +","+emp.name+","+emp.weeklyHours+","+emp.totalSales+","+emp.currentTable+",");
            bw.close();
            list.put(String.valueOf(emp.id),emp);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public Employee getEmployee(String emp)
    {
        System.out.println("Get Emp: " + emp);
        try {
            //System.out.println(new File("emplist.txt").getAbsolutePath());
            BufferedReader in = new BufferedReader(new FileReader("emplist.txt"), 16*1024);
            Scanner s = new Scanner(in);
            s.useDelimiter(",");
            while(s.hasNext())
            {
                id = s.nextInt();
                n = s.next();
                System.out.println(n);
                hours = s.nextDouble();
                sales = s.nextInt();
                table = s.nextInt();
                System.out.println("File: "  + n.length() + "Emp: " + emp.length());
                if(n.equals(emp))
                {
                    Employee person = new Employee(id,n, sales, hours, table);
                    System.out.println(id + n + sales + hours + table);
                    return person;
                }
                s.nextLine();
            }
            s.close();
            System.out.println("done");
        } catch (Exception e){
            System.err.println("getemp Error: " + e.getMessage());
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
            System.err.println("emp exists Error: " + e.getMessage());
        }
        Employee not = new Employee(0, "Employee does not exist", 0, 0, 0);
        return false;
    }
    public Map<String, Employee> getMap()
    {
        return list;
    }
}
