package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AboutUsPage;
import pages.CommonPage;
import utils.WebDriverManager;

public class AboutUsSteps implements CommonPage {
    AboutUsPage aboutUsPage;
    public  AboutUsSteps() {
        aboutUsPage = new AboutUsPage();
    }

    @Given("When click on About Us page")
    public void when_click_on_about_us_page() {
        WebDriverManager.click(aboutUsPage.AboutUsMainNavigationBar);
    }

    @Given("There should be a main header Welcome to Advance Systems LLC.")
    public void there_should_be_a_main_header_welcome_to_advance_systems_llc() {
        Assert.assertEquals(WebDriverManager.getText(aboutUsPage.MainContentPersonName), "Kuba Z");
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.AboutUsMainHeader));
    }
    @Then("This section should contain name and title of the person.")
    public void this_section_should_contain_name_and_title_of_the_person() {
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.MainContentPersonName));
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.MainContentTitle));
    }

}
