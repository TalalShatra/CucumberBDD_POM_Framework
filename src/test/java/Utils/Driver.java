package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    /**
     *      Why we're creating driver class? (Singleton Driver)
     *
     *      Because we need to use 1 driver for every class in our project (page classes and step definitions)
     *
     *      This concept called "Singleton Driver"
     */
    private static WebDriver driver;

    public static WebDriver getDriver() {
        // if the driver object is equal to null (there is no active driver instance) then we'll create a new driver instance
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // if we don't have this line next scenario will fail - NoSuchSessionException
                            // after driver.quit we need to set driver object to null
        }
    }
/*
if it's static that means it's single (only 1 copy)
but it doesn't say anything about access level
so I can call this static variable from any class
and maybe assign a new ChromeDriver() for example.

But if you make it private nobody have direct access from different classes
 nobody can update this driver!
 */

}
