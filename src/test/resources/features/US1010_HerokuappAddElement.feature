Feature: US1010 Herokuapp sayfasında add butonu testi
  @Hero
  Scenario: TC15 sonradan gorunen elemanlar calismali

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When Add Element butonuna basar
    Then Delete butonu görününceye kadar bekler
    And Delete butonunun görünür oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And sayfayi kapatir