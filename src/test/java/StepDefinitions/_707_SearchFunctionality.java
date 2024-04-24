package StepDefinitions;

import Pages.SearchFunctionality;
import Pages.TopNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _707_SearchFunctionality {
    SearchFunctionality sf = new SearchFunctionality();


    @And("User Sending the Keys in SearchFunc")
    public void userSendingTheKeysInSearchFunc(DataTable textBoxAndWritings) {
        List<List<String>> listTextPost = textBoxAndWritings.asLists(String.class);

        for (int i = 0; i < listTextPost.size(); i++) {
            WebElement textBoxWebElement = sf.getWebElement(listTextPost.get(i).get(0));
            sf.mySendKeys(textBoxWebElement, listTextPost.get(i).get(1));
        }
    }

    @And("Click on the Element in SearchFunc")
    public void clickOnTheElementInSearchFunc(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = sf.getWebElement(strLinkList.get(i));
            sf.myClick(linkWebElement);
        }
    }

    @And("Sees the Lando Gym Jacket product listed in the search results")
    public void seesTheLandoGymJacketProductListedInTheSearchResults() {
        sf.verifyContainsText(sf.productItemText, "Lando Gym Jacket");
    }


    @And("Clicks on the Lando Gym Jacket product by following the Home > Men > Tops > Jackets link.")
    public void clicksOnTheLandoGymJacketProductByFollowingTheHomeMenTopsJacketsLink() {
        sf.ActionHover(sf.menTabMenu);
        sf.ActionHover(sf.topsTabMenu);
        sf.myClick(sf.jacketsTabMenu);

    }

    @And("Confirms that the SKU number on the product page is correct")
    public void confirmsThatTheSKUNumberOnTheProductPageIsCorrect() {

        for (int i = 0; i < sf.productNameList.size(); i++) {

            if (sf.productNameList.get(i).getText().contains("Lando Gym Jacket")) {
                sf.myClick(sf.productNameList.get(i));
            }
        }

        sf.verifyContainsText(sf.skuText, "MJ08");
    }


}
