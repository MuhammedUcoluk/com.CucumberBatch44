package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css="//button[@id='enableAfter']")
    public WebElement willEnable5SecondElement;
}
