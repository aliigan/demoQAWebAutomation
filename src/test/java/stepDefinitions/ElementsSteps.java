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
    ElementsPage elements = new ElementsPage(driver);

    @Given("User is on text box page")
    public void userIsOnTextBoxPage() {
        elements.userIsOnTextBoxPage();
    }

    @When("Write full name as {string}")
    public void writeFullNameAs(String fullName) {
        elements.writeFullNameAs(fullName);
    }

    @And("Write email as {string}")
    public void writeEmailAs(String email) {
        elements.writeEmailAs(email);
    }

    @And("Write current address as {string}")
    public void writeCurrentAddressAs(String currentAddress) {
        elements.writeCurrentAddressAs(currentAddress);
    }

    @And("Write permanent address as {string}")
    public void writePermanentAddressAs(String permanentAddress) {
        elements.writePermanentAddressAs(permanentAddress);
    }

    @And("Click to submit button")
    public void clickToSubmitButton() {
        elements.clickToSubmitButton();
    }

    @Then("Check that a user record named {string} has been created")
    public void checkThatAUserRecordNamedHasBeenCreated(String name) {
        elements.checkThatAUserRecordNamedHasBeenCreated(name);
    }

    @When("Click to elements button")
    public void clickToElementsButton() {
        elements.clickToElementsButton();
    }

    @And("Click to text box button")
    public void clickToTextBoxButton() {
        elements.clickToTextBoxButton();
    }

    @Given("User is on check box page")
    public void userIsOnCheckBoxPage() {
        elements.userIsOnCheckBoxPage();
    }

    @When("Click to home check box")
    public void clickToHomeCheckBox() {
        elements.clickToHomeCheckBox();
    }

    @Then("Expected message: {string}")
    public void expectedMessage(String expected) {
        elements.expectedMessage(expected);
    }

    @Given("User is on radio button menu")
    public void userIsOnRadioButtonMenu() {
        elements.userIsOnRadioButtonMenu();
    }

    @When("Click to yes radio button")
    public void clickToYesRadioButton() {
        elements.clickToYesRadioButton();
    }

    @Then("Check that the message You have selected Yes appears on the screen")
    public void checkThatTheMessageYouHaveSelectedYesAppearsOnTheScreen() {
        elements.checkThatTheMessageYouHaveSelectedYesAppearsOnTheScreen();
    }

    @Given("User is on web tables menu")
    public void userIsOnWebTablesMenu() {
        elements.userIsOnWebTablesMenu();
    }

    @When("Click to add button")
    public void clickToAddButton() {
        elements.clickToAddButton();
    }

    @Then("Check that the registration form is opened")
    public void checkThatTheRegistrationFormIsOpened() {
        elements.checkThatTheRegistrationFormIsOpened();
    }

    @When("Write first name as {string}")
    public void writeFirstNameAs(String name) {
        elements.writeFirstNameAs(name);
    }

    @And("Write second name as {string}")
    public void writeSecondNameAs(String secondName) {
        elements.writeSecondNameAs(secondName);
    }

    @And("Write user email as {string}")
    public void writeUserEmailAs(String email) {
        elements.writeUserEmailAs(email);
    }

    @And("Write age as {string}")
    public void writeAgeAs(String age) {
        elements.writeAgeAs(age);
    }

    @And("Write salary as {string}")
    public void writeSalaryAs(String salary) {
        elements.writeSalaryAs(salary);
    }

    @And("Write department as {string}")
    public void writeDepartmentAs(String department) {
        elements.writeDepartmentAs(department);
    }

    @And("Click registration form submit button")
    public void clickRegistrationFormSubmitButton() {
        elements.clickRegistrationFormSubmitButton();
    }

    @Then("Check user: {string}")
    public void checkUser(String name) {
        elements.checkUser(name);
    }

    @When("Search {string}")
    public void search(String name) {
        elements.search(name);
    }

    @And("Click to edit button")
    public void clickToEditButton() {
        elements.clickToEditButton();
    }

    @And("Update email as {string}")
    public void updateEmailAs(String email) {
        elements.updateEmailAs(email);
    }

    @And("Search {string} from list")
    public void searchFromList(String name) {
        elements.searchFromList(name);
    }

    @Then("Check if your email is updated")
    public void checkIfYourEmailIsUpdated() {
        elements.checkIfYourEmailIsUpdated();
    }

    @And("Click to delete button")
    public void clickToDeleteButton() {
        elements.clickToDeleteButton();
    }

    @Then("List must be empty")
    public void listMustBeEmpty() {
        elements.listMustBeEmpty();
    }
}
