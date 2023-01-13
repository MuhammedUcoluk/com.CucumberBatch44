package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Heroku1Page {

    public Heroku1Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginElementi;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
    public WebElement loginButonu;
}
