package pages;

import elements.CheckoutOnePageElements;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.Setup;
import utils.PropertiesUtil;

public class CheckoutOnePage extends CheckoutOnePageElements {

    public Logger log = LoggerFactory.getLogger("integritas");

    public CheckoutOnePage() {
        driver = Setup.getDriver();
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public void fillUserData(){
        firstName.sendKeys(PropertiesUtil.getValue("firstName"));
        lastName.sendKeys(PropertiesUtil.getValue("lastName"));
        zip.sendKeys(PropertiesUtil.getValue("zipCode"));
        log.info("Fields First Name, Last Name and Zip filled");
    }

    public void goToCheckoutStepTwo(){
        btnCheckout.click();
        log.info("Clicked on Checkout button");
    }
}
