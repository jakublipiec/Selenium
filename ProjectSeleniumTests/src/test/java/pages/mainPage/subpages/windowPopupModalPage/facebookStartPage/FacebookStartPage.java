package pages.mainPage.subpages.windowPopupModalPage.facebookStartPage;

import exceptions.LastHandleWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utility.Actions;

public class FacebookStartPage extends BasePage
{
    @FindBy(id = "facebook")
    private WebElement facebookStartPageBody;

    public FacebookStartPage()
    {
        super();
    }

    public boolean isFacebookPageVisible()
    {
        //Actions.switchDriverInstanceHandleWindowToNextWindow();
        return facebookStartPageBody.isDisplayed();
    }

    @Override
    public FacebookStartPage switchDriverInstanceHandleWindowToNextWindow()
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
