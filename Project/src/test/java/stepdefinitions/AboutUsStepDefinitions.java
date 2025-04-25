package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AboutusActionsVenkat;

import utils.Reporter;

public class AboutUsStepDefinitions {
    ExtentTest test;
    AboutusActionsVenkat auv;

    @Given("I am on the Avon Cycles Website")
public void i_am_on_the_avon_cycles_website() {
    test=Hooks.report.createTest("TC_008 - AboutUs");
    auv=new AboutusActionsVenkat(test);
    
}
@When("I click on About Us in the footer under")
public void i_click_on_about_us_in_the_footer_under() {
    auv.clickOnAcceptCookies();
    auv.clickOnAboutUs();
    
}
@When("I click on Read More under")
public void i_click_on_read_more_under() {
    auv.clickOnReadMore();
    
}
@Then("I navigate back to Home page")
public void i_navigate_back_to_home_page() {
    auv.navigateBack();
    
}
@When("I click on Production in the footer under companySection")
public void i_click_on_production_in_the_footer_under_company_section() {
    auv.clickOnProduction();
    
}
@Then("I verify the title {string} is available")
public void i_verify_the_title_is_available(String string) {
     auv.verifyProduction(string);
    
}
@When("I click on Career in the footer under companySection")
public void i_click_on_career_in_the_footer_under_company_section() {
    auv.clickOnCarrer();
    
}
@When("I click on APPLY NOW button")
public void i_click_on_apply_now_button() {
    auv.clickOnApplyNow();
    
}
@Then("I verify {string} form is available")
public void i_verify_Upload_Form(String string) {
    auv.verifyUploadForm(string);
    
}

@When("I click on Life at AVON in the footer under companySection")
public void i_click_on_life_at_avon_in_the_footer_under_company_section() {
    auv.clickonLifeAtAvon();
    
}
@Then("I verify the Life at Avon {string} is available")
public void i_verify_Life_At_Avon(String string) {
    auv.verifyLifeatAvon(string);
    
}
@When("I click on Corporate in the footer under companySection")
public void i_click_on_corporate_in_the_footer_under_company_section() {
    auv.clickonCorporate();
    
}
@When("I click on the image above annualReports")
public void i_click_on_the_image_above_annual_reports() {
    auv.clickOnAnnualReports();
    
}

@Then("I verify the URL {string}")
public void i_verify_the_url(String string) {
    auv.verifyUrlofAnnualReports(string);
    
}
@Then("I capture the screenshot and attach it to the report with filename {string}")
public void i_capture_the_screenshot_and_attach_it_to_the_report_with_filename(String string) {
    Reporter.addScreenshot(string, test, string);
}



}
