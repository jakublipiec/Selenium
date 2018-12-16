package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataFaker;

public class SimpleFormDemoPage extends BasePage
{
    DataFaker faker = new DataFaker();

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

    public SimpleFormDemoPage displayedMessageShouldBeIdenticalToInputMessage()
    {
        setViewToPosition(singleInputFieldPanel);

        submitSingleInputField();
        Assert.assertEquals("The message displayed should be identical to the user's message",
                            userMessage.getAttribute("value"), displayMessage.getText());

        return this;
    }

    public SimpleFormDemoPage displayedValueShoudBeSumOfInputs()
    {
        setViewToPosition(twoInputFieldsPanel);

        submitSingleInputFieldPanel();

        Assert.assertEquals(
                aInput.getAttribute("value")+" + "+bInput.getAttribute("value")+" = "+getExpectedSum(),
                getExpectedSum(),
                displayValue.getText()
                );

        return this;
    }

    private void submitSingleInputField()
    {
        fillInMessageInput();
        showMessage();
    }

    private void fillInMessageInput()
    {
        userMessage.sendKeys(faker.getChuckNorrisFact());
    }

    private void showMessage()
    {
        showMessageBtn.click();
    }


    private void submitSingleInputFieldPanel()
    {
        fillInInputs();
        getTotalBtn.click();
    }

    private void fillInInputs()
    {
        aInput.sendKeys(faker.getNumber());
        bInput.sendKeys(faker.getNumber());
    }


    private String getExpectedSum()
    {
        return String.valueOf(Integer.parseInt(aInput.getAttribute("value")) +
                              Integer.parseInt(bInput.getAttribute("value")));
    }
}
