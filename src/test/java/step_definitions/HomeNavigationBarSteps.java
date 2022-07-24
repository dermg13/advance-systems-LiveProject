package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomeNavigationBarPage;
import utils.WebDriverManager;


public class HomeNavigationBarSteps implements CommonPage {
    HomeNavigationBarPage homeNavigationBarPage;

    public HomeNavigationBarSteps() {
        homeNavigationBarPage = new HomeNavigationBarPage();
    }

    @Given("click on HOME Button")
    public void click_on_home_button() {
        WebDriverManager.click(homeNavigationBarPage.home);
    }

    @Then("Verify Get Support buttons is displayed")
    public void verify_get_support_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homeNavigationBarPage.getSupport));
    }

    @Then("Verify Job Career buttons is displayed")
    public void verify_job_career_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homeNavigationBarPage.jobCareer));
    }

    @Then("Verify Feedback buttons is displayed")
    public void verify_feedback_buttons_is_displayed() {
        Assert.assertTrue((WebDriverManager.isDisplayed(homeNavigationBarPage.feedBacks)));
    }

    @Then("Click on English button")
    public void click_on_english_button() {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LANGUAGE_BUTTON)));
    }

    @Then("Verify Language English buttons is displayed")
    public void verify_language_english_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homeNavigationBarPage.englishLanguage));
    }

    @Then("Verify Language Spanish buttons is displayed")
    public void verify_language_spanish_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homeNavigationBarPage.spanishLanguage));
    }

    @Then("Verify Language French buttons is displayed")
    public void verify_language_french_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homeNavigationBarPage.frenchLanguage));
    }

    @When("Click on ABOUT US button")
    public void click_on_about_us_button() {
        WebDriverManager.click(homeNavigationBarPage.aboutUs);
    }

    @When("Click on SERVICES button")
    public void click_on_services_button() {
        WebDriverManager.click(homeNavigationBarPage.service);
    }

    @When("Click on CLIENTS button")
    public void click_on_clients_button() {
        WebDriverManager.click(homeNavigationBarPage.clients);
    }

    @When("Click on SOLUTIONS button")
    public void click_on_solutions_button() {
        WebDriverManager.click(homeNavigationBarPage.solution);
    }

    @When("Click on JOIN US button")
    public void click_on_join_us_button() {
        WebDriverManager.click(homeNavigationBarPage.joinUs);
    }

    @When("Click on CONTACT US button")
    public void click_on_contact_us_button() {
        WebDriverManager.click(homeNavigationBarPage.contactUs);
    }
}