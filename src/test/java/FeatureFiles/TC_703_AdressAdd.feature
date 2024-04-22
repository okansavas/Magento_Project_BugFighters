Feature: Add Adress functionality

  Background:
    Given User navigate to the Magento Website
    When User clicks the SignIn link
    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |
    And the user clicks the SignIn button

  Scenario Outline: Add new Address with invalid user information
    When User clicks the Address Book link
    And the user fills the Address fields on the screen
      | company   | <company>     |
      | telephone | <phonenumber> |
      | street_1  | <Street1>     |
      | street_2  | <Street2>     |
      | city      | <city>        |
      | zip       | <zipcode>     |

    And Select Region Counrty option
      | state | <value> |
    And the user clicks the Save button
    Then user confirms that a successful Save process has taken place
    Examples:
      | company | phonenumber | Street1 | Street2 | city    | zipcode | value |
      | techno  | 123456      | aaaa    | bbbbb   | hessen  | 78945   | 5     |
      | study   | 456987      | kalkan  | florida | alaska  | 78965   | 6     |
      | campus  | 123654      | ollll   | saaa    | newburg | 45698   | 7     |
