Feature: US1014 Dinamik Elemanlar
@Demoqa
  Scenario: TC19 Dinamik elementler tiklanabilmeli

    Given kullanici "DemoqaUrl" sayfasina gider
    Then Will enable 5 seconds butonunun enable olmasini bekler
    And Will enable 5 seconds butonunun enable oldugunu test eder
