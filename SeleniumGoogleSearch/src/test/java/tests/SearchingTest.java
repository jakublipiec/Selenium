package tests;
import config.TestConfig;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import pages.GoogleSearchPage;

public class SearchingTest extends TestConfig
{
    @Test
    public void goodQueryShouldReturnResults()
    {
        new GoogleSearchPage()
                .submitSearchWithGoodQuery()
                .queryShouldReturnResults();
    }

    @Test (expected=NoSuchElementException.class)
    public void wrongQueryShouldNotReturnResults()
    {
        new GoogleSearchPage()
                .submitSearchWithWrongQuery()
                .queryShouldReturnResults();
    }
}

