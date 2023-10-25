import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculadora calculator = new Calculadora();
        int result = calculator.soma(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        Calculadora calculator = new Calculadora();
        int result = calculator.subtracao(10, 5);
        assertEquals(5, result);
    }
}

