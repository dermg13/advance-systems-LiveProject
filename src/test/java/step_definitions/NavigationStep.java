package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.NavigationPage;
import utils.WebDriverManager;


public class NavigationStep implements CommonPage {
    NavigationPage navigationPage;

    public NavigationStep() { navigationPage = new NavigationPage(); }

    @When("click on HOME Button")
    public void click_on_home_button() {
        WebDriverManager.click(navigationPage.home);

    }

    @Then("Verify {string} buttons is displayed in Home page")
    public void verify_buttons_is_displayed_in_home_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click on English button for language")
    public void user_click_on_english_button_for_language() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify Language English buttons is displayed")
    public void verify_language_english_buttons_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify Language Spanish buttons is displayed")
    public void verify_language_spanish_buttons_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify Language French buttons is displayed")
    public void verify_language_french_buttons_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on ABOUT US button")
    public void click_on_about_us_button() {
        WebDriverManager.click(navigationPage.aboutUs);
    }

    @Then("Verify {string} buttons is displayed in About us page")
    public void verify_buttons_is_displayed_in_about_us_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on SERVICES button")
    public void click_on_services_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify {string} buttons is displayed in Services page")
    public void verify_buttons_is_displayed_in_services_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on CLIENTS button")
    public void click_on_clients_button() {
        WebDriverManager.click(navigationPage.clients);
    }

    @Then("Verify {string} buttons is displayed in Clients page")
    public void verify_buttons_is_displayed_in_clients_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on SOLUTIONS button")
    public void click_on_solutions_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify {string} buttons is displayed in Solutions page")
    public void verify_buttons_is_displayed_in_solutions_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on JOIN US button")
    public void click_on_join_us_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify {string} buttons is displayed in Join us page")
    public void verify_buttons_is_displayed_in_join_us_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on CONTACT US button")
    public void click_on_contact_us_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify {string} buttons is displayed in Contact us page")
    public void verify_buttons_is_displayed_in_contact_us_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }










}
