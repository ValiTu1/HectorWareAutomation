package com.hectorware.pages;

import com.hectorware.utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'New group')]")
    public WebElement newGroupBtn;

    @FindBy(css = ".action-input__input.focusable")
    public WebElement newGroupInputBox;

    @FindBy(xpath = "//label[@class='action-input__label']")
    public WebElement createGroupArrowBtn;

    public void createNewGroup(String groupName){
        Utils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(newGroupInputBox));
        newGroupInputBox.sendKeys(groupName);
    }

}
