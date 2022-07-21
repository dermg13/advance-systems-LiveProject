package step_definitions;

import io.cucumber.java.en.And;
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

    @Then("Verify {string} button is displayed")
    public void verify_button_is_displayed(String btn) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format("//*[text()='%s']", btn))));
    }

    @When("user click on {string} button")
    public void user_click_on_button(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format("//*[text()='%s']", btn))).click();
    }

    @Then("Verify title of page is {string}")
    public void verifyTitleOfPageIs(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());

    }

    @Then("Verify title of Home page is {string}")
    public void verify_title_of_home_page_is(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }



}