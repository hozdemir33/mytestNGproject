package techproed.tests.smoketest;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;
public class Day15_RegistrationTest {

    RegistrationPage registrationPage;
     Faker faker;
    @Test
    public void registrationTest(){
//        Driver.getDriver().get("https://www.gmibank.com/account/register");

//        Driver.getDriver().findElement(By.id("ssn")).sendKeys("111111111");
          Driver.getDriver().get(ConfigurationReader.getProperty("gmi_registration"));

          registrationPage=new RegistrationPage();
                    faker =new Faker();

          registrationPage.ssn.sendKeys("221-32-8767");
          registrationPage.firstName.sendKeys(faker.name().firstName());
          registrationPage.lastName.sendKeys(faker.name().lastName());
          registrationPage.address.sendKeys(faker.address().streetAddress());
          registrationPage.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
          registrationPage.userNAME.sendKeys("hamdo2@");
          registrationPage.email.sendKeys("madni@gmai.com");
          registrationPage.password.sendKeys("Mrhyhy2@");
          registrationPage.secondpassword.sendKeys("Mrhyhy2@");
          registrationPage.registerButton.click();

        //        HOMEWORK : complete the test of the test case
        //        Enter all fields and click register
        //        Create page objects in the page class
        //        Then use it in the test class
        //        DO MANUAL TESTING FIRST



    }

    @AfterMethod

    public void tearDown() {
        Driver.closeDriver();

    }

}