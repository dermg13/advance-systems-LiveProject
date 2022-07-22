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
    @Then("Verify title of page is \\{string}")
    public void verifyTitleOfPageIsString() {

    }
    @Then("Verify address is {string}")
    public void verifyAddressIs(String address) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, address))));
        
    }
    @And("Verify city, state and country is {string}")
    public void verifyCityStateAndCountryIs(String city) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, city))));

    }
    @And("Verify phone number is {string}")
    public void verifyPhoneNumberIs(String number) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, number))));
    }

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String socialMediaBtn) {
        Assert.assertTrue(WebDriverManager
                .isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MADIA_BUTTON
                        , socialMediaBtn
                            ))));
    }

    @When("Click on {string}")
    public void clickOn(String socialMediaBtn) {
        WebDriverManager.getDriver()
                .findElement(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MADIA_BUTTON
                        , socialMediaBtn)));
    }
    @Then("Title for each corresponding page should contain {string}")
    public void titleForEachCorrespondingPageShouldContain(String socialMediaTitle) {
        Assert.assertTrue(WebDriverManager.getDriver()
                .getTitle()
                 .toLowerCase()
                  .contains(socialMediaTitle));
    }
}