$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CheckoutScenario.feature");
formatter.feature({
  "name": "Checkout",
  "description": "  Add, remove, purchase items and verify the total price",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buy items and check final price",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is at SauceDemo home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.verifyURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valid credentials are entered",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.enterValidCredential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds 3 items to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "InventoryPageSteps.addItemsToCart(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "removes 1 item from cart",
  "keyword": "And "
});
formatter.match({
  "location": "InventoryPageSteps.removeItemsFromCart(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "InventoryPageSteps.goToCartPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "CartPageSteps.clickCheckoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Continue button after enter all user information requested",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutOnePageSteps.fillDataGoNextPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the total price is displayed properly",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutTwoPageSteps.compareTotalValue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "finishes the Purchase",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutTwoPageSteps.clickOnFinishButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the confirmation message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FinishPageSteps.checkMessageAfterPurchase()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/LoginScenarios.feature");
formatter.feature({
  "name": "Login",
  "description": "  Try to login with wrong credentials and check if an error message is displayed",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Try to login with wrong user credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is at SauceDemo home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.verifyURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid credentials are entered",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.enterValidCredential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is not logged in and an informative message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.checkErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});