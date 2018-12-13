package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Actions;

public class SimpleFormDemoPage extends BasePage
{
    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4)")
    private WebElement singleInputFieldPanel;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5)")
    private WebElement twoInputFieldsPanel;

    @FindBy(id = "user-message")
    private WebElement userMessage;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    private WebElement showMessageBtn;

    @FindBy(id = "display")
    private WebElement displayedMessage;

    public SimpleFormDemoPage()
    {
        super();
    }

    public void showPanel()
    {
        scrollInto(singleInputFieldPanel);
        Actions.waitForVisibilityElement(singleInputFieldPanel);

        userMessage.sendKeys("Kot");
        showMessageBtn.click();

        Assert.assertEquals("The message displayed should be identical to the user's message",
                            userMessage.getAttribute("value"), displayedMessage.getText());

        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        scrollInto(twoInputFieldsPanel);
        Actions.waitForVisibilityElement(twoInputFieldsPanel);


    }
}
