package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class C2_ReusableMethodsWebList {


    @Test
    public void test1 (){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage = new AmazonPage();
        List<WebElement> allWebElementDataList = amazonPage.tumDataWebelementList;

//        System.out.println(allWebElementDataList); // prints out the references

        ReusableMethods.getElementsText(amazonPage.tumDataWebelementList);
        System.out.println(ReusableMethods.getElementsText(amazonPage.tumDataWebelementList));
    }

}
