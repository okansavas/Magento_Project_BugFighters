Feature: Add Product to Basket Functionality

  Background:
    Given User navigate to the Magento Website
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |
    And the user clicks the SignIn button

  Scenario: Registered User Randomly Adds or Removes Products to The Basket

    Given Add a Randomly Selected Product to The Basket









