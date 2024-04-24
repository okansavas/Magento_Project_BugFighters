Feature: Search Functionality

  Background:
    Given User navigate to the Magento Website

    When User clicks the SignIn link

    And the user fills the fields on the screen
      | signInEmail    | tuba1@gmail.com |
      | signInpassword | tuba123.        |

    And the user clicks the SignIn button

    Then user confirms that a successful SignIn process has taken place

  Scenario: Confirmation of the ID of a randomly selected product with the search function.

    And User Sending the Keys in SearchFunc
      | searchInput | MJ08 |

    And Click on the Element in SearchFunc
      | searchButton |

    And Sees the Lando Gym Jacket product listed in the search results

    And Clicks on the Lando Gym Jacket product by following the Home > Men > Tops > Jackets link.

    And Confirms that the SKU number on the product page is correct
