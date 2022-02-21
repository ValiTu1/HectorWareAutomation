package com.hectorware.step_definitions;

import com.hectorware.pages.ContactsPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
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
    public void user_is_on_the_page(String string) {
        ;
    }
}
