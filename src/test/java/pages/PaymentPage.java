package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    WebDriver driver;

    // Locators
    By cardNumberField = By.name("card_nmuber");
    By monthDropdown   = By.name("month");
    By yearDropdown    = By.name("year");
    By cvvField        = By.name("cvv_code");
    By payButton       = By.name("submit");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to make a payment
    public void makePayment(String cardNumber, String expiry, String cvv) {
        driver.findElement(cardNumberField).sendKeys(cardNumber);

        // expiry is usually MM/YY, so split
        String[] exp = expiry.split("/");
        String month = exp[0];
        String year = exp[1];

        driver.findElement(monthDropdown).sendKeys(month);
        driver.findElement(yearDropdown).sendKeys(year);

        driver.findElement(cvvField).sendKeys(cvv);
        driver.findElement(payButton).click();
    }

    // Method to verify payment
    public void verifyPaymentSuccess() {
        boolean result = driver.getPageSource().contains("Payment successfull!");
        if (!result) {
            throw new AssertionError("Payment was not successful!");
        }
    }
}
