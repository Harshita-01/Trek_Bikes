package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaymentPage;

public class PaymentSteps {
    WebDriver driver;
    PaymentPage paymentPage;

    public PaymentSteps() {
        this.driver = Hooks.driver; // assign driver from Hooks
        paymentPage = new PaymentPage(driver); // use variable, not class name
    }

    @Given("I am on the payment page")
    public void i_am_on_the_payment_page() {
        driver.get("https://demo.guru99.com/payment-gateway/index.php");
    }

    @When("I purchase a product with card number {string}, expiry {string}, and cvv {string}")
    public void i_purchase_a_product(String cardNumber, String expiry, String cvv) {
        paymentPage.makePayment(cardNumber, expiry, cvv);
    }

    @Then("Payment should be successful")
    public void payment_should_be_successful() {
        paymentPage.verifyPaymentSuccess();
    }
}
