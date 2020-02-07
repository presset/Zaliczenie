Feature: Zakup Swetra
  Scenario: Zakup swetra w sklepie prod-kurs.coderslab.pl przez zarejestrowanego uzytkownika
    Given Loguje sie do aplikacji przez uzycie email i hasla
    When Wyszukuje  Hummingbird Printed Sweater
    And Wybieram rozmiar M
    And Dodaje piec produktow do koszyka
    And Przechodze do checkout
    And Potwierdzam swoj adres
    And Wybieram rodzaj przesylki
    And Wybieram metode platnosci
    And Zaznaczam I agree therms of service
    And Klikam order with an obligation to pay

    Then Wyswietla sie moje zamowienie z informacja: Your order is confirmed.
    And Robie screenshot z zamowieniem
  And Przegladarka zostaje zamknieta
