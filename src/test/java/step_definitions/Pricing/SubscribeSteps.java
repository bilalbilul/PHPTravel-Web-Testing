package step_definitions.Pricing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Pricing.Pricing;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class SubscribeSteps {

    private final WebDriver webDriver;

    public SubscribeSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User click button pricing")
    public void userClickPricing() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        pricing.setBtnPricing();
        Thread.sleep(3000);
    }

    @And("User already on pricing page")
    public void userVrfyPricingPage() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        Assert.assertTrue(pricing.titlePricing());
        pricing.titlePricing();
    }

    @When("User choose button subscribe")
    public void clickButtonSubscribe() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        pricing.setBtnSubscribe();
        Thread.sleep(3000);
    }

    @And("User input {string} as First Name and {string} as Last Name and {string} as Email")
    public void userInputAsEmailAsPasswordAndAsRole(String firstname, String lastname, String email) throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        pricing.setFirstNameField(firstname);
        pricing.setLastNameField(lastname);
        pricing.setEmail(email);
        Thread.sleep(3000);
    }

    @And("User choose button pay with Credit")
    public void clickButtonPayCredit() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        pricing.setBtnPayCredit();
        Thread.sleep(3000);
    }

    @And("User choose button pay with Paypal")
    public void clickButtonPaypal() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        pricing.setBtnPaypal();
        Thread.sleep(3000);
    }

    @And("User choose button pay with Bank Wire Transfer")
    public void clickButtonPayTransfer() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        pricing.setBtnPayTransfer();
        Thread.sleep(3000);
    }

    @And("User go to payment page")
    public void paymentPage() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        Assert.assertTrue(pricing.paymentPage());
        pricing.paymentPage();
        Thread.sleep(1000);
    }

    @And("User procces to paypal page")
    public void verifPaypalPage() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        Assert.assertTrue(pricing.paypalPage());
        pricing.paypalPage();
        Thread.sleep(1000);
    }

    @And("Show Bank Transfer Account")
    public void bankAccount() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        Assert.assertTrue(pricing.transferAccount());
        pricing.transferAccount();
        Thread.sleep(1000);
    }

    @And("Show pop up message")
    public void failedMessage() throws InterruptedException {
        Pricing pricing = new Pricing(webDriver);
        Assert.assertTrue(pricing.failedPopup());
        pricing.failedPopup();
        Thread.sleep(1000);
    }
}
