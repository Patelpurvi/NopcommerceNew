package nopCommerceNew;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserSelector extends Utils {


    LoadProperties loadProperties = new LoadProperties();

    public void setUpBrowser(){

        String browser = loadProperties.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");

              //  System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
               // System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE , "/dev/null");
            driver = new FirefoxDriver();
             }
                else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
            ChromeOptions options= new ChromeOptions();
          //  options.addArguments("disable-infobars");
            //options.addArguments("---disable-extensions");
         //   options.addArguments("disable-setUpBrowser - side-navigation");
           // options.addArguments("--incognito");
            //options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
            //driver = new ChromeDriver(options);
            driver = new ChromeDriver();
            }

                else if (browser.equalsIgnoreCase("InternetExplorer")){
                    System.setProperty("webdriver.internetexplorer.driver","src\\test\\Resources\\BrowserDrivers\\IEDriverServer.exe");
                    InternetExplorerOptions options = new InternetExplorerOptions();
            //driver = new InternetExplorerDriver();
                }
                else{
                    System.out.println("Browser name is empty of typed wrong:" + browser); }}






    }


