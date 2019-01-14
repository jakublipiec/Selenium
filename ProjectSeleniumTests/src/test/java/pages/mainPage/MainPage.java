package pages.mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.*;
import pages.mainPage.subpages.ajaxFormSubmitPage.AjaxFormSubmitPage;
import pages.mainPage.subpages.bootstrapAlertsPage.BootstrapAlertsPage;
import pages.mainPage.subpages.bootstrapModalsPage.BootstrapModalsPage;
import pages.mainPage.subpages.checkBoxDemoPage.CheckBoxDemoPage;
import pages.mainPage.subpages.inputFormWithValidationsPage.InputFormWithValidationsPage;
import pages.mainPage.subpages.javascriptAlertsPage.JavascriptAlertsPage;
import pages.mainPage.subpages.radioButtonDemoPage.RadioButtonDemoPage;
import pages.mainPage.subpages.selectDropdownListPage.SelectDropdownListPage;
import pages.mainPage.subpages.simpleFormDemoPage.SimpleFormDemoPage;
import pages.mainPage.subpages.windowPopupModalPage.WindowPopupModalPage;
import utility.Actions;

public class MainPage extends BasePage
{

    @FindBy(id = "myTab")
    WebElement examplesNavbar;

    @FindBy(css = "#basic_example > span")
    private WebElement basicExamplesBtn;

    @FindBy(css = "#inter_example > span")
    private WebElement intermediateExamplesBtn;

    @FindBy(css = "#advanced_example > span")
    private WebElement advancedExamplesBtn;

    //basic examples

    @FindBy(css = "#basic > div > a:nth-child(1)")
    private WebElement simpleFormDemoBtn;

    @FindBy(css = "#basic > div > a:nth-child(2)")
    private WebElement checkBoxDemoBtn;

    @FindBy(css = "#basic > div > a:nth-child(3)")
    private WebElement radioButtonsDemoBtn;

    @FindBy(css = "#basic > div > a:nth-child(4)")
    private WebElement selectDropdownListBtn;

    @FindBy(css = "#basic > div > a:nth-child(5)")
    private WebElement javascriptAlertsBtn;

    @FindBy(css = "#basic > div > a:nth-child(6)")
    private WebElement windowPopupModalBtn;

    @FindBy(css = "#basic > div > a:nth-child(7)")
    private WebElement bootstrapAlertsBtn;

    @FindBy(css = "#basic > div > a:nth-child(8)")
    private WebElement bootstrapModalsBtn;

    //intermediate examples

    @FindBy(css = "#intermediate > div > a:nth-child(1)")
    private WebElement inputFormWithValidationsBtn;

    @FindBy(css = "#intermediate > div > a:nth-child(2)")
    private WebElement ajaxFormSubmitBtn;

    //advanced examples

    public MainPage()
    {
        super();
    }

    private void loadBasicExamples()
    {

        scrollInto(examplesNavbar);
        basicExamplesBtn.click();
        Actions.waitForVisibilityElement(simpleFormDemoBtn);
    }

    private void loadIntermediateExamples()
    {
        scrollInto(examplesNavbar);
        intermediateExamplesBtn.click();
    }

    private void loadAdvancedExamples()
    {
        scrollInto(examplesNavbar);
        advancedExamplesBtn.click();
    }

    public SimpleFormDemoPage goToSimpleFormDemoPage()
    {
        loadBasicExamples();
        simpleFormDemoBtn.click();

        return new SimpleFormDemoPage();
    }

    public CheckBoxDemoPage goToCheckBoxDemoPage()
    {
        loadBasicExamples();
        checkBoxDemoBtn.click();

        return new CheckBoxDemoPage();
    }

    public RadioButtonDemoPage goToRadioButtonDemoPage()
    {
        loadBasicExamples();
        radioButtonsDemoBtn.click();

        return new RadioButtonDemoPage();
    }

    public SelectDropdownListPage goToSelectDropdownListPage()
    {
        loadBasicExamples();
        selectDropdownListBtn.click();

        return new SelectDropdownListPage();
    }

    public JavascriptAlertsPage goToJavascriptAlertsPage()
    {
        loadBasicExamples();
        javascriptAlertsBtn.click();

        return new JavascriptAlertsPage();
    }

    public WindowPopupModalPage goToWindowPopUpPage()
    {
        loadBasicExamples();
        windowPopupModalBtn.click();

        return new WindowPopupModalPage();
    }

    public BootstrapAlertsPage goToBootstrapAlertsPage()
    {
        loadBasicExamples();
        bootstrapAlertsBtn.click();

        return new BootstrapAlertsPage();
    }

    public BootstrapModalsPage goToBootstrapModalsPage()
    {
        loadBasicExamples();
        bootstrapModalsBtn.click();

        return new BootstrapModalsPage();
    }

    public InputFormWithValidationsPage goToInputFormWithValidationsPage()
    {
        loadIntermediateExamples();
        inputFormWithValidationsBtn.click();

        return new InputFormWithValidationsPage();
    }

    public AjaxFormSubmitPage goToAjaxFormSubmitPage()
    {
        loadIntermediateExamples();
        ajaxFormSubmitBtn.click();

        return new AjaxFormSubmitPage();
    }
}