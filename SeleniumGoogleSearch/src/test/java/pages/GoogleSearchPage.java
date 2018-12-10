package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import utility.DataFaker;

public class GoogleSearchPage extends BasePage
{
    DataFaker faker = new DataFaker();

    @FindBy(name = "q")
    WebElement searchInput;

    @FindBy(name = "btnK")
    WebElement searchButton;

    public GoogleSearchPage()
    {
        super();
    }

    private void fillSearchInput(String searchValue)
    {
        searchInput.sendKeys(searchValue);
    }

    @Step
    public ResultPage submitSearchWithGoodQuery()
    {
        fillSearchInput(faker.getFakeCity());
        searchButton.submit();

        return new ResultPage();
    }

    @Step
    public ResultPage submitSearchWithWrongQuery()
    {
        fillSearchInput("---------------------------");
        searchButton.submit();

        return new ResultPage();
    }
}
