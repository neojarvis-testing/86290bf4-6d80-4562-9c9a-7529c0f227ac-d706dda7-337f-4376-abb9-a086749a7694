package stepdefinitions;
 
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public void setUp() throws IOException
    {
         openBrowser();
    }
 
    @After
    public void tearDown()
    {
        driver.quit();
    }
 
    @AfterAll
    public static void saveReports()
    {
        report.flush();
        String reportPath = System.getProperty("user.dir") + "/reports/Avon Cycles Report_" + new SimpleDateFormat("2025.04.23.13.51.36").format(new Date())+ ".html";
        MailUtility.sendEmail("sharmilaabdul113@gmail.com","Report","Report Test",reportPath);
    }
 
}
 