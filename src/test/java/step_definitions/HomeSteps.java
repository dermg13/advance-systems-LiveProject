package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage{
    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

    @Then("Verify {string} buttons is displayed")
    public void verify_buttons_is_displayed(String navigationButton) {
        Assert.assertTrue((WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_NAVIGATION_BUTTON, navigationButton)))));
    }
    @When("Click on Language selection")
    public void click_on_language_selection() {
       WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LANGUAGE_BUTTON)));
    }
    @Then("Verify Language {string} buttons is displayed")
    public void verify_language_buttons_is_displayed(String languageSelection) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LANGUAGE_SELECTION, languageSelection))));
    }

}