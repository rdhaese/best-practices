
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
public class CalculatorTestWithIgnore {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test @Ignore
    public void areIntegersAddedCorrectly(){
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-9, calculator.add(-4, -5));
        assertEquals(1, calculator.add(-2, 3));
    }

     @Ignore @Test
    public void areIntegersMultipliedCorrectly(){
        assertEquals(10, calculator.multiply(2, 5));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-9, calculator.multiply(-3, 3));
        assertEquals(10, calculator.multiply(-2, -5));
    }

     @Ignore
     @Test
    public void areIntegersDividedCorrectly(){
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(3, calculator.divide(9, 3));
        assertEquals(-2, calculator.divide(10, -5));
        assertEquals(2, calculator.divide(-10, -5));
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void dividingByZeroThrowsArithmeticException(){
        calculator.divide(10, 0);
    }



    @Test
    public void isSquareRootCalculated(){
        assertEquals(2, calculator.sqrRoot(4), 0.001);
        assertEquals(4, calculator.sqrRoot(16), 0.001);
        assertEquals(0, calculator.sqrRoot(0), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, calculator.sqrRoot(Double.POSITIVE_INFINITY), 0.001);
        assertTrue(Double.isNaN(calculator.sqrRoot(-16)));
    }
}
