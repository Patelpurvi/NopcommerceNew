package nopCommerceNew;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    LoadProperties loadProperties = new LoadProperties();

    BrowserSelector browserSelector = new BrowserSelector();
    //static String timeStamp = new SimpleDataformate ("dd.MM.yy.HH.mm.ss").format(newDate());

    @BeforeMethod
    public void setUpBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        //driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterMethod
   public void closeBrowser()
    { getScreenshot();
        driver.quit();
    }


    }


