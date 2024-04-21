package StepDefinitions;

import Pages.WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _708_WishList {
    WishList wl = new WishList();
    String itemName = "";

    @Given("User hovers {string} from the header menu")
    public void userHoversFromTheHeaderMenu(String menuName) {
        wl.ActionHover(wl.getWebElement(menuName));
    }

    @And("User clicks {string} from the header menu")
    public void userClicksFromTheHeaderMenu(String subMenuName) {
        wl.ActionHover(wl.getWebElement(subMenuName));
        wl.myClick(wl.getWebElement(subMenuName));
    }

    @When("User hovers an item from the items")
    public void userHoversAnItemFromTheItems() {
        wl.ActionHover(wl.item);
    }

    @And("User clicks the heart icon")
    public void userClicksTheHeartIcon() {
        itemName = wl.productLink.getText();
        wl.myClick(wl.heart);
    }

    @Then("User sees the Item {string} message")
    public void userSeesTheItemMessage(String message) {
        wl.verifyContainsText(wl.message, message);
    }

    @When("User clicks {string} on the left menu")
    public void userClicksOnTheLeftMenu(String leftMenu) {
        wl.myClick(wl.getWebElement(leftMenu));
    }

    @Then("User sees the product that was added to the wish list")
    public void userSeesTheProductThatWasAddedToTheWishList() {

    }

    @When("User hovers the item in the wish list")
    public void userHoversTheItemInTheWishList() {
    }

    @And("User clicks the trash icon")
    public void userClicksTheTrashIcon() {
    }
}
