Feature: Zadanie1
  Scenario Outline: Zaloguj się i dodaj swoj adres
    Given Loguje sie "<email>" i "<password>"
    When Kiedy jestem zalogowana przechodze do strony Adreses
 And Dodaje "<adress>"
    And Dodaje "<zip>"
    And Dodaje "<city>"
    And Wybieram "<Country>"
    And Zapisuje adres
    Then Adres zostal dodany, przegladarka zostaje zamknieta.
    Examples:
      |email             | password | adress   | zip    | city | Country        |
      |presset@gmail.com | Pass123  | Polna 24 | 00-909 | NY   | United Kingdom |
