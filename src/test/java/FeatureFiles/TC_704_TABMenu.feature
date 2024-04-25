Feature: TAB Menu functionality

  Background:
    Given User navigate to the Magento Website
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |
    And the user clicks the SignIn button
    Then user confirms that a successful SignIn process has taken place


  Scenario: the user navigates through the Tab menu sections
    And the user navigates through the TAB menu sections with one level elements:
    And the user navigates through the TAB menu sections with two level elements
    And the user navigates through the TAB menu sections with three level elements
    Then the user verifies that the last pages are opened


