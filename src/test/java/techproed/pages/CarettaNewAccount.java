package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class CarettaNewAccount {

    public CarettaNewAccount(){ PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(xpath = "//*[@id=\"add-form\"]/div[4]/a/span")
    public WebElement createNewAccount;




}

