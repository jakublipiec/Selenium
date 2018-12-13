package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Actions;

public abstract class BasePage
{
    @FindBy(xpath = "/html/body")
    private WebElement body;

    public BasePage()
    {
        PageFactory.initElements(WebDriverSingleton.getInstance(), this);
        Actions.waitForVisibilityElement(body);
    }

    public void scrollInto(WebElement element)
    {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)WebDriverSingleton.getInstance();

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        Actions.waitForVisibilityElement(element);
    }
}
