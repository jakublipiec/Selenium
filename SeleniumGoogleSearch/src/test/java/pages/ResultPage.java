package pages;

import config.WebDriverSingleton;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultPage extends BasePage
{
    @FindBy(id = "resultStats")
    WebElement resultStats;

    public ResultPage()
    {
        super();
    }

    @Step
    public void queryShouldReturnResults()
    {
        Assert.assertTrue(resultStats.isDisplayed());
    }
}
