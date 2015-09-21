import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void areIntegersAddedCorrectly(){
        assertEquals(5, calculator.add(2,3));
        assertEquals(0, calculator.add(0,0));
        assertEquals(-9, calculator.add(-4,-5));
        assertEquals(1, calculator.add(-2, 3));
    }

    @Test
    public void areIntegersMultipliedCorrectly(){
        assertEquals(10, calculator.multiply(2,5));
        assertEquals(0, calculator.multiply(0,5));
        assertEquals(-9, calculator.multiply(-3,3));
        assertEquals(10, calculator.multiply(-2, -5));
    }

    @Test
    public void areIntegersDividedCorrectly(){
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(3, calculator.divide(9,3));
        assertEquals(-2, calculator.divide(10,-5));
        assertEquals(2, calculator.divide(-10,-5));
    }

    @Test(expected = ArithmeticException.class)
    public void dividingByZeroThrowsArithmeticException(){
        calculator.divide(10, 0);
    }
}
