package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.WidgetsPage;
import util.DriverFactory;

public class WidgetsSteps {
    WebDriver driver = DriverFactory.getDriver();
    WidgetsPage widgets = new WidgetsPage(driver);
    @When("Click to widgets button")
    public void clickToWidgetsButton() {
        widgets.clickToWidgetsButton();
    }

    @Given("User is on Accordian menu")
    public void userIsOnAccordianMenu() {
        widgets.userIsOnAccordianMenu();
    }

    @When("Click to What is Lorem Ipsum? title")
    public void clickToWhatIsLoremIpsumTitle() {
        widgets.clickToWhatIsLoremIpsumTitle();
    }

    @Then("What is Lorem Ipsum title must be collapsed")
    public void whatIsLoremIpsumTitleMustBeCollapsed() {
        widgets.whatIsLoremIpsumTitleMustBeCollapsed();
    }

    @When("Click to Where does is come from? title")
    public void clickToWhereDoesIsComeFromTitle() {
        widgets.clickToWhereDoesIsComeFromTitle();
    }

    @Then("Where dos is come from? title must be expanded")
    public void whereDosIsComeFromTitleMustBeExpanded() {
        widgets.whereDosIsComeFromTitleMustBeExpanded();
    }

    @When("Click to Why do we use it? title")
    public void clickToWhyDoWeUseItTitle() {
        widgets.clickToWhyDoWeUseItTitle();
    }

    @Then("Why do we use it? title must be expanded")
    public void whyDoWeUseItTitleMustBeExpanded() {
        widgets.whyDoWeUseItTitleMustBeExpanded();
    }

    @Given("User is on Auto Complate menu")
    public void userIsOnAutoComplateMenu() {
        widgets.userIsOnAutoComplateMenu();
    }

    @When("Type {string} and select two item in the autocomplete list")
    public void typeAndSelectTwoItemInTheAutocompleteList(String color) {
        widgets.typeAndSelectTwoItemInTheAutocompleteList(color);
    }

    @Then("The first color must be selected and displayed in the input")
    public void theFirstColorMustBeSelectedAndDisplayedInTheInput() {
        widgets.theFirstColorMustBeSelectedAndDisplayedInTheInput();
    }

    @And("The second color must be selected and displayed in the input")
    public void theSecondColorMustBeSelectedAndDisplayedInTheInput() {
        widgets.theSecondColorMustBeSelectedAndDisplayedInTheInput();

    }

    @When("Type {string} and select the item in the autocomplete list")
    public void typeAndSelectTheItemInTheAutocompleteList(String color) {
        widgets.typeAndSelectTheItemInTheAutocompleteList(color);
    }

    @Then("The color must be selected and displayed in the input")
    public void theColorMustBeSelectedAndDisplayedInTheInput() {
        widgets.theColorMustBeSelectedAndDisplayedInTheInput();
    }
}
