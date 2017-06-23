package javatest.com.epam.cdp.testngtests;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by svetlana on 6/21/17.
 */
public class TestRunner {

    private static String suitePath = "./resources/suites/testngsuite.xml";

    public static void main(String arg[]){
        TestNG tng=new TestNG();
        TestListenerAdapter tla = new TestListenerAdapter();

        tng.addListener(tla);

        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>(){{
            add(suitePath);
        }});

        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        tng.setXmlSuites(suites);
        tng.run();

    }
}
