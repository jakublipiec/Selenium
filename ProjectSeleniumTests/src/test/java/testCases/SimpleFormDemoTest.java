package testCases;

import com.sun.org.apache.xalan.internal.xsltc.dom.DOMAdapter;
import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import pages.mainPage.MainPage;
import utility.DataFaker;

import javax.xml.crypto.Data;

public class SimpleFormDemoTest extends TestConfig
{
    private DataFaker faker;

    @Test
    public void displayedMessageShouldBeIdenticalToInputMessage()
    {
        faker = new DataFaker();

        String inputMessage = faker.getChuckNorrisFact();

        String displayedMessage = new MainPage()
                                          .goToSimpleFormDemoPage()
                                            .scrollIntoSingleInputFieldPanel()
                                            .fillInMessageInput(inputMessage)
                                            .clickShowMessageBtn()
                                            .getDisplayedMessageText();

        Assert.assertEquals("The message displayed should be identical to the user's message!",
                            inputMessage, displayedMessage);
    }

    @Test
    public void displayedValueShouldBeSumOfInputs()
    {
        faker = new DataFaker();

        String aInput = faker.getRandomNumber();
        String bInput = faker.getRandomNumber();

        String sumOfInputs = Integer.valueOf(aInput) + Integer.valueOf(bInput) + "";

        String currentSumOfInputs = new MainPage()
                                            .goToSimpleFormDemoPage()
                                                .scrollIntoTwoInputFieldPanel()
                                                .fillInInputs(aInput, bInput)
                                                .clickGetTotalBtn()
                                                .getExpectedSum();

        Assert.assertEquals("The sum displayed should be identical to the sum of inputs!",
                            sumOfInputs, currentSumOfInputs);
    }
}
