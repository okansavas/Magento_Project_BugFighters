Feature: TAB Menu functionality

  Background:
    Given User navigate to the Magento Website
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |
    And the user clicks the SignIn button
    Then user confirms that a successful SignIn process has taken place

    Scenario: the user navigates through the TAB menu sections
      And the user navigates through the TAB menu sections:
      |men|women|gear|training|sale|
      |tops|bottoms|bags|fintess equipment|watches|
      |video download|jackets|hooodies & sweatshirts|tees|tanks|
      |pants         |shorts |bras & tanks          |empty|empty|


