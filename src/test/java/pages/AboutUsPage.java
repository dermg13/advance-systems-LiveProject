package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

import java.util.List;

public class AboutUsPage {
    public AboutUsPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='author-information']/h4[contains(text(),'Kuba')]")
    public WebElement MainContentPersonName;

    @FindBy(xpath = "//div[@class='author-information']/div[@class='designation']")
    public WebElement MainContentTitle;

    @FindBy(xpath = "//h2[normalize-space()='Welcome to Advance Systems LLC.']/parent::div[@class='sec-title centered']")
    public WebElement AboutUsMainHeader;

    @FindBy(xpath = "//div[@class='nav-outer clearfix']//nav[@class='main-menu']//div//ul[@class='navigation clearfix']//li//a[@href][normalize-space()='About Us']")
    public WebElement AboutUsMainNavigationBar;

    @FindBy(xpath = "//div[@class='sec-title']/h2[text()='Meet Our Experts']")
    public WebElement MeetExpertsHeader;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']/a/h3")
    public List<WebElement> ExpertName;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//img[@src]")
    public List<WebElement> ExpertImage;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']/div[@class='designation']")
    public  List<WebElement> ExpertTitle;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']//div[@class='text']")
    public  List<WebElement> ExpertQuote;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//ul/li")
    public  List<WebElement> ExpertSocial;
    @FindBy(xpath = "/body/div[1]/section[5]/div[1]/div[2]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/ancestor::section//a[@href='https://facebook.com']")
    public  List<WebElement> FaceBook;
    @FindBy(xpath = "//ul[@class='social-icon-one']//span[@class='icon fa fa-twitter']")
    public  List<WebElement> Twitter;
    @FindBy(xpath = "//ul[@class='social-icon-one']//span[@class='icon fa fa-skype']")
    public  List<WebElement> Skype;
    @FindBy(xpath = "//ul[@class='social-icon-one']//span[@class='icon fa fa-linkedin']")
    public  List<WebElement> LinkedIn;

}

