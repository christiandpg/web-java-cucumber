package pages;

import elements.FinishPageElements;
import org.openqa.selenium.support.PageFactory;
import setup.Setup;
import utils.PropertiesUtil;

public class FinishPage extends FinishPageElements {

    public FinishPage() {
        driver = Setup.getDriver();
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public boolean checkConfirmationMessage(){
        return txtConfirmationMessage.getText().equals(PropertiesUtil.getValue("txtPurchaseMessage"));
    }
}
