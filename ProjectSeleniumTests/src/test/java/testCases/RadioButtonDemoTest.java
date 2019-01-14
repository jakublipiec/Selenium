package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.mainPage.MainPage;
import utility.PageData;

public class RadioButtonDemoTest extends TestConfig
{
    @Test
    public void choosingMaleInRadioButtonDemoPanelShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.radioButtonDemoPanelCorrectMessages.get("MALE_CHOSEN"),
                            new MainPage()
                                    .goToRadioButtonDemoPage()
                                        .choosingMaleShouldShowCorrectMessage());
    }

    @Test
    public void choosingFemaleInRadioButtonDemoPanelShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.radioButtonDemoPanelCorrectMessages.get("FEMALE_CHOSEN"),
                new MainPage()
                        .goToRadioButtonDemoPage()
                            .choosingFemaleShouldShowCorrectMessage());
    }

    @Test
    public void choosingNothingShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.radioButtonDemoPanelCorrectMessages.get("NOTHING_CHOSEN"),
                new MainPage()
                        .goToRadioButtonDemoPage()
                            .choosingNothingShouldShowCorrectMessage());
    }

    @Test
    public void clickGetValuesButtonBeforeChoosingRadioButtonShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("NOTHING_CHOSEN")                           , new MainPage()
                                      .goToRadioButtonDemoPage()
                                          .clickGetValuesButtonBeforeChoosingRadioButtonShouldShowCorrectMessage());
    }

    @Test
    public void chooseMaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("MALE_AND_FIRST_AGE_GROUP_CHOSEN"), new MainPage()
                                              .goToRadioButtonDemoPage()
                                                  .chooseMaleAndFirstAgeGroupShouldShowCorrectMessage());
    }

    @Test
    public void chooseMaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("MALE_AND_SECOND_AGE_GROUP_CHOSEN"), new MainPage()
                                               .goToRadioButtonDemoPage()
                                                   .chooseMaleAndSecondAgeGroupShouldShowCorrectMessage());
    }

    @Test
    public void chooseMaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("MALE_AND_THIRD_AGE_GROUP_CHOSEN"), new MainPage()
                                              .goToRadioButtonDemoPage()
                                                  .chooseMaleAndThirdAgeGroupShouldShowCorrectMessage());
    }

    @Test
    public void chooseFemaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("FEMALE_AND_FIRST_AGE_GROUP_CHOSEN"), new MainPage()
                                                .goToRadioButtonDemoPage()
                                                    .chooseFemaleAndFirstAgeGroupShouldShowCorrectMessage());
    }

    @Test
    public void chooseFemaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("FEMALE_AND_SECOND_AGE_GROUP_CHOSEN"), new MainPage()
                                                 .goToRadioButtonDemoPage()
                                                     .chooseFemaleAndSecondAgeGroupShouldShowCorrectMessage());
    }

    @Test
    public void chooseFemaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("FEMALE_AND_THIRD_AGE_GROUP_CHOSEN"), new MainPage()
                                                .goToRadioButtonDemoPage()
                                                    .chooseFemaleAndThirdAgeGroupShouldShowCorrectMessage());
    }
}