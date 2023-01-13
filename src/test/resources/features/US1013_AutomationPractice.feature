Feature: US1013 ınvalid email testi 
  @heroku1
  Scenario: TC18 ınvalid email ile giris yapilamaz
    Given kullanici "herokuappUrl" sayfasina gider
    And user login linkine tiklar
    And email kutusuna @isareti olmayan email adresi  yazar ve enter a tiklar
    And  password alanini doldurur
    Then giris yapamadigini test ediniz
    