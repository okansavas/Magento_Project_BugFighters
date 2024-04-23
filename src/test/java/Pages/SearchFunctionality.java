package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchFunctionality extends ParentPage {
    public SearchFunctionality() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='product-item-link']")
    public WebElement productItemText;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menTabMenu;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsTabMenu;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsTabMenu;

    @FindBy(xpath = "//strong[contains(@class,'product-item-name')]/a")
    public List<WebElement> productNameList;

    @FindBy(xpath = "//div[@itemprop='sku']")
    public WebElement skuText;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement searchButton;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {

            case "searchInput":
                return this.searchInput;

            case "searchButton":
                return this.searchButton;

        }

        return null;
    }


}
