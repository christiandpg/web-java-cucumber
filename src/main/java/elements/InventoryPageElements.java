package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

import java.util.List;

public class InventoryPageElements extends Utils {
    @FindBy(css = ".inventory_item .pricebar button")
    protected List<WebElement> btnAddToCart;

    @FindBy(css = ".btn_secondary.btn_inventory")
    protected List<WebElement> btnRemove;

    @FindBy(css = "#shopping_cart_container")
    protected WebElement btnCart;
}
