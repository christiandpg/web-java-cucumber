package pages;

import elements.InventoryPageElements;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.Setup;
import utils.Utils;

public class InventoryPage extends InventoryPageElements {

    public Logger log = LoggerFactory.getLogger("integritas");

    public InventoryPage() {
        driver = Setup.getDriver();
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public void addProductToCart(int qty){
        for(int i = 0; i < qty; i++){
            btnAddToCart.get(i).click();
        }
        log.info("{} item(s) added to Cart", qty);
    }

    public void removeProductFromCart(int qty){
        for(int i = 0; i < qty; i++){
            btnRemove.get(Utils.randomNumber(btnRemove.size())).click();
        }
        log.info("{} item(s) removed from Cart", qty);
    }

    public void clickCartButton(){
        btnCart.click();
        log.info("Clicked on Cart button");
    }
}
