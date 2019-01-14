package pages.mainPage.subpages.windowPopupModalPage;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.mainPage.subpages.windowPopupModalPage.facebookStartPage.FacebookStartPage;
import pages.mainPage.subpages.windowPopupModalPage.twitterStartPage.TwitterStartPage;

public class WindowPopupModalPage extends BasePage
{
    @FindBy(css = "body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(2) > div")
    private WebElement singleWindowPopupPanel;

    @FindBy(xpath = "//a[@href='https://twitter.com/intent/follow?screen_name=seleniumeasy' and text()='  Follow On Twitter ']")
    private WebElement followOnTwitterBtn;

    @FindBy(xpath = "//a[@href='https://facebook.com/seleniumeasy' and text()='  Like us On Facebook ']")
    private WebElement likeUsOnFacebookBtn;


    @FindBy(css = "body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div")
    private WebElement multipleWindowModalPanel;

    @FindBy(xpath = "//div[@class='two-windows']/a")
    private WebElement followTwitterAndFacebookBtn;

    @FindBy(id = "followall")
    private WebElement followAllBtn;

    public WindowPopupModalPage scrollIntoSingleModalPanel()
    {
        scrollInto(singleWindowPopupPanel);

        return this;
    }

    public TwitterStartPage clickFollowOnTwitterBtn()
    {
        click(followOnTwitterBtn);

        return new TwitterStartPage();
    }

    public FacebookStartPage clickLikeUsOnFacebookBtn()
    {
        click(likeUsOnFacebookBtn);

        return new FacebookStartPage();
    }


    public WindowPopupModalPage scrollIntoMultipleModalPanel()
    {
        scrollInto(multipleWindowModalPanel);

        return this;
    }

    public TwitterStartPage clickFollowTwitterAndFacebookBtn()
    {
        click(followTwitterAndFacebookBtn);

        return new TwitterStartPage();
    }

    public FacebookStartPage clickFollowAllBtn()
    {
        click(followAllBtn);

        return new FacebookStartPage();
    }
}
