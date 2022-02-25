package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import com.hectorware.utilities.Utils;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//p[@class='action-text__longtext']")
    public WebElement newGroupErrorMessage;

    public boolean isGroupCreated(String groupName){
        Utils.wait(1);
        if(Driver.get().findElement(By.xpath("//ul[@class='app-navigation__list']//a[contains(.,'Univerty')]")).isDisplayed()){
            return true;
        }
        return false;
    }

    public void enterGroupName(String groupName){
        wait.until(ExpectedConditions.elementToBeClickable(newGroupInputBox));
        wait.until(ExpectedConditions.visibilityOf(newGroupInputBox));
        newGroupInputBox.sendKeys(groupName);
    }

}
