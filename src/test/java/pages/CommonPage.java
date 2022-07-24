package pages;

public interface CommonPage {

    String XPATH_TEMPLATE_NAVIGATION_BAR_BUTTON = "//div[@class='nav-outer clearfix']//nav[@class='main-menu']//a[text()='%s']";
    String XPATH_TEMPLATE_LANGUAGE_BUTTON = "//li/a[@class='btn btn-default dropdown-toggle']";
    String XPATH_TEMPLATE_LANGUAGE_SELECTION = "//*[@class='dropdown-menu style-one']//*[contains(text(),'%s')]";
    String XPATH_TEMPLATE_TOP_BAR_MENU = "//ul[@class='topbar-menu']/li/a[text()='%s']";

    String XPATH_TEMPLATE_SOCIAL_MEDIA_BUTTON = "//i[@class='fa fa-%s-square']";







    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";



}
