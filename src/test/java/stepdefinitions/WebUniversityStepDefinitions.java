package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepDefinitions {
    Actions actions=new Actions(Driver.getDriver());
    WebUniversityPage webUniversityPage=new WebUniversityPage();
    @When("login portala kadar asagi iner")
    public void login_portala_kadar_asagi_iner() {
    actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @When("Login portala tiklar")
    public void login_portala_tiklar() {
        webUniversityPage.loginPortalButonuElementi.click();

    }
    @Then("acilan diger windowa gecer")
    public void acilan_diger_windowa_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");

    }
    @Then("{string} ve {string} kutularina deger yazdirir")
    public void ve_kutularina_deger_yazdirir(String username, String password) {
        webUniversityPage.usernameBoxElementi.sendKeys(username);
        webUniversityPage.passwordBoxElementi.sendKeys(password);


    }
    @Then("Webuniversity login butonuna basar")
    public void webuniversity_login_butonuna_basar() {
        webUniversityPage.logButonElementi.click();

  //  }
  //  @Then("Popup'ta cikan yazinin oldugunu test eder")
 //   public void popup_ta_cikan_yazinin_oldugunu_test_eder(String popUpYazi) {
      //  String alertYazi=Driver.getDriver().switchTo().alert().getText();
     //  Assert.assertTrue();

    }
    @Then("Ok diyerek Popup'u kapatir")
    public void ok_diyerek_popup_u_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("ilk sayfaya geri döner")
    public void ilk_sayfaya_geri_döner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");

    }
    @Then("ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="WebDriverUniversity.com";
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
