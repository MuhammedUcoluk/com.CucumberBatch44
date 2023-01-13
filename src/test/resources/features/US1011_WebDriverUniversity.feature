Feature: US1011 WebDriverUniversity window handle
  @WebUniv
  Scenario Outline: TC16 Reusable method ile window handle etme

    When kullanici "WebUniversityUrl" sayfasina gider
    And login portala kadar asagi iner
    And Login portala tiklar
    Then acilan diger windowa gecer
    And "<username>" ve "<password>" kutularina deger yazdirir
    And 1 saniye bekler
    And Webuniversity login butonuna basar
    Then Ok diyerek Popup'u kapatir
    And ilk sayfaya geri döner
    And ilk sayfaya donuldugunu test eder
    And sayfayi kapatir

Examples:
    |username|password|
    |Ahmet  |Muhammed |