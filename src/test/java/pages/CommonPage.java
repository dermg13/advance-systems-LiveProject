package pages;

public interface CommonPage {

    String XPATH_TEMPLATE_NAVIGATION_BUTTON = "//div/ul//a[text()='%s']";
    String XPATH_TEMPLATE_LANGUAGE_BUTTON = "//li/a[@class='btn btn-default dropdown-toggle']";
    String XPATH_TEMPLATE_LANGUAGE_SELECTION = "//li/a[text()='%s']";
}
