package javatest.com.epam.cdp.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class SubTest extends TestBase {


    @Test(dataProvider = "longDataProvider", groups = "CP")
    public void longSub(long a, long b, long expected){
        long res=calculator.sub(a, b);
        Assert.assertEquals(res, expected);
    }
    @DataProvider(name = "longDataProvider")
    public static Object[][] longDataProvider(){
        return new Object[][]{
                {1000,3500,-2500},
                {-100,250,-350},
                {0,0,0},
                {100,-100,200},
                {300,0,300},
                {50, 200, -150},
                {10, 1, 9}
        };
    }

    @Test(dataProvider = "doubleDataProvider", groups = "CP")
    public void doubleSub(double a, double b, double expected){
        double res=calculator.sub(a, b);
        Assert.assertEquals(super.round(res), super.round(expected));
    }
    @DataProvider(name = "doubleDataProvider")
    public static Object[][] doubleDataProvider(){
        return new Object[][]{
                {2.347890,5.6600099,-3.3121199},
                {1.23,1,0.23},
                {4.55, 0, 4.55},
                {5.67, -3, 8.67},
                {14.5666666,14.5666666,0}
        };
    }
}
