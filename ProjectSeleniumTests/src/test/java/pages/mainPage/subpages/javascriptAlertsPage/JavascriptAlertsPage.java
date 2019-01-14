package pages.mainPage.subpages.javascriptAlertsPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utility.Actions;

public class JavascriptAlertsPage extends BasePage
{
    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4)")
    private WebElement javaScriptAlertBoxPanel;

    @FindBy(xpath = "//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")
    private WebElement javaScriptAlertBoxClickMeBtn;


    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-heading")
    private WebElement javaScriptConfirmBoxPanel;

    @FindBy(xpath = "//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")
    private WebElement javaScriptConfirmBoxClickMeBtn;

    @FindBy(id = "confirm-demo")
    private WebElement javaScriptConfirmBoxInfo;


    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(6)")
    private WebElement javaScriptAlertBoxWithNamePanel;

    @FindBy(xpath = "//*[@id='easycont']/div/div[2]/div[3]/div[2]/button")
    private WebElement javaScriptAlertBoxWithNameBtn;

    @FindBy(id = "prompt-demo")
    private WebElement javaScriptAlertBoxWithNameInfo;

    public JavascriptAlertsPage()
    {
        super();
    }

    public JavascriptAlertsPage clickJavaScriptAlertBoxClickMeBtn()
    {
        click(javaScriptAlertBoxClickMeBtn);

        return this;
    }

    public JavascriptAlertsPage clickJavaScriptConfirmBoxClickMeBtn()
    {
        click(javaScriptConfirmBoxClickMeBtn);

        return this;
    }

    public JavascriptAlertsPage clickJavaScriptAlertBoxWithNameClickMeBtn()
    {
        click(javaScriptAlertBoxWithNameBtn);

        return this;
    }

    public JavascriptAlertsPage scrollIntoJavaScriptAlertBox()
    {
        scrollInto(javaScriptAlertBoxPanel);

        return this;
    }

    public JavascriptAlertsPage scrollIntoJavaScriptConfirmBox()
    {
        scrollInto(javaScriptConfirmBoxPanel);

        return this;
    }

    public JavascriptAlertsPage scrollIntoJavaScriptAlertBoxWithName()
    {
        scrollInto(javaScriptAlertBoxWithNamePanel);

        return this;
    }

    public Alert returnJavaScriptAlert(String... name)
    {
        Alert javaScriptAlert = Actions.waitForAlert();

        if (name.length > 0) javaScriptAlert.sendKeys(name[0]);

        return javaScriptAlert;
    }

    public JavascriptAlertsPage alertAccept(String... name)
    {
        if (name.length > 0) returnJavaScriptAlert(name[0]).accept();
        else returnJavaScriptAlert().accept();

        return this;
    }

    public JavascriptAlertsPage alertCancel()
    {
        returnJavaScriptAlert().dismiss();

        return this;
    }

    public String getJavaScriptConfirmBoxInfoText()
    {
        return javaScriptConfirmBoxInfo.getText();
    }

    public String getJavaScriptAlertBoxWithNameInfoText()
    {
        return javaScriptAlertBoxWithNameInfo.getText();
    }
}
