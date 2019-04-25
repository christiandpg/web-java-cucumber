package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

import java.util.List;

public class CheckoutTwoPageElements extends Utils {
    @FindBy(css = ".inventory_item_price")
    protected List<WebElement> itemPrice;

    @FindBy(css = ".summary_tax_label")
    protected WebElement tax;

    @FindBy(css = ".summary_total_label")
    protected WebElement total;

    @FindBy(css = ".cart_button")
    protected WebElement btnFinish;
}
