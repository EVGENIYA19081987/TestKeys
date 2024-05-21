package Test;

import Drivers.HeadDriver;
import Helpers.StringHelper;
import Pages.MainPage;
import Pages.NamePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Helpers.StringModifier.getUniqueString;

public class MainTest extends BaseTest {


    @Test
    public void test() {
        String title = getUniqueString(StringHelper.HELP_TITLE);
        NamePage users = new MainPage().clickCommunity()
                .findTitle(title)
                .findUser();

        Assert.assertEquals(users.getUsername(), StringHelper.HELP_TITLE);

    }
}
