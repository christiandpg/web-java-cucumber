package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesUtil {

    private PropertiesUtil() {
        throw new IllegalStateException("Utility class");
    }

    private static Properties properties = new Properties();
    private static String path = StaticUtil.PATH_PROJECT + "/src/main/resources/project.properties";

    public static String getValue(String name) {
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(name);
    }
}