package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

import static Drivers.HeadDriver.getDriver;

public class Users extends BasePage {
    List<WebElement> usersName = getDriver().findElements(By.xpath("//div[@id='search_results']"));

    public Users() {
        waitVisibleAllElements(usersName);
    }

    public NamePage findUser() {
        if (usersName.size() >= 2) {
            System.out.println("Элементов в списке больше двух");
        }
        return new NamePage();
    }
}
