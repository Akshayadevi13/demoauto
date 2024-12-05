package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

import java.util.Properties;


public class MyHooks
{
    WebDriver driver;

    @Before
    public void setup()
    {
        Properties prop = new CommonUtils().intializeProperties();
        driver = DriverFactory.initializeBrowser(prop.getProperty("browser"));
        driver.get(prop.getProperty("url"));

    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}
