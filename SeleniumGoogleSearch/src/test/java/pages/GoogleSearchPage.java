package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage
{
    @FindBy(name = "q")
    private WebElement searchInput;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    public GoogleSearchPage()
    {
        super();
    }

    private void fillSearchInput(String searchValue)
    {
        searchInput.sendKeys(searchValue);
    }

    public ResultPage submitSearchWithGoodQuery(String query)
    {
        fillSearchInput(query);
        searchButton.submit();

        return new ResultPage();
    }

    public ResultPage submitSearchWithWrongQuery(String wrongQuery)
    {
        fillSearchInput(wrongQuery);
        searchButton.submit();

        return new ResultPage();
    }
}
