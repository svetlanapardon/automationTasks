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
public class SumTest extends TestBase{

    @Test
    public void testSum(){

        assertEquals(calculator.sum(1000, 3500), 4500);
        assertEquals(calculator.sum(-100, 250), 150);
        assertEquals(calculator.sum(0, 0), 0);
        assertEquals(calculator.sum(100, -100), 0);
        assertEquals(calculator.sum(300, 0), 300);

    }
    @After
    public void afterMethod(){System.out.println("SumTest is finished");}
}
