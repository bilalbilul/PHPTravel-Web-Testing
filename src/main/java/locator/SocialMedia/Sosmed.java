package locator.SocialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sosmed {

    public static WebDriver driver;

    public Sosmed(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Sosmed.driver = driver;
    }

    @FindBy(xpath = "//div[@class='mx-2']")
    private WebElement sosmedTab;

    @FindBy(xpath = "[href='https://www.facebook.com/phptravels/'] > .w-100")
    private WebElement btnFB;

    @FindBy(xpath = "[href='https://www.twitter.com/phptravels'] > .w-100")
    private WebElement btnTwitter;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/phptravels/']")
    private WebElement btnLinked;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/c/phptravelsofficial']")
    private WebElement btnYoutube;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/phptravels_/']")
    private WebElement btnIG;

    @FindBy(xpath = "//input[@id='address']")
    private WebElement fieldJoinSub;

    @FindBy(xpath = "//button[@id='subBtn']")
    private WebElement btnSub;



    @FindBy(xpath = "//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb']")
    private WebElement vrfyFB;

    @FindBy(css = "[d='M18.244 2.25h3.308l-7.227 8.26 8.502 11.24H16.17l-5.214-6.817L4.99 21.75H1.68l7.73-8.835L1.254 2.25H8.08l4.713 6.231zm-1.161 17.52h1.833L7.084 4.126H5.117z']")
    private WebElement vrfyTwitter;

    @FindBy(xpath = "//h1[1]/span[.='PHPTRAVELS']")
    private WebElement vrfyLinked;

    @FindBy(xpath = "//yt-formatted-string[.='PHPTRAVELS']")
    private WebElement vrfyYoutube;

    @FindBy(xpath = "//h2[@class='x1lliihq x1plvlek xryxfnj x1n2onr6 x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x1i0vuye x1ms8i2q xo1l8bm x5n08af x10wh9bi x1wdrske x8viiok x18hxmgj']")
    private WebElement vrfyIG;


    public boolean vrfySosmedTab() {
        return sosmedTab.isDisplayed();
    }

    public void setBtnFB() {
        btnFB.click();
    }

    public void setBtnTwitter() {
        btnTwitter.click();
    }

    public void setBtnLinked() {
        btnLinked.click();
    }

    public void setBtnYoutube() {
        btnYoutube.click();
    }

    public void setBtnIG() {
        btnIG.click();
    }

    public void setFieldJoinSub(String ngimail) {
        fieldJoinSub.sendKeys(ngimail);
    }

    public void setBtnSub() {
        btnSub.click();
    }


    public boolean vrfyFBPage() {
        return vrfyFB.isDisplayed();
    }

    public boolean vrfyTwitterPage() {
        return vrfyTwitter.isDisplayed();
    }

    public boolean vrfyLinkedPage() {
        return vrfyLinked.isDisplayed();
    }

    public boolean vrfyYoutubePage() {
        return vrfyYoutube.isDisplayed();
    }

    public boolean vrfyIgPage() {
        return vrfyIG.isDisplayed();
    }

}
