package javatest.com.epam.cdp.testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class PowSqrtTest extends TestBase {

    @Test(groups = "CP")
    public void testPowByZero() {
        double res = calculator.pow(2, 0);
        Assert.assertEquals(res, 1.0);
    }

    @Test
    public void testPowByNeg() {
        double res = calculator.pow(4, -1);
        Assert.assertEquals(res, 0.25);
    }

    @Test
    public void testPowByDouble() {
       //decimal part should be skipped
        double res = calculator.pow(2, 2.22);
        Assert.assertEquals(res, 4.0);
    }

    @Test
    public void testPowByOne() {
        double res = calculator.pow(2, 1);
        Assert.assertEquals(res, 2.0);
    }

    @Test(groups = "CP")
    public void testPowByInt() {
        double res = calculator.pow(2, 3);
        Assert.assertEquals(res, 8.0);
    }

    @Test
    public void testSqrtOfZero() {
        double res = calculator.sqrt(0);
        Assert.assertEquals(res, 0.0);
    }

    @Test(groups = "CP")
    public void testSqrtOfOne() {
        double res = calculator.sqrt(1);
        Assert.assertEquals(res, 1.0);
    }

    @Test(groups = "CP")
    public void testSqrtOfInt() {
        double res = calculator.sqrt(4);
        Assert.assertEquals(res, 2.0);
    }

    @Test
    public void testSqrtOfDouble() {
        double res = calculator.sqrt(8.22);
        Assert.assertEquals(super.round(res), 2.867);
    }

    @Test
    public void testSqrtOfNeg() {
        double res = calculator.sqrt(-3);
        Assert.assertEquals(super.round(res), -1.732);
    }
}