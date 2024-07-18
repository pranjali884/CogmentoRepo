package baseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static Properties prop; 
    public static WebDriver driver;
    
    public BaseClass() {
        try {
            prop = new Properties();
            String path = System.getProperty("user.dir") + "/src/main/java/configurationLayer/config.properties";
            System.out.println("Loading properties from: " + path);  // Logging the properties file path
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
            System.out.println("Properties loaded: " + prop);  // Logging the loaded properties
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found at the specified path");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException occurred while loading the properties file");
            e.printStackTrace();
        }
    }
    
    public static void initialization() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        
        String url = prop.getProperty("URL");
        if (url != null) {
            System.out.println("Navigating to URL: " + url);  // Logging the URL
            driver.get(url);
        } else {
            System.out.println("URL property is not set in the properties file");
        }
    }
}
