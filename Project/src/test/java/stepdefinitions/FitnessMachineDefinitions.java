package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FitnessMachineActions;


public class FitnessMachineDefinitions {
       ExtentTest test;
    FitnessMachineActions fitness;
@Given("I landed on Avoncycles website")
public void i_landed_on_avoncycles_website() {
    test=Hooks.report.createTest("TC_006 - FitnessMachineActions");
    fitness=new FitnessMachineActions();
}
@When("I click on Avon Fitness Machines")
public void i_click_on_avon_fitness_machines() {
   fitness.clickOnAvonFitnessMachines(test);
}
@When("I verify Avon Fitness Machines page URL")
public void i_verify_avon_fitness_machines_page_url() {
    fitness.verifyAvonUrl(test);
}
@When("I handle the pop-up and close the form")
public void i_handle_the_pop_up_and_close_the_form() {
    fitness.clickOnPopUp(test);
}
@When("I hover over Domestic Gym")
public void i_hover_over_domestic_gym() {
   fitness.hoverOnDomesticGym(test);
}
@When("I hover over Cardio Line")
public void i_hover_over_cardio_line() {
  fitness.hoverOnCardioLine(test);
}
@When("I click on Treadmills")
public void i_click_on_treadmills() {
  fitness.clickOnTreadmills(test);
}
@When("I click on first product")    
public void i_click_on_first_product() {
   fitness.clickOnFirstProduct(test);
}
@When("I click Enquire Now")
public void i_click_enquire_now() {
   fitness.clickOnEnquireNow(test);
}
@When("I enter {string} in the Name field")
public void i_enter_in_the_name_field(String string) {
   fitness.inputName(test,string);
}
@When("I enter {string} in Email field")
public void i_enter_in_email_field(String string) {
   fitness.inputEmail(test,string);
}
@When("I enter {string} in the Phone Number field")
public void i_enter_in_the_phone_number_field(String string) {
    fitness.inputPhone(test,string);
}
@When("I enter {string} in City field")
public void i_enter_in_city_field(String string) {
   fitness.inputCity(test,string);
}
@When("I click Submit")
public void i_click_submit() {
   fitness.clickOnSubmit(test);
}
@Then("I capture a screenshot")
public void i_capture_a_screenshot() {
    fitness.captureScreenshot(test);
}
}
