package Pages;

import Providers.ConfigProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static Drivers.HeadDriver.getDriver;

abstract public class BasePage {


    public static WebDriverWait getExplicityWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigProviders.EXPLICITY_WAIT));
    }

    public static WebElement waitVisibilityOfElement(By element) {
        return getExplicityWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static List<WebElement> waitVisibleAllElements(List<WebElement>elements){
        return getExplicityWait().until(ExpectedConditions.visibilityOfAllElements(elements));

    }
}
