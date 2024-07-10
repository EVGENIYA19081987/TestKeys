package Test;

import Drivers.HeadDriver;
import Pages.BasePage;
import Providers.DataProviders;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest{


@BeforeMethod
    public  void setDriver(){
    HeadDriver.createDriver();
    HeadDriver.setWindowSize();
    HeadDriver.open(DataProviders.URL);


}

@AfterMethod
    public void closeDriver(){
    HeadDriver.closeDriver();
}


}
