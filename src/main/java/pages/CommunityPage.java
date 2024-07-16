package pages;

import org.openqa.selenium.By;

public class CommunityPage extends BasePage {
    By searchButton = By.xpath("//input[@id='SearchPlayers']");

    public CommunityPage() {
        waitVisibilityOfElement(searchButton);
    }

    public CommunityPage2 findTitle(String str) {
        waitVisibilityOfElement(searchButton).click();
        waitVisibilityOfElement(searchButton).sendKeys(str);
        return new CommunityPage2();
    }

}