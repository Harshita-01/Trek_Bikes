package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.TelecomPage;

public class TelecomSteps {
    WebDriver driver;
    TelecomPage telecomPage;

    // Constructor to link driver from Hooks
    public TelecomSteps() {
        this.driver = Hooks.driver;   
        telecomPage = new TelecomPage(driver);
    }

    @Given("I am on the Add Customer page")
    public void i_am_on_the_add_customer_page() {
        driver.get("https://demo.guru99.com/telecom/addcustomer.php");
    }

    @When("I fill customer details {string}, {string}, {string}, {string}, {string}")
    public void i_fill_customer_details(String fname, String lname, String email, String addr, String phone) {
        telecomPage.fillCustomerForm(fname, lname, email, addr, phone);
    }

    @Then("Customer ID should be generated")
    public void customer_id_should_be_generated() {
        telecomPage.verifyCustomerIdGenerated();
    }
}
