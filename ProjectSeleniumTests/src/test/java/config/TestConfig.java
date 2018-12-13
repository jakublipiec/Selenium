package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestConfig
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        String baseURL = "https://www.seleniumeasy.com/test/";

        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @After
    public void tearDown()
    {
        WebDriverSingleton.quit();
    }
}
