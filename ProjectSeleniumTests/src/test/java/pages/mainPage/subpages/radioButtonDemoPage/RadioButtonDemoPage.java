package pages.mainPage.subpages.radioButtonDemoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

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

    public String choosingMaleShouldShowCorrectMessage()
    {
        scrollInto(radioButtonDemoPanel);

        chooseMaleInRadioButtonDemoPanel();

        click(getCheckedValueButton);

        return checkedRadioButtonInfo.getText();
    }

    public String choosingFemaleShouldShowCorrectMessage()
    {
        scrollInto(groupRadioButtonsDemoPanel);

        chooseFemaleInRadioButtonDemoPanel();

        click(getCheckedValueButton);

        return checkedRadioButtonInfo.getText();
    }

    public String choosingNothingShouldShowCorrectMessage()
    {
        scrollInto(groupRadioButtonsDemoPanel);

        click(getCheckedValueButton);

        return checkedRadioButtonInfo.getText();
    }

    public String clickGetValuesButtonBeforeChoosingRadioButtonShouldShowCorrectMessage()
    {
        scrollInto(groupRadioButtonsDemoPanel);

        click(getValuesButton);

        return groupRadioButtonsSubmitMessage.getText();
    }

    public String chooseFemaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(femaleRadioButtonInGroupRadioButtonsDemoPanel,
                              firstAgeGroupRadioButton);

        return groupRadioButtonsSubmitMessage.getText();
    }

    public String chooseFemaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(femaleRadioButtonInGroupRadioButtonsDemoPanel,
                              secondAgeGroupRadioButton);

        return groupRadioButtonsSubmitMessage.getText();
    }

    public String chooseFemaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(femaleRadioButtonInGroupRadioButtonsDemoPanel,
                              thirdAgeGroupRadioButton);

        return groupRadioButtonsSubmitMessage.getText();
    }

    public String chooseMaleAndFirstAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(maleRadioButtonInGroupRadioButtonsDemoPanel,
                              firstAgeGroupRadioButton);

        return groupRadioButtonsSubmitMessage.getText();
    }

    public String chooseMaleAndSecondAgeGroupShouldShowCorrectMessage()
    {
        checkDisplayedMessage(maleRadioButtonInGroupRadioButtonsDemoPanel,
                              secondAgeGroupRadioButton);

        return groupRadioButtonsSubmitMessage.getText();
    }

    public String chooseMaleAndThirdAgeGroupShouldShowCorrectMessage()
    {
        return checkDisplayedMessage(maleRadioButtonInGroupRadioButtonsDemoPanel, thirdAgeGroupRadioButton);
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

    private String checkDisplayedMessage(WebElement gender, WebElement ageGroup)
    {
        scrollInto(groupRadioButtonsDemoPanel);

        click(gender);

        click(ageGroup);

        click(getValuesButton);

        return groupRadioButtonsSubmitMessage.getText();
    }
}
