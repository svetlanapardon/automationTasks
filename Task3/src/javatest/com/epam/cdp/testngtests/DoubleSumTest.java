package javatest.com.epam.cdp.testngtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class DoubleSumTest extends TestBase {

    @Test(dataProvider = "sumDataProvider", groups = {"CP"})
    public void testSum(double a, double b, double expected){
        double sum=calculator.sum(a, b);
        Assert.assertEquals(super.round(sum), expected);
    }
    @DataProvider(name = "dataProvider")
    public static Object[][] sumDataProvider(){
        return new Object[][]{
                {2.34,5.66,8},
                {1.23,4.55,5.78},
                {4.55, 0, 4.55},
                {5.67, -3, 2.67},
                {0,0,0}
        };
    }
    @AfterMethod
    public void afterMethod(){System.out.println("DoubleSumTest");}

}
