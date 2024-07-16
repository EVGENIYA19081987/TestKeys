package pages;

import org.openqa.selenium.By;

public class CommunityPage2 extends BasePage {
    By loop = By.xpath("//input[@class='community_home_search_players_image']");

    public CommunityPage2() {
        waitVisibilityOfElement(loop);
    }

    public Users ClickLoop() {
        waitVisibilityOfElement(loop).click();
        return new Users();
    }
}
