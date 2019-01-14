package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.mainPage.MainPage;
import utility.PageData;

public class CheckBoxDemoTest extends TestConfig
{
    @Test
    public void checkTheCheckboxShouldDisplayCorrectMessage()
    {
        String correctSuccessInfoText = PageData.CHECKBOX_DEMO_PAGE.values.get("SUCCESS");

        WebElement successInfo = new MainPage()
                                        .goToCheckBoxDemoPage()
                                            .scrollIntoSingleCheckBoxDemoPanel()
                                            .clickCheckbox()
                                            .getSuccessInfo();

        Assert.assertTrue("Message should be displayed", successInfo.isDisplayed());
        Assert.assertEquals("Check the checkbox should display "+successInfo,
                correctSuccessInfoText, successInfo.getText());
    }

    @Test
    public void uncheckTheCheckboxShouldDisplayCorrectMessage()
    {
        WebElement successInfo = new MainPage()
                                        .goToCheckBoxDemoPage()
                                            .scrollIntoSingleCheckBoxDemoPanel()
                                            .clickCheckbox()
                                            .clickCheckbox()
                                            .getSuccessInfo();

        Assert.assertFalse("Message should not be displayed", successInfo.isDisplayed());
    }

    @Test
    public void clickCheckAllBtnShouldCheckAllOptions()
    {
        boolean areOptionsChecked = new MainPage()
                                            .goToCheckBoxDemoPage()
                                                .scrollIntoMultipleCheckboxDemoPanel()
                                                .clickCheckButton()
                                                .areOptionsChecked();

        Assert.assertTrue("All options should be checked.", areOptionsChecked);
    }

    @Test
    public void checkAllOptionsWithButtonShouldChangeButtonText()
    {
        String correctBtnText = PageData.CHECKBOX_DEMO_PAGE.values.get("UNCHECK_ALL");

        String currentBtnText = new MainPage()
                                        .goToCheckBoxDemoPage()
                                            .scrollIntoMultipleCheckboxDemoPanel()
                                            .clickCheckButton()
                                            .getCheckButtonText();

        Assert.assertEquals(correctBtnText, currentBtnText);
    }

    @Test
    public void clickUncheckAllBtnShouldUncheckAllOptions()
    {
        boolean areOptionsChecked = new MainPage()
                                            .goToCheckBoxDemoPage()
                                                .scrollIntoMultipleCheckboxDemoPanel()
                                                .clickCheckButton()
                                                .clickCheckButton()
                                                .areOptionsChecked();

        Assert.assertFalse("All options should not be checked.", areOptionsChecked);
    }

    @Test
    public void uncheckAllOptionsWithButtonShouldChangeButtonText()
    {
        String correctBtnText = PageData.CHECKBOX_DEMO_PAGE.values.get("CHECK_ALL");

        String currentBtnText = new MainPage()
                                        .goToCheckBoxDemoPage()
                                            .scrollIntoMultipleCheckboxDemoPanel()
                                            .clickCheckButton()
                                            .clickCheckButton()
                                            .getCheckButtonText();

        Assert.assertEquals(correctBtnText, currentBtnText);
    }

    @Test
    public void checkAllOptionsManuallyShouldChangeButtonText()
    {
        String correctBtnText = PageData.CHECKBOX_DEMO_PAGE.values.get("UNCHECK_ALL");

        String currentBtnText = new MainPage()
                                        .goToCheckBoxDemoPage()
                                            .scrollIntoMultipleCheckboxDemoPanel()
                                            .clickOptionsManually()
                                            .getCheckButtonText();

        Assert.assertEquals(correctBtnText, currentBtnText);
    }

    @Test
    public void uncheckAllOptionsManuallyShouldChangeButtonText()
    {
        String correctBtnText = PageData.CHECKBOX_DEMO_PAGE.values.get("CHECK_ALL");

        String currentBtnText = new MainPage()
                                        .goToCheckBoxDemoPage()
                                            .scrollIntoMultipleCheckboxDemoPanel()
                                            .clickOptionsManually()
                                            .clickOptionsManually()
                                            .getCheckButtonText();

        Assert.assertEquals(correctBtnText, currentBtnText);
    }
}
