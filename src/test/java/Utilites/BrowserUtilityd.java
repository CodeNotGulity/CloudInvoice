package Utilites;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class BrowserUtilityd {

    /**
     * This method generates random emails
     * Ex:
     * .getRandomEmail(); -> returns "userEmail12345@gmail.com"
     */
    public static String getRandomEmail() {
        String email = "userEmail";
        Random random = new Random();
        int number = random.nextInt(99_999);
        return email + number + "@gmail.com";
    }

    /**
     * This method will accept WebElement of dropdown
     * and String value of dropdown, and will select
     * provided value in dropdown.
     */
    public static void selectDropdownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /**
     * this method is for elements to be clickable
     */
    public static WebElement waitForElementToBeClickable(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        WebElement element1=wait.until(ExpectedConditions.elementToBeClickable(element));

        return element1;
    }
/**
 * this method is for element to be visable
 *  .waitForElementToBeVisable(element,seconds)
 */
public static WebElement waitForElementToBeVisable(WebElement element, int seconds) {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
    WebElement element1=wait.until(ExpectedConditions.visibilityOf(element));

    return element1;
}

/**
 * This message takes a screenshot at compile error
 *  .takeScreenShot("Test-Name")
 */
public static void takeScreenShot(String testName) throws IOException {
    WebDriver driver= Driver.getDriver();
    File screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    String path = "src/test/resources1/Screenshots/"+testName+".png";

    File file = new File(path);
    FileUtils.copyFile(screenShot,file);

}


}
