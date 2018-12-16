package testCases;

import config.TestConfig;
import org.junit.Test;
import pages.MainPage;

public class RadioButtonDemoTest extends TestConfig
{
    @Test
    public void choosingMaleInRadioButtonDemoPanelShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .choosingMaleShouldShowCorrectMessage();
    }

    @Test
    public void choosingFemaleInRadioButtonDemoPanelShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .choosingFemaleShouldShowCorrectMessage();
    }

    @Test
    public void choosingNothingShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .choosingNothingShouldShowCorrectMessage();
    }

    @Test
    public void clickGetValuesButtonBeforeChoosingRadioButtonShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .clickGetValuesButtonBeforeChoosingRadioButtonShouldShowCorrectMessage();
    }

    @Test
    public void chooseMaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .chooseMaleAndFirstAgeGroupShouldShowCorrectMessage();
    }

    @Test
    public void chooseMaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .chooseMaleAndSecondAgeGroupShouldShowCorrectMessage();
    }

    @Test
    public void chooseMaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .chooseMaleAndThirdAgeGroupShouldShowCorrectMessage();
    }

    @Test
    public void chooseFemaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .chooseFemaleAndFirstAgeGroupShouldShowCorrectMessage();
    }

    @Test
    public void chooseFemaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .chooseFemaleAndSecondAgeGroupShouldShowCorrectMessage();
    }

    @Test
    public void chooseFemaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        new MainPage()
                .goToRadioButtonDemoPage()
                    .chooseFemaleAndThirdAgeGroupShouldShowCorrectMessage();
    }
}