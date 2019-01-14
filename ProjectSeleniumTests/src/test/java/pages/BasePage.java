package pages;

import config.WebDriverSingleton;
import exceptions.LastHandleWindowException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.Actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class BasePage
{
    @FindBy(xpath = "/html/body")
    private WebElement body;

    public BasePage()
    {
        PageFactory.initElements(WebDriverSingleton.getInstance(), this);
        Actions.waitForVisibilityElement(body);
    }

    public void scrollInto(WebElement element)
    {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)WebDriverSingleton.getInstance();

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        Actions.waitForVisibilityElement(element);
    }

    public <T extends BasePage> T click(WebElement element)
    {
        element.click();

        return (T)this;
    }

    public List<WebElement> getOptions(WebElement selectCompound)
    {
        Select dropDownBox = new Select(selectCompound);

        return dropDownBox.getOptions();
    }

    public List<String> getOptionsNames(List<WebElement> options)
    {
        List<String> names = new ArrayList<>();

        for (WebElement option : options)
        {
            names.add(option.getAttribute("value"));
        }

        return names;
    }

    public <T extends BasePage> T switchDriverInstanceHandleWindowToNextWindow() throws LastHandleWindowException
    {
        /*/**
         *   When I have two browser windows and I want to do an action on the second window,
         *   I need to switch driver instance to the second window (provide access to second window elements).
         *
         *   Method should only be used for switch between two browser windows!
         */

        /* String currentHandleWindow = WebDriverSingleton.getInstance().getWindowHandle();

        for (String handleWindow : WebDriverSingleton.getInstance().getWindowHandles())
        {
            if (handleWindow != currentHandleWindow)
            {
                WebDriverSingleton.getInstance().switchTo().window(handleWindow); //how can I do it better?
            }
        }*/

            String currentHandle = WebDriverSingleton.getInstance().getWindowHandle();

            Set<String> handles = WebDriverSingleton.getInstance().getWindowHandles();

            if (handles.size() < 2) throw new LastHandleWindowException("There is only one browser window!");

            WebDriver instance = WebDriverSingleton.getInstance();

            Iterator<String> iterator = handles.iterator();

            boolean isEqual = false;

            while (iterator.hasNext())
            {
                if (isEqual == true)
                {
                    instance.switchTo().window(iterator.next());
                    break;
                }

                if (iterator.next().equals(currentHandle))
                {
                    isEqual = true;
                }
            }
            return (T)this;
    }

    public Integer getCountOfHandleWindows()
    {
        return WebDriverSingleton.getInstance().getWindowHandles().size();
    }
}
