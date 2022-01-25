package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
//        to instantiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }
//    WebElement ssn = findElement(By.id("ssn"));
//    @FindBy(id = "ssn")
//    public WebElement ssn;

    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(id="firstname")
    public WebElement firstName;
    @FindBy(id="lastname")
    public WebElement lastName;
    @FindBy(id="address")
    public WebElement address;
    @FindBy(id = "mobilephone")
    public WebElement phoneNumber;
    @FindBy(id = "username")
    public WebElement userNAME;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(id="firstPassword")
    public WebElement password;
    @FindBy(id="secondPassword")
    public WebElement secondpassword;
    @FindBy(xpath = "//button[@ type='submit']")
    public WebElement registerButton;

    //       HOMEWORK : complete the test of the test case
    //       Enter all fields and click register
   //       Create page object in the page class
   //       Then use it in the test class
   //       DO MANUAL TESTING FIRST


}