package calculator;

import model.Input;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    public void calculateTax() {
        Input testCase1 = new Input(
                2,
                true,
                true,
                true,
                true,
                200000.00,
                2000.00,
                5000.00,
                9000.00
        );

        double expected = 27475.00;

        assertEquals(expected, calculator.calculateTax(testCase1));
    }

}