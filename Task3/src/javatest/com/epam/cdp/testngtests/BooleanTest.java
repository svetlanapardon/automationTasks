package javatest.com.epam.cdp.testngtests;

import org.junit.Test;
import org.testng.Assert;

/**
 * Created by svetlana on 6/21/17.
 */
public class BooleanTest extends TestBase {

    @Test
    public void positiveZero(){
        Assert.assertFalse(calculator.isPositive(0));
    }

    @Test
    public void positiveInt(){
        Assert.assertTrue(calculator.isPositive(10));
    }

    @Test
    public void positiveNeg(){
        Assert.assertFalse(calculator.isPositive(-10));
    }

    @Test
    public void negativeZero(){
        Assert.assertFalse(calculator.isPositive(0));
    }

    @Test
    public void negativeInt(){
        Assert.assertTrue(calculator.isPositive(-10));
    }

    @Test
    public void negativePositive(){
        Assert.assertFalse(calculator.isPositive(10));
    }

}
