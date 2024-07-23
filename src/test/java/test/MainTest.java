package test;

import helpers.StringHelper;
import org.testng.annotations.Test;
import pages.UserListPage;
import pages.MainPage;

import static org.testng.AssertJUnit.assertTrue;

public class MainTest extends BaseTest {
    @Test
    public void test() {
        UserListPage users = new MainPage()
                .clickCommunity()
                .setTitle(StringHelper.HELP_TITLE)
                .clickLoop();

        assertTrue(users.isDisplayed());
        assertTrue(users.getCountOfUsers(StringHelper.HELP_TITLE));

    }
}