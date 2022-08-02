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


    @When("User click on \\{string} link")
    public void userClickOnStringLink(String division) {
        WebDriverManager.getDriver()
                .findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, division)))
                .click();

    }

    @Then("Verify title of page is \\{string}")
    public void verifyTitleOfPageIsString(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }
}
