package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActionsVenkat;
import utils.Reporter;
import utils.Screenshot;

public class HomePageStepDefinitionsVenkat {
 ExtentTest test;
 HomePageActionsVenkat hpa;

 @Given("I launch the Avon Cycles Website")
public void i_launch_the_avon_cycles_website() {
    test=Hooks.report.createTest("TC_003 - HomePageActions");
    hpa=new HomePageActionsVenkat(test);
   
}
@When("I hover on cycleBrandCategory")
public void i_hover_on_cycle_brand_category() {
    hpa.hoverOnCycleByBrand();
   
}
@When("I click on cycleBrand")
public void i_click_on_cycle_brand() {
    hpa.clickOnAvon();
   
}
@Then("I verify {string} label is displayed")
public void i_verify_label_is_displayed(String string) {
    hpa.verifyAvon(string);
   
}
@When("I click on sortButton")
public void i_click_on_sort_button() {
    hpa.clickOnSort();
   
}
@When("I select Price ascending")
public void i_select_price_ascending() {
    hpa.clickonPriceAscending();
   
}
@When("I click on compare")
public void i_click_on_compare() {
    hpa.clickOnCompare();
   
}
@When("I click on cartIcon")
public void i_click_on_cart_icon() {
    hpa.clickOnCart();
   
}
@When("I click on increaseQuantity")
public void i_click_on_increase_quantity() {
    hpa.clickOnPlus();
   
}
@When("I click on deleteIcon")
public void i_click_on_delete_icon() {
    hpa.clickOnDelete();
   
}
@Then("An alert pop-up appears")
public void an_alert_pop_up_appears() {
    Screenshot.takeScreenshot("Pop up apperas");
   
}
@Then("I handle alerts and click dismiss")
public void i_handle_alerts_and_click_dismiss() {
    hpa.dismissAlert();
   
}
@When("I click on checkoutButton")
public void i_click_on_checkout_button() {
    hpa.clickonCheckout();
   
}
@Then("I verify the page redirects to {string}")
public void i_verify_the_page_redirects_to(String string) {
    hpa.verifyUrl(string);
   
}
@Then("I verify the SeletctAdress {string}")
public void i_verify_the_SeletctAdress(String string) {
    hpa.verifySelectAddress(string);
   
}
@Then("I verify the PriceDetail {string}")
public void i_verify_the_PriceDetail(String string) {
    hpa.verifyPriceDetail(string);
   
}
@Then("I verify the SelectPaymentMethod {string}")
public void i_verify_the_SelectPaymentMethod(String string) {
    hpa.verifySelectPaymentMethod(string);
   
}

@Then("I verify the {string}")
public void i_verify_the(String string) {
    hpa.verifyBackToCart(string);
   
}
@Then("I capture the screenshot")
public void i_capture_the_screenshot() {
    Reporter.addScreenshot("TestCase03", test, null);
   
}


}
