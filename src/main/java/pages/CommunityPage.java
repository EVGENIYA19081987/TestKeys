package pages;

import org.openqa.selenium.By;

public class CommunityPage extends BasePage {
    By searchButton = By.xpath("//input[@id='SearchPlayers']");
    By loop = By.xpath("//input[@class='community_home_search_players_image']");

    public CommunityPage() {
        waitVisibilityOfElement(searchButton);
    }

    public CommunityPage setTitle(String str) {
        waitVisibilityOfElement(searchButton).click();
        waitVisibilityOfElement(searchButton).sendKeys(str);
        return this;
    }

    public LastPage clickLoop() {
        waitVisibilityOfElement(loop).click();
        return new LastPage();
    }
}