package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

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

}

