package techproed.tests.smoketest;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.CareateANewAccount;
import techproed.pages.CreateCustomerPage;
import techproed.pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class CarettaLoginTest {

CareateANewAccount careateANewAccount=new CareateANewAccount();


    @Test
    public void registration() throws IOException {
        Faker faker=new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("caretta_url"));

        careateANewAccount.registrationButton.click();
        careateANewAccount.userNameCaretta.sendKeys("hamdullah jersen");
        careateANewAccount.password.sendKeys("Jbjhb8@");
        careateANewAccount.email.sendKeys("iuhiub@gmail.com");
        careateANewAccount.Fullname.sendKeys("kerm");
        careateANewAccount.phoneNumber.sendKeys("7679898876");
        careateANewAccount.ssn.sendKeys("676564565");
        careateANewAccount.driverlicense.sendKeys("56545435456");
        careateANewAccount.country.sendKeys("Afganistan");
        careateANewAccount.adress.sendKeys(faker.address().streetAddress());
        careateANewAccount.workingsector.sendKeys("IT");
        careateANewAccount.birthday.sendKeys("12/26/1982");

         careateANewAccount.submit.click();
         ReusableMethods.waitFor(3);
         ReusableMethods.getScreenshot("this email address is already taken");

    }

}
