package StepDefinitions;

import Pages.WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _708_WishList {
    WishList wl = new WishList();
    String itemName = "";

    @When("User sees the Cookies Consent clicks to consent button")
    public void userSeesTheCookiesConsentClicksToConsentButton() {
        if(wl.consentButton.isDisplayed())
            wl.myClick(wl.consentButton);
    }

    @Given("User hovers {string} from the header menu")
    public void userHoversFromTheHeaderMenu(String menuName) {
        wl.ActionHover(wl.getWebElement(menuName));
    }

    @And("User clicks {string} from the header menu")
    public void userClicksFromTheHeaderMenu(String subMenuName) {
        wl.ActionHover(wl.getWebElement(subMenuName));
        wl.myClickWishList(wl.getWebElement(subMenuName));
    }

    @When("User hovers an item from the items")
    public void userHoversAnItemFromTheItems() {
        wl.scrollToElement(wl.item);
        wl.ActionHover(wl.item);
    }

    @And("User clicks the heart icon")
    public void userClicksTheHeartIcon() {
        itemName = itemName + wl.productLink.getText();
        wl.myClickWishList(wl.heart);
    }

    @Then("User sees the Item {string} message")
    public void userSeesTheItemMessage(String message) {
        wl.verifyContainsText(wl.message, message);
    }

    @And("User sees the product that was added to the wish list")
    public void userSeesTheProductThatWasAddedToTheWishList() {
        boolean found = wl.listContainsString(wl.wishNameList, itemName);
        Assert.assertTrue(found,"The item is not in the Wish List");
    }

    @When("User hovers the item in the wish list")
    public void userHoversTheItemInTheWishList() {
        wl.scrollToElement(wl.item);
        wl.ActionHover(wl.item);
    }

    @And("User clicks the trash icon")
    public void userClicksTheTrashIcon() {
        wl.myClickWishList(wl.itemToRemove);
    }
}
