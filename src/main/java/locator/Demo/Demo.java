package locator.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Demo {

    public static WebDriver driver;

    public Demo(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Demo.driver = driver;
    }

    @FindBy(xpath = "//ul[@class='navbar-nav col-12 col-xl-8 justify-content-center']//a[.='Demo']")
    private WebElement btnDemo;

    @FindBy(xpath = "//h1[@class='mb-0']")
    private WebElement vrfyTitleDemo;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='business_name']")
    private WebElement businessName;

    @FindBy(xpath = "//input[@class='email form-control']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='number']")
    private WebElement captchaNumber;

    @FindBy(xpath = "//button[@id='demo']")
    private WebElement btnSubmit;

    @FindBy(id = "colored")
    private WebElement vrfySuccessForm;

    @FindBy(xpath = "//div[@class='error-message']")
    private WebElement vrfyFailedForm;

    @FindBy(xpath = "//div[@id='extension-popup']")
    private WebElement extensionPopup;

    public void setBtnDemo() {
        btnDemo.click();
    }

    public boolean titleDemo() {
        return vrfyTitleDemo.isDisplayed();
    }

    public void setFirstNameField(String firstname) {
        firstNameField.sendKeys(firstname);
    }

    public void setLastNameField(String lastname) {
        lastNameField.sendKeys(lastname);
    }

    public void setBusinessName(String businessname) {
        businessName.sendKeys(businessname);
    }

    public void setEmail(String mail) {
        email.sendKeys(mail);
    }

    public int generateRandomCaptchaResult() {
        String idNumber = "numb1";
        WebElement numberElement = driver.findElement(By.id(idNumber));
        String angkaText = numberElement.getText();
        int number = Integer.parseInt(angkaText);

        String idAnotherNumber = "numb2";
        WebElement anotherNumberElement = driver.findElement(By.id(idAnotherNumber));
        String anotherNumberText = anotherNumberElement.getText();
        int anotherNumber = Integer.parseInt(anotherNumberText);
        int sumResult = number + anotherNumber;

        return sumResult;
    }

    public void setBtnSubmit() {
        btnSubmit.click();
    }

    public void setInvalidCaptcha(String invalidCaptcha) {
        captchaNumber.sendKeys(invalidCaptcha);
    }

    public void setCaptchaNumber() {
        int captchaResult = generateRandomCaptchaResult();
        captchaNumber.sendKeys(String.valueOf(captchaResult));
    }

    public boolean successForm() {
        return vrfySuccessForm.isDisplayed();
    }

    public boolean failedForm() {
        return vrfyFailedForm.isDisplayed() && verifyExtensionPopup();
    }

    private boolean verifyExtensionPopup() {
        return extensionPopup.isDisplayed();
    }

}
