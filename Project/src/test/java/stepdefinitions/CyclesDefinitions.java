package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CyclesPageActions;

public class CyclesDefinitions {
     public ExtentTest test;
    CyclesPageActions cpa;

     @Given("I open the website Avon Cycles")
public void i_open_the_website_avon_cycles() {
    test=Hooks.report.createTest("TC_009 - CyclesPageActions");
    cpa=new CyclesPageActions(test);
   
}
    @When("I verify the label {string}")
    public void i_verify_the_label(String string) {
        cpa.verifyCycleText(test);
    }
    @When("I click on the Cyclux link in the footer")
    public void i_click_on_the_cyclux_link_in_the_footer() {
        cpa.clickOnCyclux(test);
        
    }
    @Then("I verify that the page redirects to the expected URL {string}")
    public void i_verify_that_the_page_redirects_to_the_expected_url(String string) {
        cpa.verifyCycleUrl(test);
       
    }
    @When("I click on the Avon link")
    public void i_click_on_the_avon_link() {
        cpa.clickOnAvon(test);
       
    }
    @Then("I verify the page redirects to the expected URL {string}")
    public void i_verify_the_page_redirects_to_the_expected_url(String string) {
        cpa.verifyAvonUrl(test);

       
    }

    @When("I click on REVIEW")
    public void i_click_on_review() {
        cpa.clickOnReview(test);
       
    }
    @When("I click on the first option in the review section")
    public void i_click_on_the_first_option_in_the_review_section() {
        cpa.clickOnFirstReview(test);
        
    }
    @When("I click on SIZE")
    public void i_click_on_size() {
        cpa.clickOnSize(test);
       
    }
    @When("I click on the first option in the size section")
    public void i_click_on_the_first_option_in_the_size_section() {
        cpa.clickOnFirstsize(test);
        
    }
    @When("I click on Color Swatches")
    public void i_click_on_color_swatches() {
        cpa.clickOnColor(test);
        
    }
    @When("I click on Clear Filters")
    public void i_click_on_clear_filters() {
        cpa.clickOnClear(test);
       
    }
    @When("I click on Sort")
    public void i_click_on_sort() {
        cpa.clickOnSort(test);
        
    }
    @When("I click on the first sort option")
    public void i_click_on_the_first_sort_option() {
        cpa.clickOnSortFirst(test);
        
    }
    @When("I click on the first product")
    public void i_click_on_the_first_product() {
        cpa.clickOnFirstProd(test);
       
    }
    @Then("I verify the {string} functionality")
    public void i_verify_the_functionality(String string) {
        cpa.verifyAddText(test);
       
    }
}

    