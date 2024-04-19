Feature: Login functionality

  Background:
    Given User navigate to the Magento Website
  Scenario Outline: Login with invalid user information
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | <element> | <data> |

    And the user clicks the SignIn button
    Then user confirms error message that appears on the screen.
      | <errorelement> |
    Examples:
      | element        | data            | errorelement      |
      | signInEmail    | tuba1@gmail.com | passerrorMessage  |
      | signInpassword | 12345           | emailerrorMessage |



  Scenario: Login with valid user information
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |
    And the user clicks the SignIn button
    Then user confirms that a successful SignIn process has taken place
