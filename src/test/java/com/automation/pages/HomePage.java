package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public boolean isHomePageDisplayed(){
        WebElement filterDrpDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        WebElement sortItem = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        return filterDrpDown.isDisplayed() && sortItem.isDisplayed();
    }
}
