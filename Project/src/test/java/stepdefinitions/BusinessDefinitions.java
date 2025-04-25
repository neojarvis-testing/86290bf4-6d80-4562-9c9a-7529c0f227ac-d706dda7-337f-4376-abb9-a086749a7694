package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BusinessPageActions;

public class BusinessDefinitions {

    public ExtentTest test;
    BusinessPageActions bpa;


    @Given("I open the website")
public void i_open_the_website() {
    test=Hooks.report.createTest("TC_004 - BusinessPageActions");
    bpa=new BusinessPageActions(test);
   
}
@When("I click on Internatioanl Business")
public void i_click_on_internatioanl_business() {
    bpa.clickOnBusiness(test); 
}
@When("I verify Page URL {string}")
public void i_verify_page_url(String string) {
    bpa.verifyPageUrl(test);

}
@When("I verify the text {string} is displayed")
public void i_verify_the_text_is_displayed(String string) {
    bpa.verifyPageText(test);
   
}
@When("I input the value {string} in the Email ID field")
public void i_input_the_value_in_the_email_id_field(String string) {
    bpa.sendEmail(test, string);
    
}
@Then("I verify the Email ID label is displayed")
public void i_verify_the_email_id_label_is_displayed() {
    bpa.verifyEmail(test);
    
}
@Then("I verify the Ph.No label is displayed")
public void i_verify_the_ph_no_label_is_displayed() {
    bpa.verifyPhone(test);
   
}
@Then("I input the value {string} in the phone number field")
public void i_input_the_value_in_the_phone_number_field(String string) {
    bpa.sendPhone(test, string);
  
}
@Then("I verify the Country label is displayed")
public void i_verify_the_country_label_is_displayed() {
    bpa.verifyCountry(test);
   
}
@Then("I input the value {string} in the country field")
public void i_input_the_value_in_the_country_field(String string) {
    bpa.sendCountry(test, string);
    
}
@Then("I verify the Company label is displayed")
public void i_verify_the_company_label_is_displayed() {
    bpa.verifyCompany(test);
   
}
@Then("I input the value {string} in the Company Name field")
public void i_input_the_value_in_the_company_name_field(String string) {
    bpa.sendCompany(test, string);

}
@Then("I verify the Address label is displayed")
public void i_verify_the_address_label_is_displayed() {
    bpa.verifyAddress(test);
   
}
@Then("I input the value {string} in the Address field")
public void i_input_the_value_in_the_address_field(String string) {
    bpa.sendAddress(test, string);
    
}
@Then("I verify the Subject label is displayed")
public void i_verify_the_subject_label_is_displayed() {
    bpa.verifyCountry(test);
   
}
@Then("I input the value {string} in the Subject field")
public void i_input_the_value_in_the_subject_field(String string) {
    bpa.sendSubject(test, string);
   
}
@Then("I input the value {string} in the Your Message field")
public void i_input_the_value_in_the_your_message_field(String string) {
    bpa.sendMessage(test, string);
    
}
@Then("I click on the Send button")
public void i_click_on_the_send_button() {
    bpa.clickOnSend(test);
   
}
}
