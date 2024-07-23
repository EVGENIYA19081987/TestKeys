package pages;

import org.openqa.selenium.By;

public class LastPage extends BasePage {
    By nameUser = By.xpath("//a[text()='Black8'][1]");

    public boolean isDisplayed() {
        return waitVisibilityOfElement(nameUser).isDisplayed();
    }
}
