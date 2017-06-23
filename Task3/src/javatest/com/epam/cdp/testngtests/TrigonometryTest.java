package javatest.com.epam.cdp.testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by svetlana on 6/21/17.
 */
public class TrigonometryTest extends TestBase {

    @Test
    public void sin0(){
        double res = calculator.sin(0);
        Assert.assertEquals(res,0.0);
    }

    @Test
    public void sin30(){
        double res = calculator.sin(30);
        Assert.assertEquals(res,0.5);

    }

    @Test(groups = "CP")
    public void sin90(){
        double res = calculator.sin(90);
        Assert.assertEquals(res,1.0);
    }

    @Test(groups = "CP")
    public void cos0(){
        double res = calculator.cos(0);
        Assert.assertEquals(res,1.0);
    }

    @Test
    public void cos60(){
        double res = calculator.cos(0);
        Assert.assertEquals(res,0.5);
    }

    @Test
    public void tg0(){
        double res = calculator.tg(0);
        Assert.assertEquals(res,0.0);
    }

    @Test(groups = "CP")
    public void tg45(){
        double res = calculator.tg(45);
        Assert.assertEquals(res,1.0);
    }

    @Test (expectedExceptions = NumberFormatException.class)
    public void tg90(){
        double res = calculator.tg(90);
    }


    @Test(expectedExceptions = NumberFormatException.class)
    public void ctg0(){
        double res = calculator.tg(0);
    }

    @Test(groups = "CP")
    public void ctg45(){
        double res = calculator.tg(45);
        Assert.assertEquals(res,1.0);
    }
}
