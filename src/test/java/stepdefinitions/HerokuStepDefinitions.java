package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuPage;
import utilities.ReusableMethods;

public class HerokuStepDefinitions {
    HerokuPage herokuPage=new HerokuPage();
    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
    herokuPage.addButonElementi.click();
    }
    @Then("Delete butonu görününceye kadar bekler")
    public void delete_butonu_görününceye_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuPage.deleteButonElementi,20);

    }
    @Then("Delete butonunun görünür oldugunu test eder")
    public void delete_butonunun_görünür_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButonElementi.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButonElementi.click();

    }
}
