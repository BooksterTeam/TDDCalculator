import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created on 30/04/16
 * author: nixoxo
 */
public class CalculatorTest {


    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() throws Exception {
        assertEquals(calculator.add(5, 5), 10);
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(calculator.subtract(10, 5), 5);
    }

    @Test
    public void div() throws Exception {
        assertEquals(calculator.div(15, 5), 3);
    }

    @Test
    public void mult() throws Exception {
        assertEquals(calculator.mult(5, 3), 15);
    }
}
