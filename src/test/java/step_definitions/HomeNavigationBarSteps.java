package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomeNavigationBarPage;
import pages.HomePage;
import utils.WebDriverManager;


public class HomeNavigationBarSteps implements CommonPage {
    HomeNavigationBarPage homeNavigationBarPage;



    public HomeNavigationBarSteps() {
        homeNavigationBarPage = new HomeNavigationBarPage();
    }


    @When("Click on {string} Link")
    public void click_on_link(String string) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_NAVIGATION_BAR, string)));
    }
    @Then("Verify Get Support buttons is displayed")
    public void verify_get_support_buttons_is_displayed() {
        WebDriverManager.isDisplayed(homeNavigationBarPage.getSupport);
    }
    @Then("Verify Job Career buttons is displayed")
    public void verify_job_career_buttons_is_displayed() {
        WebDriverManager.isDisplayed(homeNavigationBarPage.jobCareer);
    }
    @Then("Verify Feedback buttons is displayed")
    public void verify_feedback_buttons_is_displayed() {
        WebDriverManager.isDisplayed(homeNavigationBarPage.feedBacks);
    }
    @Then("Verify Language English buttons is displayed")
    public void verify_language_english_buttons_is_displayed() {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LANGUAGE_BUTTON)));
        WebDriverManager.isDisplayed(homeNavigationBarPage.englishLanguage);
    }
    @Then("Verify Language Spanish buttons is displayed")
    public void verify_language_spanish_buttons_is_displayed() {
        WebDriverManager.isDisplayed(homeNavigationBarPage.spanishLanguage);
    }
    @Then("Verify Language French buttons is displayed")
    public void verify_language_french_buttons_is_displayed() {
        WebDriverManager.isDisplayed(homeNavigationBarPage.frenchLanguage);
    }

}
