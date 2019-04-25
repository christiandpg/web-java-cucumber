Feature: Checkout
  Add, remove, purchase items and verify the total price

  Scenario: Buy items and check final price
    Given the user is at SauceDemo home page
    When valid credentials are entered
    And clicks on Login button
    And adds 3 items to the cart
    And removes 1 item from cart
    And clicks on Cart icon
    And clicks on Checkout button
    And clicks on Continue button after enter all user information requested
    Then the total price is displayed properly
    When finishes the Purchase
    Then the confirmation message is displayed