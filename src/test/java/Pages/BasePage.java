package Pages;

import Drivers.HeadDriver;
import Providers.ConfigProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Drivers.HeadDriver.getDriver;

abstract public class BasePage  {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver=webDriver;
    }
//   public BasePage(WebDriver driver){
//       this.driver=driver;
//   }
    public static WebDriverWait getExplicityWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigProviders.EXPLICITY_WAIT));
    }

    public static WebElement visibilityOfElement(By element){
        return getExplicityWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
