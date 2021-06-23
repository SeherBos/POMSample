package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class D22_TryOut {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
    }
}
