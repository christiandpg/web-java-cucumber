package pages;

import elements.HomePageElements;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.Setup;
import utils.PropertiesUtil;

public class HomePage extends HomePageElements {

    public Logger log = LoggerFactory.getLogger("integritas");

    public HomePage() {
        driver = Setup.getDriver();
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public boolean verifyHomePage(){
        return driver.getCurrentUrl().equals(PropertiesUtil.getValue("systemURL"));
    }

    public void enterValidCredentials(){
        userName.sendKeys(PropertiesUtil.getValue("validUser"));
        password.sendKeys(PropertiesUtil.getValue("validPassword"));
        log.info("Username and password fields filled");
    }

    public void enterInvalidCredentials(){
        userName.sendKeys(PropertiesUtil.getValue("validUser"));
        password.sendKeys(PropertiesUtil.getValue("invalidPassword"));
        log.info("Username and password fields filled");
    }

    public void pressLoginButton(){
        btnLogin.click();
        log.info("Clicked on Login button");
    }

    public boolean checkErrorMessageAfterLogin(){
        return loginFailMessage.getText().contains(PropertiesUtil.getValue("txtWrongUserCredentials"));
    }
}
