package javatest.com.epam.cdp.testngtests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class MultTest extends TestBase {

    @DataProvider(name = "longDataProvider")
    public static Object[][] longDataProvider() {
        return new Object[][]{
                {0, 100, 0},
                {-100, 25, -2500},
                {200, 0, 0},
                {1, 500, 500},
                {1000, 3000, 3000000}
        };
    }

    @DataProvider(name = "doubleDataProvider")
    public static Object[][] doubleDataProvider() {
        return new Object[][]{
                {0, 10.2, 0},
                {-1, 0.34, -0.34},
                {0.25, 100, 25},
                {0.25, 5, 1}
        };
    }
    @Test(dataProvider = "longDataProvider", groups = "CP")
    public void LongMultTest(long a, long b, long expected) {
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    @Test(dataProvider = "doubleDataProvider", groups = "CP")
    public void DoubleMultTest(double a, double b, double expected) {
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

}

