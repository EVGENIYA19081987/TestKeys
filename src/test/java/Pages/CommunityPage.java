package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommunityPage extends BasePage{
    @FindBy(xpath = "//input[@id='SearchPlayers']")
    public WebElement SearchButton;
    @FindBy(xpath = "//input[@class='community_home_search_players_image']")
    public WebElement Loup;


    public CommunityPage() {

    }
    public Users findTitle(String str) {
        SearchButton.click();
        SearchButton.sendKeys(str);
        System.out.println("данные введены");
        Loup.click();
        System.out.println("клилнут значок лупы");
        return new Users();
    }
}
