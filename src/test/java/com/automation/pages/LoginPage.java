package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    //instead of using findElement(Bypath) we use findBy it works
    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id="login-button")
    WebElement loginBtn;

    public void openWebsite(){
        driver.get("https://www.saucedemo.com/");
    }

    public void doLogin(String Username,String Password){
        usernameInput.sendKeys(Username);
        passwordInput.sendKeys(Password);
        loginBtn.click();
    }
}
