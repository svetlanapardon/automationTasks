package javatest.com.epam.cdp.junittests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * Created by svetlana on 6/21/17.
 */
public class TestRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(SumTest.class, DivTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Was successfull? :"+ result.wasSuccessful());
    }
}