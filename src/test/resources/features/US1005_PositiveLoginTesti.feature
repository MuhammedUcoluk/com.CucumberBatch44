@hotel
Feature: US1005 Positive Login Testi

  Scenario: TC08 Positive Login

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then kullanici adi olara "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And Login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir