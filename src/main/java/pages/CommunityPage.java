package pages;

// todo лишняя строка
import org.openqa.selenium.By;

public class CommunityPage extends BasePage {
    By searchButton = By.xpath("//input[@id='SearchPlayers']");
    By loop = By.xpath("//input[@class='community_home_search_players_image']");

    // todo для ROOT_ELEMENT выбирается 1 элемент, присущий только это странице. И в конструкторе мы ждем его видимости.
    //  У тебя 2 элемента. Можешь оставить так, но так не принято) Рекомендую определиться и оставить 1 элемент.
    public CommunityPage() {
        waitVisibilityOfElement(searchButton);
        waitVisibilityOfElement(loop);
    }
// todo лишняя строка

    public Users findTitle(String str) {
        waitVisibilityOfElement(searchButton).click();
        waitVisibilityOfElement(searchButton).sendKeys(str);
        waitVisibilityOfElement(loop).click();
        return new Users();
    }
}
