package pages;

import elements.CheckoutTwoPageElements;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.Setup;

public class CheckoutTwoPage extends CheckoutTwoPageElements {

    public Logger log = LoggerFactory.getLogger("integritas");

    public CheckoutTwoPage() {
        driver = Setup.getDriver();
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public boolean compareTotalAndItemsPrice(){
        log.info("Starting comparision between item prices + tax and Total field");

        float sumItemPrices = 0;
        for(int i = 0; i < itemPrice.size(); i++){
            sumItemPrices += Float.valueOf(itemPrice.get(i).getText().replace("$", ""));
        }

        String[] tax_ = tax.getText().replace("$", "").split(" ");
        String[] total_ = total.getText().replace("$", "").split(" ");
        float itemPricesPlusTax = sumItemPrices + Float.valueOf(tax_[1]);

        return itemPricesPlusTax == Float.valueOf(total_[1]);
    }

    public void clickFinishButton(){
        btnFinish.click();
        log.info("Clicked on Finish button");
    }
}
