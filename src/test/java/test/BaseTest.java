package test;

import drivers.HeadDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import providers.DataProviders;

public abstract class BaseTest {


    @BeforeMethod
    public void setDriver() {
        HeadDriver.createDriver();
        HeadDriver.setWindowSize();
        HeadDriver.open(DataProviders.URL);
    }

    @AfterMethod
    public void closeDriver() {
        HeadDriver.closeDriver();
    }
}
