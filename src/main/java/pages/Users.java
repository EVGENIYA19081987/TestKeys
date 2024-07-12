package pages;

import org.openqa.selenium.By;


public class Users extends BasePage {
    By usersName = By.xpath("//div[@id='search_results']");

    public Users() {
        // todo какой прикол в этом методе?
        waitVisibleAllElements(usersName);
    }

    // todo какой прикол в этом методе?
    private void waitVisibleAllElements(By usersName) {
    }

    // todo поля создаются сразу после названия класса. В середине класса - не очень хорошая практика.
    //  Сначала идет название класса, потом поля, потом конструктор, потом методы.
    static int count;

    // todo метод возвращает строку - которую получает на вход. Зачем это?
    public String getCountOfUsers(String users) {
        if (count >= 2){
        }
        return users;
    }
}

