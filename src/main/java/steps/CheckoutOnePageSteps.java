package steps;

import cucumber.api.java.en.And;
import pages.CheckoutOnePage;

public class CheckoutOnePageSteps {

    CheckoutOnePage checkoutOnePage = new CheckoutOnePage();

    @And("clicks on Continue button after enter all user information requested")
    public void fillDataGoNextPage(){
        checkoutOnePage.fillUserData();
        checkoutOnePage.goToCheckoutStepTwo();
    }
}
