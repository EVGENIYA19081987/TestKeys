package pages;

import helpers.StringHelper;
import org.openqa.selenium.By;


public class Users extends BasePage {
    By usersName = By.xpath("//div[@id='search_results']");
    static boolean count;

    public Users() {
        waitVisibilityOfElement(usersName);
    }

    public boolean getCountOfUsers(String users) {
        if (users.contains(StringHelper.HELP_TITLE)) {
            return true;
        }
        return count;
    }
}