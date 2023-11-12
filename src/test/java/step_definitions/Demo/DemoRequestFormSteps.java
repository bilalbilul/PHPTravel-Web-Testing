package step_definitions.Demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Demo.Demo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class DemoRequestFormSteps {

    private final WebDriver webDriver;

    public DemoRequestFormSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User click button demo")
    public void userClickDemo() throws InterruptedException {
        Demo demo = new Demo(webDriver);
        demo.setBtnDemo();
        Thread.sleep(3000);
    }

    @And("User already on demo page")
    public void userVrfyDemoPage() throws InterruptedException {
        Demo demo = new Demo(webDriver);
        Assert.assertTrue(demo.titleDemo());
        demo.titleDemo();
    }

    @When("User input {string} as First Name and {string} as Last Name and {string} as Company and {string} as Email")
    public void userInputAsEmailAsPasswordAndAsRole(String firstname, String lastname, String company, String email) throws InterruptedException {
        Demo demo = new Demo(webDriver);
        demo.setFirstNameField(firstname);
        demo.setLastNameField(lastname);
        demo.setBusinessName(company);
        demo.setEmail(email);
        Thread.sleep(3000);
    }

    @And("User input number for captcha")
    public void clickCaptcha() throws InterruptedException {
        Demo demo = new Demo(webDriver);
        demo.setCaptchaNumber();
        Thread.sleep(3000);
    }

    @And("User input invalid number for captcha {string}")
            public void invalidCaptchaNumber(String number) throws InterruptedException {
        Demo demo = new Demo(webDriver);
        demo.setInvalidCaptcha(number);
        Thread.sleep(3000);
    }

    @And("Click submit button")
    public void clickSubmitButton() throws InterruptedException {
        Demo demo = new Demo(webDriver);
        demo.setBtnSubmit();
        Thread.sleep(3000);
    }

    @And("Success send form")
    public void successSendForm() throws InterruptedException {
        Demo demo = new Demo(webDriver);
        Assert.assertTrue(demo.successForm());
        demo.successForm();
    }

    @And("Failed send form")
    public void failedSendForm() throws InterruptedException {
        Demo demo = new Demo(webDriver);
        Assert.assertTrue(demo.failedForm());
    }
}
