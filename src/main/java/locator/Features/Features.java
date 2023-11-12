package locator.Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Features {

    public static WebDriver driver;

    public Features(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Features.driver = driver;
    }

    @FindBy(xpath = "//span[.='Features']")
    private WebElement btnFeatures;

    @FindBy(xpath = "//a[contains(.,'Flights Modules')]")
    private WebElement btnFlight;

    @FindBy(xpath = "//a[contains(.,'Hotels Modules')]")
    private WebElement btnHotel;

    @FindBy(xpath = "//a[contains(.,'Tours Modules')]")
    private WebElement btnTour;

    @FindBy(xpath = "//a[contains(.,'Cars Modules')]")
    private WebElement btnCars;

    @FindBy(xpath = "//a[contains(.,'Blogs Modules')]")
    private WebElement btnBlog;

    @FindBy(xpath = "//a[contains(.,'CMS Modules')]")
    private WebElement btnCms;

    @FindBy(xpath = "//a[contains(.,'Offers Modules')]")
    private WebElement btnOffers;

    @FindBy(xpath = "//a[contains(.,'Newsletter Modules')]")
    private WebElement btnNews;

    @FindBy(xpath = "//strong[contains(.,'Search filter and reserve flights tickets')]")
    private WebElement vrfyFlight;

    @FindBy(xpath = "//strong[contains(.,'Complete Hotels Booking Module')]")
    private WebElement vrfyHotel;

    @FindBy(xpath = "//strong[contains(.,'Dedicated tours module')]")
    private WebElement vrfyTour;

    @FindBy(xpath = "//strong[contains(.,'Cars rental & transfer')]")
    private WebElement vrfyCars;

    @FindBy(xpath = "//strong[contains(.,'The perfect Blogging Module')]")
    private WebElement vrfyBlog;

    @FindBy(xpath = "//strong[.='System']")
    private WebElement vrfyCms;

    @FindBy(xpath = "//strong[.='Complete Offers Module']")
    private WebElement vrfyOffers;

    @FindBy(xpath = "//strong[.='Optimized Newsletter System']")
    private WebElement vrfyNews;

    public void setBtnFeatures() {
        btnFeatures.click();
    }

    public void setBtnFlight() {
        btnFlight.click();
    }

    public void setBtnHotel() {
        btnHotel.click();
    }

    public void setBtnTour() {
        btnTour.click();
    }

    public void setBtnCars() {
        btnCars.click();
    }

    public void setBtnBlog() {
        btnBlog.click();
    }

    public void setBtnCms() {
        btnCms.click();
    }

    public void setBtnOffers() {
        btnOffers.click();
    }

    public void setBtnNews() {
        btnNews.click();
    }


    public boolean vrfyHotelPage() {
        return vrfyHotel.isDisplayed();
    }

    public boolean vrfyFlightPage() {
        return vrfyFlight.isDisplayed();
    }

    public boolean vrfyCarsPage() {
        return vrfyCars.isDisplayed();
    }

    public boolean vrfyTourPage() {
        return vrfyTour.isDisplayed();
    }

    public boolean vrfyBlogPage() {
        return vrfyBlog.isDisplayed();
    }

    public boolean vrfyCmsPage() {
        return vrfyCms.isDisplayed();
    }

    public boolean vrfyOfferPage() {
        return vrfyOffers.isDisplayed();
    }

    public boolean vrfyNewsPage() {
        return vrfyNews.isDisplayed();
    }

}
