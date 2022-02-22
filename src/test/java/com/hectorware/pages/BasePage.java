package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.get(), 5);

    @FindBy(css = ".logo.logo-icon")
    public WebElement logo;

    @FindBy(className = "creatable")
    public WebElement loader;

    public void navigateMenuTab(String tabName){
        Driver.get().findElement(By.xpath("(//a[@aria-label='"+tabName+"'])[1]")).click();
    }

}
