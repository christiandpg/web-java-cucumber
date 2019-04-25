package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.CheckoutTwoPage;

public class CheckoutTwoPageSteps {

    CheckoutTwoPage checkoutTwoPage = new CheckoutTwoPage();

    @Then("the total price is displayed properly")
    public void compareTotalValue(){
        Assert.assertTrue(checkoutTwoPage.compareTotalAndItemsPrice());
    }

    @When("finishes the Purchase")
    public void clickOnFinishButton(){
        checkoutTwoPage.clickFinishButton();
    }
}
