package steps;


import Utilites.ConfigReader;
import Utilites.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    WebDriver driver= Driver.getDriver();

    @Given("user navigates to {string} application")
    public void user_navigates_to_the_weborders_application(String application) {
        switch (application) {
            case "WebOrders":
                driver.get(ConfigReader.getProperty("WebOrdersURL"));
                break;
            case "Etsy":
                driver.get(ConfigReader.getProperty("EtsyAppURL"));
                break;
            case "PizzaApp":
                driver.get(ConfigReader.getProperty("PizzaAppURL"));
                break;
            case "InternetHeroApp":
                driver.get(ConfigReader.getProperty("InternetHeroApp"));
                break;
        }
    }

    @Before
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    @After
    public void tearDown(Scenario scenario){
//        driver.quit();
        System.out.println("Method Runs after each scenario");

    }
}
