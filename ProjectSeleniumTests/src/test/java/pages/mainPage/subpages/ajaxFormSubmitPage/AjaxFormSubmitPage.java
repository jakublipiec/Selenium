package pages.mainPage.subpages.ajaxFormSubmitPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utility.Actions;

public class AjaxFormSubmitPage extends BasePage
{
    @FindBy(id = "frm")
    private WebElement ajaxForm;

    @FindBy(id = "title")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@class='title-validation validation-error']")
    private WebElement errorSign;

    @FindBy(id = "description")
    private WebElement desccriptionInput;

    @FindBy(id = "btn-submit")
    private WebElement submitBtn;

    @FindBy(id = "submit-control")
    private WebElement submitMessage;

    public AjaxFormSubmitPage()
    {
        super();
    }

    public AjaxFormSubmitPage scrollIntoAjaxForm()
    {
        scrollInto(ajaxForm);

        return this;
    }

    public AjaxFormSubmitPage fillNameInput(String name)
    {
        nameInput.sendKeys(name);

        return this;
    }

    public AjaxFormSubmitPage fillDescriptionInput(String description)
    {
        desccriptionInput.sendKeys(description);

        return this;
    }

    public AjaxFormSubmitPage clickSubmitBtn()
    {
        click(submitBtn);

        return this;
    }

    public boolean isError()
    {
        return errorSign.isDisplayed();
    }

    public String getAjaxInfo()
    {
        Actions.waitForAjaxCalls();

        Actions.waitUntilTextWillBeChanged(submitMessage);

        return submitMessage.getText();
    }
}
