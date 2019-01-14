package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.mainPage.MainPage;

public class InputFormWithValidationsTest extends TestConfig
{
    @Test
    public void fillInInputsWithValidDataShouldShowInfo()
    {
        boolean isInfoDisplayed = new MainPage()
                                            .goToInputFormWithValidationsPage()
                                                .scrollIntoFirstInput()
                                                .fillInInputWithValidData()
                                                .clickSendBtn()
                                                .isSuccessMessageDisplayed();

        Assert.assertTrue("Success message should be displayed.", isInfoDisplayed);
    }

    @Test
    public void clickSendBtnBeforeFillingInputsShouldNotShowInfo()
    {
        boolean isInfoDisplayed = new MainPage()
                                            .goToInputFormWithValidationsPage()
                                                .scrollIntoFirstInput()
                                                .clickSendBtn()
                                                .isSuccessMessageDisplayed();

        Assert.assertFalse("Success message should not be displayed.", isInfoDisplayed);
    }
}
