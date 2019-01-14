package testCases;

import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.mainPage.MainPage;
import utility.DataFaker;

public class AjaxFormSubmitTest extends TestConfig
{
    private DataFaker faker;

    @Test
    public void clickSubmitBtnBeforeFillingInputsShouldSignalValidationError()
    {
        boolean isErrorSignDisplayed = new MainPage()
                                                    .goToAjaxFormSubmitPage()
                                                        .scrollIntoAjaxForm()
                                                        .clickSubmitBtn()
                                                        .isError();

        Assert.assertTrue("Error sign should be displayed!", isErrorSignDisplayed);
    }

    @Test
    public void clickSubmitBtnWithoutFillingNameInputShouldSignalValidationError()
    {
        faker = new DataFaker();
        String randomDescription = faker.getChuckNorrisFact();

        boolean isErrorSignDisplayed = new MainPage()
                                                .goToAjaxFormSubmitPage()
                                                    .scrollIntoAjaxForm()
                                                    .fillDescriptionInput(randomDescription)
                                                    .clickSubmitBtn()
                                                    .isError();

        Assert.assertTrue("Error sign should be displayed!", isErrorSignDisplayed);
    }

    @Test
    public void clickSubmitBtnAfterFillingInputsShouldShowInfo()
    {
        faker = new DataFaker();

        String randomName = faker.getRandomFirstName();
        String randomDescription = faker.getChuckNorrisFact();

        String correctInfo = "Form submited Successfully!";

        String currentInfo = new MainPage()
                                .goToAjaxFormSubmitPage()
                                    .scrollIntoAjaxForm()
                                    .fillNameInput(randomName)
                                    .fillDescriptionInput(randomDescription)
                                    .clickSubmitBtn()
                                    .getAjaxInfo();

        Assert.assertEquals(correctInfo, currentInfo);
    }
}
