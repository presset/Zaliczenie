$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Feature/zakupSwetra.feature");
formatter.feature({
  "line": 1,
  "name": "Zakup Swetra",
  "description": "",
  "id": "zakup-swetra",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Zakup swetra w sklepie prod-kurs.coderslab.pl przez zarejestrowanego uzytkownika",
  "description": "",
  "id": "zakup-swetra;zakup-swetra-w-sklepie-prod-kurs.coderslab.pl-przez-zarejestrowanego-uzytkownika",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Loguje sie do aplikacji przez uzycie email i hasla",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Wyszukuje  Hummingbird Printed Sweater",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Wybieram rozmiar M",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Dodaje piec produktow do koszyka",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Przechodze do checkout",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Potwierdzam swoj adres",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Wybieram rodzaj przesylki",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Wybieram metode platnosci",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Zaznaczam I agree therms of service",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Klikam order with an obligation to pay",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Wyswietla sie moje zamowienie z informacja: Your order is confirmed.",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Robie screenshot z zamowieniem",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Przegladarka zostaje zamknieta",
  "keyword": "And "
});
formatter.match({
  "location": "ZakupSwetra.logujeSieDoAplikacji()"
});
formatter.result({
  "duration": 12304423886,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.wyszukujeHummingbirdPrintedSweater()"
});
formatter.result({
  "duration": 1184108830,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.wybieramRozmiarM()"
});
formatter.result({
  "duration": 1265474697,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.dodajePiecProduktowDoKoszyka()"
});
formatter.result({
  "duration": 1426580125,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.przechodzeDoCheckout()"
});
formatter.result({
  "duration": 1200182436,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.potwierdzamSwojAdres()"
});
formatter.result({
  "duration": 895384817,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.wybieramRodzajPrzesylki()"
});
formatter.result({
  "duration": 1026539087,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.wybieramMetodePlatnosci()"
});
formatter.result({
  "duration": 275967742,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.zaznaczamIAgreeThermsOfService()"
});
formatter.result({
  "duration": 281848937,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.klikamOrderWithAnObligationToPay()"
});
formatter.result({
  "duration": 855542163,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.wyswietlaSieMojeZamowienieZInformacjaYourOrderIsConfirmed()"
});
formatter.result({
  "duration": 72954,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.robieScreenshotZZamowieniem()"
});
formatter.result({
  "duration": 182881536,
  "status": "passed"
});
formatter.match({
  "location": "ZakupSwetra.przegladarkaZostajeZamknieta()"
});
formatter.result({
  "duration": 3961269103,
  "status": "passed"
});
});