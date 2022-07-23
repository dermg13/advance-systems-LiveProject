package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.WebDriverManager;

import java.util.List;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

    String str = "Words from our Clients";

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

    @Then("Verify title of page is {string}")
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

    @Then("User is able to see {string} icon")
    public void userIsAbleToSeeIcon(String socialMediaBtn) {
        Assert.assertTrue(WebDriverManager
                .isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MEDIA_BUTTON
                        , socialMediaBtn
                ))));
    }

    @When("Click on {string}")
    public void clickOn(String socialMediaBtn) {
        WebDriverManager.getDriver()
                .findElement(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MEDIA_BUTTON
                        , socialMediaBtn))).click();
    }


    @Then("URL is {string}")
    public void urlIs(String socialMediaUrl) {
        Assert.assertEquals(socialMediaUrl, WebDriverManager.getDriver().getCurrentUrl());
    }

    @Given("Verify the header texts")
    public void verify_the_header_texts() {
        WebDriverManager.getText(homePage.clientsHeader).equals(str);

    }

    @Then("Verify the testimonials")
    public void verify_the_testimonials() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.clientsTestimonial));
    }

    @Then("Verify the name of clients")
    public void verify_the_name_of_testimonials() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.clientsName));
    }

    @Then("Verify the states")
    public void verify_the_states() {
        Assert.assertTrue((WebDriverManager.isDisplayed(homePage.clientsState)));


    }




    @Then("Verify user sees company image")
    public void verifyUserSeesCompanyImage() {
        WebElement imageFile = WebDriverManager.getDriver().findElement(By.xpath("//div[contains(@class,'active')]//*[contains(@alt,'company-image-1')]"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)WebDriverManager.getDriver()).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
        if (!ImagePresent)
        {
            System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }
    }

}