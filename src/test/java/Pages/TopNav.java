package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav extends ParentPage {
    public TopNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@class='authorization-link'] /a)[1]")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement signInEmail;

    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement signInpassword;

    @FindBy(xpath = "(//div[@class='primary']/button)[1]")
    public WebElement signInButton;
}
