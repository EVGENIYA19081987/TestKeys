package pages;


import org.openqa.selenium.By;

public class CommunityPage extends BasePage {
    By searchButton = By.xpath("//input[@id='SearchPlayers']");
    By loop = By.xpath("//input[@class='community_home_search_players_image']");

    public CommunityPage() {
        waitVisibilityOfElement(searchButton);
        waitVisibilityOfElement(loop);
    }


    public Users findTitle(String str) {
        waitVisibilityOfElement(searchButton).click();
        waitVisibilityOfElement(searchButton).sendKeys(str);
        waitVisibilityOfElement(loop).click();
        return new Users();
    }
}
