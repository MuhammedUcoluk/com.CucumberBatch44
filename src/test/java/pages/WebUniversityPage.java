package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@id='login-portal']")
    public WebElement loginPortalButonuElementi;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameBoxElementi;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordBoxElementi;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement logButonElementi;
}
