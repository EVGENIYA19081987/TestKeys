package pages;


import org.openqa.selenium.By;

public class NamePage extends BasePage {

    By userName = By.xpath("//a[text()='Black8'][1]");

    public NamePage() {

        waitVisibilityOfElement(userName);
    }

    public String getUsername() {
        return waitVisibilityOfElement(userName).getText();
    }
        static int count;

    public NamePage getCountOfUsers(String users) {
        if(count>=2){
            System.out.println("Black8");
        };
        return null;
    }


    }


