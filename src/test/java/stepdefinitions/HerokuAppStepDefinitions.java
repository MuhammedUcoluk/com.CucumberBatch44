package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Heroku1Page;
import utilities.ConfigReader;
import utilities.Driver;

public class HerokuAppStepDefinitions {
Heroku1Page heroku1Page=new Heroku1Page();
    Actions actions=new Actions(Driver.getDriver());
    @Given("user login linkine tiklar")
    public void user_login_linkine_tiklar() {
        heroku1Page.loginElementi.click();

    }
    @Given("email kutusuna @isareti olmayan email adresi  yazar ve enter a tiklar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar_ve_enter_a_tiklar() {
        heroku1Page.username.sendKeys(ConfigReader.getProperty("HOInvalidUsername"));
       actions.sendKeys(Keys.TAB).perform();
    }
    @Given("password alanini doldurur")
    public void password_alanini_doldurur() {
        heroku1Page.password.sendKeys(ConfigReader.getProperty("HOInvalidPassword"));
        actions.sendKeys(Keys.TAB).perform();
        heroku1Page.loginButonu.click();

    }
    @Then("giris yapamadigini test ediniz")
    public void giris_yapamadigini_test_ediniz() {

    }

}
