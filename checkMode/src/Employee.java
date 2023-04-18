class Employee
{
    String name;
    int totalSales = 0;
    double weeklyHours = 0;
    int currentTable = 0;
    public Employee(String emp, int sales, double hours)
    {
        name = emp;
        totalSales = sales;
        weeklyHours = hours;
    }
    public void updateSales(int sales)
    {
        totalSales = totalSales + sales;
    }
    public void updateHours(double hours)
    {
        weeklyHours = weeklyHours + hours;
    }
    public void setTable(int table)
    {
        currentTable = table;
    }
    public String getInfo()
    {
        return "<html>Name: " + this.name + "<br/>Sales: " + this.totalSales + "<br/>Hours: " + this.weeklyHours + "<br/>Table: " + this.currentTable + "</html>";
    }
}