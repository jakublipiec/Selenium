package testCases;

import config.TestConfig;
import org.junit.Test;
import pages.MainPage;

public class CheckBoxDemoTest extends TestConfig
{
    @Test
    public void checkTheCheckboxShouldDisplayCorrectMessage()
    {
        new MainPage()
                .goToCheckBoxDemoPage()
                    .checkTheCheckboxShouldDisplayCorrectMessage();
    }

    @Test
    public void checkAndUncheckAllOptionsWithButtonShouldChangeButtonText()
    {
        new MainPage()
                .goToCheckBoxDemoPage()
                    .checkAllOptionsShouldChangeButtonText(true)
                    .uncheckAllOptionsShouldChangeButtonText(true);
    }

    @Test
    public void checkAndUncheckAllOptionsManuallyShouldChangeButtonText()
    {
        new MainPage()
                .goToCheckBoxDemoPage()
                    .checkAllOptionsShouldChangeButtonText(false)
                    .uncheckAllOptionsShouldChangeButtonText(false);
    }
}
