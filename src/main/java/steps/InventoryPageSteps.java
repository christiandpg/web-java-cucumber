package steps;

import cucumber.api.java.en.And;
import pages.InventoryPage;

public class InventoryPageSteps {

    InventoryPage inventoryPage = new InventoryPage();

    @And("adds {int} items to the cart")
    public void addItemsToCart(int quantity){
        inventoryPage.addProductToCart(quantity);
    }

    @And("removes {int} item from cart")
    public void removeItemsFromCart(int quantity){
        inventoryPage.removeProductFromCart(quantity);
    }

    @And("clicks on Cart icon")
    public void goToCartPage(){
        inventoryPage.clickCartButton();
    }
}
