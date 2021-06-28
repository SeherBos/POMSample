package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

    //Scenario Uitline in TestNG deki karsiligi budur.
    @DataProvider
    public Object[][] testData() {
        String[][] data = {
                {"Persons of interest", "9"},
                {"Sherlock", "9.5"},
                {"Breaking Bad", "10"},
                {"Lucifer", "9"},
                {"Criminal", "9.5"},
                {"Prison Break", "10"}
        };
        return data;
    }
    //datayi git buradan al. ve her data icin test case kos. Bitir devam et.
    //Scenario Uitline ==> Examples gibi
    @Test(dataProvider = "testData")
    public void test1(String dizi, String imdb){
        System.out.println("Dizi ismi " + dizi + "imdb " + imdb);
    }
}

