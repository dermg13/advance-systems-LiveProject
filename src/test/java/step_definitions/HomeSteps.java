package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import pages.CommonPage;
import pages.HomePage;
import utils.SeleniumUtils;
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

    @Then("Title for each corresponding page should contain {string}")
    public void titleForEachCorrespondingPageShouldContain(String socialMediaTitle) {
        Assert.assertTrue(WebDriverManager.getDriver()
                .getTitle()
                .toLowerCase()
                .contains(socialMediaTitle));
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

    @When("Information is displayed in the parallax section")
    public void information_is_displayed_in_the_parallax_section() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.ParallaxSectionHeaderOne));
    }

    @Then("Header and description update automatically")
    public void header_and_description_update_automatically() {
        SeleniumUtils.waitForElementVisibility(homePage.ParallaxSectionHeaderOne);
        String descriptionTxtOne = homePage.ParallaxSectionDescriptionOneTxt.getText();
        if (descriptionTxtOne.equals(homePage.ParallaxSectionDescriptionOneTxt.getText()) && homePage.ParallaxSectionHeaderOne.isDisplayed()) {
            SeleniumUtils.sleep(10000L);
            Assert.assertTrue(homePage.ParallaxSectionHeaderOne.isDisplayed());
        } else {
            Assert.fail("Parallax two is displayed");
        }
    }

    @When("User clicks on {string} button in parallax section")
    public void user_clicks_on_button_in_parallax_section(String ReadMorebtn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, ReadMorebtn)));
    }

    @Then("User should see the {string} page displayed")
    public void user_should_see_the_page_displayed(String page) {
        Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains(page));
    }


    @Then("Verify user sees company image")
    public void verifyUserSeesCompanyImage() throws InterruptedException {
        List<WebElement> footerCompany = WebDriverManager.getDriver().findElements(By.xpath("//div[contains(@class,'active')]//*[contains(@alt,'company-image-')]"));
        for (WebElement each : footerCompany) {
            Assert.assertTrue(WebDriverManager.isDisplayed(each));
        }
    }


    @Then("Verify header is {string}")
    public void verifyHeaderIs(String header) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, header))));
    }

    @And("Verify secondary header is {string}")
    public void verifySecondaryHeaderIs(String secondaryHeader) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, secondaryHeader))));
    }

    @And("Verify description text is {string}")
    public void verifyDescriptionTextIs(String descriptionText) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, descriptionText))));
    }

    @Then("Verify {string} sections is displayed as a header")
    public void verify_sections_is_displayed_as_a_header(String section) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_SECTION, section))));
    }

    @Then("Verify Employee & Employer Relations is displayed")
    public void verify_employee_employer_relations_is_displayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.employeeRelation));
    }

    @Then("Verify descriptions under expect sections is displayed")
    public void verify_descriptions_under_expect_sections_is_displayed() {
        for (WebElement desc : homePage.description) {
            Assert.assertTrue(WebDriverManager.isDisplayed(desc));
            //System.out.println(WebDriverManager.getText(desc));
        }
    }

    @Then("Verify copyright text is {string}")
    public void verifyCopyrightTextIsString(String copyRight) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, copyRight))));
    }
    @Then("Verify {string} information is displayed")
    public void verify_information_is_displayed(String contact) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, contact))));
    }

    @Given("scroll down to bottom of the page")
    public void scroll_down_to_bottom_of_the_page() {

        WebDriverManager.click(homePage.BottomOfThePage);//scroll down to bottom
    }

    @Then("Click on button go back button when scroll down to bottom of the page")
    public void click_on_button_go_back_button_when_scroll_down_to_bottom_of_the_page() {

        WebDriverManager.click(homePage.GoToTopButton);//click on go back button

    }

    @Then("Check if it back to top content")
    public void check_if_it_back_to_top_content() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.home));//Highlight a top element
    }

    @Then("Verify {string} icon is displayed")
    public void verifyIconIsDisplayed(String str) {
        Assert.assertTrue(WebDriverManager
                .isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MEDIA_FT, str))));
    }

    @When("User click on {string}")
    public void userClickOn(String btn) {
        WebDriverManager.getDriver()
                .findElement(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MEDIA_FT, btn)))
                .click();
    }

    @Then("User is navigated to new tab")
    public void userIsNavigatedToNewTab() {
        SeleniumUtils.switchToNextWindow();
    }

    @Then("Verify URL contains {string}")
    public void verifyURLContains(String str) {
        Assert.assertTrue(WebDriverManager.getDriver().getCurrentUrl().contains(str));
    }

    @When("User click on {string} link")
    public void userClickOnLink(String str) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_QUICKLINK,str)));

    }

    @Then("Verify page title contains {string}")
    public void verifyPageTitleContains(String str) {
        Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains(str));
    }

    @Then("Verify email input field has placeholder {string}")
    public void verifyEmailInputFieldHasPlaceholder(String email) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, email))));
        Assert.assertTrue(WebDriverManager.isEnabled(
                WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, email)))
        ));
    }

    @Given("User opens {string} page")
    public void userOpensPage(String pageLink) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_NAVIGATION_BAR, pageLink)));
    }
}








