package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Users extends BasePage{
    List<WebElement> usersName = driver.findElements(By.xpath("//div[@id='search_results']"));

    public Users() {

    }
    public NamePage findUser() {
        if (usersName.size() >= 2) {
            System.out.println("Элементов в списке больше двух");
        }
        return new NamePage();
    }
}
