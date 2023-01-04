package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Editor",
        dryRun = true //eksik adımları bulmak istiyorsak true, normal test için false
)

public class Runner {
    //Runner classının body sine hiç bir kod yazmıyoruz.
    //Bu class için önemli olan kullanacağımız 2 adet notasyon.

    //=====dryRun=false yazıldıgında yukarıda belirlenen tagla etiketlenen tüm senaryoları sırasıyla çalıştırır.
    //dryRun=true dediğimizde ise KODLARI ÇALIŞTIRMADAN eksik stepler olup olmadığını kontrol eder ve
    // varsa bize eksik stepleri rapor eder.

    //features ve glue olarak spesifik bir class veya features dosyasini değil
    // tüm klasör ve package yi seçtik
    //dolayısı ile stepdefinitions package si içerisinde hangi classta olursa olsun
    //işimize yarayan bir stepdefinitions varsa rahatlıkla kullanabiliriz.
}
