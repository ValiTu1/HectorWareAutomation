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

    @FindBy(id = "new-contact-button")
    public WebElement newContactBtn;

    @FindBy(id = "contact-org")
    public WebElement companyFormInputBox;

    @FindBy(id = "contact-title")
    public WebElement titleFormInputBox;

    @FindBy (xpath = "//input[@inputmode='tel']")
    public WebElement phoneFormInputBox;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement emailFormInputBox;

    @FindBy(xpath = "//div[contains(.,'Post office')]/../input[@class='property__value']")
    public WebElement poBoxInputBox;

    @FindBy(xpath = "//div[contains(.,'Address')]/../input[@class='property__value']")
    public WebElement addressInputBox;

    @FindBy(xpath = "//div[contains(.,'Extended')]/../input[@class='property__value']")
    public WebElement extendedAddressInputBox;

    @FindBy(xpath = "//div[contains(.,'Postal')]/../input[@class='property__value']")
    public WebElement postalCodeInoutBox;

    @FindBy(xpath = "//div[contains(.,'City')]/../input[@class='property__value']")
    public WebElement cityInputBox;

    @FindBy(xpath = "//div[contains(.,'State')]/../input[@class='property__value']")
    public WebElement stateInputBox;

    @FindBy(xpath = "//div[contains(.,'Country')]/../input[@class='property__value']")
    public WebElement countryInputBox;

    @FindBy(xpath = "//input[@placeholder='Add contact in group']")
    public WebElement addContactInGroupDropdown;

    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public WebElement addNewPropertyDropdown;


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

    public void selectFromListOfOptions(String valueName){
        Utils.wait(1);
        Driver.get().findElement(By.xpath("//div[@title='"+valueName+"']/span")).click();
    }

}
