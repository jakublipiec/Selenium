package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.junit.Test;
import pages.mainPage.MainPage;
import utility.DataFaker;
import utility.PageData;

public class JavascriptAlertsTest extends TestConfig
{
    @Test
    public void clickJavaScriptAlertBoxBtnShouldReturnAlert()
    {
        Alert javaScriptAlert = new MainPage()
                                        .goToJavascriptAlertsPage()
                                            .scrollIntoJavaScriptAlertBox()
                                            .clickJavaScriptAlertBoxClickMeBtn()
                                            .returnJavaScriptAlert();

        Assert.assertFalse("JavaScriptAlertBox alert did not appear!", javaScriptAlert == null);
    }

    @Test
    public void clickJavaScriptConfirmBoxBtnShouldReturnAlert()
    {
        Alert javaScriptAlert = new MainPage()
                                        .goToJavascriptAlertsPage()
                                            .scrollIntoJavaScriptConfirmBox()
                                            .clickJavaScriptConfirmBoxClickMeBtn()
                                            .returnJavaScriptAlert();

        Assert.assertFalse("JavaScriptConfirmBox alert did not appear", javaScriptAlert == null);
    }

    @Test
    public void acceptJavaScriptConfirmBoxAlertShouldShowCorrectInfo()
    {
        String correctInfo = PageData.JAVASCRIPT_ALERTS_PAGE.javaScriptConfirmBoxCorrectMessages.get("ALERT_ACCEPT");

        String currentInfo = new MainPage()
                                        .goToJavascriptAlertsPage()
                                            .scrollIntoJavaScriptConfirmBox()
                                            .clickJavaScriptConfirmBoxClickMeBtn()
                                            .alertAccept()
                                            .getJavaScriptConfirmBoxInfoText();

        Assert.assertEquals(correctInfo, currentInfo);
    }

    @Test
    public void dismissJavaScriptConfirmBoxAlertShouldShowCorrectInfo()
    {
        String correctInfo = PageData.JAVASCRIPT_ALERTS_PAGE.javaScriptConfirmBoxCorrectMessages.get("ALERT_DISMISS");

        String currentInfo = new MainPage()
                                        .goToJavascriptAlertsPage()
                                            .scrollIntoJavaScriptConfirmBox()
                                            .clickJavaScriptConfirmBoxClickMeBtn()
                                            .alertCancel()
                                            .getJavaScriptConfirmBoxInfoText();

        Assert.assertEquals(correctInfo, currentInfo);
    }

    @Test
    public void clickJavaScriptAlertBoxWithNameBtnShouldReturnAlert()
    {
        Alert javaScriptAlert = new MainPage()
                                        .goToJavascriptAlertsPage()
                                            .scrollIntoJavaScriptAlertBoxWithName()
                                            .clickJavaScriptAlertBoxWithNameClickMeBtn()
                                            .returnJavaScriptAlert();

        Assert.assertFalse("JavaScriptAlertBox alert did not appear!", javaScriptAlert == null);
    }

    @Test
    public void acceptJavaScriptAlertBoxWithNameShouldShowCorrectInfo()
    {
        String randomName = new DataFaker().getRandomFirstName();

        String correctInfo = PageData.JAVASCRIPT_ALERTS_PAGE.javaScriptAlertBoxWithNameCorrectMessages.get("BASE_INFO") +
                            "'" + randomName + "' !";

        String currentInfo = new MainPage()
                                        .goToJavascriptAlertsPage()
                                            .scrollIntoJavaScriptAlertBoxWithName()
                                            .clickJavaScriptAlertBoxWithNameClickMeBtn()
                                            .alertAccept(randomName)
                                            .getJavaScriptAlertBoxWithNameInfoText();

        Assert.assertEquals(correctInfo, currentInfo);
    }
}
