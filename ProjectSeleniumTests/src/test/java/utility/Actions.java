package utility;

import config.WebDriverSingleton;
import exceptions.LastHandleWindowException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Actions
{
    static final int WAIT_TIMEOUT = 10;
    private static WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), WAIT_TIMEOUT);

    public static void waitForVisibilityElement(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static Alert waitForAlert()
    {
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void waitForAlertDisappear(long milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e)
        {
            System.out.println("Alert has not disappeared!\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void waitForAjaxCalls()
    {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) WebDriverSingleton.getInstance();

        wait.until(condition -> (boolean)javascriptExecutor.executeScript("return jQuery.active == 0"));
    }

    public static void waitUntilTextWillBeChanged(WebElement element)
    {
        String previousText = element.getText();
        wait.until(condition -> !element.getText().equals(previousText));
    }
}
