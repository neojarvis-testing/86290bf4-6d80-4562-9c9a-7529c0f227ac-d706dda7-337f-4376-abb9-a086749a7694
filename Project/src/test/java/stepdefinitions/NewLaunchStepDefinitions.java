package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewLaunchActions;

public class NewLaunchStepDefinitions {

    WebDriver driver;
    NewLaunchActions launch;
    ExtentReports report = Hooks.report;
    ExtentTest test = Hooks.test;

    @Given("I am on Avon Cycles Website HomePage")
    public void i_am_on_avon_cycles_website_home_page() {
        launch = new NewLaunchActions();
        test = report.createTest("Avon Cycles User Registration");
    }

    @When("I click on New Launches")
    public void i_click_on_new_launches() {
        launch.clickOnNewLaunches(test);
    }

    @Then("I verify New Launch URL")
    public void i_verify_new_launch_url() {
        launch.verifyNewLaunch(test);
    }

    @Then("I click on Wish List")
    public void i_click_on_wish_list() {
        launch.clickOnWishlist(test);
    }

    @Then("I switch to Login Page")
    public void i_switch_to_login_page() {
        launch.switchLogin(test);
    }

    @Then("I verify Login Page URL")
    public void i_verify_login_page_url() {
        launch.verifyLoginUrl(test);
    }

    @Then("I verify Login Page title")
    public void i_verify_login_page_title() {
        launch.verifyLoginTitle(test);
    }

    @When("I enter {string} in the email field")
    public void i_enter_in_the_email_field(String email) {
        launch.enterLoginEmail(email,test);
    }

    @When("I enter {string} in the password field")
    public void i_enter_in_the_password_field(String password) {
        launch.enterLoginPassword(password,test);
    }

    @When("I click on Login Button")
    public void i_click_on_login_button() {
        launch.clickOnLogin(test);
    }

    @Then("I verify Login Error")
    public void i_verify_login_error() {
        launch.verifyLoginError(test);
    }

    @When("I click on Create Account link")
    public void i_click_on_create_account_link() {
        launch.clickOnCreateAccount(test);
    }

    @Then("I verify register URL")
    public void i_verify_register_url() {
        launch.verifyRegisterUrl(test);
    }

    @When("I enter {string} in the first name field")
    public void i_enter_in_the_first_name_field(String string) {
        launch.enterFirstName(string,test);
    }

    @When("I enter {string} in the last name field")
    public void i_enter_in_the_last_name_field(String string) {
        launch.enterLastName(string,test);
    }

    @When("I enter {string} in the registeremail field")
    public void i_enter_in_the_registeremail_field(String string) {
        launch.enterRegisterEmail(string,test);
    }

    @When("I enter {string} in the phone field")
    public void i_enter_in_the_phone_field(String string) {
        launch.enterPhone(string,test);
    }

    @When("I enter {string} in the registerpassword field")
    public void i_enter_in_the_registerpassword_field(String string) {
        launch.enterRegisterPassword(string,test);
    }

    @When("I click on Sign Up button")
    public void i_click_on_sign_up_button() {
        launch.clickSignup(test);
    }

}
