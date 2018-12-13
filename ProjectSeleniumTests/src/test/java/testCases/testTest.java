package testCases;

import config.TestConfig;
import org.junit.Test;
import pages.MainPage;

public class testTest extends TestConfig
{
    @Test
    public void loadSimpleFormDemoPage()
    {
        new MainPage()
                .goToSimpleFormDemoPage()
                .showPanel();
    }
}
