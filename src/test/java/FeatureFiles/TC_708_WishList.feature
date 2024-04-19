Feature: Login functionality

  Background:
    Given User navigate to the Magento Website
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |
    And the user clicks the SignIn button
    Then user confirms that a successful SignIn process has taken place

  Scenario: Adding and Removing Items To Wish List
    Given User clicks the "Womens Jackets" from the header menu
    When User hovers an item from the items
    And User clicks the heart icon
    Then User sees the "adding confirmation message"
    When User clicks My Account in the dropdown menu under users name
    And User clicks My Wish List on the left menu
    Then User sees the product that was added to the wish list
    When User hovers the item in the wish list
    And User clicks the trash icon
    Then User sees the "removing confirmation message"
