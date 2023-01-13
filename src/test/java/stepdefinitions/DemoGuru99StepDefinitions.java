package stepdefinitions;

import io.cucumber.java.en.Given;
import net.bytebuddy.implementation.bind.annotation.DefaultMethod;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99StepDefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();
    @Given("{string} , sütunundaki tüm degerleri yazdirir")
    public void sütunundaki_tüm_degerleri_yazdirir(String istenenBaslikstr) {

       // Driver.getDriver().switchTo().frame(demoGuruPage.iframe);

        List<WebElement> baslikWebElementListesi=demoGuruPage.baslikWebElementListesi;

        List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebElementListesi);

        int istenenSutunIndexi=baslikStringListesi.indexOf(istenenBaslikstr);

        //  //tbody//tr//td

        List<WebElement> istenenSutunWebElementListesi=demoGuruPage.sutunListesiGetir(istenenSutunIndexi);

        List<String> istenenSutunStrList=ReusableMethods.getElementsText(istenenSutunWebElementListesi);

        System.out.println(istenenBaslikstr + "sutunundaki elementler \n" + istenenSutunStrList);


    }
}
