package steps;


import Utilites.ConfigReader;
import Utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.InternetHeroAppHomePage;

import java.util.List;

public class InvoiceCloudSteps {
    InternetHeroAppHomePage homePage= new InternetHeroAppHomePage();

    WebDriver driver = Driver.getDriver();

    @Given("User navigates to {string} application")
    public void user_navigates_to_application(String URL) {
        driver.get(ConfigReader.getProperty(URL));
    }

    @When("User adds {int} of Elements")
    public void userAddsOfElements(int number) {
        for (int i=0; i<number;i++){
                homePage.addElementButton.click();
            }
        }

    @Then("user validates number of elements on UI is correct")
    public void user_validates_number_of_elements_on_ui_is_correct() {
     List<WebElement> values=driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));

        int actual=values.size();
        int expected=10;

        Assert.assertEquals(expected,actual);







    }
}



