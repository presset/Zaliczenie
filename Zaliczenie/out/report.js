$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dodanieAdresu.feature");
formatter.feature({
  "line": 1,
  "name": "Dodanie Adresu",
  "description": "",
  "id": "dodanie-adresu",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Zalogowanie do aplikacji i dodanie adresu",
  "description": "",
  "id": "dodanie-adresu;zalogowanie-do-aplikacji-i-dodanie-adresu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Loguje się do aplikacji",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Jako zalogowany uzytkownik klikam w odnosnik Adreses",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Wpisuje ulicje w sekcje adress",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "wpisuję kod pocztowy w sekcje zipPostal",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Wpisuje City w s",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Wybieram Country",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Klikam zapisz",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Adres jest dodany close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DodanieAdresu.logujeSięDoAplikacji()"
});
formatter.result({
  "duration": 13392337921,
  "status": "passed"
});
formatter.match({
  "location": "DodanieAdresu.jakoZalogowanyUzytkownikKlikamWOdnosnikAdreses()"
});
formatter.result({
  "duration": 544659497,
  "status": "passed"
});
formatter.match({
  "location": "DodanieAdresu.wpisujeUlicjeWSekcjeAdress()"
});
formatter.result({
  "duration": 371273392,
  "status": "passed"
});
formatter.match({
  "location": "DodanieAdresu.wpisujęKodPocztowyWSekcjeZipPostal()"
});
formatter.result({
  "duration": 308153286,
  "status": "passed"
});
formatter.match({
  "location": "DodanieAdresu.wpisujeCityWS()"
});
formatter.result({
  "duration": 315968606,
  "status": "passed"
});
formatter.match({
  "location": "DodanieAdresu.wybieramCountry()"
});
formatter.result({
  "duration": 294640445,
  "status": "passed"
});
formatter.match({
  "location": "DodanieAdresu.klikamZapisz()"
});
formatter.result({
  "duration": 537059789,
  "status": "passed"
});
formatter.match({
  "location": "DodanieAdresu.adresJestDodanyCloseBrowser()"
});
formatter.result({
  "duration": 2813268613,
  "status": "passed"
});
});