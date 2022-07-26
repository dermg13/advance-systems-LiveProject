package pages;

public interface CommonPage {
    // Home Navigation Bar
    String XPATH_TEMPLATE_LANGUAGE_BUTTON = "//li/a[@class='btn btn-default dropdown-toggle']";


    String XPATH_TEMPLATE_SOCIAL_MEDIA_BUTTON = "//i[@class='fa fa-%s-square']";
    String XPATH_TEMPLATE_SOCIAL_MEDIA_FT = "//ul[@class='social-icon-six']//a[@href='https://%s.com']";

    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";



}
