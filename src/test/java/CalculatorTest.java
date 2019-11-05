import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double result = calculator.add(2.00, 2.00);
        assertEquals(4.00, result, 0.01);
    }
}
