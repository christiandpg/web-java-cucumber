package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class HomePageSteps {

    HomePage home = new HomePage();

    @Given("the user is at SauceDemo home page")
    public void verifyURL(){
        Assert.assertTrue(home.verifyHomePage());
    }

    @When("(.*) credentials are entered")
    public void enterValidCredential(String strCredentials){
        if(strCredentials.equals("valid"))
            home.enterValidCredentials();
        else
            home.enterInvalidCredentials();
    }

    @And("clicks on Login button")
    public void clickLoginButton(){
        home.pressLoginButton();
    }

    @Then("the user is not logged in and an informative message is displayed")
    public void checkErrorMessage(){
        Assert.assertTrue(home.checkErrorMessageAfterLogin(), "ERROR! Expected message not displayed");
    }
}
