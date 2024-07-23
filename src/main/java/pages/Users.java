package pages;

import helpers.StringHelper;
import org.openqa.selenium.By;


public class Users extends BasePage {
    By usersName = By.xpath("//div[@id='search_results']");

    public Users() {
        waitVisibilityOfElement(usersName);
    }

       public NamePage getNames(){
        return new NamePage();
       }
}