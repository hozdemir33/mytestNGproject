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


    //       HOMEWORK : complete the test of the test case
    //       Enter all fields and click register
   //       Create page pbject in the page class
   //       Then use it in the test class
   //       DO MANUAL TESTING FIRST


}