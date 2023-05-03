import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EmployeeTest {
    Employee emp = new Employee(1, "Test", 0, 0, 0);

    @Test
    @DisplayName("Test Update Sales")
    void updateSalesEquals() {
        double ans = emp.updateSales(3);
        Assertions.assertEquals(ans, 3);
    }

    @Test
    @DisplayName("Test Update Hours")
    void updateHoursEquals() {
        double ans = emp.updateHours(22.54);
        Assertions.assertEquals(ans, 22.54);
    }

    @Test
    @DisplayName("Test Set Table")
    void setTableEquals() {
        int ans = emp.setTable(116);
        Assertions.assertEquals(ans, 116);
    }

}
