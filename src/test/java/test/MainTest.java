package test;

import helpers.StringHelper;
import org.testng.Assert;
import pages.LastPage;
import pages.MainPage;


import org.testng.annotations.Test;
import pages.NamePage;
import pages.Users;

public class MainTest extends BaseTest {
    @Test
    public void test() {
        LastPage users = new MainPage().
                clickCommunity()
                .findTitle(StringHelper.HELP_TITLE)
                .clickLoop()
                .getNames()
                .findUser();

        Assert.assertTrue(users.isDisplayed());

    }
}