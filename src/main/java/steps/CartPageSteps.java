package steps;

import cucumber.api.java.en.And;
import pages.CartPage;

public class CartPageSteps {

    CartPage cartPage = new CartPage();

    @And("clicks on Checkout button")
    public void clickCheckoutButton(){
        cartPage.clickOnCheckoutButton();
    }
}
