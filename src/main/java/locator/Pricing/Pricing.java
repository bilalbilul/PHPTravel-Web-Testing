package locator.Pricing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pricing {

    public static WebDriver driver;

    public Pricing(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Pricing.driver = driver;
    }

    @FindBy(xpath = "//a[@href='https://phptravels.com/pricing']")
    private WebElement btnPricing;

    @FindBy(xpath = "//h1[@class='mb-0']")
    private WebElement vrfyTitlePricing;

    @FindBy(xpath = "//div[@class='pricing-package startup']//a[.='Subscribe']")
    private WebElement btnSubscribe;

    @FindBy(xpath = "//h1[.='startup $50']")
    private WebElement vrfyHarga;

    @FindBy(xpath = "//div[@id='startup']//input[@name='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//div[@id='startup']//input[@name='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@id='startup']//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@id='startup']//form[1]/button[@class='rounded-1 btn-lg btn btn-outline-dark w-100 fs-6 p-3 mb-2']")
    private WebElement btnPayCredit;

    @FindBy(xpath = "//a[@href='https://phptravels.com/paypal/50']")
    private WebElement btnPaypal;

    @FindBy(xpath = "//div[@id='startup']//div[@class='modal-body p-4']/button[@class='rounded-1 btn-lg btn btn-outline-dark w-100 fs-6 p-3 mb-2']")
    private WebElement btnPayTransfer;

    @FindBy(xpath = "//img[@alt='tazapay']")
    private WebElement vrfyPaymentPage;

    @FindBy(xpath = "//a[.='Proceed to Payment']")
    private WebElement vrfyPaypalPage;

    @FindBy(xpath = "//p[.='Account : 8312022337']")
    private WebElement vrfyTransferAccount;

    @FindBy(xpath = "//div[@class='error-message']")
    private WebElement vrfyFailedPopup;

    @FindBy(xpath = "//div[@id='extension-popup']")
    private WebElement extensionPopup;

    public void setBtnPricing() {
        btnPricing.click();
    }

    public boolean titlePricing() {
        return vrfyTitlePricing.isDisplayed();
    }

    public void setBtnSubscribe() {
        btnSubscribe.click();
    }

    public void setFirstNameField(String firstname) {
        firstName.sendKeys(firstname);
    }

    public void setLastNameField(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setBtnPayCredit() {
        btnPayCredit.click();
    }

    public void setBtnPaypal() {
        btnPaypal.click();
    }

    public void setBtnPayTransfer() {
        btnPayTransfer.click();
    }

    public boolean paymentPage() {
        return vrfyPaymentPage.isDisplayed();
    }

    public boolean paypalPage() {
        return vrfyPaypalPage.isDisplayed();
    }

    public boolean transferAccount() {
        return vrfyTransferAccount.isDisplayed();
    }

    public boolean failedPopup() {
        return vrfyFailedPopup.isDisplayed() && verifyExtensionPopup();
    }

    private boolean verifyExtensionPopup() {
        return extensionPopup.isDisplayed();
    }

}
