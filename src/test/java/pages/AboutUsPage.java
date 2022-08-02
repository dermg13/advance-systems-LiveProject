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

    @FindBy(xpath = "//div[@class='sec-title']/h2")
    public WebElement MeetExpertsHeader;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']/a/h3")
    public List<WebElement> ExpertName;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//img[@src]")
    public List<WebElement> ExpertImage;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']/div[@class='designation']")
    public  List<WebElement> ExpertTitle;
    @FindBy(xpath = "//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']//div[@class='text']")
    public  List<WebElement> ExpertQuote;

}

