$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CheckoutScenario.feature");
formatter.feature({
  "name": "Checkout",
  "description": "  Add, remove and purchase items and verify the total price",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Purchase items and verify total price",
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
  "keyword": "And "
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
  "error_message": "cucumber.runtime.CucumberException: When a hook declares an argument it must be of type cucumber.api.Scenario. public void setup.Setup.afterScenario(org.testng.ITestResult)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:52)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\n\tat cucumber.runner.TestCase.run(TestCase.java:49)\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.uri("file:src/test/resources/features/LoginScenarios.feature");
formatter.feature({
  "name": "Login",
  "description": "  Try to login with wrong credentials",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Try to login with wrong username / password",
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
  "error_message": "cucumber.runtime.CucumberException: When a hook declares an argument it must be of type cucumber.api.Scenario. public void setup.Setup.afterScenario(org.testng.ITestResult)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:52)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\n\tat cucumber.runner.TestCase.run(TestCase.java:49)\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
});