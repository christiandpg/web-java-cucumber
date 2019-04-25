package setup;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PropertiesUtil;
import utils.StaticUtil;
import utils.Utils;

import java.util.concurrent.TimeUnit;


public class Setup {
    public static WebDriver driver;
    public Logger log = LoggerFactory.getLogger("integritas");

    @Before
    public void beforeScenario(Scenario scenario) {
        log.info("Starting scenario: {}", scenario.getName());

        if (StaticUtil.OS.contains("Windows"))
            System.setProperty("webdriver.chrome.driver", StaticUtil.PATH_PROJECT + PropertiesUtil.getValue("driverWin"));
        else if (StaticUtil.OS.contains("Mac"))
            System.setProperty("webdriver.chrome.driver", StaticUtil.PATH_PROJECT + PropertiesUtil.getValue("driverMac"));
        else if (StaticUtil.OS.contains("Linux"))
            System.setProperty("webdriver.chrome.driver", StaticUtil.PATH_PROJECT + PropertiesUtil.getValue("driverLinux"));

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(PropertiesUtil.getValue("systemURL"));
        log.info("Redirected to SauceDemo home page");

        Utils.createFolderForScreenshots(scenario.getName());
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void afterScenario(Scenario scenario) {
        if(scenario.isFailed()){
            log.error("Test failed, a screenshot will be saved on {}", Utils.finalScreenshotsPath);
            Utils.takeAndSaveScreenshot();
        }
        driver.quit();
        log.info("Execution finished");
    }
}
