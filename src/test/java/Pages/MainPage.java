package Pages;

import Drivers.HeadDriver;
import Providers.DataProviders;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.Step;
public class MainPage extends BasePage{


    @FindBy(xpath = "//div[@class='responsive_page_content']//a[@data-tooltip-content='.submenu_Community']")
    WebElement Community;

    public MainPage() {

        visibilityOfElement(By.xpath("//div[@class='responsive_page_content']//a[@data-tooltip-content='.submenu_Community']"));
    }

    public CommunityPage clickCommunity(){
        Community.click();
        return new CommunityPage();
    }
}
