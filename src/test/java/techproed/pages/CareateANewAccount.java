package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class CareateANewAccount {

    public CareateANewAccount()

    { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@class='btn-custom']")
    public WebElement registrationButton;
    @FindBy(id="UserName")
    public WebElement userNameCaretta;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="Email")
    public WebElement email;


    @FindBy(id="NameSurname")
    public WebElement Fullname;

   @FindBy(id="PhoneNo")
    public WebElement phoneNumber;

    @FindBy(id="SSN")
    public WebElement ssn;

    @FindBy(id="DrivingLicense")
    public WebElement driverlicense;

    @FindBy(id="IDCountry")
    public WebElement country;

    @FindBy(id="Address")
    public WebElement adress;


    @FindBy(id="WorkingSector")
    public WebElement workingsector;

    @FindBy(id="BirthDate")
    public WebElement birthday;

    @FindBy(id="btnSubmit")
    public WebElement submit;






}

