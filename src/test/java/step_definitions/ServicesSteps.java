package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.ServicesPage;
import utils.WebDriverManager;

public class ServicesSteps implements CommonPage {
    ServicesPage servicesPage;
    public ServicesSteps(){
        servicesPage = new ServicesPage();
    }

    @When("User click on {string} link")
    public void userClickOnStringLink(String pageLink) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_NAVIGATION_BAR, pageLink)));
    }

    @Then("Verify the page title is {string}")
    public void verifyThePageTitleIs(String title) {
       Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }
}
