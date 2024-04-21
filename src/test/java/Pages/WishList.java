package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WishList extends ParentPage{
    public WishList() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='fc-button fc-cta-consent fc-primary-button']//p[@class='fc-button-label']")
    public WebElement consentButton;
    @FindBy(linkText = "Women")
    private WebElement women;
    @FindBy(linkText = "Tops")
    private WebElement tops;
    @FindBy(xpath = "//div[@class='product-item-info']")
    public WebElement item;
    @FindBy(xpath = "//a[@class='product-item-link']")
    public WebElement productLink;
    @FindBy(xpath = "//a[@class='action towishlist']")
    public WebElement heart;
    @FindBy(xpath = "//div[@role='alert']/div/div")
    public WebElement message;
    @FindBy(xpath = "//form[@id='wishlist-view-form']//a[@class='product-item-link']")
    public List<WebElement> wishNameList;
    @FindBy(xpath = "//a[@data-role='remove']")
    public WebElement itemToRemove;

    public WebElement getWebElement(String element) {
        switch (element) {
            case "Women": return this.women;
            case "Tops": return this.tops;
        }
        return null;
    }

    public  void myClickWishList(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public boolean listContainsString(List<WebElement> list, String text){
        boolean found=false;
        for (WebElement e: list)
        {
            if (e.getText().toLowerCase().equals(text.toLowerCase()))
                found=true;
        }
        return found;
    }
}
