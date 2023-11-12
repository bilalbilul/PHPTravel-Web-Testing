package step_definitions.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Product.Product;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class ProductSteps {

    private final WebDriver webDriver;

    public ProductSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User click button product")
    public void userClickProduct() throws InterruptedException {
        Product product = new Product(webDriver);
        product.setBtnProduct();
        Thread.sleep(3000);
    }

    @When("User Choose Product Integrations")
    public void userChooseIntegrations() throws InterruptedException {
        Product product = new Product(webDriver);
        product.setBtnIntegrations();
        Thread.sleep(3000);
    }

    @When("User Choose Product Costomization")
    public void userChooseCostom() throws InterruptedException {
        Product product = new Product(webDriver);
        product.setBtnCostom();
        Thread.sleep(3000);
    }

    @When("User Choose Product Technology")
    public void userChooseTechnology() throws InterruptedException {
        Product product = new Product(webDriver);
        product.setBtnTechno();
        Thread.sleep(3000);
    }

    @When("User Choose Product Requirements")
    public void userChooseRequire() throws InterruptedException {
        Product product = new Product(webDriver);
        product.setBtnRequirments();
        Thread.sleep(3000);
    }

    @And("User already on Integrations Page")
    public void integrationsPage() throws InterruptedException {
        Product product = new Product(webDriver);
        Assert.assertTrue(product.vrfyIntegrationsPage());
        product.vrfyIntegrationsPage();
    }

    @And("User already on Costomization Page")
    public void costomizationPage() throws InterruptedException {
        Product product = new Product(webDriver);
        Assert.assertTrue(product.vrfyCostomPage());
        product.vrfyCostomPage();
    }

    @And("User already on Technology Page")
    public void technologyPage() throws InterruptedException {
        Product product = new Product(webDriver);
        Assert.assertTrue(product.vrfyTechnoPage());
        product.vrfyTechnoPage();
    }

    @And("User already on Requirements Page")
    public void requirementsPage() throws InterruptedException {
        Product product = new Product(webDriver);
        Assert.assertTrue(product.vrfyRquirmentPage());
        product.vrfyRquirmentPage();
    }
}
