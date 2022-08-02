package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AboutUsPage;
import pages.CommonPage;
import utils.WebDriverManager;

import java.util.List;

public class AboutUsSteps implements CommonPage {
    AboutUsPage aboutUsPage;
    public  AboutUsSteps() {
        aboutUsPage = new AboutUsPage();
    }

    @Given("Click on About Us page")
    public void click_on_about_us_page() {
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
    @Then("This section should have a header   Meet Our Experts.")
    public void this_section_should_have_a_header_meet_our_experts() {
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.MeetExpertsHeader));
    }
    @Then("Total of four employees should be displayed Picture")
    public void total_of_four_employees_should_be_displayed_picture() throws InterruptedException {
        List<WebElement> image = WebDriverManager.getDriver().findElements(By.xpath("//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//img[@src]"));
        for (int i = 0; i < image.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(image.get(i)));
        }
    }
    @Then("Total of four employees should be displayed Title")
    public void total_of_four_employees_should_be_displayed_title() throws InterruptedException {
        List<WebElement> title = WebDriverManager.getDriver().findElements(By.xpath("//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']/div[@class='designation']"));
        for (int i = 0; i < title.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(title.get(i)));
        }
    }
    @Then("Total of four employees should be displayed Quote")
    public void total_of_four_employees_should_be_displayed_quote() throws InterruptedException {
        List<WebElement> quote = WebDriverManager.getDriver().findElements(By.xpath("//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']//div[@class='text']"));
        for (int i = 0; i < quote.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(quote.get(i)));
        }
    }
    @Then("Total of four employees should be displayed Social media link")
    public void total_of_four_employees_should_be_displayed_social_media_link() throws InterruptedException {
        List<WebElement> social = WebDriverManager.getDriver().findElements(By.xpath("//ul[@class='social-icon-one']"));
        for (int i = 0; i < social.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(social.get(i)));
        }
    }
    @Then("Employees Social media buttons should take to corresponding pages")
    public void employeed_social_media_buttons_should_take_to_corresponding_pages() throws InterruptedException {

        List<WebElement> facebook = WebDriverManager.getDriver().findElements(By.xpath("//span/ancestor::section//a[@href='https://facebook.com']"));
        for (int i = 0; i < facebook.size(); i++) {
            facebook.get(i).click();
            System.out.println(WebDriverManager.getDriver().getTitle());
            WebDriverManager.getDriver().navigate().back();
        }
        List<WebElement> twitter = WebDriverManager.getDriver().findElements(By.xpath("//span/ancestor::section//a[@href='https://twitter.com']"));
        for (int i = 0; i < twitter.size(); i++) {
            twitter.get(i).click();
            System.out.println(WebDriverManager.getDriver().getTitle());
            WebDriverManager.getDriver().navigate().back();
        }
        List<WebElement> skype = WebDriverManager.getDriver().findElements(By.xpath("//span/ancestor::section//a[@href='https://skype.com']"));
        for (int i = 0; i < skype.size(); i++) {
            skype.get(i).click();
            System.out.println(WebDriverManager.getDriver().getTitle());
            WebDriverManager.getDriver().navigate().back();
        }
        List<WebElement> linkedin = WebDriverManager.getDriver().findElements(By.xpath("//span/ancestor::section//a[@href='https://linkedin.com']"));
        for (int i = 0; i < linkedin.size(); i++) {
            linkedin.get(i).click();
            System.out.println(WebDriverManager.getDriver().getTitle());
            WebDriverManager.getDriver().navigate().back();
        }
    }

    @Given("user clicks on About Us page")
    public void userClicksOnAboutUsPage() {
        WebDriverManager.click(aboutUsPage.AboutUsMainNavigationBar);
    }

    @Then("Verify first header says {string}")
    public void verifyFirstHeaderSays(String firstHeader) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, firstHeader))));

    }

    @Then("Verify first header's description text says {string}")
    public void verifyFirstHeaderSDescriptionTextSays(String firstHeaderText) {
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.FirstHeaderText));

    }

    @Then("Verify second header says {string}")
    public void verifySecondHeaderSays(String secondHeader) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, secondHeader))));
    }

    @Then("Verify second header's description text says {string}")
    public void verifySecondHeaderSDescriptionTextSays(String secondHeaderText) {
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.SecondHeaderText));
    }

    @Then("Verify third header says {string}")
    public void verifyThirdHeaderSays(String thirdHeader) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, thirdHeader))));
    }

    @Then("Verify third header's description text says {string}")
    public void verifyThirdHeaderSDescriptionTextSays(String thirdHeaderText) {
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.ThirdHeaderText));
    }

    @Then("Verify fourth header says {string}")
    public void verifyFourthHeaderSays(String fourthHeader) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, fourthHeader))));
    }

    @Then("Verify fourth header's description text says {string}")
    public void verifyFourthHeaderSDescriptionTextSays(String fourthHeaderText) {
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.FourthHeaderText));
    }
}
