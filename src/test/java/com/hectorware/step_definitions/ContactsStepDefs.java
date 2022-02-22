package com.hectorware.step_definitions;

import com.hectorware.pages.ContactsPage;
import com.hectorware.utilities.Driver;
import com.hectorware.utilities.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsStepDefs {

    ContactsPage contactsPage = new ContactsPage();

    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String tabName) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.visibilityOf(contactsPage.loader));
        contactsPage.navigateMenuTab("Contacts");
    }

    @Given("user is on the {string} page")
    public void user_is_on_the_page(String pageTitle) {
        Assert.assertTrue(Driver.get().getTitle().contains(pageTitle));
    }

    @When("user clicks on new group button")
    public void userClicksOnNewGroupButton() {
        contactsPage.newGroupBtn.click();
    }

    @And("user enters valid group name {string}")
    public void userEntersValidGroupName(String groupName) {
        Utils.wait(4);
        contactsPage.createNewGroup(groupName);
    }

    @And("user clicks to create the new group")
    public void userClicksToCreateTheNewGroup() {
        //contactsPage.createGroupArrowBtn.click();
    }

    @Then("new group should be displayed")
    public void newGroupShouldBeDisplayed() {
    }
}
