package pages.mainPage.subpages.bootstrapModalsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utility.Actions;

public class BootstrapModalsPage extends BasePage
{
    private boolean isModalDisplayed;

    @FindBy(css = "body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(2) > div > div")
    private WebElement singleModalExamplePanel;

    @FindBy(xpath = "//a[@href='#myModal0']")
    private WebElement singleModalExamplePanelLaunchModalBtn;

    @FindBy(xpath = "//*[@id=\"myModal0\"]/div/div")
    private WebElement singleModalExampleModalContent;

    @FindBy(css = "body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div > div")
    private WebElement multipleModalExamplePanel;

    @FindBy(xpath = "//a[@href='#myModal']")
    private WebElement multipleModalExamplePanelLaunchModalBtn;

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div")
    private WebElement parentModalContent;

    @FindBy(xpath = "//a[@href='#myModal2']")
    private WebElement parentModalLaunchModalBtn;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div")
    private WebElement childModalContent;

    public BootstrapModalsPage()
    {
        super();
    }

    private BootstrapModalsPage showModal(WebElement panel, WebElement button, WebElement modal)
    {
        scrollInto(panel);

        button.click();

        Actions.waitForVisibilityElement(modal);

        setModalDisplayed(modal.isDisplayed());

        return this;
    }

    public BootstrapModalsPage showModalInSingleModalExamplePanel()
    {
        showModal(singleModalExamplePanel, singleModalExamplePanelLaunchModalBtn, singleModalExampleModalContent);

        return this;
    }

    public BootstrapModalsPage showModalInMultipleModalExamplePanel()
    {
        showModal(multipleModalExamplePanel, multipleModalExamplePanelLaunchModalBtn, parentModalContent);

        return this;
    }

    public BootstrapModalsPage showChildModal()
    {
        showModal(parentModalContent, parentModalLaunchModalBtn, childModalContent);

        return this;
    }

    public boolean isModalDisplayed()
    {
        return isModalDisplayed;
    }

    public void setModalDisplayed(boolean modalDisplayed)
    {
        isModalDisplayed = modalDisplayed;
    }
}
