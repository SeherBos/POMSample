package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){
        // That is created when you don't want to be created an object from the Driver class.
        // In order to do that , constructor must be default and has to have - PRIVATE -  access modifier.
        // These kind of classes are called  SINGLETON CLASS.
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){

            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class);
                    driver = new SafariDriver();
                    break;
            }

        }

        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

        public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver=null;
        }

        }
}
