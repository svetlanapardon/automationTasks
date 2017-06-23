package javatest.com.epam.cdp.testngtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class LongSumTest extends TestBase {

    @Test(dataProvider = "sumDataProvider", groups = "CP")
    public void testSum(long a, long b, long expected){
        long sum=calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }
    @DataProvider(name = "dataProvider")
    public static Object[][] sumDataProvider(){
        return new Object[][]{
                {1000,3500,4500},
                {-100,250,150},
                {0,0,0},
                {100,-100,0},
                {300,0,300}
        };
    }
    @AfterMethod
    public void afterMethod(){System.out.println("LongSumTest");}

}
