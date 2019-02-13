package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(10, calculationsUnderTest.calculate(Operation.SUM, 7, 3, 0), 0.01);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(3, calculationsUnderTest.calculate(Operation.SUBTRACT, 5, 2, 0), 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(2, calculationsUnderTest.calculate(Operation.DIVIDE, 4, 2, 0), 0.01);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(8, calculationsUnderTest.calculate(Operation.MULTIPLY, 4, 2, 0), 0.01);
    }

    @Test
    public void testAverage() throws Exception {
        assertEquals(3, calculationsUnderTest.calculate(Operation.AVERAGE, 6, 2, 1), 0.01);
    }

    @Test
    public void testDivNullPos() throws Exception {
        assertEquals(Float.POSITIVE_INFINITY, calculationsUnderTest.calculate(Operation.DIVIDE, 5, 0, 0), 0.01);
    }

    @Test
    public void testDivNullNeg() throws Exception {
        assertEquals(Float.NEGATIVE_INFINITY, calculationsUnderTest.calculate(Operation.DIVIDE, -5, 0, 0), 0.01);
    }

    @After
    public void tearDown() {
    }


}