package Drivers;

import Pages.BasePage;
import Providers.ConfigProviders;
import Providers.DataProviders;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HeadDriver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
            return driver;
        }
        return driver;
    }


    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public static void closeDriver() {
        getDriver().close();
        getDriver().quit();
        driver=null;
    }

    public static void open(String URL) {
        getDriver().get(URL);
    }

    public static void setWindowSize() {
        getDriver().manage().window().maximize();
    }


}
