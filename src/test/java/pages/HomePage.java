package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy( xpath = "//div/h2[contains(text(),'Words from our Clients')]")
    public WebElement clientsHeader;

    @FindBy(xpath = "//div[@class='owl-item active']/div/div/div[@class='text']")
    public WebElement clientsTestimonial;

    @FindBy(xpath = "//div[@class='owl-item active']/div[@class='thumb-item']/div/h3")
    public WebElement clientsName;

    @FindBy(xpath = "//div[@class='owl-item active']/div[@class='thumb-item']/div/div")
    public WebElement clientsState;

    @FindBy(xpath = "(//h2[@class='white-heading'])[1]")
    public WebElement ParallaxSectionHeaderOne;

    @FindBy(xpath = "(//div[@class='tp-mask-wrap']//div[@class='text'])[1]")
    public WebElement ParallaxSectionDescriptionOneTxt;



    @FindAll(@FindBy(xpath = "//div[contains(@class,'active')]//*[contains(@alt,'company-image-')]"))
    public WebElement footerCompanies;


    @FindBy(xpath = "//div[@class='inner-box']//br/parent::h3")
    public WebElement employeeRelations;

    @FindBy(xpath = "//div[@class='flex-box']/div/div/div[contains(@class, 'text')]")
    public List<WebElement> description;


    @FindBy(xpath = "//ul[@class='list-info']//li")
    public WebElement contact;

    @FindBy(xpath = "//div[text()='Copyright © 2022 Advance Systems LLC. All Rights Reserved.']")
    public WebElement  BottomOfThePage;

    @FindBy(xpath = "//div//span[@class='icon fa fa-arrow-up']")
    public WebElement GoToTopButton;

    @FindBy(xpath = "//div/ul/li[text()='Stay Connected:']")
    public WebElement TopPage;


}

