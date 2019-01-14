package testCases;

import config.TestConfig;
import org.junit.Test;
import org.junit.Assert;
import pages.mainPage.MainPage;

public class WindowPopupModalTest extends TestConfig
{
    @Test
    public void clickFollowOnTwitterBtnShouldDisplayTwitterPage()
    {
        boolean isTwitterPageVisible = new MainPage()
                                                    .goToWindowPopUpPage()
                                                        .scrollIntoSingleModalPanel()
                                                        .clickFollowOnTwitterBtn()
                                                            .switchDriverInstanceHandleWindowToNextWindow()
                                                            .isTwitterPageVisible();

        Assert.assertTrue("Twitter start page should be visible", isTwitterPageVisible);
    }

    @Test
    public void clickLikeUsOnFacebookBtnShouldDisplayFacebookPage()
    {
        boolean isFacebookPageVisible = new MainPage()
                                                    .goToWindowPopUpPage()
                                                        .scrollIntoSingleModalPanel()
                                                        .clickLikeUsOnFacebookBtn()
                                                            .switchDriverInstanceHandleWindowToNextWindow()
                                                            .isFacebookPageVisible();

        Assert.assertTrue("Facebook start page should be visible", isFacebookPageVisible);
    }

    @Test()
    public void clickFollowTwitterAndFacebookBtnShouldOpenTwoWindows()
    {
        final Integer COUNT_OF_HANDLE_WINDOWS = 3;

        Integer currentCountOfHandleWindows = new MainPage()
                                                    .goToWindowPopUpPage()
                                                        .scrollIntoMultipleModalPanel()
                                                        .clickFollowTwitterAndFacebookBtn()
                                                        .getCountOfHandleWindows();

        Assert.assertTrue(currentCountOfHandleWindows == COUNT_OF_HANDLE_WINDOWS);
    }

    @Test()
    public void clickFollowAllBtnShouldOpenThreeWindows()
    {
        final Integer COUNT_OF_HANDLE_WINDOWS = 4;

        Integer currentCountOfHandleWindows = new MainPage()
                                                    .goToWindowPopUpPage()
                                                        .scrollIntoMultipleModalPanel()
                                                        .clickFollowAllBtn()
                                                        .getCountOfHandleWindows();

        Assert.assertTrue(currentCountOfHandleWindows == COUNT_OF_HANDLE_WINDOWS);
    }
}
