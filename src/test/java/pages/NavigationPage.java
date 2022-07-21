package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class NavigationPage {
    public NavigationPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }
}

