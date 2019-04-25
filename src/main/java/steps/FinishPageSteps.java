package steps;

import cucumber.api.java.en.And;
import org.testng.Assert;
import pages.FinishPage;

public class FinishPageSteps {

    FinishPage finishPage = new FinishPage();

    @And("the confirmation message is displayed")
    public void checkMessageAfterPurchase(){
        Assert.assertTrue(finishPage.checkConfirmationMessage());
    }
}
