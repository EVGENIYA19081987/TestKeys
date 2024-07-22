package test;

import helpers.StringHelper;
import org.testng.Assert;
import pages.MainPage;

import org.testng.annotations.Test;
import pages.Users;
public class MainTest extends BaseTest {

    @Test
    public void test() {
        Users users = new MainPage().clickCommunity()
                .findTitle(StringHelper.HELP_TITLE)
                .ClickLoop();
        Assert.assertTrue(users
                .getCountOfUsers(StringHelper.HELP_TITLE));
    }
}