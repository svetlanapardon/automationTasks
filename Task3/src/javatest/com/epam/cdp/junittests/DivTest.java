package javatest.com.epam.cdp.junittests;

import java.util.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by svetlana on 6/21/17.
 */

public class DivTest extends TestBase {

    @Test
    public void testDivByZero(){
       try {
           double div = calculator.div(2, 0);
       }catch (NumberFormatException e){
            Assert.fail("Test failed : " + e.getMessage());
        }
    }

    @Test
    public void testDivByOne(){
        double div=calculator.div(3.45, 1);
        Assert.assertEquals(super.round(div), 3.45, 0);
    }

    @Test
    public void testDivByInt(){
        double div=calculator.div(3.45, 2);
        Assert.assertEquals(super.round(div), 1.725, 0);
    }

    @Test
    public void testDivByDouble(){
        double div=calculator.div(3.45, 1.25);
        Assert.assertEquals(super.round(div), 2.76, 0);
    }

    @Test
    public void testDivByNeg(){
        double div=calculator.div(5.69, -2);
        Assert.assertEquals(super.round(div), -2.845, 0);
    }

    @After
    public void afterMethod(){System.out.println("DivTest is finished");}

}
