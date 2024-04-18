package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _701_Register {

    DialogContent dc=new DialogContent();
    @Given("User navigate to the Magento Website")
    public void userNavigateToTheMagentoWebsite() {
    GWD.getDriver().get("https://magento.softwaretestingboard.com/");



        if (dc.einwilligen.size()>0)
            dc.myClick(dc.einwilligen.get(0));
    }

    @When("User clicks the Create Account link")
    public void userClicksTheCreateAccountLink() {
        dc.myClick(dc.createAccount);

    }

    @And("the user fills the fields on the screen")
    public void theUserFillsTheFieldsOnTheScreen(DataTable registerFields) {
        List<List<String>> listTxtYazi = registerFields.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement = dc.getWebElement(listTxtYazi.get(i).get(0));
            dc.mySendKeys(txtBoxWebElement, listTxtYazi.get(i).get(1));
        }

    }

    @And("the user clicks the Create Account button")
    public void theUserClicksTheCreateAccountButton() {
        dc.myClick(dc.buttonCrateAccount);
    }

    @Then("user confirms that a successful registration process has taken place")
    public void userConfirmsThatASuccessfulRegistrationProcessHasTakenPlace() {
        dc.verifyContainsText(dc.verifyAccount, "Thank");

    }
}
