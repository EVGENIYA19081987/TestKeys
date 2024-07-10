package pages;


public class NamePage extends BasePage {

    By userName = By.xpath("//a[text()='Black8'][1]");

    public NamePage() {

        waitVisibilityOfElement(userName);
    }

    public String getUsername() {
        return waitVisibilityOfElement(userName).getText();
    }}


