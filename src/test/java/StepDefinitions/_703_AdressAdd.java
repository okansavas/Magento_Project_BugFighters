package StepDefinitions;

import Pages.TC_703_AdressAddPOM;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _703_AdressAdd {
    TC_703_AdressAddPOM tc3=new TC_703_AdressAddPOM();

    @When("User clicks the Address Book link")
    public void userClicksTheAddressBookLink() {
        tc3.myClick(tc3.actionsMenu);
        tc3.myClick(tc3.myAccountBtn);
        tc3.myClick(tc3.adressBook);
        tc3.myClick(tc3.addNewAdressBtn);
    }

    @And("Select Region Counrty option")
    public void selectRegionCounrtyOption(DataTable selectoptions) {
        List<List<String>> listTxtYazi =selectoptions.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement = tc3.getWebElement(listTxtYazi.get(i).get(0));
            tc3.SelectMenuValue(txtBoxWebElement,listTxtYazi.get(i).get(1));
    }}

    @And("the user clicks the Save button")
    public void theUserClicksTheSaveButton() {
        tc3.myClick(tc3.saveAdressBtn);
    }

    @Then("user confirms that a successful Save process has taken place")
    public void userConfirmsThatASuccessfulSaveProcessHasTakenPlace() {
        tc3.verifyContainsText(tc3.verification,"You saved the address.");
    }

    @And("the user fills the Address fields on the screen")
    public void theUserFillsTheAddressFieldsOnTheScreen(DataTable addressFields) {
        List<List<String>> listTxtYazi = addressFields.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement = tc3.getWebElement(listTxtYazi.get(i).get(0));
            tc3.mySendKeys(txtBoxWebElement, listTxtYazi.get(i).get(1));
        }
    }
}
