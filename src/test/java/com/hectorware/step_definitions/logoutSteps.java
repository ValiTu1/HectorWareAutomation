package com.hectorware.step_definitions;

import com.hectorware.utilities.ConfigReader;
import com.hectorware.utilities.Driver;
import com.hectorware.utilities.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logoutSteps {

    @Given("Navigate to webpage")
    public void navigate_to_webpage() {
        Driver.get().get(ConfigReader.get("url"));

    }

    @Then("Verify login page is displayed")
    public void verify_login_page_is_displayed() {
        Utils.wait(5);
        String exptectedTitle = "Hectorware - QA";
        String actualtitle = Driver.get().getTitle();
        Assert.assertEquals("User is not on the login page", exptectedTitle, actualtitle);

    }


    @Then("Verify profile window is displayed")
    public void verify_profile_window_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click on settings button")
    public void click_on_settings_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify options are displayed")
    public void verify_options_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click on Log out button")
    public void click_on_Log_out_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that user logged out and lands on login page")
    public void verify_that_user_logged_out_and_lands_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}
