package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class NavigationPage {
    public NavigationPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy( linkText = "HOME")
    public WebElement home;

    @FindBy( linkText = "ABOUT US")
    public WebElement aboutUs;

    @FindBy( linkText = "SERVICES")
    public WebElement service;

    @FindBy( linkText = "CLIENTS")
    public WebElement clients;

    @FindBy( linkText = "SOLUTIONS")
    public WebElement solution;

    @FindBy( linkText = "JOIN US")
    public WebElement joinUs;

    @FindBy(linkText = "CONTACT US")
    public WebElement contactUs;

    @FindBy (xpath = "//*[@class='dropdown-menu style-one']//*[contains(text(),'English')]")
    public WebElement englishLanguage;
    @FindBy (xpath = "//*[@class='dropdown-menu style-one']//*[contains(text(),'Spanish')]")
    public WebElement spanishLanguage;
    @FindBy (xpath = "//*[@class='dropdown-menu style-one']//*[contains(text(),'French')]")
    public WebElement frenchLanguage;


}

