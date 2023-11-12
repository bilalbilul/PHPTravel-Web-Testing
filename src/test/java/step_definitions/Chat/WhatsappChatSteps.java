package step_definitions.Chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import locator.Chat.Chat;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class WhatsappChatSteps {

    private final WebDriver webDriver;

    public WhatsappChatSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User click button Whatsapp Chat")
    public void clickBtnWAChat() throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.setBtnWA();
        Thread.sleep(3000);
    }

    @And("User move to Whatsapp Page")
    public void vrfyWAName() throws InterruptedException {
        Chat chat = new Chat(webDriver);
        Assert.assertTrue(chat.setVrfyWA());
        chat.setVrfyWA();
    }
}
