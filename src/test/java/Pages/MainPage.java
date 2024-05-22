package Pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
    By element = By.xpath("//div[@class='responsive_page_content']//a[@data-tooltip-content='.submenu_Community']");

    public MainPage() {

        waitVisibilityOfElement(element);
    }
    public CommunityPage clickCommunity() {
        waitVisibilityOfElement(element).click();
        return new CommunityPage();
    }
}
