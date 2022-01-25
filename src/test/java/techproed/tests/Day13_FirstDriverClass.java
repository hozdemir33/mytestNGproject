package techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.sql.SQLOutput;

public class Day13_FirstDriverClass {

    @Test
    public void firstDriverTest(){
//      driver =>>>>> Driver.getDriver()
//        Driver.getDriver().get("https://www.amazon.com");
//        Driver.getDriver().navigate().to("https://www.google.com");
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("google_url"));

        System.out.println("Google Title:"+Driver.getDriver().getTitle());
        Driver.closeDriver();

    }

    @AfterMethod

    public void tearDown() {
        Driver.closeDriver();

    }
}
