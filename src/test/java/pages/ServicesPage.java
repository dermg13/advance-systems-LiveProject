package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class ServicesPage {
    public ServicesPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy (xpath = "//*[text()='Finance']")
    public WebElement financeBtn;

    @FindBy (xpath = "//*[text()='Information Technology']")
    public WebElement ITBtn;

    @FindBy (xpath = "//*[text()='Healthcare']")
    public WebElement healthcareBtn;

    @FindBy (xpath = "//*[text()='Government Projects']")
    public WebElement governmentProjectsBtn;

    @FindBy (xpath = "//*[text()='Others']")
    public WebElement othersBtn;
}
