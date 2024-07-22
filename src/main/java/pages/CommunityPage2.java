package pages;

import org.openqa.selenium.By;

public class CommunityPage2 extends BasePage {  //todo лучше более информативный нейминг. CommunityPage2 - не понятно.
    By loop = By.xpath("//input[@class='community_home_search_players_image']");

    public CommunityPage2() {
        waitVisibilityOfElement(loop);
    }

    public Users ClickLoop() {  //todo  названия методов с маленькой буквы
        waitVisibilityOfElement(loop).click();
        return new Users();
    }
}
