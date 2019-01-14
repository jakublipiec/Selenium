package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestConfig
{
    private WebDriver driver;

    private static final String BASE_URL = "https://www.seleniumeasy.com/test/";

    @Before
    public void setUp()
    {
        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
    }

    @After
    public void tearDown()
    {
        WebDriverSingleton.quit();
    }
}
