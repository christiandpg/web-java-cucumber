package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import setup.Setup;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {
    protected static WebDriver driver;
    public static String finalScreenshotsPath;

    public Utils() {
        driver = Setup.getDriver();
    }

    public static int randomNumber(int listSize){
        Random rand = new Random();
        return rand.nextInt(listSize);
    }

    public static void createFolderForScreenshots(String scenarioName){
        String path = StaticUtil.PATH_PROJECT + StaticUtil.IMAGES_PATH + scenarioName + "/" + getDate();
        File folderForScreenshots = new File(path);
        folderForScreenshots.mkdir();
        finalScreenshotsPath = path;
    }

    public static void takeAndSaveScreenshot() {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(finalScreenshotsPath + "/failed-" + getDateHour() + ".png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-dd-MM");
        Date date = new Date();
        return formatter.format(date);
    }

    public static String getDateHour(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-dd-MM_HHmmss");
        Date date = new Date();
        return formatter.format(date);
    }
}
