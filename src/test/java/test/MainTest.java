package test;

import helpers.StringHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Users;

public class MainTest extends BaseTest {

    @Test
    public void test() {
        Users users = new MainPage()
                .clickCommunity()
                .findTitle(StringHelper.HELP_TITLE)
                .ClickLoop();
        Assert.assertTrue(users.getCountOfUsers(StringHelper.HELP_TITLE));
        //todo тест ничего не проверяет. Посмотри внимательно на метод getCountOfUsers ты проверяешь,
        // что StringHelper.HELP_TITLE содержит StringHelper.HELP_TITLE
        // Давай упростим задачу.
        // Получи имена всех юзеров со страницы Users и убедись, что среди них есть StringHelper.HELP_TITLE
    }
}