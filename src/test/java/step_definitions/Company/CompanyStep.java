package step_definitions.Company;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Company.Company;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

import java.util.Set;

public class CompanyStep {

    private final WebDriver webDriver;

    public CompanyStep(){super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User click button Company")
    public void userClickCompany() throws InterruptedException {
        Company company = new Company(webDriver);
        company.setBtnCompany();
        Thread.sleep(3000);
    }
    @When("User Choose Company Blog")
    public void userChooseCompBlog() throws InterruptedException {
        String mainTabHandle = webDriver.getWindowHandle();
        Company company = new Company(webDriver);
        company.setBtnCommpanyBlogs();
        Thread.sleep(3000);
        Set<String> allHandles = webDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainTabHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
    }

    @When("User Choose Company Docs")
    public void userChooseDocs() throws InterruptedException {
        String mainTabHandle = webDriver.getWindowHandle();
        Company company = new Company(webDriver);
        company.setBtnDocs();
        Thread.sleep(3000);
        Set<String> allHandles = webDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainTabHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
    }
    @When("User Choose Company Contact")
    public void userChooseContact() throws InterruptedException {
        Company company = new Company(webDriver);
        company.setBtnContact();
        Thread.sleep(3000);
    }

    @When("User Choose Company Info")
    public void userChooseAbout() throws InterruptedException {
        Company company = new Company(webDriver);
        company.setBtnAbout();
        Thread.sleep(3000);
    }

    @When("User Choose Company Team")
    public void userChooseTeam() throws InterruptedException {
        Company company = new Company(webDriver);
        company.setBtnTeam();
        Thread.sleep(3000);
    }

    @When("User Choose Company Jobs")
    public void userChooseJob() throws InterruptedException {
        Company company = new Company(webDriver);
        company.setBtnJob();
        Thread.sleep(3000);
    }
    @When("User Choose Company Partners")
    public void userChoosePartner() throws InterruptedException {
        Company company = new Company(webDriver);
        company.setBtnPartner();
        Thread.sleep(3000);
    }

    @When("User Choose Media Kit")
    public void userChooseMedia() throws InterruptedException {
        Company company = new Company(webDriver);
        company.setBtnMedia();
        Thread.sleep(3000);
    }

    @And("User already on Company Blogs Page")
    public void CompBlogPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyCompanyPage());
        company.vrfyCompanyPage();
    }

    @And("User already on Company Docs Page")
    public void docsPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyDocsPage());
        company.vrfyDocsPage();
    }

    @And("User already on Contact Info Page")
    public void contactPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyContactPage());
        company.vrfyContactPage();
    }

    @And("User already on Company Info Page")
    public void aboutPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyAboutPage());
        company.vrfyAboutPage();
    }

    @And("User already on Company Team Page")
    public void teamPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyTeamPage());
        company.vrfyTeamPage();
    }

    @And("User already on Jobs Page")
    public void jobPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyJobPage());
        company.vrfyJobPage();
    }

    @And("User already on Company Partners Page")
    public void partnerPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyPartnerPage());
        company.vrfyPartnerPage();
    }

    @And("User already on Company Media Page")
    public void mediaPage() throws InterruptedException {
        Company company = new Company(webDriver);
        Assert.assertTrue(company.vrfyMediaPage());
        company.vrfyMediaPage();
    }

}
