package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.mainPage.MainPage;

public class BootstrapModalsTest extends TestConfig
{
    @Test
    public void clickLaunchModalButtonInSingleModalExamplePanelShouldShowCorrectModal()
    {
        boolean isModalDisplayed = new MainPage()
                                            .goToBootstrapModalsPage()
                                                .showModalInSingleModalExamplePanel()
                                                .isModalDisplayed();

        Assert.assertTrue("Correct modal should be visible", isModalDisplayed);
    }

    @Test
    public void clickLaunchModalButtonInMultipleModalExamplePanelShouldShowCorrectModal()
    {
        boolean isModalDisplayed = new MainPage()
                                            .goToBootstrapModalsPage()
                                                .showModalInMultipleModalExamplePanel()
                                                .isModalDisplayed();

        Assert.assertTrue("Correct modal should be visible", isModalDisplayed);
    }

    @Test
    public void clickLaunchModalButtonInDisplayedModalShouldShowNextCorrectModal()
    {
        boolean isModalDisplayed = new MainPage()
                                            .goToBootstrapModalsPage()
                                                .showModalInMultipleModalExamplePanel()
                                                .showChildModal()
                                                .isModalDisplayed();


        Assert.assertTrue("Correct modal should be visible", isModalDisplayed);
    }
}
