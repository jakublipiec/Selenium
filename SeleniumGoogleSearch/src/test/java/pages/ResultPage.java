package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage
{
    @FindBy(id = "resultStats")
    private WebElement resultStats;

    public ResultPage()
    {
        super();
    }

    public boolean isResultDisplayed()
    {
        return resultStats.isDisplayed();
    }
}
