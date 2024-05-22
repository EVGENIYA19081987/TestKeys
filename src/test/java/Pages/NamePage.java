package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NamePage extends BasePage {

    By userName = By.xpath("//a[text()='Black8'][1]");

    public NamePage() {

        waitVisibilityOfElement(userName);
    }

    public String getUsername() {
        return waitVisibilityOfElement(userName).getText();
    }}


