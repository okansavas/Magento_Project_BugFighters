package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @Then("user confirms that a successful SignIn process has taken place")
    public void userConfirmsThatASuccessfulSignInProcessHasTakenPlace() {
        dc.verifyContainsText(dc.WelcomeMessage,"Welcome");
    }
}
