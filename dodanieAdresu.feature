Feature: Dodanie Adresu

  Scenario: Zalogowanie do aplikacji i dodanie adresu

    Given Loguje się do aplikacji
    When Jako zalogowany uzytkownik klikam w odnosnik Adreses
    And Wpisuje ulicje w sekcje adress
    And wpisuję kod pocztowy w sekcje zipPostal
    And Wpisuje City w s
    And Wybieram Country
    And Klikam zapisz
    Then Adres jest dodany close browser