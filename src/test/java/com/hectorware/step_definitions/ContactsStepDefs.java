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
    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String tabName) {
        wait.until(ExpectedConditions.invisibilityOf(contactsPage.loader));
        contactsPage.navigateMenuTab("Contacts");
    }

    @Given("user is on the {string} page")
    public void user_is_on_the_page(String pageTitle) {
        Assert.assertTrue(Driver.get().getTitle().contains(pageTitle));
    }

    @When("user clicks on new group button")
    public void userClicksOnNewGroupButton() {
        Utils.wait(1);
        contactsPage.newGroupBtn.click();
    }

    @And("user enters group name {string}")
    public void userEntersValidGroupName(String groupName) {
        contactsPage.enterGroupName(groupName);
    }

    @And("user clicks to create the new group")
    public void userClicksToCreateTheNewGroup() {
        Utils.wait(1);
        contactsPage.createGroupArrowBtn.click();
    }

    @Then("{string} group should be displayed")
    public void groupShouldBeDisplayed(String groupName) {
        System.out.println(contactsPage.isGroupCreated(groupName));
        Assert.assertTrue(contactsPage.isGroupCreated(groupName));
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String error) {
        wait.until(ExpectedConditions.visibilityOf(contactsPage.newGroupErrorMessage));
        Utils.wait(1);
        Assert.assertTrue(contactsPage.newGroupErrorMessage.isDisplayed());
    }

    @When("user clicks on create new contact button")
    public void userClicksOnCreateNewContactButton() {

    }
}
