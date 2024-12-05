package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class CommonUtils
{

    public Properties intializeProperties()
    {
        Properties prop = new Properties();
        File proFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");

        try
        {
            FileInputStream fis = new FileInputStream(proFile);
            prop.load(fis);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }

        return prop;
    }

    public static final int IMPLICIT_WAIT_TIME=10;
    public static final int PAGE_LOAD_TIME=15;
    public static final int EXPLICIT_WAIT_BASIC_TIME=30;

}
