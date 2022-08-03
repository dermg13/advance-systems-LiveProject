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
    @FindBy(xpath = "//span/ancestor::section//a[@href='https://facebook.com.com']")
    public  List<WebElement> FaceBook;
    @FindBy(xpath = "//span/ancestor::section//a[@href='https://twitter.com']")
    public  List<WebElement> Twitter;
    @FindBy(xpath = "//span/ancestor::section//a[@href='https://skype.com']")
    public  List<WebElement> Skype;
    @FindBy(xpath = "//span/ancestor::section//a[@href='https://linkedin.com']")
    public  List<WebElement> LinkedIn;

    @FindBy(xpath = "(//div[@class='text'])[11]")
    public WebElement FirstHeaderText;

    @FindBy(xpath = "(//div[@class='text'])[12]")
    public WebElement SecondHeaderText;

    @FindBy(xpath = "(//div[@class='text'])[13]")
    public WebElement ThirdHeaderText;

    @FindBy(xpath = "(//div[@class='text'])[11]")
    public WebElement FourthHeaderText;

    @FindBy(xpath = "//div[@class='text-center']")
    public WebElement WeAreSection;

    @FindBy(xpath = "//div[@class='text-center']//h1")
    public WebElement WeAreRecruitmentExpert;

    @FindBy(xpath = "//div[@class='text-center']//div[@class='link']")
    public WebElement OurServicesBtn;


}

