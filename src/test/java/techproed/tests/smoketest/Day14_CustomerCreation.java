package techproed.tests.smoketest;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import techproed.pages.CreateCustomerPage;
import techproed.pages.EmployeeDefaultPageHomePage;
import techproed.pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Day14_CustomerCreation {

    LoginPage loginPage = new LoginPage();

    EmployeeDefaultPageHomePage employeeDefaultPage = new EmployeeDefaultPageHomePage();

    CreateCustomerPage createCustomerPage=new CreateCustomerPage();

    @Test
    public void createCustomerAsEmployee() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
//        calling the loginApplication method to log in
        loginPage.loginApplication("gino.wintheiser","%B6B*q1!TH");
        Thread.sleep(5000);
        employeeDefaultPage.myOperationsDropdown.click();
        employeeDefaultPage.manageCustomers.click();

        createCustomerPage.createANewCustomer.click();
        createCustomerPage.firstname.sendKeys("Testfirst");
        createCustomerPage.lastname.sendKeys("Testlast");
        createCustomerPage.middleInitial.sendKeys("T");
        createCustomerPage.email.sendKeys("test@gmail.com");
        createCustomerPage.mobilePhoneNumber.sendKeys("111-111-1111");
        createCustomerPage.phoneNumber.sendKeys("111-111-1111");
        createCustomerPage.zipCode.sendKeys("11111");
        createCustomerPage.address.sendKeys("Test Address 123");
        createCustomerPage.city.sendKeys("TestCity");
        createCustomerPage.ssn2.sendKeys("111-11-1111");

        //        SELECTING ELEMENT FROM DROPDOWN USING SELECT OBJECT
        //        WebElement countryDropdown = Driver.getDriver().findElement(By.id("tp-customer-country"));
        //       Select select = new Select(countryDropdown);
        //       select.selectByVisibleText("USA");

        Select country = new Select(createCustomerPage.countryDropdown);
        country.selectByVisibleText("USA");
        createCustomerPage.state.sendKeys("Texas");

        Select user = new Select(createCustomerPage.userDrop);
        user.selectByIndex(2);
        Select account = new Select(createCustomerPage.accountDropdown);
        account.selectByIndex(3);

        createCustomerPage.zelleEnrolledCheckbox.click();
        createCustomerPage.saveButton.click();

    }
}
