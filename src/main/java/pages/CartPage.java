package pages;

import elements.CartPageElements;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.Setup;

public class CartPage extends CartPageElements {

    public Logger log = LoggerFactory.getLogger("integritas");

    public CartPage() {
        driver = Setup.getDriver();
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public void clickOnCheckoutButton(){
        btnCheckout.click();
        log.info("Clicked on Checkout button");
    }
}
