package pages.mainPage.subpages.simpleFormDemoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SimpleFormDemoPage extends BasePage
{
    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4)")
    private WebElement singleInputFieldPanel;

    @FindBy(id = "user-message")
    private WebElement userMessage;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    private WebElement showMessageBtn;

    @FindBy(id = "display")
    private WebElement displayMessage;


    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5)")
    private WebElement twoInputFieldsPanel;

    @FindBy(id = "sum1")
    private WebElement aInput;

    @FindBy(id = "sum2")
    private WebElement bInput;

    @FindBy(css = "#gettotal > button")
    private WebElement getTotalBtn;

    @FindBy(id = "displayvalue")
    private WebElement displayValue;


    public SimpleFormDemoPage()
    {
        super();
    }

    public SimpleFormDemoPage fillInMessageInput(String userMessage)
    {
        this.userMessage.sendKeys(userMessage);

        return this;
    }

    public SimpleFormDemoPage fillInInputs(String aInput, String bInput)
    {
        this.aInput.sendKeys(aInput);
        this.bInput.sendKeys(bInput);

        return this;
    }

    public String getExpectedSum()
    {

        return String.valueOf(Integer.parseInt(aInput.getAttribute("value")) +
                              Integer.parseInt(bInput.getAttribute("value")));
    }

    public SimpleFormDemoPage clickGetTotalBtn()
    {
        click(getTotalBtn);

        return this;
    }

    public SimpleFormDemoPage clickShowMessageBtn()
    {
        click(showMessageBtn);

        return this;
    }

    public SimpleFormDemoPage scrollIntoTwoInputFieldPanel()
    {
        scrollInto(twoInputFieldsPanel);

        return this;
    }

    public SimpleFormDemoPage scrollIntoSingleInputFieldPanel()
    {
        scrollInto(singleInputFieldPanel);

        return this;
    }

    public String getDisplayedMessageText()
    {
        return this.displayMessage.getText();
    }
}
