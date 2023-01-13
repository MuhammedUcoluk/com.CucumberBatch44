package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampStepDefinitions {
    HotelMyCampPage hotelMyCampPages=new HotelMyCampPage();


    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hotelMyCampPages.gelismisSekmesiElementi.click();
        hotelMyCampPages.siteyeilerleSekmesiElementi.click();
    hotelMyCampPages.ilkLoginLinki.click();
    }



    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hotelMyCampPages.passwordBox.sendKeys(ConfigReader.getProperty(passwordTuru));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hotelMyCampPages.loginLinki.click();

    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hotelMyCampPages.basariliGiris.isDisplayed());

    }

    @And("giris yapilamadigini test eder")
    public void girisYailamadiginiTestEder() {

        Assert.assertTrue(hotelMyCampPages.basarisizGiris.isDisplayed());
    }


    @Then("scenario outline dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hotelMyCampPages.usernameBox.sendKeys(username);
    }

    @And("scenario outline dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hotelMyCampPages.passwordBox.sendKeys(password);
    }

    @Then("kullanici adi olara {string} girer")
    public void kullanici_adi_olara_girer(String kullaniciTipi) {
        hotelMyCampPages.usernameBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));
    }


}
