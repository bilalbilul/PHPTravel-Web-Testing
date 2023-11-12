package locator.Product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {

    public static WebDriver driver;

    public Product(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Product.driver = driver;
    }

    @FindBy(xpath = "//span[.='Product']")
    private WebElement btnProduct;

    @FindBy(xpath = "//a[contains(.,'Integrations')]")
    private WebElement btnIntegrations;

    @FindBy(xpath = "//a[contains(.,'Costomization')]")
    private WebElement btnCostom;

    @FindBy(xpath = "//a[@href='https://phptravels.com/technology']")
    private WebElement btnTechno;

    @FindBy(xpath = "//a[@href='https://phptravels.com/requirements']")
    private WebElement btnRequirments;

    @FindBy(xpath = "//a[@href='https://docs.phptravels.com/modules/flights/kiwi']/img[@alt='Kiwi']")
    private WebElement vrfyIntegrations;

    @FindBy(xpath = "//h3[.='01. Create your documents of requirements']")
    private WebElement vrfyCostom;

    @FindBy(xpath = "//div[@class='row mt-5']/div[1]/div[@class='card p-4 rounded-4 mb-4']")
    private WebElement vrfyTechno;

    @FindBy(xpath = "//section[1]//div[@class='col-md-12 mb1']/div[contains(.,'Basic server requirements')]")
    private WebElement vrfyRequirment;

    public void setBtnProduct() {
        btnProduct.click();
    }

    public void setBtnIntegrations() {
        btnIntegrations.click();
    }

    public void setBtnCostom() {
        btnCostom.click();
    }

    public void setBtnTechno() {
        btnTechno.click();
    }

    public void setBtnRequirments() {
        btnRequirments.click();
    }

    public boolean vrfyIntegrationsPage() {
        return vrfyIntegrations.isDisplayed();
    }

    public boolean vrfyCostomPage() {
        return vrfyCostom.isDisplayed();
    }

    public boolean vrfyTechnoPage() {
        return vrfyTechno.isDisplayed();
    }

    public boolean vrfyRquirmentPage() {
        return vrfyRequirment.isDisplayed();
    }

}
