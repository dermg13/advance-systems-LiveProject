package step_definitions;

import io.cucumber.java.en.And;
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

    @Then("Verify the page title is {string}")
    public void verifyThePageTitleIs(String title) {
       Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }

    @When("User clicks on division {string} link")
    public void userClicksOnDivisionLink(String pageLink) {
            WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_TEXT, pageLink)));
        }

    @And("Verify the following buttons from {string} are enabled")
    public void verifyTheFollowingButtonsFromAreEnabled(String divisionBtn) {
        Assert.assertTrue(WebDriverManager.isEnabled(
                WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, divisionBtn)))
        ));
    }

    @Then("Verify Finance button is enabled")
    public void verifyFinanceButtonIsEnabled() {
        Assert.assertTrue(WebDriverManager.isEnabled(servicesPage.financeBtn));
    }

    @Then("Verify Information Technology button is enabled")
    public void verifyInformationTechnologyButtonIsEnabled() {
        Assert.assertTrue(WebDriverManager.isEnabled(servicesPage.ITBtn));
    }

    @Then("Verify Healthcare button is enabled")
    public void verifyHealthcareButtonIsEnabled() {
        Assert.assertTrue(WebDriverManager.isEnabled(servicesPage.healthcareBtn));
    }

    @Then("Verify Government Projects button is enabled")
    public void verifyGovernmentProjectsButtonIsEnabled() {
        Assert.assertTrue(WebDriverManager.isEnabled(servicesPage.governmentProjectsBtn));
    }

    @Then("Verify Others button is enabled")
    public void verifyOthersButtonIsEnabled() {
        Assert.assertTrue(WebDriverManager.isEnabled(servicesPage.othersBtn));
    }
}

