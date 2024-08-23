package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ElementsPage;
import util.DriverFactory;

public class ElementsSteps {

    WebDriver driver = DriverFactory.getDriver();
    ElementsPage textBox = new ElementsPage(driver);

    @Given("User is on text box page")
    public void userIsOnTextBoxPage() {
        textBox.userIsOnTextBoxPage();
    }

    @When("Write full name as {string}")
    public void writeFullNameAs(String fullName) {
        textBox.writeFullNameAs(fullName);
    }

    @And("Write email as {string}")
    public void writeEmailAs(String email) {
        textBox.writeEmailAs(email);
    }

    @And("Write current address as {string}")
    public void writeCurrentAddressAs(String currentAddress) {
        textBox.writeCurrentAddressAs(currentAddress);
    }

    @And("Write permanent address as {string}")
    public void writePermanentAddressAs(String permanentAddress) {
        textBox.writePermanentAddressAs(permanentAddress);
    }

    @And("Click to submit button")
    public void clickToSubmitButton() {
        textBox.clickToSubmitButton();
    }

    @Then("Check if the registration was successful")
    public void checkIfTheRegistrationWasSuccessful() {
        textBox.checkIfTheRegistrationWasSuccessful();
    }

    @When("Click to elements button")
    public void clickToElementsButton() {
        textBox.clickToElementsButton();
    }

    @And("Click to text box button")
    public void clickToTextBoxButton() {
        textBox.clickToTextBoxButton();
    }
}
