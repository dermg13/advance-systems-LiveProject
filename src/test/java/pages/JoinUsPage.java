package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class JoinUsPage {
    public JoinUsPage(){PageFactory.initElements(WebDriverManager.getDriver(), this);
    }
    @FindBy (xpath = "//h1[text()='Join Us']")
    public WebElement pageHeader;
}
