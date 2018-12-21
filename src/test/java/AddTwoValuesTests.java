import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods
    @Test
    public void multyplyTwoPositiveAndNegative () { assertEquals( "-30*2 must be -60", -60, calc.multiply(-30, 2));}
    @Test
    public void multiplyTwoPositiveValues () { assertEquals("10*15 must be 150", 150, calc.multiply(10, 15));}
@Test
public void subtractionTwoPositiveValues () {assertEquals("10-5 must be 5", 5, calc.subtraction(10,5)); }
    @Test
    public void subtractionNegativeAndPositiveValues () {assertEquals("-10-5 must be -5", -15, calc.subtraction(-10,5)); }
    @Test
    public void squareRootOfValue () {assertEquals("square 36 must be 6", 6, calc.square_Root(36));}
    @Test
    public void squarePowerOfValues () {assertEquals("power 5 must be 25", 25.0, calc.DoubleMultyply(5));}
    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
