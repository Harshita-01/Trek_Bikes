package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TelecomPage {
    WebDriver driver;
    WebDriverWait wait;

    By fname = By.id("fname");
    By lname = By.id("lname");
    By email = By.id("email");
    By addr = By.name("addr");
    By phone = By.id("telephoneno");
    By submit = By.name("submit");

    public TelecomPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void fillCustomerForm(String first, String last, String mail, String address, String mobile) {
        driver.findElement(fname).sendKeys(first);
        driver.findElement(lname).sendKeys(last);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(addr).sendKeys(address);
        driver.findElement(phone).sendKeys(mobile);
        driver.findElement(submit).click();
    }

    public void verifyCustomerIdGenerated() {
        WebElement customerId = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@align='center'][2]/h3"))
        );
        assert customerId.isDisplayed();
    }
}
