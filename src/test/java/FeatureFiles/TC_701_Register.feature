Feature: Open a new user account

  Background:
    Given User navigate to the Magento Website


  Scenario: User registration
    When User clicks the Create Account link
    And the user fills the fields on the screen
      | firstName       | tuba           |
      | lastName        | alll             |
      | email           | tuba1@gmail.com |
      | password        | tuba123.       |
      |passwordConfirm  | tuba123.       |

    And the user clicks the Create Account button
    Then user confirms that a successful registration process has taken place