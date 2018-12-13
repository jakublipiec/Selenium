package testCases;

import config.TestConfig;
import org.junit.Test;
import pages.MainPage;

public class SimpleFormDemoTest extends TestConfig
{
    @Test
    public void displayedMessageShouldBeIdenticalToInputMessage()
    {
        new MainPage()
                .goToSimpleFormDemoPage()
                    .displayedMessageShouldBeIdenticalToInputMessage();
    }

    @Test
    public void displayedValueShouldBeSumOfInputs()
    {
        new MainPage()
                .goToSimpleFormDemoPage()
                    .displayedValueShoudBeSumOfInputs();
    }

    @Test
    public void simpleFormDemoFullTest()
    {
        new MainPage()
                .goToSimpleFormDemoPage()
                    .displayedMessageShouldBeIdenticalToInputMessage()
                    .displayedValueShoudBeSumOfInputs();
    }
}
