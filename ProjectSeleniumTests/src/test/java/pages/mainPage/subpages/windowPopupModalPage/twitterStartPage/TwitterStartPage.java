package pages.mainPage.subpages.windowPopupModalPage.twitterStartPage;

import exceptions.LastHandleWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utility.Actions;

public class TwitterStartPage extends BasePage
{
    @FindBy(id = "not-logged-in")
    private WebElement twitterStartPageBody;

    public TwitterStartPage()
    {
        super();
    }

    public boolean isTwitterPageVisible()
    {
        return twitterStartPageBody.isDisplayed();
    }

    @Override
    public TwitterStartPage switchDriverInstanceHandleWindowToNextWindow()
    {
        try
        {
            return super.switchDriverInstanceHandleWindowToNextWindow();
        }
        catch (LastHandleWindowException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return this;
    }
}
