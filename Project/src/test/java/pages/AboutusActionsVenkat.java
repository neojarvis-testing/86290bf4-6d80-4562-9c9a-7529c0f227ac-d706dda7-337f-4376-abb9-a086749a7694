package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.AboutUsLocatorsVenkat;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class AboutusActionsVenkat {
    WebDriverHelper helper;
    WebDriver driver;
    ExtentTest test;
    LoggerHandler loggerHandler;
    Assertion assertion;
 
    /*
     * Constructor Name: AboutusActionsVenkat
     * Author Name: Venkatanarayana
     * Description: This constructor initializes the ExtentTest instance and WebDriverHelper.
     * Parameter List: ExtentTest test - The ExtentTest instance for reporting.
     */
    public AboutusActionsVenkat(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }
 
    /*
     * Method Name: clickOnAcceptCookies
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Accept Cookies" button.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnAcceptCookies(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.cookies);
            loggerHandler.logInfo("Clicked on accept cookies");
            test.info("Clicked on accept cookies");
            test.log(Status.PASS, "Clicked on accept cookies");
            Screenshot.takeScreenshot("AcceptCookies");
        } catch (Exception e) {
            Reporter.addScreenshot("click on accept cookies", test, "click on accept cookies");
            loggerHandler.logError("Click on accept cookies failed");
            test.log(Status.FAIL, "Click on accept cookies failed");
        }
    }
 
    /*
     * Method Name: clickOnAboutUs
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "About Us" link.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnAboutUs(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.aboutUs);
            loggerHandler.logInfo("Clicked on about us");
            test.info("Clicked on about us");
            test.log(Status.PASS, "Clicked on about us");
            Screenshot.takeScreenshot("AboutUs");
        } catch (Exception e) {
            Reporter.addScreenshot("click on About us in the footer section", test, "click on About us in the footer section");
            loggerHandler.logError("Click on About us in the footer section failed");
            test.log(Status.FAIL, "Click on About us in the footer section failed");
        }
    }
 
    /*
     * Method Name: clickOnReadMore
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Read More" link and navigates back to the home page.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnReadMore(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.readmore);
            loggerHandler.logInfo("Click on Readmore in the about us");
            test.info("Click on Readmore in the about us");
            test.log(Status.PASS, "Click on Readmore in the about us");
            Screenshot.takeScreenshot("ReadMore");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on Readmore in the about us", test, "Click on Readmore in the about us");
            loggerHandler.logError("Click on Readmore in the about us failed");
            test.log(Status.FAIL, "Click on Readmore in the about us failed");
        }
    }

    /*
     * Method Name: navigateBack
     * Author Name: Venkatanarayana
     * Description: This method navigates back to home page
     * Return Type: void
     * Parameter List: NA
     */

    public void navigateBack(){
            try{
            helper.navigateBack();
            loggerHandler.logInfo("navigate to home page");
            test.info("navigate to home page");
            }
            catch(Exception e){
                Reporter.addScreenshot("Navigated to home page", test, "Navigated to home page");
                loggerHandler.logError("Navigated to home page failed");
                test.log(Status.FAIL, "Navigated to home page failed");
            }
        
    }
 
    /*
     * Method Name: clickOnProduction
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Production" link, verifies the text, and navigates back to the home page.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnProduction(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.production);
            loggerHandler.logInfo("Click on production in the footer");
            test.info("Click on production in the footer");
            test.log(Status.PASS, "Click on production in the footer");
            Screenshot.takeScreenshot("Production");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on production in the footer", test, "click on production in the about us");
            loggerHandler.logError("Click on production in the about us failed");
            test.log(Status.FAIL, "Click on production in the about us failed");
        }
    }


    /*
     * Method Name: verifyProduction
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "Production".
     * Return Type: void
     * Parameter List: String str
     */
    public void verifyProduction(String str){
        try{
            assertion.verifyText(AboutUsLocatorsVenkat.productionTitle, str);
            helper.navigateBack();
            loggerHandler.logInfo("Verified Production");
            test.info("Verified Production");
            test.log(Status.PASS, "Verified Production");
            Screenshot.takeScreenshot("Production");
        }
     catch (Exception e) {
        Reporter.addScreenshot("Verified Production", test, "Verified Production");
        loggerHandler.logError("Click on production in the about us failed");
        test.log(Status.FAIL, "Click on production in the about us failed");
    }


    }
 
    /*
     * Method Name: clickOnCarrer
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Career" link.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnCarrer(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.carrer);
            loggerHandler.logInfo("Clicked on career");
            test.info("Clicked on career");
            test.log(Status.PASS, "Clicked on career");
            Screenshot.takeScreenshot("Carrer");
        } catch (Exception e) {
            Reporter.addScreenshot("click on career in the footer", test, "New Launch click Failed");
            loggerHandler.logError("Click on career failed");
            test.log(Status.FAIL, "Click on career failed");
        }
    }
 
    /*
     * Method Name: clickOnApplyNow
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Apply Now" button
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnApplyNow(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.applyNow);
            loggerHandler.logInfo("Clicked on apply now");
            test.info("Clicked on apply now");
            test.log(Status.PASS, "Clicked on apply now");
            Screenshot.takeScreenshot("Apply now");
            Reporter.addScreenshot("Apply Now", test, "Apply Now");
        } catch (Exception e) {
            Reporter.addScreenshot("Apply now", test, "Apply now click Failed");
            loggerHandler.logError("Click on apply now failed");
            test.log(Status.FAIL, "Click on apply now failed");
        }
    }


    /*
     * Method Name: verifyUploadForm
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "Upload Form", and navigates back to the home page.
     * Return Type: void
     * Parameter List: String str
     */
    public void verifyUploadForm(String str){
        try{
            assertion.verifyText(AboutUsLocatorsVenkat.uploadForm, str);
            helper.clickOnElement(AboutUsLocatorsVenkat.close);
            helper.navigateBack();
            loggerHandler.logInfo("Verified UploadForm");
            test.info("Verified UploadForm");
            test.log(Status.PASS, "Verified UploadForm");
            Screenshot.takeScreenshot("UploadForm");
            
        }
     catch (Exception e) {
        Reporter.addScreenshot("Verified UploadForm", test, "Verified UploadForm");
        loggerHandler.logError("Verification of UploadForm failed");
        test.log(Status.FAIL, "Verification of UploadForm failed");
    }
}
 
    /*
     * Method Name: clickonLifeAtAvon
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Life At Avon" link.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickonLifeAtAvon(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.lifeAtAvon);   
            loggerHandler.logInfo("Clicked on Life At Avon");
            test.info("Clicked on Life At Avon");
            test.log(Status.PASS, "Clicked on Life At Avon");
            Screenshot.takeScreenshot("LifeAtAvon");
        } catch (Exception e) {
            Reporter.addScreenshot("LifeAtAvon", test, "LifeAtAvon click Failed");
            loggerHandler.logError("Click on Life At Avon failed");
            test.log(Status.FAIL, "Click on Life At Avon failed");
        }
    }


    /*
     * Method Name: verifyLifeAtAvon
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "Life At Avon", and navigates back to the home page.
     * Return Type: void
     * Parameter List: String str
     */
    public void verifyLifeatAvon(String str){
        try{
            assertion.verifyText(AboutUsLocatorsVenkat.verifyLifeatAvon, str);
            helper.navigateBack();
            loggerHandler.logInfo("Verified Life At Avon");
            test.info("Verified Life At Avon");
            test.log(Status.PASS, "Verified Life At Avon");
            Screenshot.takeScreenshot("Life At Avon");
        }
     catch (Exception e) {
        Reporter.addScreenshot("Verified Life At Avon", test, "Verified Life At Avon");
        loggerHandler.logError("Verification of Life At Avon failed");
        test.log(Status.FAIL, "Verification of Life At Avon failed");
    }
}
 
    /*
     * Method Name: clickonCorporate
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Corporate" link
     * Return Type: void
     * Parameter List: NA
     */
    public void clickonCorporate(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.corporate);
            loggerHandler.logInfo("Clicked on Corporate");
            test.info("Clicked on corporate");
            test.log(Status.PASS, "Clicked on corporate");
            Screenshot.takeScreenshot("Corporate");
        } catch (Exception e) {
            Reporter.addScreenshot("Corporate", test, "Corporate click Failed");
            loggerHandler.logError("Click on Corporate failed");
            test.log(Status.FAIL, "Click on Corporate failed");
        }
    }

    /*
     * Method Name: clickOnAnnualReports
     * Author Name: Venkatanarayana
     * Description: This method click on the "Annual Reports" link
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnAnnualReports(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.annualReports);
            helper.switchWindow();
            loggerHandler.logInfo("switch to new tab");
            test.info("switch to new tab");
            test.log(Status.PASS, "Clicked on corporate");
        }catch (Exception e) {
            Reporter.addScreenshot("Annual Reports", test, "Annual Reports Failed");
            loggerHandler.logError("Click on Annual Reports failed");
            test.log(Status.FAIL, "Click on Annual Reports failed");
        }
    }
 
    /*
     * Method Name: verifyUrlofAnnualReports
     * Author Name: Venkatanarayana
     * Description: This method verifies the URL of the Annual Reports page.
     * Return Type: void
     * Parameter List: String str
     */
    public void verifyUrlofAnnualReports(String str){
        try {
            assertion.verifyUrl(str);
            loggerHandler.logInfo("Verified URL of Annual Reports");
            test.info("Verified URL of Annual Reports");
            test.log(Status.PASS, "Verified URL of Annual Reports");
            Screenshot.takeScreenshot("Verified URL of Annual Reports");
        } catch (Exception e) {
            Reporter.addScreenshot("Verified URL of Annual Reports failed", test, "Verified URL of Annual Reports failed");
            loggerHandler.logError("Verified URL of Annual Reports failed");
            test.log(Status.FAIL, "Verified URL of Annual Reports failed");
        }
    }
 
}