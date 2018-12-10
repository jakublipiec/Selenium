package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Actions;

public class BasePage
{
    @FindBy(id = "gsr")
    private WebElement body;

    public BasePage()
    {
        PageFactory.initElements(WebDriverSingleton.getInstance(), this);
        Actions.waitForVisibilityElement(body);
    }
}
