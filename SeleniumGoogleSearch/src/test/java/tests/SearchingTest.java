package tests;
import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import pages.GoogleSearchPage;
import utility.DataFaker;

public class SearchingTest extends TestConfig
{
    @Test
    public void goodQueryShouldReturnResults()
    {
        final String QUERY = new DataFaker().getFakeCity();

        boolean queryReturnResults = new GoogleSearchPage()
                                            .submitSearchWithGoodQuery(QUERY)
                                                .isResultDisplayed();

        Assert.assertTrue("Query should return results.", queryReturnResults);
    }

    @Test (expected=NoSuchElementException.class)
    public void wrongQueryShouldNotReturnResults()
    {
        final String WRONG_QUERY = "---------------------------------------";

        boolean queryReturnResults =  new GoogleSearchPage()
                                                .submitSearchWithWrongQuery(WRONG_QUERY)
                                                    .isResultDisplayed();
    }
}

