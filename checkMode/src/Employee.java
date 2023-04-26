class Employee
{
    int id;
    String name;
    int totalSales = 0;
    double weeklyHours = 0;
    int currentTable = 0;
    public Employee(int i,String emp, int sales, double hours, int table)
    {
        id = i;
        name = emp;
        totalSales = sales;
        weeklyHours = hours;
        currentTable = table;
    }
    public void updateSales(int sales)
    {
        this.totalSales = totalSales + sales;
    }
    public void updateHours(double hours)
    {
        this.weeklyHours = weeklyHours + hours;
    }
    public void setTable(int table)
    {
        this.currentTable = table;
    }
    public String getInfo()
    {
        return "<html>Name: " + this.name + "<br/>Sales: " + this.totalSales + "<br/>Hours: " + this.weeklyHours + "<br/>Table: " + this.currentTable + "</html>";
    }
}