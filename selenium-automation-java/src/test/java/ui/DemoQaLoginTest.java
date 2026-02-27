package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class DemoQaLoginTest {

    WebDriver driver;
    LoginPage loginPage;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Konfiguracja i uruchomienie sterownika Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Inicjalizacja strony logowania
        loginPage = new LoginPage(driver);

        // Ustawienie WebDriverWait do dynamicznego czekania na elementy lub URL
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // maksymalnie 10 sekund
    }

    @Test
    public void testValidLogin() {
        // Przejście do strony logowania
        loginPage.goToLoginPage();

        // Wprowadzenie danych logowania i zalogowanie
        loginPage.login("testuser", "Test@123");

        // Czekanie, aż URL zmieni się i będzie zawierał "profile" (strona docelowa)
        wait.until(ExpectedConditions.urlContains("profile"));

        // Weryfikacja, że logowanie zakończyło się sukcesem
        assertTrue(driver.getCurrentUrl().contains("profile"));
    }

    @Test
    public void testInvalidLogin() {
        // Przejście do strony logowania
        loginPage.goToLoginPage();

        // Wprowadzenie nieprawidłowych danych logowania i próba zalogowania
        loginPage.login("invaliduser", "invalidpassword");

        // Czekanie, aż pojawi się komunikat o błędzie
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

        // Pobranie tekstu komunikatu o błędzie
        String errorText = driver.findElement(By.id("name")).getText();

        // Weryfikacja, że logowanie zakończyło się niepowodzeniem (pozostajemy na stronie logowania)
        assertTrue(errorText.contains("Invalid username or password!"));
    }

    @Test
    public void testValidAndInvalidLogin() {
        // Przejście do strony logowania
        loginPage.goToLoginPage();

        // Wprowadzenie danych logowania i zalogowanie
        loginPage.login("testuser", "Test@123");

        // Czekanie, aż URL zmieni się i będzie zawierał "profile" (strona docelowa)
        wait.until(ExpectedConditions.urlContains("profile"));

        // Weryfikacja, że logowanie zakończyło się sukcesem
        assertTrue(driver.getCurrentUrl().contains("profile"));

        // Wylogowanie
        loginPage.logout();

        // Przejście do strony logowania
        loginPage.goToLoginPage();

        // Wprowadzenie nieprawidłowych danych logowania i próba zalogowania
        loginPage.login("invaliduser", "invalidpassword");

        // Czekanie, aż pojawi się komunikat o błędzie
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

        // Pobranie tekstu komunikatu o błędzie
        String errorText = driver.findElement(By.id("name")).getText();

        // Weryfikacja, że logowanie zakończyło się niepowodzeniem (pozostajemy na stronie logowania)
        assertTrue(errorText.contains("Invalid username or password!"));
    }

    @AfterClass
    public void tearDown() {
        // Zamknięcie przeglądarki po teście
        driver.quit();
    }
}