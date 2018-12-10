package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class TestConfig
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        String baseUrl = "http://google.com";

        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown()
    {
        WebDriverSingleton.quit();
    }
}
