package javatest.com.epam.cdp.testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class LongDivTest extends TestBase {
    @Test(groups = {"CP"}, expectedExceptions = NumberFormatException.class)
    public void testDivByZero() throws NumberFormatException{
        double div=calculator.div(2, 0);
    }

    @Test(groups={"CP"})
    public void testDivByOne(){
        double div=calculator.div(340, 1);
        Assert.assertEquals(div, 340);
    }

    @Test
    public void testDivByInt(){
        double div=calculator.div(150, 2);
        Assert.assertEquals(div, 75);
    }

    @Test(groups={"CP"})
    public void testDivByLong(){
        double div=calculator.div(4, 3);
        Assert.assertEquals(super.round(div), 1.33);
    }

    @Test
    public void testDivByNeg(){
        double div=calculator.div(10, -5);
        Assert.assertEquals(div, -2);
    }
}
