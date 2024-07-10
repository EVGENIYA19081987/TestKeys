package pages;

import org.openqa.selenium.By;


public class Users extends BasePage {
    By usersName = By.xpath("//div[@id='search_results']");

    public Users() {
        waitVisibleAllElements(usersName);
    }

    private void waitVisibleAllElements(By usersName) {
    }


    static int count;

    public String getCountOfUsers(String users) {
        if (count >= 2){
        }
        return users;
    }
}

