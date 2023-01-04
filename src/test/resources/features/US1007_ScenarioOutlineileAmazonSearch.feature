@amazon
Feature: US1007 Scenario Outline ile Amazon Search

  Scenario Outline: TC12 Amazonda bir listedeki tüm elementleri aratmak
    Given kullanici "AmazonUrl" sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdigini test eder
    And  sayfayi kapatir



    Examples:
    |aranacakEleman|
    |Apple|
    |Java|
    |Samsung|
    |Armut|
    |Nutella|