
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class checkLogicTest {
    checkLogic logic = new checkLogic();
    managerMode manager = new managerMode();

    @Test
    @DisplayName("Addition on Check")
    void additionOperationEquals() {
        double ans = logic.add(5.99, 0);
        Assertions.assertEquals(ans, 5.99);
    }

    @Test
    @DisplayName("Subtraction on Check")
    void subtractionOperationEquals() {
        double ans = logic.subtract(4.99, 5.99);
        Assertions.assertEquals(ans, 1.00);
    }

    @Test
    @DisplayName("Partial Pay `false` on Start")
    void partialPayFalse() {
        boolean ans = logic.partialPayFalse();
        Assertions.assertTrue(ans == false);
    }

}
