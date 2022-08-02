package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    @Given("This section should have a header   Meet Our Experts.")
    public void this_section_should_have_a_header_meet_our_experts() {
        Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.MeetExpertsHeader));
    }

    @Then("Total of four employees should be displayed Picture")
    public void total_of_four_employees_should_be_displayed_picture() {
        List<WebElement> image = WebDriverManager.getDriver().findElements(By.xpath("//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//img[@src]"));
        for (int i = 0; i < image.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.ExpertImage.get(i)));
        }
    }
    @Then("Total of four employees should be displayed Title")
    public void total_of_four_employees_should_be_displayed_title() {
        List<WebElement> title = WebDriverManager.getDriver().findElements(By.xpath("//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']/div[@class='designation']"));
        for (int i = 0; i < title.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.ExpertTitle.get(i)));
        }
    }
    @Then("Total of four employees should be displayed Quote")
    public void total_of_four_employees_should_be_displayed_quote() {
        List<WebElement> quote = WebDriverManager.getDriver().findElements(By.xpath("//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//div[@class='lower-content']//div[@class='text']"));
        for (int i = 0; i < quote.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.ExpertQuote.get(i)));
        }
    }
    @Then("Total of four employees should be displayed Social")
    public void total_of_four_employees_should_be_displayed_social() {
        List<WebElement> social = WebDriverManager.getDriver().findElements(By.xpath("//div[@class='team-member-one col-lg-3 col-md-6 col-xs-12']//ul/li"));
        for (int i = 0; i < social.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.ExpertSocial.get(i)));
        }
    }

    @Then("All employees FaceBook buttons should take to FaceBook pages")
    public void all_face_book_buttons_should_take_to_face_book_pages() throws InterruptedException {
        List<WebElement> facebook = WebDriverManager.getDriver().findElements(By.xpath("//ul[@class='social-icon-one']/li[1]"));
        for (int i = 0; i < facebook.size(); i++) {
            WebDriverManager.click(aboutUsPage.FaceBook.get(i));
            System.out.println(WebDriverManager.getDriver().getTitle());
            WebDriverManager.getDriver().navigate().back();
            Thread.sleep(2000);
        }
    }

//    @Then("All Twitter buttons should take to Twitter pages")
//    public void all_twitter_buttons_should_take_to_twitter_pages() {
//        List<WebElement> twitter = WebDriverManager.getDriver().findElements(By.xpath("//ul[@class='social-icon-one']//a[@href='https://twitter.com']"));
//        for (int i = 0; i < twitter.size(); i++) {
//            twitter.get(i).click();
//            WebDriverManager.getDriver().navigate().back();
//            System.out.println(WebDriverManager.getDriver().getTitle());
//        }
//    }
//
//    @Then("All Skype buttons should take to Skype pages")
//    public void all_skype_buttons_should_take_to_skype_pages() {
//        List<WebElement> skype = WebDriverManager.getDriver().findElements(By.xpath("//ul[@class='social-icon-one']//a[@href='https://twitter.com']"));
//        for (int i = 0; i < skype.size(); i++) {
//            skype.get(i).click();
//            WebDriverManager.getDriver().navigate().back();
//            System.out.println(WebDriverManager.getDriver().getTitle());
//        }
//    }
//
//    @Then("All LinkedIn buttons should take to LinkedIn pages")
//    public void all_linked_in_buttons_should_take_to_linked_in_pages() {
//        List<WebElement> linkedIn = WebDriverManager.getDriver().findElements(By.xpath("//ul[@class='social-icon-one']//a[@href='https://twitter.com']"));
//        for (int i = 0; i < linkedIn.size(); i++) {
//            linkedIn.get(i).click();
//            WebDriverManager.getDriver().navigate().back();
//            System.out.println(WebDriverManager.getDriver().getTitle());
//        }
//
//    }
}
