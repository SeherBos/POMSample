package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaResortPage {

    public KoalaResortPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id ="details-button")
    public WebElement advancedButton;

    @FindBy (id ="proceed-link")
    public WebElement proceedButton;

    @FindBy(linkText = "Log in")
    public WebElement login;

    @FindBy(id = "UserName")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement submit;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadiElementi;
}
