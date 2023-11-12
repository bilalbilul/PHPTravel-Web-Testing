package locator.Chat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chat {

    public static WebDriver driver;

    public Chat(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Chat.driver = driver;
    }

    @FindBy(xpath = "//body[.='Chat now']")
    private WebElement btnChat;

    @FindBy(xpath = "//button[@class='lc-hacr1k esv0owm2']")
    private WebElement btnChatNow;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//span[@class='lc-90q5um esv0owm0']/span[.='Start the chat']")
    private WebElement btnStart;

    @FindBy(xpath = "//textarea[@class='lc-vmgsve e1m92qam0']")
    private WebElement vrfyRoomChat;

    @FindBy(xpath = "//div[@class='whatsapp wow fadeIn animated']")
    private WebElement btnWA;

    @FindBy(xpath = "//h3[@class='_9vd5 _9scb _9scr']")
    private WebElement vrfyWA;

    public boolean vrfyBtnChat() {
        return btnChat.isDisplayed();
    }

    public void setBtnChat() {
        btnChat.click();
    }

    public void setBtnChatNow() {
        btnChatNow.click();
    }

    public void setNameField(String name) {
        inputName.sendKeys(name);
    }

    public void setEmalField(String email) {
        inputEmail.sendKeys(email);
    }

    public void setBtnStart() {
        btnStart.click();
    }

    public boolean setVrfyRoomChat() {
        return vrfyRoomChat.isDisplayed();
    }

    public void setBtnWA() {
        btnWA.click();
    }

    public boolean setVrfyWA() {
        return vrfyWA.isDisplayed();
    }
}
