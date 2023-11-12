package step_definitions.Chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Chat.Chat;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LiveChatSteps {

    private final WebDriver webDriver;

    public LiveChatSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User wants to chat admin")
    public void userWantsChat() throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.vrfyBtnChat();
        Thread.sleep(3000);
    }

    @When("User click button Live Chat")
    public void clickBtnChat() throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.setBtnChat();
        Thread.sleep(3000);
    }

    @And("User click button Chat Now")
    public void clickBtnChatNow() throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.setBtnChatNow();
        Thread.sleep(3000);
    }

    @And("User input {string} as Name and {string} as Email")
    public void userInputAsEmail(String name, String email) throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.setNameField(name);
        chat.setEmalField(email);
        Thread.sleep(3000);
    }

    @And("Click button Start Chat")
    public void clickBtnStart() throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.setBtnStart();
        Thread.sleep(3000);
    }

    @And("User ready to chat")
    public void vrfyRoomLiveChat() throws InterruptedException {
        Chat chat = new Chat(webDriver);
        Assert.assertTrue(chat.setVrfyRoomChat());
    }

}
