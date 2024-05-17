package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_705_POM extends ParentPage {

    public TC_705_POM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(@class,'top ui-corner')]")
    public List<WebElement> topMenuList;

    @FindBy(xpath = "//h1[@id='page-title-heading']/span")
    public WebElement pageTitleText;

    @FindBy(xpath = "//strong[contains(@class,'product-item-name')]/a")
    public List<WebElement> productNameList;

    @FindBy(xpath = "//div[contains(@id,'143-')]")
    public List<WebElement> productSizeList;

    @FindBy(xpath = "//div[contains(@id,'-93-')]")
    public List<WebElement> productColorList;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//strong[contains(text(),'Erin Renny')]")
    public WebElement handSelectedByErin;

    @FindBy(xpath = "(//select[@id='limiter'])[2]")
    public WebElement limiterSelect;

    @FindBy(xpath = "//a[@class='block-promo sale-main']")
    public WebElement shopWomensDeals;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement showBasket;

    @FindBy(xpath = "(//div[@class='amount price-container']//span)[2]")
    public WebElement cartSubTotal;

    @FindBy(xpath = "//span[@class='minicart-price']/span")
    public List<WebElement> productsPriceInBasket;




}
