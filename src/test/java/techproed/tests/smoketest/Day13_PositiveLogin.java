package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Day13_PositiveLogin {

    LoginPage loginPage = new LoginPage();

    @Test
    public void login(){

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));

        loginPage.loginDropdown.click();

        loginPage.signInButton.click();

        loginPage.username.sendKeys(ConfigurationReader.getProperty("employee_username"));

        loginPage.password.sendKeys(ConfigurationReader.getProperty("employee_password"));

        loginPage.loginButton.click();

    }
}
