import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up Calculator...");
        calc = new Calculator(); // Arrange
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    void testAddition() {
        int result = calc.add(10, 20); // Act
        assertEquals(30, result);      // Assert
    }

    @Test
    void testNegativeAddition() {
        assertEquals(-5, calc.add(-2, -3)); // Assert
    }
}

