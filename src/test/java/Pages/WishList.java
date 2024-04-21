package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList extends ParentPage{
    public WishList() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Women")
    private WebElement women;
    @FindBy(linkText = "Tops")
    private WebElement tops;
    @FindBy(xpath = "//div[@class='product-item-info']")
    public WebElement item;
    @FindBy(css = "[a.product-item-link]")
    public WebElement productLink;
    @FindBy(xpath = "//div[@class='product-item-info']")
    public WebElement heart;
    @FindBy(xpath = "//div[@role='alert']/div/div")
    public WebElement message;
    @FindBy(linkText = "My Account")
    private WebElement myAccount;
    @FindBy(linkText = "My Wish List")
    private WebElement myWishList;

    public WebElement getWebElement(String element) {
        switch (element) {
            case "Women": return this.women;
            case "Tops": return this.tops;
            case "My Account": return this.myAccount;
            case "My Wish List": return this.myWishList;
        }
        return null;
    }
}
