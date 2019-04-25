package utils;

public class StaticUtil {

    private StaticUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PATH_PROJECT = System.getProperty("user.dir");
    public static final String OS = System.getProperty("os.name");
    public static final String IMAGES_PATH = PropertiesUtil.getValue("screenshotsPath");
}