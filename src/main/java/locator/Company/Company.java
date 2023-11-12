package locator.Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company {

    public static WebDriver driver;

    public Company(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Company.driver = driver;
    }

    @FindBy(xpath = "//span[.='Company']")
    private WebElement btnCompany;

    @FindBy(xpath = "//a[@href='https://phptravels.com/blog']")
    private WebElement btnCommpanyBlogs;

    @FindBy(xpath = "//a[contains(.,'Docs')]")
    private WebElement btnDocs;

    @FindBy(xpath = "//a[@href='https://phptravels.com/contact-us']")
    private WebElement btnContact;

    @FindBy(xpath = "//a[@href='https://phptravels.com/about-us']")
    private WebElement btnAbout;

    @FindBy(xpath = "//a[@href='https://phptravels.com/the-team']")
    private WebElement btnTeam;

    @FindBy(xpath = "//a[@href='https://phptravels.com/jobs']")
    private WebElement btnJob;

    @FindBy(xpath = "//a[contains(.,'Partners')]")
    private WebElement btnPartner;

    @FindBy(xpath = "//a[contains(.,'Media Kit')]")
    private WebElement btnMedia;

    @FindBy(xpath = "//text[@id='PHPTRAVELS']")
    private WebElement vrfyCompanyBlog;

    @FindBy(xpath = "//h1[@class='r-1xnzce8 r-crgep1 r-1nf4jbm']")
    private WebElement vrfyDocs;

    @FindBy(xpath = "//div[@class='card-header']")
    private WebElement vrfyContact;

    @FindBy(xpath = "//strong[.='PHPTRAVELS']")
    private WebElement vrfyAbout;

    @FindBy(xpath = "//h2[@class='tac my-5']")
    private WebElement vrfyTeam;

    @FindBy(xpath = "//h2[.='Checkout below available job positions at PHPTRAVELS']")
    private WebElement vrfyJob;

    @FindBy(xpath = "//h2[@class='title strong']")
    private WebElement vrfyPartner;

    @FindBy(xpath = "//h2[.='Brand Logo']")
    private WebElement vrfyMedia;

    @FindBy(xpath = "//input[@name='s']")
    private WebElement btnSearch;

    @FindBy(id = "menu-item-191")
    private WebElement btnTravel;

    @FindBy(id = "menu-item-192")
    private WebElement btnTech;

    @FindBy(id = "menu-item-193")
    private WebElement btnBusines;

    @FindBy(id = "menu-item-194")
    private WebElement btnVersion;

    @FindBy(id = "menu-item-195")
    private WebElement btnEvent;

    public void setBtnCompany() {
        btnCompany.click();
    }

    public void setBtnCommpanyBlogs() {
        btnCommpanyBlogs.click();
    }

    public void setBtnDocs() {
        btnDocs.click();
    }

    public void setBtnContact() {
        btnContact.click();
    }

    public void setBtnAbout() {
        btnAbout.click();
    }

    public void setBtnTeam() {
        btnTeam.click();
    }

    public void setBtnJob() {
        btnJob.click();
    }

    public void setBtnPartner() {
        btnPartner.click();
    }

    public void setBtnMedia() {
        btnMedia.click();
    }

    public void setBtnSearch(String search) {
        btnSearch.sendKeys(search);
    }

    public void setBtnTravel() {
        btnTravel.click();
    }

    public void setBtnTech() {
        btnTech.click();
    }

    public void setBtnBusines() {
        btnBusines.click();
    }

    public void setBtnVersion() {
        btnVersion.click();
    }

    public void setBtnEvent() {
        btnVersion.click();
    }



    public boolean vrfyCompanyPage() {
        return vrfyCompanyBlog.isDisplayed();
    }

    public boolean vrfyDocsPage() {
        return vrfyDocs.isDisplayed();
    }

    public boolean vrfyContactPage() {
        return vrfyContact.isDisplayed();
    }

    public boolean vrfyAboutPage() {
        return vrfyAbout.isDisplayed();
    }

    public boolean vrfyTeamPage() {
        return vrfyTeam.isDisplayed();
    }

    public boolean vrfyJobPage() {
        return vrfyJob.isDisplayed();
    }

    public boolean vrfyPartnerPage() {
        return vrfyPartner.isDisplayed();
    }

    public boolean vrfyMediaPage() {
        return vrfyMedia.isDisplayed();
    }

}
