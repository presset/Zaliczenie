package Cucumber.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DodanieAdresu {
    private WebDriver driver;
    public String keyword;
    @Given("^Loguje się do aplikacji$")
    public void logujeSięDoAplikacji() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        // Uruchom nowy egzemplarz przeglądarki Firefox
        driver = new FirefoxDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do strony
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a/i")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("presset@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Pass123");
        driver.findElement(By.id("submit-login")).click();
    }

    @When("^Jako zalogowany uzytkownik klikam w odnosnik Adreses$")
    public void jakoZalogowanyUzytkownikKlikamWOdnosnikAdreses() {
        driver.findElement(By.id("address-link")).click();


    }

    @And("^Wpisuje ulicje w sekcje adress$")
    public void wpisujeUlicjeWSekcjeAdress() {
        WebElement adres = driver.findElement(By.name("address1"));
        adres.click();
        adres.clear();
        adres.sendKeys("Polna 24");
    }


    @And("^wpisuję kod pocztowy w sekcje zipPostal$")
    public void wpisujęKodPocztowyWSekcjeZipPostal() {
        WebElement kod = driver.findElement(By.name("postcode"));
        kod.click();
        kod.clear();
        kod.sendKeys("00-909");
    }

    @And("^Wpisuje City w s$")
    public void wpisujeCityWS() {
        WebElement miasto = driver.findElement(By.name("city"));
        miasto.click();
        miasto.clear();
        miasto.sendKeys("Nowy York");

    }

    @And("^Wybieram Country$")
    public void wybieramCountry() {
        new Select(driver.findElement(By.name("id_country"))).selectByVisibleText("United Kingdom");
    }

    @And("^Klikam zapisz$")
    public void klikamZapisz() {
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }

    @Then("^Adres jest dodany close browser$")
    public void adresJestDodanyCloseBrowser() {
        driver.quit();
    }


}


