package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _702_Login {
    DialogContent dc=new DialogContent();
    @When("User clicks the SignIn link")
    public void userClicksTheSignInLink() {
        dc.myClick(dc.signIn);
    }

    @And("the user clicks the SignIn button")
    public void theUserClicksTheSignInButton() {
        dc.myClick(dc.signInButton);
    }
    @Then("user confirms error message that appears on the screen.")
    public void userConfirmsErrorMessageThatAppearsOnTheScreen(DataTable message) {
        List<String> strButoonList=message.asList(String.class);
        for (int i = 0; i < strButoonList.size(); i++) {
            WebElement linkWebElemnt=dc.getWebElement(strButoonList.get(i));
            dc.verifyContainsText(linkWebElemnt,"required");

        }
    }

    @Then("user confirms that a successful SignIn process has taken place")
    public void userConfirmsThatASuccessfulSignInProcessHasTakenPlace() {
        dc.verifyContainsText(dc.WelcomeMessage,"Welcome");
    }
}
