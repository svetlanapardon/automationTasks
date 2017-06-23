package javatest.com.epam.cdp.testngtests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

/**
 * Created by svetlana on 6/21/17.
 */
    public class TestBase {
        protected Calculator calculator;

        @BeforeMethod
        public void setUp(){
            calculator=new Calculator();
            System.out.println("creating new instance of calculator");
        }

        public double round(double a){
            return (double)Math.round(a * 1000d)/1000d;
        }
    }
