package pages.mainPage.subpages.inputFormWithValidationsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utility.DataFaker;

import java.util.Random;

public class InputFormWithValidationsPage extends BasePage
{
    @FindBy(name = "first_name")
    private WebElement firstName;

    @FindBy(name = "last_name")
    private WebElement lastName;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "phone")
    private WebElement phoneNumber;

    @FindBy(name = "address")
    private WebElement address;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "state")
    private WebElement stateSelect;

    @FindBy(name = "zip")
    private WebElement zipCode;

    @FindBy(name = "website")
    private WebElement website;

    @FindBy(xpath = "//input[@name='hosting' and @value='yes']")
    private WebElement hostingYes;

    @FindBy(xpath = "//input[@name='hosting' and @value='no']")
    private WebElement hostingNo;

    @FindBy(name = "comment")
    private WebElement projectDescription;

    @FindBy(css = "#contact_form > fieldset > div:nth-child(14) > div > button")
    private WebElement sendBtn;

    @FindBy(id ="form_success_message")
    private WebElement successMessage;


    public InputFormWithValidationsPage()
    {
        super();
    }

    public InputFormWithValidationsPage scrollIntoFirstInput()
    {
        scrollInto(firstName);

        return this;
    }

    public InputFormWithValidationsPage fillInInputWithValidData()
    {
        DataFaker faker = new DataFaker();

        sendFirstName(faker.getRandomFirstName());
        sendLastName(faker.getRandomLastname());
        sendEmail(faker.getRandomGmail());
        sendPhoneNumber(faker.getRandomPhoneNumber());
        sendAddress(faker.getRandomAddress());
        sendCity(faker.getRandomCity());
        selectRandomState(Integer.valueOf(faker.getRandomNumber(1, 50)));
        sendZipCode(faker.getRandomZipCode());
        sendWebside(faker.getRandomWebside());
        checkRandomHostingOption();
        sendDescription(faker.getRandomShakespeareHamlet());

        return this;
    }

    public InputFormWithValidationsPage clickSendBtn()
    {
        click(sendBtn);

        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return this;
    }

    public boolean isSuccessMessageDisplayed()
    {
        return this.successMessage.isDisplayed();
    }

    private InputFormWithValidationsPage sendFirstName(String firstName)
    {
        this.firstName.sendKeys(firstName);

        return this;
    }

    private InputFormWithValidationsPage sendLastName(String lastName)
    {
        this.lastName.sendKeys(lastName);

        return this;
    }

    private InputFormWithValidationsPage sendEmail(String email)
    {
        this.email.sendKeys(email);

        return this;
    }

    private InputFormWithValidationsPage sendPhoneNumber(String phoneNumber)
    {
        this.phoneNumber.sendKeys(phoneNumber);

        return this;
    }

    private InputFormWithValidationsPage sendAddress(String address)
    {
        this.address.sendKeys(address);

        return this;
    }

    private InputFormWithValidationsPage sendCity(String city)
    {
        this.city.sendKeys(city);

        return this;
    }

    private InputFormWithValidationsPage selectRandomState(int index)
    {
        WebElement option = getOptions(stateSelect).get(index);

        click(option);

        return this;
    }

    private InputFormWithValidationsPage sendZipCode(String zipCode)
    {
        this.zipCode.sendKeys(zipCode);

        return this;
    }

    private InputFormWithValidationsPage sendWebside(String webside)
    {
        this.website.sendKeys(webside);

        return this;
    }

    private InputFormWithValidationsPage checkRandomHostingOption()
    {
        if (new Random().nextInt() % 2 != 0) hostingYes.click();
        else hostingNo.click();

        return this;
    }

    private InputFormWithValidationsPage sendDescription(String description)
    {
        this.projectDescription.sendKeys(description);

        return this;
    }

    private InputFormWithValidationsPage sendForm()
    {
        click(sendBtn);

        return this;
    }
}
