package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NamePage extends BasePage {
    @FindBy(xpath = "//input[@id='search_text_box']")
    public WebElement inputBox;
    @FindBy(xpath = "//div[@class='header_real_name ellipsis']")
    private WebElement namePage;
    @FindBy(xpath = "//a[text()='Black8'][1]")
    public WebElement userName;

    public NamePage() {

    }

    public String getUsername() {
        return userName.getText();
    }

    public String getName() {
        return namePage.getText();
    }
}
