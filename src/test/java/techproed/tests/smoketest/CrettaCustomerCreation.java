package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.CreateCustomerPage;
import techproed.pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CrettaCustomerCreation {

    LoginPage loginPage=new LoginPage();
    CreateCustomerPage createCustomerPage=new CreateCustomerPage();

    @Test
    public void createNewCustomer(){

        Driver.getDriver().get(ConfigurationReader.getProperty("cretta_hotel"));





    }

}
