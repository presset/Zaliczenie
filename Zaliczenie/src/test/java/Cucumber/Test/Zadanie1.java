package Cucumber.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Zadanie1 {
    private WebDriver driver;
    public String keyword;

    @Given("^Loguje sie \"([^\"]*)\" i \"([^\"]*)\"$")
    public void logujeSieI(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a/i")).click();
        WebElement mail = driver.findElement(By.name("email"));
        mail.click();
        mail.clear();
        mail.sendKeys(arg0);
        WebElement haslo = driver.findElement(By.name("password"));
        haslo.click();
        haslo.clear();
        haslo.sendKeys(arg1);
        driver.findElement(By.id("submit-login")).click();
        }

    @When("^Kiedy jestem zalogowana przechodze do strony Adreses$")
    public void kiedyJestemZalogowanaPrzechodzeDoStronyAdreses() {
        WebElement dodajAdres = driver.findElement(By.id("address-link"));
        dodajAdres.click();
    }

    @And("^Dodaje \"([^\"]*)\"$")
    public void dodaje(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement adres = driver.findElement(By.name("address1"));
        adres.click();
        adres.clear();
        adres.sendKeys(arg0);
    }
    @And("^Dodaje <zip>$")
    public void dodajeZip(String zip) {
            WebElement kod = driver.findElement(By.name("postcode"));
            kod.click();
            kod.clear();
            kod.sendKeys(zip);
    }

    @And("^Dodaje <city>$")
    public void dodajeCity(String city) {
            WebElement miasto = driver.findElement(By.name("city"));
            miasto.click();
            miasto.clear();
            miasto.sendKeys(city);
                }

    @And("^Wybieram \"([^\"]*)\"$")
    public void wybieram(String Country) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     new Select(driver.findElement(By.name("id_country"))).selectByVisibleText(Country);
    }

    @And("^Zapisuje adres$")
    public void zapisujeAdres() {
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    @Then("^Adres zostal dodany, przegladarka zostaje zamknieta\\.$")
    public void adresZostalDodanyPrzegladarkaZostajeZamknieta() {
        driver.quit();
    }



}

