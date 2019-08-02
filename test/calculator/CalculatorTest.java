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
    public void boxesChecked() {
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

        int expected = 4;

        assertEquals(expected, calculator.boxesChecked(testCase1));
    }

    @Test
    public void standardDeduction() {
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

        double expected = 29200.00;

        assertEquals(expected, calculator.standardDeduction(testCase1));
    }

    @Test
    public void taxDue() {
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

        assertEquals(expected, calculator.taxDue(testCase1));
    }

    @Test
    public void testCase2() {
        Input testCase2 = new Input(
                1,
                true,
                false,
                false,
                false,
                70000.00,
                100.00,
                300.00,
                200.00
        );

        double expected = 8303.50;

        assertEquals(expected, calculator.taxDue(testCase2));
    }

}