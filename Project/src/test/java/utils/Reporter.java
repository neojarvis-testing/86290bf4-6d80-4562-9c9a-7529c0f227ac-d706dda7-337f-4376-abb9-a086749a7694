package utils;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
 
public class Reporter {
    private static File file;
    private static ExtentSparkReporter sparkReporter;
    private static ExtentReports reports;
   
/* Method Name: createReport
 * Author Name: Sharmila,Pragna,Ramavathar,Venkat,Anjani.
 * Description: This method initializes and configures the ExtentReports instance for generating test reports.
 * Return Type: ExtentReports
 * Parameter List: String reportName
 */
 
    public static ExtentReports createReport(String reportName) {
        String dirpath = System.getProperty("user.dir") + "/reports";
        file = new File(dirpath);
 
        if (!file.exists()) {
            file.mkdir();
        }
 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        dateFormat.setTimeZone(istTimeZone);
        String timestamp = dateFormat.format(new Date());
 
        String reportPath = System.getProperty("user.dir") + "/reports/" + reportName + "_" + timestamp + ".html";
        File reportfile = new File(reportPath);
 
        sparkReporter = new ExtentSparkReporter(reportfile);
 
        sparkReporter.config().setTheme(Theme.STANDARD);
 
        reports = new ExtentReports();
 
        reports.setSystemInfo("Operating System", System.getProperty("os.name"));
        reports.setSystemInfo("Operating System version", System.getProperty("os.version"));
        reports.setSystemInfo("Java version", System.getProperty("java.version"));
        reports.setSystemInfo("Selenium version", "4.15.0");
 
        reports.attachReporter(sparkReporter);
 
        return reports;
    }
 
    public static String captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
 
        String destPath = "./" + name;
 
        if (Base.driver == null)
            System.out.println("driver is null");
 
        TakesScreenshot ts = (TakesScreenshot) Base.driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
 
        File screenshotsDir = new File(System.getProperty("user.dir") + "/reports");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
 
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }
 
    /*
 * Method Name: addScreenshot
 * Author Name: Sharmila,Pragna,Ramavathar,Venkat,Anjani.
 * Description: This method captures a screenshot and adds it to the ExtentTest report.
 * Return Type: void
 * Parameter List: String filename, ExtentTest test, String description, WebDriver driver
 */
 
 public static void addScreenshot(String filename, ExtentTest test, String description) {
    try {
        test.log(Status.INFO, description,
                MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
 
}