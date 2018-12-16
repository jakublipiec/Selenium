package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.PageData;

public class RadioButtonDemoPage extends BasePage
{
    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4)")
    private WebElement radioButtonDemoPanel;

    @FindBy(xpath = "//input[@name='optradio' and @value='Male']")
    private WebElement maleRadioButtonInRadioButtonDemoPanel;

    @FindBy(xpath = "//input[@name='optradio' and @value='Female']")
    private WebElement femaleRadioButtonInRadioButtonDemoPanel;

    @FindBy(id = "buttoncheck")
    private WebElement getCheckedValueButton;

    @FindBy(xpath = "//p[@class='radiobutton']")
    private WebElement checkedRadioButtonInfo;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5)")
    private WebElement groupRadioButtonsDemoPanel;

    @FindBy(xpath = "//input[@name='gender' and @value='Male']")
    private WebElement maleRadioButtonInGroupRadioButtonsDemoPanel;

    @FindBy(xpath = "//input[@name='gender' and @value='Female']")
    private WebElement femaleRadioButtonInGroupRadioButtonsDemoPanel;

    @FindBy(xpath = "//input[@name='ageGroup' and @value='0 - 5']")
    private WebElement firstAgeGroupRadioButton;

    @FindBy(xpath = "//input[@name='ageGroup' and @value='5 - 15']")
    private WebElement secondAgeGroupRadioButton;

    @FindBy(xpath = "//input[@name='ageGroup' and @value='15 - 50']")
    private WebElement thirdAgeGroupRadioButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
    private WebElement getValuesButton;

    @FindBy(xpath = "//p[@class='groupradiobutton']")
    private WebElement groupRadioButtonsSubmitMessage;

    public RadioButtonDemoPage()
    {
        super();
    }

    public RadioButtonDemoPage choosingMaleShouldShowCorrectMessage()
    {
        setViewToPosition(radioButtonDemoPanel);

        chooseMaleInRadioButtonDemoPanel();

        click(getCheckedValueButton);

        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.radioButtonDemoPanelCorrectMessages.get("MALE_CHOSEN"),
                            checkedRadioButtonInfo.getText());

        return this;
    }

    public RadioButtonDemoPage choosingFemaleShouldShowCorrectMessage()
    {
        setViewToPosition(groupRadioButtonsDemoPanel);

        chooseFemaleInRadioButtonDemoPanel();

        click(getCheckedValueButton);

        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.radioButtonDemoPanelCorrectMessages.get("FEMALE_CHOSEN"),
                            checkedRadioButtonInfo.getText());

        return this;
    }

    public RadioButtonDemoPage choosingNothingShouldShowCorrectMessage()
    {
        setViewToPosition(groupRadioButtonsDemoPanel);

        click(getCheckedValueButton);

        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.radioButtonDemoPanelCorrectMessages.get("NOTHING_CHOSEN"),
                            checkedRadioButtonInfo.getText());

        return this;
    }

    public RadioButtonDemoPage clickGetValuesButtonBeforeChoosingRadioButtonShouldShowCorrectMessage()
    {
        setViewToPosition(groupRadioButtonsDemoPanel);

        click(getValuesButton);

        Assert.assertEquals(PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get("NOTHING_CHOSEN"), groupRadioButtonsSubmitMessage.getText());

        return this;
    }

    public RadioButtonDemoPage chooseFemaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(femaleRadioButtonInGroupRadioButtonsDemoPanel,
                firstAgeGroupRadioButton,
                PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get(
                        "FEMALE_AND_FIRST_AGE_GROUP_CHOSEN"
                ));

        return this;
    }

    public RadioButtonDemoPage chooseFemaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(femaleRadioButtonInGroupRadioButtonsDemoPanel,
                secondAgeGroupRadioButton,
                PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get(
                        "FEMALE_AND_SECOND_AGE_GROUP_CHOSEN"
                ));

        return this;
    }

    public RadioButtonDemoPage chooseFemaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(femaleRadioButtonInGroupRadioButtonsDemoPanel,
                thirdAgeGroupRadioButton,
                PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get(
                        "FEMALE_AND_THIRD_AGE_GROUP_CHOSEN"
                ));

        return this;
    }

    public RadioButtonDemoPage chooseMaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(maleRadioButtonInGroupRadioButtonsDemoPanel,
                firstAgeGroupRadioButton,
                PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get(
                        "MALE_AND_FIRST_AGE_GROUP_CHOSEN"
                ));

        return this;
    }

    public RadioButtonDemoPage chooseMaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(maleRadioButtonInGroupRadioButtonsDemoPanel,
                secondAgeGroupRadioButton,
                PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get(
                        "MALE_AND_SECOND_AGE_GROUP_CHOSEN"
                ));

        return this;
    }

    public RadioButtonDemoPage chooseMaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(maleRadioButtonInGroupRadioButtonsDemoPanel,
                thirdAgeGroupRadioButton,
                PageData.RADIO_BUTTON_DEMO_PAGE.groupRadioButtonsDemoPanelCorrectMessages.get(
                        "MALE_AND_THIRD_AGE_GROUP_CHOSEN"
                ));

        return this;
    }

    private RadioButtonDemoPage click(WebElement element)
    {
        element.click();

        return this;
    }

    private RadioButtonDemoPage chooseMaleInRadioButtonDemoPanel()
    {
        click(maleRadioButtonInRadioButtonDemoPanel);

        return this;
    }

    private RadioButtonDemoPage chooseFemaleInRadioButtonDemoPanel()
    {
        click(femaleRadioButtonInRadioButtonDemoPanel);

        return this;
    }

    private RadioButtonDemoPage checkDisplayedMessage(WebElement gender, WebElement ageGroup, String correctMessage)
    {
        setViewToPosition(groupRadioButtonsDemoPanel);

        click(gender);

        click(ageGroup);

        click(getValuesButton);

        Assert.assertEquals(correctMessage, groupRadioButtonsSubmitMessage.getText());

        return this;
    }

}
