package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class CheckoutOnePageElements extends Utils {
    @FindBy(css = "#first-name")
    protected WebElement firstName;

    @FindBy(css = "#last-name")
    protected WebElement lastName;

    @FindBy(css = "#postal-code")
    protected WebElement zip;

    @FindBy(css = ".checkout_buttons .cart_button")
    protected WebElement btnCheckout;
}
