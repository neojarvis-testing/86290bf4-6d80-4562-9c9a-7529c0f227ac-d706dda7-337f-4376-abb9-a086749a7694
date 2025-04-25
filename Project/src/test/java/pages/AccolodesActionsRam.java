package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import uistore.AccolodesLocatorsRam;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AccolodesActionsRam {
    WebDriverHelper helper;
    WebDriver driver;
    ExtentTest test;
    LoggerHandler loggerHandler;
    Assertion assertion;

    public AccolodesActionsRam() {
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }
    
    /*
 * Method Name: clickAccolodes
 * Author Name: Ramavathar
 * Description: This method scrolls to the "Accolodes" element on the page and then clicks on it.
 *              It logs and reports the actions before and after the click operation.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void clickAccolodes(ExtentTest test) {
        try {
            helper.scroll(AccolodesLocatorsRam.accolode);
            loggerHandler.logInfo("Scroll to Accolodes");
            test.info("Scroll to Accolodes");
            test.log(Status.PASS, "Scroll on Accolodes");
            helper.clickOnElement(AccolodesLocatorsRam.accolode); 
            Screenshot.takeScreenshot("Accolode");
            loggerHandler.logInfo("Click on Accolodes");
            test.info("Click on Accolodes");
            test.log(Status.PASS, "Click on Accolodes");
        } catch (Exception e) {
            loggerHandler.logError("Click on Accolodes");
            test.log(Status.FAIL, "Click on Accolodes");
            Reporter.addScreenshot("Accolodes", test, "Accolodes" );
        }

    }
    
    /*
 * Method Name: verifyAwards
 * Author Name: Ramavathar
 * Description: This method verifies that the current URL matches the expected Awards page URL ("https://avoncycles.com/awards/"),
 *              logs the result, and then navigates back.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void verifyAwards(ExtentTest test, String string) {
        try {
            assertion.verifyUrl(string); 
            Screenshot.takeScreenshot("Awards Page URL");
            loggerHandler.logInfo("Awards URl Page is verified");
            test.info("Awards URl Page is verified");
            test.log(Status.PASS, "Awards URl Page is verified");
            helper.navigateBack();
        } catch (Exception e) {
            loggerHandler.logError("Awards URl Page is verified");
            test.log(Status.FAIL, "Awards URl Page is verified");
            Reporter.addScreenshot("awards", test, "awards" );
        }

    }   

        /*
 * Method Name: clickOnAcceptCookies
 * Author Name: Ramavathar
 * Description: This method clicks on Cookies
 * Return Type: void
 * Parameter List: ExtentTest test
 */


     public void clickOnAcceptCookies(ExtentTest test){
        try{
            helper.clickOnElement(AccolodesLocatorsRam.cookies);
            Screenshot.takeScreenshot("Cookies");
            loggerHandler.logInfo("Click on Cookies");
            test.info("Click on Cookies");
            test.log(Status.PASS, "Click on Cookies");
        }
        catch(Exception e){
            loggerHandler.logError("Click on Cookies");
            test.log(Status.FAIL, "Click on Cookies");
            Reporter.addScreenshot("Cookies", test, "Cookies" );
        }
    }
    
    
/*
 * Method Name: clickBlogs
 * Author Name: Ramavathar
 * Description: This method scrolls to the blog element, clicks on it, and logs the action.
 *              It updates the ExtentTest report with the status of the action.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void clickBlogs(ExtentTest test) {
        try {
            helper.scroll(AccolodesLocatorsRam.blog);
            loggerHandler.logInfo("Scroll to  blog");
            test.info("Scroll to blog");
            test.log(Status.PASS, "Scroll to blog");
            helper.clickOnElement(AccolodesLocatorsRam.blog);
            Screenshot.takeScreenshot("Blog");
            loggerHandler.logInfo("Click on blog");
            test.info("Click on blog");
            test.log(Status.PASS, "Click on blog");
        } catch (Exception e) {
            loggerHandler.logError("Click on blog");
            test.log(Status.FAIL, "Click on blog");
            Reporter.addScreenshot("Blog", test, "Blog section" );
        }
    }


/*
 * Method Name: verifyBlog
 * Author Name: Ramavathar
 * Description: This method verifies that the current URL matches the expected Blog page URL ("https://avoncycles.com/blog/"),
 *              logs the verification result, and navigates back.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void verifyBlog(ExtentTest test,String string) {
        try { 
            assertion.verifyUrl(string); 
            Screenshot.takeScreenshot("Blog URL");
            loggerHandler.logInfo("Blog URl Page is verified");
            test.info("Blog URl Page is verified");
            test.log(Status.PASS, "Blog URl Page is verified");
            helper.navigateBack();
        } catch (Exception e) {
            loggerHandler.logError("Click on blog");
            test.log(Status.FAIL, "Click on blog");
            Reporter.addScreenshot("Blog", test, "Blog" );
        }

    }

   /*
 * Method Name: clickWarrant
 * Author Name: Ramavathar
 * Description: This method scrolls to the warranty element and clicks on it to access the warranty information.
 *              It logs the actions and then navigates back.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void clickWarrant(ExtentTest test) {
        try {
            helper.scroll(AccolodesLocatorsRam.warranty);
            loggerHandler.logInfo("Scroll to warranty");
            test.info("Scroll to warranty");
            test.log(Status.PASS, "Scroll to warranty");
            helper.clickOnElement(AccolodesLocatorsRam.warranty); 
            Screenshot.takeScreenshot("Warranty");
            loggerHandler.logInfo("Click on warranty");
            test.info("Click on warranty");
            test.log(Status.PASS, "Click on warranty");
            
        } catch (Exception e) {
            loggerHandler.logError("Click on warranty");
            test.log(Status.FAIL, "Click on warranty");
            Reporter.addScreenshot("Warranty", test, "Warranty" );
        }

    }

   /*
 * Method Name: verifyWarrantyPolicy
 * Author Name: Ramavathar
 * Description: This method verifies that the current URL matches the expected Warranty Policy page URL ("https://avoncycles.com/warranty-policy/"),
 *              logs the result, and navigates back.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void verifyWarrantyPolicy(ExtentTest test,String string) {
        try {
            assertion.verifyUrl(string); 
            Screenshot.takeScreenshot("WarrantyPolicy URL");
            loggerHandler.logInfo("Warranty Policy URL is verified");
            test.info("Warranty Policy URL is verified");
            test.log(Status.PASS, "Warranty Policy URL is verified");
            helper.navigateBack();
        } catch (Exception e) {
            loggerHandler.logError("Warranty Policy URL is verified");
            test.log(Status.FAIL, "Warranty Policy URL is verified");
            Reporter.addScreenshot("Warranty Policy", test, "Warranty policy" );
        }

    }

    /*
 * Method Name: clickTerms
 * Author Name: Ramavathar
 * Description: This method scrolls to and clicks on the Terms element,
 *              logs the action, and updates the test report accordingly.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void clickTerms(ExtentTest test) {
        try {
            helper.scroll(AccolodesLocatorsRam.terms);
            loggerHandler.logInfo("Scroll to terms");
            test.info("Scroll to terms");
            test.log(Status.PASS, "Scroll to terms");
            helper.clickOnElement(AccolodesLocatorsRam.terms);
            Screenshot.takeScreenshot("Terms");
            loggerHandler.logInfo("Click on terms");
            test.info("Click on terms");
            test.log(Status.PASS, "Click on terms");
        } catch (Exception e) {
            loggerHandler.logError("Click on terms");
            test.log(Status.FAIL, "Click on terms");
            Reporter.addScreenshot("Terms", test, "Terms" );
        }

    }
   
   /*
 * Method Name: verifyTerms
 * Author Name: Ramavathar
 * Description: This method verifies that the current URL matches the expected Terms and Conditions page URL ("https://avoncycles.com/termcondition/"),
 *              logs the verification, and navigates back.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void verifyTerms(ExtentTest test,String string) {
        try {
            assertion.verifyUrl(string);
            Screenshot.takeScreenshot(null);
            loggerHandler.logInfo("Term condition URL is verified");
            test.info("Term condition URL is verified");
            test.log(Status.PASS, "Term condition URL is verified");
            helper.navigateBack();
        } catch (Exception e) {
            loggerHandler.logError("Term condition URL is verified");
            test.log(Status.FAIL, "Term condition URL is verified");
            Reporter.addScreenshot("term", test, "term" );
        }

    }
    
    /*
 * Method Name: clickDealer
 * Author Name: Ramavathar
 * Description: Clicks on the Dealer element, logs the action, and updates the ExtentTest report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void clickDealer(ExtentTest test) {
        try {
            helper.clickOnElement(AccolodesLocatorsRam.dealer);
            Screenshot.takeScreenshot("Dealer");
            loggerHandler.logInfo("Click on Dealer");
            test.info("Click on Dealer");
            test.log(Status.PASS, "Click on Dealer");
        } catch (Exception e) {
            loggerHandler.logError("Click on Dealer");
            test.log(Status.FAIL, "Click on Dealer");
            Reporter.addScreenshot("Dealer", test, "Dealer" );
        }

    }

    
/*
 * Method Name: verifyStoreLocator
 * Author Name: Ramavathar
 * Description: Verifies that the current URL is the expected Store Locator page ("https://avoncycles.com/storelocater")
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void verifyStoreLocator(ExtentTest test,String string) {
        try {
            assertion.verifyUrl(string); 
            Screenshot.takeScreenshot("Dealer");
            loggerHandler.logInfo("Store Locator URL is verified");
            test.info("Store Locator URL is verified");
            test.log(Status.PASS, "Store Locator URL is verified");
        } catch (Exception e) {
            loggerHandler.logError("Store Locator URL is verified");
            test.log(Status.FAIL, "Store Locator URL is verified");
            Reporter.addScreenshot("StoreLocator", test, "StoreLocator" );
        }

    } 

    /*
 * Method Name: verifyDealer
 * Author Name: Ramavathar
 * Description: Verifies  the text "Dealer Locator" is displayed. It logs the success and updates the test report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void verifyDealer(ExtentTest test,String string){
        try{
            assertion.verifyText(AccolodesLocatorsRam.dealLocator,string);
            Screenshot.takeScreenshot("Dealer");
            loggerHandler.logInfo("Store Locator  is verified");
            test.info("Store Locator U is verified");
            test.log(Status.PASS, "Store Locator  is verified");
        }
        catch (Exception e) {
            loggerHandler.logError("Store Locator  is verified");
            test.log(Status.FAIL, "Store Locator  is verified");
            Reporter.addScreenshot("Store", test, "Store" );
        }
    }

    /*
 * Method Name: dropState
 * Author Name: Ramavathar
 * Description: Selects the "Assam" option from the State dropdown, logs the action, and updates the test report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */

    public void dropState(ExtentTest test) {
        try {
            helper.dropdown(AccolodesLocatorsRam.state, "Assam");
            Screenshot.takeScreenshot("State");
            loggerHandler.logInfo("Dropdown State");
            test.info("Dropdown State");
            test.log(Status.PASS, "Dropdown State");
        } catch (Exception e) {
            loggerHandler.logError("Dropdown State");
            test.log(Status.FAIL, "Dropdown State");
            Reporter.addScreenshot("State", test, "State" );
        }

    }

    /*
 * Method Name: dropCity
 * Author Name: Ramavathar
 * Description: Selects the city "Barpeta Road" from the City dropdown, captures a screenshot, logs the action, and updates the test report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
    
    public void dropCity(ExtentTest test) {
        try {
            helper.dropdown(AccolodesLocatorsRam.city, "Barpeta Road");
            Screenshot.takeScreenshot("City");
            loggerHandler.logInfo("Dropdown City");
            test.info("Dropdown City");
            test.log(Status.PASS, "Dropdown City");
            Reporter.addScreenshot("City", test, "city screenshot" );
        } catch (Exception e) {
            loggerHandler.logError("Dropdown City");
            test.log(Status.FAIL, "Dropdown City");
            Reporter.addScreenshot("City", test, "City" );
        }

    }
}

