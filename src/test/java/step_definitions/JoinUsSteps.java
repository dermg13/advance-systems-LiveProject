package step_definitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.CommonPage;
import pages.JoinUsPage;
import utils.WebDriverManager;

public class JoinUsSteps implements CommonPage {

    JoinUsPage joinUsPage;

    public JoinUsSteps() {joinUsPage = new JoinUsPage();}
}
