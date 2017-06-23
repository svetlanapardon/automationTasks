package javatest.com.epam.cdp.testngtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class DoubleDivTest extends TestBase {

    @Test(groups = {"CP"}, expectedExceptions = NumberFormatException.class)
    public void testDivByZero() throws NumberFormatException{
        double div=calculator.div(2, 0);
    }

    @Test(groups={"CP"})
    public void testDivByOne(){
        double div=calculator.div(3.45, 1);
        Assert.assertEquals(super.round(div), 3.45);
    }

    @Test
    public void testDivByInt(){
        double div=calculator.div(3.45, 2);
        Assert.assertEquals(super.round(div), 1.725);
    }

    @Test(groups = {"CP"})
    public void testDivByDouble(){
        double div=calculator.div(3.45, 1.25);
        Assert.assertEquals(super.round(div), 2.76);
    }

    @Test
    public void testDivByNeg(){
        double div=calculator.div(5.69, -2);
        Assert.assertEquals(super.round(div), -2.845);
    }
}
