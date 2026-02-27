package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver; // Referencja do WebDriver, który steruje przeglądarką

    // Lokatory elementów na stronie logowania
    private By usernameField = By.id("userName"); // Pole na nazwę użytkownika
    private By passwordField = By.id("password"); // Pole na hasło
    private By loginButton = By.id("login");      // Przycisk logowania
    private By logoutButton = By.id("submit");     // Przycisk wylogowania (po zalogowaniu)

    // Konstruktor klasy – przypisuje WebDriver przekazany z testu
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Metoda otwierająca stronę logowania
    public void goToLoginPage() {
        driver.get("https://demoqa.com/login");
    }

    // Metoda wykonująca logowanie przy użyciu podanych danych
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username); // Wpisanie nazwy użytkownika
        driver.findElement(passwordField).sendKeys(password); // Wpisanie hasła
        driver.findElement(loginButton).click();
    }

    // Metoda wykonująca wylogowanie
    public void logout() {
        driver.findElement(logoutButton).click();
    }
}