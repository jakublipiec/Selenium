package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class CheckBoxDemoPage extends BasePage
{
    private final String CHECKBOX_SUCCES_MESSAGE = "Success - Check box is checked";
    private final String CHECKED_OPTIONS_BUTTON_TEXT = "Check All";
    private final String UNCHECKED_OPTIONS_BUTTON_TEXT = "Uncheck All";

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4)")
    private WebElement singleCheckBoxDemoPanel;

    @FindBy(id = "isAgeSelected")
    private WebElement ageCheckbox;

    @FindBy(id = "txtAge")
    private WebElement successInfo;


    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5)")
    private WebElement multipleCheckboxDemoPanel;

    @FindBys({
            @FindBy(className = "cb1-element")
    })
    private List<WebElement> options;

    @FindBy(id = "check1")
    private WebElement checkBtn;

    public CheckBoxDemoPage()
    {
        super();
    }

    public CheckBoxDemoPage checkTheCheckboxShouldDisplayCorrectMessage()
    {
        setToPosition(singleCheckBoxDemoPanel);

        checkTheCheckbox();

        Assert.assertTrue("Message should be displayed", successInfo.isDisplayed());
        Assert.assertEquals("Check the checkbox should display: "+CHECKBOX_SUCCES_MESSAGE,
                            successInfo.getText(), CHECKBOX_SUCCES_MESSAGE);

        return this;
    }

    private void checkTheCheckbox()
    {
        ageCheckbox.click();
    }

    public CheckBoxDemoPage checkAllOptionsShouldChangeButtonText(boolean checkWithButton)
    {
        setToPosition(multipleCheckboxDemoPanel);

        if (checkWithButton) clickButton();
        else checkAllOptionsManually();

        Assert.assertTrue("All options should be checked", areOptionsChecked());
        Assert.assertEquals("Button text should be equal "+UNCHECKED_OPTIONS_BUTTON_TEXT,
                            UNCHECKED_OPTIONS_BUTTON_TEXT, checkBtn.getAttribute("value"));

        return this;
    }

    public CheckBoxDemoPage uncheckAllOptionsShouldChangeButtonText(boolean uncheckWithButton)
    {
        setToPosition(multipleCheckboxDemoPanel);

        if (uncheckWithButton)
        {
            clickButton();

            Assert.assertEquals("Button text should be equal "+CHECKED_OPTIONS_BUTTON_TEXT,
                    CHECKED_OPTIONS_BUTTON_TEXT, checkBtn.getAttribute("value"));
        }
        else
        {
            uncheckAllOptionsManually();
        }

        Assert.assertFalse("All options should be unchecked", areOptionsChecked());

        return this;
    }

    private void clickButton()
    {
        checkBtn.click();
    }

    private void checkAllOptionsManually()
    {
        for (WebElement option : options)
        {
            option.click();
        }
    }

    private void uncheckAllOptionsManually()
    {
        for (WebElement option : options)
        {
            option.click();
            Assert.assertEquals("Button text should be equal "+CHECKED_OPTIONS_BUTTON_TEXT,
                    CHECKED_OPTIONS_BUTTON_TEXT, checkBtn.getAttribute("value"));
        }
    }

    private boolean areOptionsChecked()
    {
        for (WebElement option : options)
        {
            if (!option.isSelected()) return false;
        }

        return true;
    }
}
