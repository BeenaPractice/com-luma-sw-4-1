package com.softwaretesting.magento.testbase;

import com.softwaretesting.magento.propertyreader.PropertyReader;
import com.softwaretesting.magento.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");


    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){

        //closeBrowser();
    }
}
