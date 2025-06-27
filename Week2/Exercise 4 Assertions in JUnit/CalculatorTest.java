import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result); // expected 5
        assertNotEquals(6, result); // not 6
        assertTrue(result > 0);
        assertFalse(result < 0);
    }
}
