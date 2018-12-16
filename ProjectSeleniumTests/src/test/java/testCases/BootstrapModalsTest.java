package testCases;

import config.TestConfig;
import org.junit.Test;
import pages.MainPage;

public class BootstrapModalsTest extends TestConfig
{
    @Test
    public void clickLaunchModalButtonInSingleModalExamplePanelShouldShowCorrectModal()
    {
        new MainPage()
                .goToBootstrapModalsPage()
                    .modalInSingleModalExamplePanelShouldBeDisplayed();
    }

    @Test
    public void clickLaunchModalButtonInMultipleModalExamplePanelShouldShowCorrectModal()
    {
        new MainPage()
                .goToBootstrapModalsPage()
                    .modalInMultipleModalExamplePanelShouldBeDisplayed();
    }

    @Test
    public void clickLaunchModalButtonInDisplayedModalShouldShowNextCorrectModal()
    {
        new MainPage()
                .goToBootstrapModalsPage()
                    .modalInMultipleModalExamplePanelShouldBeDisplayed()
                    .childModalShouldBeDisplayed();
    }
}
