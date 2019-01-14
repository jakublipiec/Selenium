package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.mainPage.MainPage;
import pages.mainPage.subpages.selectDropdownListPage.SelectDropdownListPage;

public class SelectDropdownListTest extends TestConfig
{
    @Test
    public void chooseOptionInSelectListDemoPanelShouldShowCorrectMessage()
    {
        String receivedMessage = new MainPage()
                                        .goToSelectDropdownListPage()
                                            .scrollIntoSelectListDemoPanel()
                                            .clickSelectList()
                                            .chooseRandomOption()
                                            .getSelectListDemoReceivedMessage();

        String expectedMessage = SelectDropdownListPage.getExpectedMessage();

        Assert.assertEquals("Expected message must be identical to received message",
                            expectedMessage, receivedMessage);

    }
}
