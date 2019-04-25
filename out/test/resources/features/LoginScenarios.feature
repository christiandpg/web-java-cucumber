Feature: Login
  Try to login with wrong credentials and check if an error message is displayed

  Scenario: Try to login with wrong user credentials
    Given the user is at SauceDemo home page
    When invalid credentials are entered
    And clicks on Login button
    Then the user is not logged in and an informative message is displayed