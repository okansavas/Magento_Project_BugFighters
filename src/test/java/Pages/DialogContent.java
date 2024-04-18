package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

 @FindBy(xpath = "(//a[text()='Create an Account']) [1]")
    public WebElement createAccount;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "email_address")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="password-confirmation")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//button[@class='action submit primary'] /span")
    public WebElement buttonCrateAccount;

    @FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
    public WebElement verifyAccount;

    @FindBy(xpath = "//p[text()='Einwilligen']")
    public List<WebElement> einwilligen;

    @FindBy(xpath = "(//li[@class='authorization-link'] /a)[1]")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement signInEmail;

    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement signInpassword;

    @FindBy(xpath = "(//div[@class='primary']/button)[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//span[contains(text(),'Welcome')]) [1]")
    public WebElement WelcomeMessage;



    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "firstName":
                return this.firstname;
            case "lastName":
                return this.lastname;
            case "email":
                return this.email;
            case "password":
                return this.password;
            case "passwordConfirm":
                return this.passwordConfirm;
            case "signInEmail":
                return this.signInEmail;
            case "signInpassword":
                return this.signInpassword;
        }
        return null;

}}
