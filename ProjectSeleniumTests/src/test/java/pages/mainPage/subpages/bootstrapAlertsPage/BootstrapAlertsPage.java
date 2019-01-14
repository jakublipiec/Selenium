package pages.mainPage.subpages.bootstrapAlertsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class BootstrapAlertsPage extends BasePage
{
    @FindBy(id = "autoclosable-btn-success")
    private WebElement autoclosableSuccessBtn;

    @FindBy(id = "normal-btn-success")
    private WebElement normalSuccessBtn;

    @FindBy(id = "autoclosable-btn-warning")
    private WebElement autoclosableWarningBtn;

    @FindBy(id = "normal-btn-warning")
    private WebElement normalWarningBtn;

    @FindBy(id = "autoclosable-btn-danger")
    private WebElement autoclosableDangerBtn;

    @FindBy(id = "normal-btn-danger")
    private WebElement normalDangerBtn;

    @FindBy(id = "autoclosable-btn-info")
    private WebElement autoclosableInfoBtn;

    @FindBy(id = "normal-btn-info")
    private WebElement normalInfoBtn;


    @FindBy(xpath = "//div[contains(@class, 'alert-autocloseable-success')]")
    private WebElement autoclosableSuccessAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-success')]")
    private WebElement normalSuccessAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-success')]/button")
    private WebElement normalSuccessAlertBtn;


    @FindBy(xpath = "//div[contains(@class, 'alert-autocloseable-warning')]")
    private WebElement autoclosableWarningAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-warning')]")
    private WebElement normalWarningAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-warning')]/button")
    private WebElement normalWarningAlertBtn;


    @FindBy(xpath = "//div[contains(@class, 'alert-autocloseable-danger')]")
    private WebElement autoclosableDangerAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-danger')]")
    private WebElement normalDangerAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-danger')]/button")
    private WebElement normalDangerAlertBtn;


    @FindBy(xpath = "//div[contains(@class, 'alert-autocloseable-info')]")
    private WebElement autoclosableInfoAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-info')]")
    private WebElement normalInfoAlert;

    @FindBy(xpath = "//div[contains(@class, 'alert-normal-info')]/button")
    private WebElement normalInfoAlertBtn;

    public BootstrapAlertsPage()
    {
        super();
    }

    public BootstrapAlertsPage scrollIntoFirstButton()
    {
        scrollInto(autoclosableSuccessBtn);

        return this;
    }

    public BootstrapAlertsPage clickAutoclosableSuccessBtn()
    {
        click(autoclosableSuccessBtn);

        return this;
    }

    public BootstrapAlertsPage clickNormalSuccessBtn()
    {
        click(normalSuccessBtn);

        return this;
    }

    public BootstrapAlertsPage clickAutoclosableWarningBtn()
    {
        click(autoclosableWarningBtn);

        return this;
    }

    public BootstrapAlertsPage clickNormalWarningBtn()
    {
        click(normalWarningBtn);

        return this;
    }

    public BootstrapAlertsPage clickAutoclosableDangerBtn()
    {
        click(autoclosableDangerBtn);

        return this;
    }

    public BootstrapAlertsPage clickNormalDangerBtn()
    {
        click(normalDangerBtn);

        return this;
    }

    public BootstrapAlertsPage clickAutoclosableInfoBtn()
    {
        click(autoclosableInfoBtn);

        return this;
    }

    public BootstrapAlertsPage clickNormalInfoBtn()
    {
        click(normalInfoBtn);

        return this;
    }

    public WebElement getAutoclosableSuccessAlert()
    {
        return autoclosableSuccessAlert;
    }

    public WebElement getNormalSuccessAlert()
    {
        return normalSuccessAlert;
    }

    public WebElement getAutoclosableWarningAlert()
    {
        return autoclosableWarningAlert;
    }

    public WebElement getNormalSuccessAlertBtn()
    {
        return normalSuccessAlertBtn;
    }

    public WebElement getAutoclosableDangerAlert()
    {
        return autoclosableDangerAlert;
    }

    public WebElement getAutoclosableInfoAlert()
    {
        return autoclosableInfoAlert;
    }

    public WebElement getNormalInfoAlert()
    {
        return normalInfoAlert;
    }

    public WebElement getNormalDangerAlert()
    {
        return normalDangerAlert;
    }

    public WebElement getNormalWarningAlertBtn()
    {
        return normalWarningAlertBtn;
    }

    public WebElement getNormalWarningAlert()
    {
        return normalWarningAlert;
    }

    public BootstrapAlertsPage clickNormalSuccessAlertBtn()
    {
        click(normalSuccessAlertBtn);

        return this;
    }

    public BootstrapAlertsPage clickNormalWarningAlertBtn()
    {
        click(normalWarningAlertBtn);

        return this;
    }

    public BootstrapAlertsPage clickNormalDangerAlertBtn()
    {
        click(normalDangerAlertBtn);

        return this;
    }

    public BootstrapAlertsPage clickNormalInfoAlertBtn()
    {
        click(normalInfoAlertBtn);

        return this;
    }
}
