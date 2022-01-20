package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    //    Find the page object in this class
    //    creating the constructor to initialize the page element
    //    PageFactory.initElements is used to initialize this page objects

    public LoginPage(){PageFactory.initElements(Driver.getDriver(),this);}

    //    employee info
    //    login for Gaimbank.com
    //    gino.wintheiser
    //    %B6B*q1!TH

    @FindBy(id="account-menu")
    public WebElement loginDropdown;

    @FindBy(xpath = "(//*[text()='Sign in'])[1]")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

}

