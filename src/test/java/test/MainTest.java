package test;

import helpers.StringHelper;
import org.testng.Assert;
import pages.MainPage;


import org.testng.annotations.Test;
import pages.Users;


public class MainTest extends BaseTest {

    // todo тест ничего не проверяет. Посмотри внимательно на класс Users, метод getCountOfUsers
    @Test
    public void test() {
        Users users = new MainPage().clickCommunity()
                .findTitle(StringHelper.HELP_TITLE);
        Assert.assertEquals(users.getCountOfUsers(StringHelper.HELP_TITLE), StringHelper.HELP_TITLE);
    }
}
