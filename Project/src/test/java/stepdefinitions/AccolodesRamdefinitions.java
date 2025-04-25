package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccolodesActionsRam;

public class AccolodesRamdefinitions {   
   ExtentTest test;
   AccolodesActionsRam aar;

 @Given("The user is on the homepage of the website")
public void the_user_is_on_the_homepage_of_the_website() {
    test=Hooks.report.createTest("TC_007 - AccolodesActionsRam");
    aar=new AccolodesActionsRam();
}
@When("I click on Accolodes")
public void i_click_on_accolodes() {
    aar.clickAccolodes(test);
}
@Then("I verify the Accolodes {string}")
public void i_verify_the_accolodes(String string) {
    aar.verifyAwards(test, string);
}
@Then("I click on Accept Cookies")
public void i_click_on_accept_cookies() {
    aar.clickOnAcceptCookies(test);
}
@Then("I click on Blogs")
public void i_click_on_blogs() {
    aar.clickBlogs(test);
}
@Then("I verify the blog {string}")
public void i_verify_the_blog(String string) {
    aar.verifyBlog(test, string);
}
@Then("I click on Warranty")
public void i_click_on_warranty() {
   aar.clickWarrant(test);
}
@Then("I verify the warranty {string}")
public void i_verify_the_warranty(String string) {
    aar.verifyWarrantyPolicy(test, string);
}
@Then("I click on Terms")
public void i_click_on_terms() {
    aar.clickTerms(test);
}
@Then("I verify the conditions {string}")
public void i_verify_the_conditions(String string) {
    aar.verifyTerms(test, string);
}
@Then("I click on Dealer")
public void i_click_on_dealer() {
    aar.clickDealer(test);
}
@Then("I verify the Store  {string}")
public void i_verify_the_store(String string) {
    aar.verifyStoreLocator(test, string);
}
@Then("I verify the Shop  {string}")
public void i_verify_the_shop(String string) {
    aar.verifyDealer(test, string);
}
@Then("I click the State")
public void i_click_the_state() {
    aar.dropState(test);
}
@Then("I click the City")
public void i_click_the_city() {
   aar.dropCity(test);
}   
}
