package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class HomePageElements extends Utils {
    @FindBy(css = "#user-name")
    protected WebElement userName;

    @FindBy(css = "#password")
    protected WebElement password;

    @FindBy(css = ".btn_action")
    protected WebElement btnLogin;

    @FindBy(css = ".login-box h3")
    protected WebElement loginFailMessage;
}
