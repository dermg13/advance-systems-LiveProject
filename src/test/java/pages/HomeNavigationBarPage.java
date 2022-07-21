package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomeNavigationBarPage {
    public HomeNavigationBarPage(){
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

    @FindBy(xpath = "//a[contains(text(),'Get Support')]")
    public WebElement getSupport;
    @FindBy(xpath = "//a[contains(text(),'Job Career')]")
    public WebElement jobCareer;
    @FindBy(xpath = "//a[contains(text(),'Feedbacks')]")
    public WebElement feedbacks;

    @FindBy (xpath = "//*[@class='dropdown-menu style-one']//*[contains(text(),'English')]")
    public WebElement englishLanguage;
    @FindBy (xpath = "//*[@class='dropdown-menu style-one']//*[contains(text(),'Spanish')]")
    public WebElement spanishLanguage;
    @FindBy (xpath = "//*[@class='dropdown-menu style-one']//*[contains(text(),'French')]")
    public WebElement frenchLanguage;


}
