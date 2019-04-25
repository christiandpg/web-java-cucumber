package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class FinishPageElements extends Utils {
    @FindBy(css = "#checkout_complete_container h2")
    protected WebElement txtConfirmationMessage;
}
