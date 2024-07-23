package pages;

import org.openqa.selenium.By;

public class NamePage extends BasePage {
    By name = By.xpath("//div[@role='main']");

    public NamePage() {
        waitVisibilityOfElement(name).getText();
    }

    public LastPage findUser() {
        return new LastPage();
    }
}
