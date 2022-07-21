package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.NavigationPage;
import utils.WebDriverManager;


public class NavigationStep implements CommonPage {
    NavigationPage navigationPage;

    public NavigationStep() {
        navigationPage = new NavigationPage();
    }

    String english = "English";
    String spanish = "Spanish";
    String french = "French";

    @Given("click on HOME Button")
    public void click_on_home_button() {
        WebDriverManager.click(navigationPage.home);
    }
    @Then("Verify Get Support buttons is displayed")
    public void verify_get_support_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.getSupport));
    }
    @Then("Verify Job Career buttons is displayed")
    public void verify_job_career_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.jobCareer));
    }
    @Then("Verify Feedback buttons is displayed")
    public void verify_feedback_buttons_is_displayed() {
        Assert.assertTrue((WebDriverManager.isDisplayed(navigationPage.feedbacks)));
    }
    @Then("Click on English button")
    public void click_on_english_button() {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LANGUAGE_BUTTON)));
    }
    @Then("Verify Language English buttons is displayed")
    public void verify_language_english_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.englishLanguage));
    }
    @Then("Verify Language Spanish buttons is displayed")
    public void verify_language_spanish_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.spanishLanguage));
    }
    @Then("Verify Language French buttons is displayed")
    public void verify_language_french_buttons_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.frenchLanguage));
    }
    @When("Click on ABOUT US button")
    public void click_on_about_us_button() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.aboutUs));
    }
    @When("Click on SERVICES button")
    public void click_on_services_button() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.service));
    }
    @When("Click on CLIENTS button")
    public void click_on_clients_button() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.clients));
    }
    @When("Click on SOLUTIONS button")
    public void click_on_solutions_button() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.solution));
    }
    @When("Click on JOIN US button")
    public void click_on_join_us_button() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.joinUs));
    }
    @When("Click on CONTACT US button")
    public void click_on_contact_us_button() {
        Assert.assertTrue(WebDriverManager.isDisplayed(navigationPage.contactUs));
    }

//    @When("click on HOME Button")
//    public void click_on_home_button() {
//        WebDriverManager.click(navigationPage.home);
//    }
//    @Then("Verify {string} buttons is displayed in Home page")
//    public void verify_buttons_is_displayed_in_home_page(String topBarMenu) {
//        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TOPBAR_BUTTON, topBarMenu))));
//    }
//
//    @When("user click on English button for language")
//    public void user_click_on_english_button_for_language() {
//        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LANGUAGE_BUTTON)));
//    }
//
//    @Then("Verify Language English buttons is displayed")
//    public void verify_language_english_buttons_is_displayed() {
//        WebDriverManager.getText(navigationPage.englishLanguage).equals(english);
//    }
//
//    @Then("Verify Language Spanish buttons is displayed")
//    public void verify_language_spanish_buttons_is_displayed() {
//        WebDriverManager.getText(navigationPage.spanishLanguage).equals(spanish);
//    }
//
//    @Then("Verify Language French buttons is displayed")
//    public void verify_language_french_buttons_is_displayed() {
//        WebDriverManager.getText(navigationPage.frenchLanguage).equals(french);
//    }
//
//    @When("Click on ABOUT US button")
//    public void click_on_about_us_button() {
//
//        WebDriverManager.click(navigationPage.aboutUs);
//    }
//
//    @Then("Verify {string} buttons is displayed in About us page")
//    public void verify_buttons_is_displayed_in_about_us_page(String topBarMenu) {
//        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TOPBAR_BUTTON, topBarMenu))));
//    }
//
//    @When("Click on SERVICES button")
//    public void click_on_services_button() {
//        WebDriverManager.click(navigationPage.service);
//    }
//
//    @Then("Verify {string} buttons is displayed in Services page")
//    public void verify_buttons_is_displayed_in_services_page(String topBarMenu) {
//        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TOPBAR_BUTTON, topBarMenu))));
//    }
//
//    @When("Click on CLIENTS button")
//    public void click_on_clients_button() {
//        WebDriverManager.click(navigationPage.clients);
//    }
//
//    @Then("Verify {string} buttons is displayed in Clients page")
//    public void verify_buttons_is_displayed_in_clients_page(String topBarMenu) {
//        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TOPBAR_BUTTON, topBarMenu))));
//    }
//
//    @When("Click on SOLUTIONS button")
//    public void click_on_solutions_button() {
//        WebDriverManager.click(navigationPage.solution);
//    }
//
//    @Then("Verify {string} buttons is displayed in Solutions page")
//    public void verify_buttons_is_displayed_in_solutions_page(String topBarMenu) {
//        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TOPBAR_BUTTON, topBarMenu))));
//    }
//
//    @When("Click on JOIN US button")
//    public void click_on_join_us_button() {
//        WebDriverManager.click(navigationPage.joinUs);
//    }
//
//    @Then("Verify {string} buttons is displayed in Join us page")
//    public void verify_buttons_is_displayed_in_join_us_page(String topBarMenu) {
//        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TOPBAR_BUTTON, topBarMenu))));
//    }
//
//    @When("Click on CONTACT US button")
//    public void click_on_contact_us_button() {
//        WebDriverManager.click(navigationPage.contactUs);
//    }
//
//    @Then("Verify {string} buttons is displayed in Contact us page")
//    public void verify_buttons_is_displayed_in_contact_us_page(String topBarMenu) {
//        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TOPBAR_BUTTON, topBarMenu))));
//    }










}
