package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageActionsRam;

public class HomePageRamDefinitions {  
    ExtentTest test;
    HomePageActionsRam hpra;
       

@Given("the user is on the home page of the website")
public void the_user_is_on_the_home_page_of_the_website() {
    test=Hooks.report.createTest("TC_002 - HomePageActionsRam");
    hpra=new HomePageActionsRam();
}
@When("the user hovers over Bicycle")
public void the_user_hovers_over_bicycle() {
    hpra.hoverBicycle(test);
}
@When("the user clicks on Electric Bike")
public void the_user_clicks_on_electric_bike() {
   hpra.clickElectric(test);
}
@When("the user clicks on the Price")
public void the_user_clicks_on_the_price() {
    hpra.clickPrice(test);
}
@When("the user clicks on the Review")
public void the_user_clicks_on_the_review() {
    hpra.clickReview(test);
}
@When("the user clicks on the  First Review")
public void the_user_clicks_on_the_first_review() {
    hpra.clickReviewFirst(test);
}
@When("the user clicks on the Size")
public void the_user_clicks_on_the_size() {
    hpra.clickSize(test);
}
@When("the user clicks on First Size")
public void the_user_clicks_on_first_size() {
    hpra.clickSizeFirst(test);
}
@When("the user clicks on Height")
public void the_user_clicks_on_height() {
    hpra.clickHeight(test);
}
@When("the user clicks on First Height")
public void the_user_clicks_on_first_height() {
    hpra.clickHeightFirst(test);
}
@When("the user clicks on Color")
public void the_user_clicks_on_color() {
   hpra.clickColor(test);
}
@When("the user clicks on Filter")
public void the_user_clicks_on_filter() {
    hpra.clickFilter(test);
}
@When("the user clicks on Categories")
public void the_user_clicks_on_categories() {
    hpra.clickCategories(test);
}
@When("the user clicks on Bicycle Category")
public void the_user_clicks_on_bicycle_category() {
    hpra.clickBicycleCategory(test);
}
@Then("I verify the {string}")
public void i_verify_the(String string) {
    hpra.verifyBicycleCategory(test,string);
}



}
