package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GearPageActions;

public class GearPageDefinitions {
    ExtentTest test;
    GearPageActions gearPage;

@Given("I am on Avoncycle homepage")
public void i_am_on_avoncycle_homepage() {
    test=Hooks.report.createTest("TC_001 - GearPageActions");
    gearPage=new GearPageActions();

}
@When("I click on search icon")
public void i_click_on_search_icon() {
    gearPage.clickOnAccept(test);
    gearPage.clickOnSearchIcon(test);
   
}
@When("I click on the search bar")
public void i_click_on_the_search_bar() {
    gearPage.clickOnSearchBar(test);
}
@When("I input {string} in search")
public void i_input_in_search(String string) {
    gearPage.sendData(test,string);
}
@When("I click on the first product")
public void i_click_on_the_first_product() {
   gearPage.clickOnFirstProduct(test);
}
@When("I click on buynow")
public void i_click_on_buynow() {
   gearPage.clickOnBuyNow(test);
}
@When("I enter {string} in the First Name field")
public void i_enter_in_the_first_name_field(String string) {
   gearPage.enterFirstName(test,string);
}
@When("I enter {string} in the Last Name field")
public void i_enter_in_the_last_name_field(String string) {
    gearPage.enterLastName(test,string);
}
@When("I enter {string} in the Email field")
public void i_enter_in_the_email_field(String string) {
   gearPage.enterEmail(test,string);
}
@When("I enter {string} in the Phone field")
public void i_enter_in_the_phone_field(String string) {
   gearPage.enterPhoneNumber(test,string);
}
@When("I enter {string} in the Post Code field")
public void i_enter_in_the_post_code_field(String string) {
    gearPage.enterPostCode(test,string);
}
@When("I enter {string} in the State field")
public void i_enter_in_the_state_field(String string) {
   gearPage.enterState(test,string);
}
@When("I enter {string} in the City field")
public void i_enter_in_the_city_field(String string) {
    gearPage.enterCity(test,string);
}
@When("I enter {string} in the Address field")
public void i_enter_in_the_address_field(String string) {
    gearPage.enterAddress(test,string);
}
@When("I enter {string} in the Coupon field")
public void i_enter_in_the_coupon_field(String string) {
gearPage.enterCouponCode(test,string);
}
@When("I click on Apply")
public void i_click_on_apply() {
   gearPage.clickOnApply(test);
}
@When("I click on Razorpay")
public void i_click_on_razorpay() {
   gearPage.clickOnRazorPay(test);
}
@Then("User clicks Confirmcheckout button")
public void user_clicks_confirmcheckout_button() {
    gearPage.clickOnConfirmCheckOut(test);
}
}
