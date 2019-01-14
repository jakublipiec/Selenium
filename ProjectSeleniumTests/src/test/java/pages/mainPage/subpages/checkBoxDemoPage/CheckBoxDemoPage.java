package pages.mainPage.subpages.checkBoxDemoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import pages.BasePage;

import java.util.List;

public class CheckBoxDemoPage extends BasePage
{
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

    public CheckBoxDemoPage scrollIntoSingleCheckBoxDemoPanel()
    {
        scrollInto(singleCheckBoxDemoPanel);

        return this;
    }

    public CheckBoxDemoPage scrollIntoMultipleCheckboxDemoPanel()
    {
        scrollInto(multipleCheckboxDemoPanel);

        return this;
    }

    public CheckBoxDemoPage clickCheckButton()
    {
        checkBtn.click();

        return this;
    }

    public CheckBoxDemoPage clickOptionsManually()
    {
        for (WebElement option : options)
        {
            option.click();
        }

        return this;
    }

    public boolean areOptionsChecked()
    {
        for (WebElement option : options)
        {
            if (!option.isSelected()) return false;
        }

        return true;
    }

    public CheckBoxDemoPage clickCheckbox()
    {
        ageCheckbox.click();

        return this;
    }

    public String getCheckButtonText()
    {
        return this.checkBtn.getAttribute("value");
    }

    public WebElement getSuccessInfo()
    {
        return this.successInfo;
    }
}
