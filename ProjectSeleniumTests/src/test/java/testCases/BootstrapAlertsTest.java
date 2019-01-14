package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.mainPage.MainPage;
import utility.Actions;
import utility.PageData;
import utility.Tool;

public class BootstrapAlertsTest extends TestConfig
{
    @Test
    public void clickAutoclosableSuccessBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("SUCCESS");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                        .scrollIntoFirstButton()
                                        .clickAutoclosableSuccessBtn()
                                        .getAutoclosableSuccessAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
    public void clickNormalSuccessBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("SUCCESS");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                        .scrollIntoFirstButton()
                                        .clickNormalSuccessBtn()
                                        .getNormalSuccessAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
    public void clickAutoclosableWarningBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("WARNING");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                        .scrollIntoFirstButton()
                                        .clickAutoclosableWarningBtn()
                                        .getAutoclosableWarningAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
        public void clickNormalWarningBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("WARNING");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                        .scrollIntoFirstButton()
                                        .clickNormalWarningBtn()
                                        .getNormalWarningAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
    public void clickAutoclosableDangerBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("DANGER");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                        .scrollIntoFirstButton()
                                        .clickAutoclosableDangerBtn()
                                        .getAutoclosableDangerAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
    public void clickNormalDangerBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("DANGER");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                    .scrollIntoFirstButton()
                                    .clickNormalDangerBtn()
                                    .getNormalDangerAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
    public void clickAutoclosableInfoBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("INFO");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                        .scrollIntoFirstButton()
                                        .clickAutoclosableInfoBtn()
                                        .getAutoclosableInfoAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
    public void clickNormalInfoBtnShouldShowCorrectAlert()
    {
        String correctAlertColor = PageData.BOOTSTRAP_ALERTS_PAGE.alertColors.get("INFO");

        WebElement alert = new MainPage()
                                    .goToBootstrapAlertsPage()
                                        .scrollIntoFirstButton()
                                        .clickNormalInfoBtn()
                                        .getNormalInfoAlert();

        String currentAlertColor = Tool.convertRGBAColorToHex(alert.getCssValue("background-color"));

        Assert.assertTrue("Alert should be displayed!", alert.isDisplayed());
        Assert.assertEquals(correctAlertColor, currentAlertColor);
    }

    @Test
    public void whenClickCloseInSuccessNormalAlertThenAlertShouldDisappear()
    {
        boolean isAlertDisplayed = new MainPage()
                                            .goToBootstrapAlertsPage()
                                                .scrollIntoFirstButton()
                                                .clickNormalSuccessBtn()
                                                .clickNormalSuccessAlertBtn()
                                                .getNormalSuccessAlert()
                                                    .isDisplayed();

        Assert.assertFalse("Alert should not be displayed!", isAlertDisplayed);
    }

    @Test
    public void whenClickCloseInWarningNormalAlertThenAlertShouldDisappear()
    {
        boolean isAlertDisplayed = new MainPage()
                                            .goToBootstrapAlertsPage()
                                                .scrollIntoFirstButton()
                                                .clickNormalWarningBtn()
                                                .clickNormalWarningAlertBtn()
                                                .getNormalSuccessAlert()
                                                    .isDisplayed();

        Assert.assertFalse("Alert should not be displayed!", isAlertDisplayed);
    }

    @Test
    public void whenClickCloseInDangerNormalAlertThenAlertShouldDisappear()
    {
        boolean isAlertDisplayed = new MainPage()
                                            .goToBootstrapAlertsPage()
                                                .scrollIntoFirstButton()
                                                .clickNormalDangerBtn()
                                                .clickNormalDangerAlertBtn()
                                                .getNormalDangerAlert()
                                                    .isDisplayed();

        Assert.assertFalse("Alert should not be displayed!", isAlertDisplayed);
    }

    @Test
    public void whenClickCloseInInfoNormalAlertThenAlertShouldDisappear()
    {
        boolean isAlertDisplayed = new MainPage()
                                            .goToBootstrapAlertsPage()
                                                .scrollIntoFirstButton()
                                                .clickNormalInfoBtn()
                                                .clickNormalInfoAlertBtn()
                                                .getNormalInfoAlert()
                                                    .isDisplayed();

        Assert.assertFalse("Alert should not be displayed!", isAlertDisplayed);
    }

    @Test
    public void autoclosableSuccessAlertShouldDisappearAfter5seconds()
    {
        final Long TIMEOUT = 5000L + 1000L; //1000L <- time of disappearing effect

        WebElement autoclosableSuccessAlert = new MainPage()
                                                    .goToBootstrapAlertsPage()
                                                        .scrollIntoFirstButton()
                                                        .clickAutoclosableSuccessBtn()
                                                        .getAutoclosableSuccessAlert();

        Actions.waitForVisibilityElement(autoclosableSuccessAlert);
        Actions.waitForAlertDisappear(TIMEOUT);

        Assert.assertFalse("Alert should not be displayed!", autoclosableSuccessAlert.isDisplayed());
    }

    @Test
    public void autoclosableWarningAlertShouldDisappearAfter3seconds()
    {
        final Long TIMEOUT = 3000L + 1000L; //1000L <- time of disappearing effect

        WebElement autoclosableWarningAlert = new MainPage()
                                                        .goToBootstrapAlertsPage()
                                                            .scrollIntoFirstButton()
                                                            .clickAutoclosableWarningBtn()
                                                            .getAutoclosableWarningAlert();

        Actions.waitForVisibilityElement(autoclosableWarningAlert);
        Actions.waitForAlertDisappear(TIMEOUT);

        Assert.assertFalse("Alert should not be displayed!", autoclosableWarningAlert.isDisplayed());
    }

    @Test
    public void autoclosableDangerAlertShouldDisappearAfter5seconds()
    {
        final Long TIMEOUT = 5000L + 1000L; //1000L <- time of disappearing effect

        WebElement autoclosableDangerAlert = new MainPage()
                .goToBootstrapAlertsPage()
                .scrollIntoFirstButton()
                .clickAutoclosableDangerBtn()
                .getAutoclosableDangerAlert();

        Actions.waitForVisibilityElement(autoclosableDangerAlert);
        Actions.waitForAlertDisappear(TIMEOUT);

        Assert.assertFalse("Alert should not be displayed!", autoclosableDangerAlert.isDisplayed());
    }

    @Test
    public void autoclosableInfoAlertShouldDisappearAfter6seconds()
    {
        final Long TIMEOUT = 6000L + 1000L; //1000L <- time of disappearing effect

        WebElement autoclosableInfoAlert = new MainPage()
                                                    .goToBootstrapAlertsPage()
                                                        .scrollIntoFirstButton()
                                                        .clickAutoclosableInfoBtn()
                                                        .getAutoclosableInfoAlert();

        Actions.waitForVisibilityElement(autoclosableInfoAlert);
        Actions.waitForAlertDisappear(TIMEOUT);

        Assert.assertFalse("Alert should not be displayed!", autoclosableInfoAlert.isDisplayed());
    }
}
