package pages;

import org.openqa.selenium.By;

import static drivers.HeadDriver.getDriver;

public class LastPage extends BasePage {
    By nameUser = By.xpath("//a[text()='Black8']");
    String userNameTemplate = "//a[text()='%s']";

    public LastPage() {
        waitVisibilityOfElement(By.xpath("//div[@class='maincontent']"));
    }

    public boolean isDisplayed() {
        return waitVisibilityOfElement(nameUser).isDisplayed();
    }

    public boolean getCountOfUsers(String nickname) {
        By user = By.xpath(String.format(userNameTemplate, nickname));
        return getDriver().findElements(user).size() > 1;
    }
}
