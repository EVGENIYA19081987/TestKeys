package pages;

import drivers.HeadDriver;
import providers.ConfigProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
// todo лишняя строка
// todo лишняя строка
// todo лишняя строка

abstract public class BasePage {
// todo лишняя строка

    public static WebDriverWait getExplicityWait() {
        return new WebDriverWait(HeadDriver.getDriver(), Duration.ofSeconds(ConfigProviders.EXPLICITY_WAIT));
    }

    public static WebElement waitVisibilityOfElement(By element) {
        return getExplicityWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    }

// todo лишняя строка + хорошо бы нажать ctrl + alt + l (чтобы отформатировать класс согласно джава конвенции)