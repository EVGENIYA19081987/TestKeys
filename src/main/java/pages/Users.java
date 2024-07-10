package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static drivers.HeadDriver.getDriver;

public class Users extends BasePage {
    List<WebElement> usersName = HeadDriver.getDriver().findElements(By.xpath("//div[@id='search_results']"));

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
