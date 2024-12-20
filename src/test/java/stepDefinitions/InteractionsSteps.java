package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.InteractionsPage;
import util.DriverFactory;

public class InteractionsSteps {

    WebDriver driver = DriverFactory.getDriver();
    InteractionsPage interactions = new InteractionsPage(driver);

    @Given("Click to interactions button")
    public void clickToInteractionsButton() {
        interactions.clickToInteractionsButton();
    }

    @Given("User is on sortable menu")
    public void userIsOnSortableMenu() {
        interactions.userIsOnSortableMenu();
    }

    @Then("{string} must have the following starting order:")
    public void mustHaveTheFollowingStartingOrder(String item) {
        interactions.mustHaveTheFollowingStartingOrder(item);
    }
}
