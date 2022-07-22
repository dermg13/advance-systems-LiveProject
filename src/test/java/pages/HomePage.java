package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy( xpath = "//div/h2[contains(text(),'Words from our Clients')]")
    public WebElement clientsHeader;

    @FindBy(xpath = "//div[@class='testimonial-block-one']/div[@class='inner-box']/div[@class='text']")
    public WebElement clientsWordsText;

    @FindBy(xpath = "//div[@class='thumb-content']/h3")
    public WebElement clientsName;

    @FindBy(xpath = "//div[@class='thumb-content']/div")
    public WebElement clientsState;


}

