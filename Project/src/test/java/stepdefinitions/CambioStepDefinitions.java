package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CambioActions;

public class CambioStepDefinitions {

    WebDriver driver;
    CambioActions cambio;
    ExtentReports report = Hooks.report;
    ExtentTest test = Hooks.test;

    @Given("I am on Avon Cycles HomePage")
    public void i_am_on_avon_cycles_home_page() {
        cambio = new CambioActions();
        test = report.createTest("Cambio Best Sellers");
    }

    @When("I click on Cambio link")
    public void i_click_on_cambio_link() {
        cambio.clickOnCambio(test);
    }

    @When("I switch to Cambio website")
    public void i_switch_to_cambio_website() {
        cambio.switchCambio(test);
    }

    @Then("I Verify Cambio URL")
    public void i_verify_cambio_url() {
        cambio.verifyUrl(test);
    }

    @When("I hover over Bikes")
    public void i_hover_over_bikes() {
        cambio.hoverOverBikes(test);
    }

    @When("I click on Best Sellers")
    public void i_click_on_best_sellers() {
        cambio.clickOnBestSellers(test);
    }

    @Then("I verify Product Categories title")
    public void i_verify_product_categories_title() {
        cambio.verifyProductCategories(test);
    }

    @Then("I verify Best Selling Bicycle")
    public void i_verify_best_selling_bicycle() {
        cambio.verifyBestSellingBicycle(test);
    }

    @When("I click on 26T")
    public void i_click_on_26t() {
        cambio.clickOn26T(test);
    }

    @When("I hover over first Product")
    public void i_hover_over_first_product() {
        cambio.hoverOverFirstProduct(test);
    }

    @When("I click on Select Options Button")
    public void i_click_on_select_options_button() {
        cambio.clickOnSelectOptions(test);
    }

    @Then("I verify 26T title")
    public void i_verify_26t_title() {
        cambio.verifyTitle26T(test);
    }

    @When("I click on Add to Cart")
    public void i_click_on_add_to_cart() {
        cambio.clickOnAddToCart(test);
    }

    @When("I click on View Cart")
    public void i_click_on_view_cart() {
        cambio.clickOnViewCart(test);
    }

    @Then("I verify Cart Totals")
    public void i_verify_cart_totals() {
        cambio.verifyCartTotals(test);
    }

    @Then("I verify Proceed Checkout")
    public void i_verify_proceed_checkout() {
        cambio.verifyProceedCheckOut(test);
    }

    @Then("I verify Fixed Deposit title.")
    public void i_verify_fixed_deposit_title() {
        cambio.verifyFixedDeposit(test);
    }

}
