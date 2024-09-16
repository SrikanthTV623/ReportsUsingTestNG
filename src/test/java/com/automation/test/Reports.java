package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Reports extends BaseTest {

    @Test
    public void verifyUserCanLoginWithValidCredentials() throws IOException {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),ConfigReader.getConfigValue("login.password"));
        //to click screenshot
        test.addScreenCaptureFromPath(takeScreenshot());
        //to check home page is opened or not
        Assert.assertTrue(homePage.isHomePageDisplayed(),"Homepage is not loading properly");
    }

}
