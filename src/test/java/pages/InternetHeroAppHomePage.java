package pages;


import Utilites.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetHeroAppHomePage {

    public InternetHeroAppHomePage(){
        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement addElementButton;

    @FindBy(id = "elements")
    public WebElement deleteButton;


}
