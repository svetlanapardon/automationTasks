package javatest.com.epam.cdp.testngtests;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class TestRunner {


    public static void main(String[] args) {
        TestNG tng = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("CalculatorTest");

        List<String> files = new ArrayList<>();
        files.add("./resources/suites/testngsuite.xml");

        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        tng.setXmlSuites(suites);
        tng.run();
    }
}