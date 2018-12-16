package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Actions;

public class BootstrapModalsPage extends BasePage
{
    @FindBy(css = "body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(2) > div > div")
    WebElement singleModalExamplePanel;

    @FindBy(xpath = "//a[@href='#myModal0']")
    WebElement singleModalExamplePanelLaunchModalBtn;

    @FindBy(xpath = "//*[@id=\"myModal0\"]/div/div")
    WebElement singleModalExampleModalContent;


    @FindBy(css = "body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div > div")
    WebElement multipleModalExamplePanel;

    @FindBy(xpath = "//a[@href='#myModal']")
    WebElement multipleModalExamplePanelLaunchModalBtn;

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div")
    WebElement parentModalContent;

    @FindBy(xpath = "//a[@href='#myModal2']")
    WebElement parentModalLaunchModalBtn;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div")
    WebElement childModalContent;

    public BootstrapModalsPage()
    {
        super();
    }


    private BootstrapModalsPage modalShouldBeDisplayed(WebElement panel, WebElement button, WebElement modal)
    {
        setViewToPosition(panel);

        button.click();

        Actions.waitForVisibilityElement(modal);

        Assert.assertTrue("Correct modal should be visible", modal.isDisplayed());

        return this;
    }

    public BootstrapModalsPage modalInSingleModalExamplePanelShouldBeDisplayed()
    {
        modalShouldBeDisplayed(singleModalExamplePanel,
                               singleModalExamplePanelLaunchModalBtn,
                               singleModalExampleModalContent);

        return this;
    }

    public BootstrapModalsPage modalInMultipleModalExamplePanelShouldBeDisplayed()
    {
        modalShouldBeDisplayed(multipleModalExamplePanel,
                               multipleModalExamplePanelLaunchModalBtn,
                               parentModalContent);

        return this;
    }

    public BootstrapModalsPage childModalShouldBeDisplayed()
    {

        modalShouldBeDisplayed(parentModalContent,
                               parentModalLaunchModalBtn,
                               childModalContent);

        return this;
    }

}
