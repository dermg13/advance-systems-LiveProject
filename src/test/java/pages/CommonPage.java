package pages;

public interface CommonPage {

    String XPATH_TEMPLATE_TOPBAR_BUTTON = "//div/ul//a[text()='%s']";
    String XPATH_TEMPLATE_LANGUAGE_BUTTON = "//li/a[@class='btn btn-default dropdown-toggle']";
    String XPATH_TEMPLATE_LANGUAGE_SELECTION = "//li/a[text()='%s']";





    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";


}
