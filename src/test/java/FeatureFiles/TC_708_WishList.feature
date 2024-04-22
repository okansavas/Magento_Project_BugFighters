Feature: Login functionality

  Background:
    Given User navigate to the Magento Website
    When User sees the Cookies Consent clicks to consent button
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |
    And the user clicks the SignIn button
    Then user confirms that a successful SignIn process has taken place

  Scenario: Adding and Removing Items To Wish List
    Given User hovers "Women" from the header menu
    And User clicks "Tops" from the header menu
    When User hovers an item from the items
    And User clicks the heart icon
    Then User sees the Item "has been added to your Wish List" message
    And User sees the product that was added to the wish list
    When User hovers the item in the wish list
    And User clicks the trash icon
    Then User sees the Item "has been removed from your Wish List" message
