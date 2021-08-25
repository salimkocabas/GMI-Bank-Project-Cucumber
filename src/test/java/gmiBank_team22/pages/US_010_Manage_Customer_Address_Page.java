package gmiBank_team22.pages;

import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_010_Manage_Customer_Address_Page {
    public US_010_Manage_Customer_Address_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "jh-create-entity")
    public WebElement createCustomer;

    @FindBy (id = "tp-customer-address")
    public WebElement manCusAddress;

    @FindBy (id = "tp-customer-city")
    public WebElement manCusCity;

    @FindBy (id = "tp-customer-state")
    public WebElement manCusState;

//    @FindBy (id = "tp-customer-country")
//    public WebElement manCusCountry;

    @FindBy (xpath = "//input[@id='tp-customer-address']/following-sibling::div[text()='This field is required.']")
    public WebElement notProvideAddress;

    @FindBy (xpath = "//input[@id='tp-customer-city']/following-sibling::div[text()='This field is required.']")
    public WebElement notProvideCity;
}
