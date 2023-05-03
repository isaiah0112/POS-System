class Employee
{
    int id;
    String name;
    int totalSales = 0;
    double weeklyHours = 0;
    int currentTable = 0;
    String password = "password";
    public Employee(int i,String emp, int sales, double hours, int table)
    {
        id = i;
        name = emp;
        totalSales = sales;
        weeklyHours = hours;
        currentTable = table;
    }
    public int updateSales(int sales)
    {
        this.totalSales = totalSales + sales;

        return this.totalSales;
    }
    public double updateHours(double hours)
    {
        this.weeklyHours = weeklyHours + hours;
        
        return this.weeklyHours;
    }
    public int setTable(int table)
    {
        this.currentTable = table;

        return this.currentTable;
    }
    public String getInfo()
    {
        return "<html>Name: " + this.name + "<br/>Sales: " + this.totalSales + "<br/>Hours: " + this.weeklyHours + "<br/>Table: " + this.currentTable + "</html>";
    }
}