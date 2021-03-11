package helpers;

import javax.xml.bind.PropertyException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class ProjectHelpers {

    public static Properties properties;

    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }

    private static Properties loadProperties() {
        if (properties == null) {

            try (InputStream input = new FileInputStream(getProjectPath() + "\\src\\main\\resources\\application.properties")) {
                properties = new Properties();
                properties.load(input);

            } catch (IOException io) {
                io.printStackTrace();

            }

        }
        return properties;
    }

    public static String getProperty(String property) {
        loadProperties();
        return properties.getProperty(property);
    }
}