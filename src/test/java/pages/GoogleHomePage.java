package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[text()='Aceptar todo']")
    public WebElement cookies;

    @FindBy(name = "q")
    public WebElement googleSearchBox;

    @FindBy(xpath = "//*[@id='recaptcha-anchor']")
    public WebElement captcha;
}
