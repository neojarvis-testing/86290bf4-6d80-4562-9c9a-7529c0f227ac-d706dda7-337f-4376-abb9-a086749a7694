package stepdefinitions;
 

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.MailUtility;
import utils.Reporter;
 
public class Hooks extends Base {
    static ExtentReports report;
    static ExtentTest test;

    @BeforeAll
    public static void reports()
    {
        report = Reporter.createReport("Avon Cycles Report");
    }
 
    @Before
    public void setUp()  {
            openBrowser();
    }
 
    @After
    public void tearDown()
    {
        driver.quit();
    }
 
    @AfterAll
    public static  void saveReports()
    {
        report.flush();
        MailUtility.getEmail();
    }
 
}
