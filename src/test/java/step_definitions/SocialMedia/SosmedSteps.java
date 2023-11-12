package step_definitions.SocialMedia;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Demo.Demo;
import locator.SocialMedia.Sosmed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

import java.util.Set;

public class SosmedSteps {

    private final WebDriver webDriver;

    public SosmedSteps(){super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User wants to check social media account")
    public void userCheckSosmed() throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.vrfySosmedTab();
        Thread.sleep(3000);
    }
    @When("User Click Facebook button")
    public void userChooseFB() throws InterruptedException {
        String mainTabHandle = webDriver.getWindowHandle();
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.setBtnFB();
        Thread.sleep(3000);
        Set<String> allHandles = webDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainTabHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
    }

    @When("User Click Twitter button")
    public void userChooseTwitter() throws InterruptedException {
        String mainTabHandle = webDriver.getWindowHandle();
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.setBtnTwitter();
        Thread.sleep(3000);
        Set<String> allHandles = webDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainTabHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
    }
    @When("User Click Linkedin button")
    public void userChooseLinked() throws InterruptedException {
        String mainTabHandle = webDriver.getWindowHandle();
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.setBtnLinked();
        Thread.sleep(3000);
        Set<String> allHandles = webDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainTabHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
    }

    @When("User Click Youtube button")
    public void userChooseYoutube() throws InterruptedException {
        String mainTabHandle = webDriver.getWindowHandle();
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.setBtnYoutube();
        Thread.sleep(3000);
        Set<String> allHandles = webDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainTabHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
    }

    @When("User Click Instagram button")
    public void userChooseIg() throws InterruptedException {
        String mainTabHandle = webDriver.getWindowHandle();
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.setBtnIG();
        Thread.sleep(3000);
        Set<String> allHandles = webDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainTabHandle)) {
                webDriver.switchTo().window(handle);
                break;
            }
        }
    }

    @When("User wants to join subscribe for email {string}")
    public void userJoinSub(String email) throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.setFieldJoinSub(email);
        Thread.sleep(3000);
    }

    @And("User already on Facebook Page")
    public void fbPage() throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        Assert.assertTrue(sosmed.vrfyFBPage());
        sosmed.vrfyFBPage();
    }

    @And("User already on Twitter Page")
    public void twitterPage() throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        Assert.assertTrue(sosmed.vrfyTwitterPage());
        sosmed.vrfyTwitterPage();
    }

    @And("User already on Linkedin Page")
    public void linkedPage() throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        Assert.assertTrue(sosmed.vrfyLinkedPage());
        sosmed.vrfyLinkedPage();
    }

    @And("User already on Youtube Page")
    public void ytPage() throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        Assert.assertTrue(sosmed.vrfyYoutubePage());
        sosmed.vrfyYoutubePage();
    }

    @And("User already on Instagram Page")
    public void igPage() throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        Assert.assertTrue(sosmed.vrfyIgPage());
        sosmed.vrfyIgPage();
    }

    @And("User click button join subscribe")
    public void joinSub() throws InterruptedException {
        Sosmed sosmed = new Sosmed(webDriver);
        sosmed.setBtnSub();
        Thread.sleep(3000);
    }

}
