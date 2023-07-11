package com.softwaretesting.magento.pages;
/*
 Write down the following test into WomenTestclass
1. verifyTheSortByProductNameFilter
* Mouse Hover on Women Menu
* Mouse Hover on Tops
* Click on Jackets
* Select Sort By filter “Product Name”
* Verify the products name display in
alphabetical order
 */

import com.softwaretesting.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {
    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");//1.1
    By tops = By.xpath("//a[@id='ui-id-9']");//1.2
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");//1.3
    By sort = By.xpath("(//select[@id='sorter'])[1]");


    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }

    public void sortByFilter(String filter) {
        selectByVisibleTextFromDropDown(sort, filter);
    }
}