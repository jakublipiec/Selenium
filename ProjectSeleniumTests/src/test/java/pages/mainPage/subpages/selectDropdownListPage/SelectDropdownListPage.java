package pages.mainPage.subpages.selectDropdownListPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utility.DataFaker;
import utility.PageData;

public class SelectDropdownListPage extends BasePage
{
    private DataFaker faker;
    private static String expectedMessage;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4)")
    private WebElement selectListDemoPanel;

    @FindBy(id = "select-demo")
    private  WebElement selectList;

    @FindBy( xpath = "//p[@class='selected-value']")
    private WebElement selectListDemoMessage;


    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5)")
    private WebElement multiSelectListDemoPanel;

    @FindBy(id ="multi-select")
    private WebElement multiSelectList;

    @FindBy(id = "printMe")
    private WebElement firstSelectedBtn;

    @FindBy(id = "printAll")
    private WebElement getAllSelectedBtn;

    @FindBy(className = "getall-selected")
    private WebElement multiSelectListDemoMessage;

    public SelectDropdownListPage()
    {
        super();
    }

    public SelectDropdownListPage scrollIntoSelectListDemoPanel()
    {
        scrollInto(selectListDemoPanel);

        return this;
    }

    public SelectDropdownListPage clickSelectList()
    {
        click(selectList);

        return this;
    }

    public SelectDropdownListPage chooseOption(int index)
    {
        setExpectedMessage(index);

        WebElement option = getOptions(selectList).get(index);

        click(option);

        return this;
    }

    public SelectDropdownListPage chooseRandomOption()
    {
        faker = new DataFaker();

        int index = Integer.parseInt(faker.getRandomNumber(1, getOptions(selectList).size()-1));

        chooseOption(index);

        return this;
    }

    public String getSelectListDemoReceivedMessage()
    {
        return expectedMessage;
    }

    public static String getExpectedMessage() throws NullPointerException
    {
        return expectedMessage;
    }

    private void setExpectedMessage(int index)
    {
        expectedMessage = PageData.SELECT_DROPDOWN_LIST_PAGE.selectListDemoMessages.get(index);
    }
}
