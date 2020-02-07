package Cucumber.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class ZakupSwetra {
    private WebDriver driver;
    public String keyword;

    @Given("^Loguje sie do aplikacji przez uzycie email i hasla$")
    public void logujeSieDoAplikacji() throws Throwable{
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
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

    @When("^Wyszukuje  Hummingbird Printed Sweater$")
    public void wyszukujeHummingbirdPrintedSweater() throws Throwable {
        driver.findElement(By.name("s")).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("Hummingbird Printed Sweater");
        driver.findElement(By.xpath("//div[@id='search_widget']/form/button/i")).click();
    }


    @And("^Wybieram rozmiar M$")
    public void wybieramRozmiarM() throws Throwable {
        WebElement wybieram = driver.findElement(By.cssSelector("article.product-miniature:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
        wybieram.click();
        new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
        driver.findElement(By.id("group_1")).click();

    }

    @And("^Dodaje piec produktow do koszyka$")
    public void dodajePiecProduktowDoKoszyka() throws Throwable {
        driver.findElement(By.xpath("//form[@id='add-to-cart-or-refresh']/div[2]/div/div/div/span[3]/button/i")).click();
        driver.findElement(By.xpath("//form[@id='add-to-cart-or-refresh']/div[2]/div/div/div/span[3]/button/i")).click();
        driver.findElement(By.xpath("//form[@id='add-to-cart-or-refresh']/div[2]/div/div/div/span[3]/button/i")).click();
        driver.findElement(By.xpath("//form[@id='add-to-cart-or-refresh']/div[2]/div/div/div/span[3]/button/i")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }


    @And("^Przechodze do checkout$")
    public void przechodzeDoCheckout() throws Throwable{
        driver.get ("https://prod-kurs.coderslab.pl/index.php?controller=cart&action=show");
       driver.get ("https://prod-kurs.coderslab.pl/index.php?controller=order");
//        driver.findElement(By.xpath("\"//div[@class='cart-content-btn']/child::a")).click();
//        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();

    }

    @And("^Potwierdzam swoj adres$")
    public void potwierdzamSwojAdres()throws Throwable {
        WebElement potwierdzam = driver.findElement(By.name("confirm-addresses"));
        potwierdzam.click();
    }

    @And("^Wybieram rodzaj przesylki$")
    public void wybieramRodzajPrzesylki()throws Throwable {
        WebElement przesylka = driver.findElement(By.name("confirmDeliveryOption"));
        przesylka.click();
    }

    @And("^Wybieram metode platnosci$")
    public void wybieramMetodePlatnosci()throws Throwable {
        WebElement platnosc = driver.findElement(By.name("payment-option"));
        platnosc.click();
            }

    @And("^Zaznaczam I agree therms of service$")
    public void zaznaczamIAgreeThermsOfService() throws Throwable{
     driver.findElement(By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']")).click();
    }

    @And("^Klikam order with an obligation to pay$")
    public void klikamOrderWithAnObligationToPay() throws Throwable{
        driver.findElement(By.xpath("(//button[@type='submit'])[9]")).click();
    }

    @Then("^Wyswietla sie moje zamowienie z informacja: Your order is confirmed\\.$")
    public void wyswietlaSieMojeZamowienieZInformacjaYourOrderIsConfirmed() {
    }
    @And("^Robie screenshot z zamowieniem$")
    public void robieScreenshotZZamowieniem() throws Throwable {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("/media/ania/MobileAA/Kurs/Zaliczenie/screen/screen1.png"));
    }


    @And("^Przegladarka zostaje zamknieta$")
    public void przegladarkaZostajeZamknieta() {
        driver.quit();
    }
}
