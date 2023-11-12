package step_definitions.Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Features.Features;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class FeaturesSteps {

    private final WebDriver webDriver;

    public FeaturesSteps(){super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User click button Features")
    public void userClickFeatures() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnFeatures();
        Thread.sleep(3000);
    }
    @When("User Choose Flight Module")
    public void userChooseFlight() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnFlight();
        Thread.sleep(3000);
    }
    @When("User Choose Hotel Module")
    public void userChooseHotel() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnHotel();
        Thread.sleep(3000);
    }
    @When("User Choose Tours Module")
    public void userChooseTours() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnTour();
        Thread.sleep(3000);
    }

    @When("User Choose Cars Module")
    public void userChooseCars() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnCars();
        Thread.sleep(3000);
    }

    @When("User Choose Blogs Module")
    public void userChooseBlog() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnBlog();
        Thread.sleep(3000);
    }
    @When("User Choose CMS Module")
    public void userChooseCMS() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnCms();
        Thread.sleep(3000);
    }
    @When("User Choose Offers Module")
    public void userChooseOffers() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnOffers();
        Thread.sleep(3000);
    }

    @When("User Choose Newsletter Module")
    public void userChooseNews() throws InterruptedException {
        Features features = new Features(webDriver);
        features.setBtnNews();
        Thread.sleep(3000);
    }

    @And("User already on Flights Module Page")
    public void flightPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyFlightPage());
        features.vrfyFlightPage();
    }

    @And("User already on Hotels Module Page")
    public void hotelPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyHotelPage());
        features.vrfyHotelPage();
    }

    @And("User already on Cars Module Page")
    public void carsPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyCarsPage());
        features.vrfyCarsPage();
    }

    @And("User already on Tours Module Page")
    public void toursPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyTourPage());
        features.vrfyTourPage();
    }

    @And("User already on CMS Module Page")
    public void cmsPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyCmsPage());
        features.vrfyCmsPage();
    }

    @And("User already on Blogs Module Page")
    public void blogPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyBlogPage());
        features.vrfyBlogPage();
    }

    @And("User already on Offers Module Page")
    public void offersPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyOfferPage());
        features.vrfyOfferPage();
    }

    @And("User already on Newsletter Module Page")
    public void newsPage() throws InterruptedException {
        Features features = new Features(webDriver);
        Assert.assertTrue(features.vrfyNewsPage());
        features.vrfyNewsPage();
    }

}
