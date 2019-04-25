package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class CartPageElements extends Utils {
    @FindBy(css = ".cart_footer .btn_action.checkout_button")
    protected WebElement btnCheckout;
}
