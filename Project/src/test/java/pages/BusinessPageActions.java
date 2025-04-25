package pages;

 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.BusinessPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class BusinessPageActions {
    public WebDriverHelper helper;
    public ExtentTest test;
     LoggerHandler loggerHandler;
   Assertion assertion;

    public BusinessPageActions(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
        loggerHandler=new LoggerHandler();
        assertion=new Assertion();
    }
 
    /*
     * Method Name: clickOnBusiness
     * Author Name: Chikka Anjani
     * Description: This method clicks on the business element
     * Return Type:void
     * Parameter List:ExtentTest test
     */
 
    public void clickOnBusiness(ExtentTest test){
        try{
        helper.waitForElementToBeVisible(BusinessPageLocators.business, 10);
        helper.clickOnElement(BusinessPageLocators.business);
        Reporter.addScreenshot("Business", test, "Clicked on Business");
        loggerHandler.logInfo("Clicked on Business");
        test.info("Clicked on Business");
        test.log(Status.PASS, "Clicked on Business");
        Screenshot.takeScreenshot("Business");
        }catch(Exception e){
            Reporter.addScreenshot("Business", test, "Clicked on Business failed");
            loggerHandler.logError("Unable to Click on Business");
            test.log(Status.FAIL, "Unable to Click on Business");
        }
    }
 
     /*
     * Method Name: verifyPageUrl
     * Author Name: Chikka Anjani
     * Description: This method verifies the PageURL.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void verifyPageUrl(ExtentTest test){
        try{
        assertion.verifyUrl("https://avoncycles.com/international-business");
        loggerHandler.logInfo("URL Verified");
        test.info("Verified URL");
        test.log(Status.PASS,"Verified URL");
        Screenshot.takeScreenshot("PageURL");
        }catch(Exception e){
            Reporter.addScreenshot("PageURL", test, "Verified PageURL failed");
            loggerHandler.logError("Not Verified URL");
            test.log(Status.FAIL, "Not Verified URL");
           
        }
    }
 
    /*
     * Method Name: verifyPageText
     * Author Name: Chikka Anjani
     * Description: This method verifies the PageText.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void verifyPageText(ExtentTest test){
        try{
        assertion.verifyText(BusinessPageLocators.certifications, "Certifications");
        loggerHandler.logInfo("Verified Page text");
        test.info("Verify Page text");
        test.log(Status.PASS, "Verify Page text");
        Screenshot.takeScreenshot("PageText");
    }catch(Exception e){
        Reporter.addScreenshot("PageText", test, "Verified PageText failed");
        loggerHandler.logError("Unable to Verify Page text");
        test.log(Status.FAIL, "Unable to Verify Page text");
    }
}
 
 /*
     * Method Name: sendemail
     * Author Name: Chikka Anjani
     * Description: This method reads data from feature file
     * Return Type: void
     * Parameter List:ExtentTest test, String value
     */
 
   public void sendEmail(ExtentTest test, String value){
try {
    helper.typeInElement(BusinessPageLocators.email, value);
    loggerHandler.logInfo("Entered email");
    Reporter.addScreenshot("Email", test, "Clicked on Email");
    test.info("Entered email");
    test.log(Status.PASS, "Entered email");
    Screenshot.takeScreenshot("Email");
  }catch (Exception e) {
    Reporter.addScreenshot("Email", test, "Clicked on Email failed");
    loggerHandler.logError("Unable to Verify Email");
    test.log(Status.FAIL, "Unable to Verify Email");
   }
}
 
 /*
     * Method Name: verifyEmail
     * Author Name: Chikka Anjani
     * Description: This method verifies the Email.
     * Return Type:void
     * Parameter List:ExtentTest test
     */
public void verifyEmail(ExtentTest test){
    try{
    assertion.verifyText(BusinessPageLocators.emaillabel, "Email ID (required)");
    loggerHandler.logInfo("Email verified");
    test.info("Email verified");
    test.log(Status.PASS, "Email verified");
    Screenshot.takeScreenshot("Email");
   }catch(Exception e){
    Reporter.addScreenshot("Email", test, "Verified email failed");
    loggerHandler.logError("Unable to Verify Email");
    test.log(Status.FAIL, "Unable to Verify Email");
   }
}
 
    /*
     * Method Name: verifyPhone
     * Author Name: Chikka Anjani
     * Description: This method verifies the Phone.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void verifyPhone(ExtentTest test){
    try{
    assertion.verifyText(BusinessPageLocators.phonelabel, "Ph. No (required)");
    loggerHandler.logInfo("Verified Phone Number");
    test.info("verified Phone Number");
    test.log(Status.PASS, "Verified Phone Number");
    Screenshot.takeScreenshot("Phone");
    }catch(Exception e){
        Reporter.addScreenshot("Phone", test, "Verfied phone failed");
        loggerHandler.logError("Unable to Verify Phone Number");
        test.log(Status.FAIL, "Unable to Verify Phone Number");
    }
 
}
 
/*
     * Method Name: sendPhone
     * Author Name: Chikka Anjani
     * Description:  This method reads data from feature file
     * Return Type: void
     * Parameter List:ExtentTest test, String value
     */
 
 
public void sendPhone(ExtentTest test, String value){
    try {
        helper.typeInElement(BusinessPageLocators.phone, value);
        loggerHandler.logInfo("Entered Phone Number");
        test.info("Entered Phone Number");
        test.log(Status.PASS, "Entered Phone Number");
        Screenshot.takeScreenshot("Phone");
    } catch (Exception e) {
        Reporter.addScreenshot("Phone", test, "Clicked on Phone failed");
        loggerHandler.logError("Entered Invalid Phone Number");
       test.log(Status.FAIL,"Entered Invalid Phone Number");
    }
}
 
/*
     * Method Name: verifyCountry
     * Author Name: Chikka Anjani
     * Description: This method verifies the country.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void verifyCountry(ExtentTest test){
        try{
        assertion.verifyText(BusinessPageLocators.countrylabel, "Country");
        loggerHandler.logInfo("Verified Country");
        test.info("Verified Country");
        test.log(Status.PASS, "Verified Country");
        Screenshot.takeScreenshot("Country");
    }catch(Exception e){
        Reporter.addScreenshot("Country", test, "Verified Country failed");
        loggerHandler.logError("Unable to Verify Country");
        test.log(Status.FAIL, "Unable to Verify Country");
    }
}
 
/*
     * Method Name: sendCountry
     * Author Name: Chikka Anjani
     * Description:  This method reads data from feature file
     * Return Type: void
     * Parameter List:ExtentTest test, String value
     */
 
 
    public void sendCountry(ExtentTest test, String value){
        try {
            helper.typeInElement(BusinessPageLocators.country, value);
            loggerHandler.logInfo("Entered Country");
            test.info("Entered Country");
            test.log(Status.PASS, "Entered Country");
            Screenshot.takeScreenshot("Country");
        } catch (Exception e) {
            Reporter.addScreenshot("Country", test, "Clicked on Country failed");
            loggerHandler.logError("Unable to Enter Country");
            test.log(Status.FAIL, "Unable to Enter Country");
        }
    }
 
    /*
     * Method Name: verifyCompany
     * Author Name: Chikka Anjani
     * Description: This method verifies the company.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void verifyCompany(ExtentTest test){
        try{
            assertion.verifyText(BusinessPageLocators.companylabel, "Company Name");
            loggerHandler.logInfo("Verified Company");
            test.info("Verified Company");
            test.log(Status.PASS, "Verified Company");
            Screenshot.takeScreenshot("Company");
        }catch(Exception e){
            Reporter.addScreenshot("Company", test, "Verified Company failed");
            loggerHandler.logError("Unable to Verify Company");
            test.log(Status.FAIL, "Unable to Verify Company");
 
        }
    }
 
    /*
     * Method Name: sendCompany
     * Author Name: Chikka Anjani
     * Description:  This method reads data from feature file
     * Return Type: void
     * Parameter List:ExtentTest test, String value
     */
 
 
    public void sendCompany(ExtentTest test, String value){
        try {
            helper.typeInElement(BusinessPageLocators.company, value);
            loggerHandler.logInfo("Entered Company");
            Reporter.addScreenshot("Company", test, "Clicked on Company");
            test.info("Entered Company");
            test.log(Status.PASS, "Entered Company");
            Screenshot.takeScreenshot("Company");
            } catch (Exception e) {
             Reporter.addScreenshot("Company", test, "Clicked on Company failed");
            loggerHandler.logError("Unable to Enter Company");
               test.log(Status.FAIL, "Unable to Enter Company");
            }
        }
 
        /*
     * Method Name: verifyAddress
     * Author Name: Chikka Anjani
     * Description: This method verifies the address.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
     public void verifyAddress(ExtentTest test){
        try{
            assertion.verifyText(BusinessPageLocators.addresslabel, "Address");
            loggerHandler.logInfo("Verified Address");
            test.info("Verified Address");
            test.log(Status.PASS, "Verified Address");
            Screenshot.takeScreenshot("Address");
        }catch(Exception e){
            Reporter.addScreenshot("Address", test, "Verified Address failed");
            loggerHandler.logError("Unable to Verify Address");
            test.log(Status.FAIL, "Unable to Verify Address");
        }
    }
 
    /*
     * Method Name: sendAddress
     * Author Name: Chikka Anjani
     * Description:  This method reads data from feature file
     * Return Type: void
     * Parameter List:ExtentTest test, String value
     */
 
 
    public void sendAddress(ExtentTest test, String value){
        try {
                helper.typeInElement(BusinessPageLocators.address, value);
                loggerHandler.logInfo("Entered Address");
                test.info("Entered Address");
                test.log(Status.PASS, "Entered Address");
                Screenshot.takeScreenshot("Address");
            } catch (Exception e) {
                Reporter.addScreenshot("Address", test, "Clicked on Address failed");
                loggerHandler.logError("Unable to Enter Address");
            test.log(Status.FAIL, "Unable to Enter Address");
            }
        }
 
        /*
     * Method Name: verifySubject
     * Author Name: Chikka Anjani
     * Description: This method verifies the subject.
     * Return Type:void
     * Parameter List:ExtentTest test
     */
 
    public void verifySubject(ExtentTest test){
        try{
            assertion.verifyText(BusinessPageLocators.subjectlabel, "Subject");
            loggerHandler.logInfo("Verified Subject");
            test.info("Verified Subject");
            test.log(Status.PASS, "Verified Subject");
            Screenshot.takeScreenshot("Subject");
        }catch(Exception e){
            Reporter.addScreenshot("Subject", test, "Clicked on Subject failed");
            loggerHandler.logError("Unable to Verify Subject");
            test.log(Status.FAIL, "Unable to Verify Subject");
        }
    }
 
    /*
     * Method Name: sendSubject
     * Author Name: Chikka Anjani
     * Description:  This method reads data from feature file
     * Return Type: void
     * Parameter List:ExtentTest test, String value
     */
 
 
    public void sendSubject(ExtentTest test, String value){
        try {
                helper.typeInElement(BusinessPageLocators.subject,value);
                loggerHandler.logInfo("Entered Subject");
                test.info("Entered Subject");
                test.log(Status.PASS, "Entered Subject");
                Screenshot.takeScreenshot("Subject");
            } catch (Exception e) {
                Reporter.addScreenshot("Subject", test, "Clicked on Subject failed");
                loggerHandler.logError("Unable to Enter Subject");
            test.log(Status.FAIL, "Unable to Enter Subject");
            }
        }
 
        /*
     * Method Name: sendMessage
     * Author Name: Chikka Anjani
     * Description:  This method reads data from feature file
     * Return Type: void
     * Parameter List:ExtentTest test, String value
     */
 
 
    public void sendMessage(ExtentTest test, String value){
        try {
                helper.typeInElement(BusinessPageLocators.message, value);
                loggerHandler.logInfo("Entered Message");
                test.info("Entered Message");
                test.log(Status.PASS, "Entered Message");
                Screenshot.takeScreenshot("Message");
            } catch (Exception e) {
                Reporter.addScreenshot("Message", test, "Clicked on Message failed");
                loggerHandler.logError("Unable to Enter Message");
            test.log(Status.FAIL, "Unable to Enter Message");
            }
        }
 
        /*
     * Method Name: clickOnSend
     * Author Name: Chikka Anjani
     * Description: This method clicks on the send element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
    public void clickOnSend(ExtentTest test){
        try{
            helper.clickOnElement(BusinessPageLocators.send);
            Reporter.addScreenshot("Send", test, "Clicked on Send");
            Screenshot.takeScreenshot("sent");
            loggerHandler.logInfo("Clicked on Send");
            test.info("Clicked on Send");
                test.log(Status.PASS, "Clicked on Send");
                Screenshot.takeScreenshot("Send");
            }catch(Exception e){
                Reporter.addScreenshot("Send", test, "Clicked on Send failed");
                loggerHandler.logError("Unable to Click on Send");
            test.log(Status.FAIL, "Unable to Click on Send");
            }
    }
}
         
 
