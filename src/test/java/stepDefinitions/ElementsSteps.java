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
    public void searchFromList(String email) {
        elements.searchFromList(email);
    }

    @Then("Check if the mail is updated to {string}")
    public void checkIfYourEmailIsUpdated(String email) {
        elements.checkIfYourEmailIsUpdated(email);
    }

    @And("Click to delete button")
    public void clickToDeleteButton() {
        elements.clickToDeleteButton();
    }

    @Then("List must be empty")
    public void listMustBeEmpty() {
        elements.listMustBeEmpty();
    }

    @Given("User is on Buttons menu")
    public void userIsOnButtonsMenu() {
        elements.userIsOnButtonsMenu();
    }

    @When("Double click on the Double Click Me button")
    public void doubleClickOnTheDoubleClickMeButton() {
        elements.doubleClickOnTheDoubleClickMeButton();
    }

    @Then("The message {string} is displayed on the screen")
    public void theMessageIsDisplayedOnTheScreen(String message) {
        elements.theMessageIsDisplayedOnTheScreen(message);
    }

    @When("Right click on the Right Click Me button")
    public void rightClickOnTheRightClickMeButton() {
        elements.rightClickOnTheRightClickMeButton();
    }

    @When("Left click on the Click Me button")
    public void leftClickOnTheClickMeButton() {
        elements.leftClickOnTheClickMeButton();
    }

    @Given("User is on Links menu")
    public void userIsOnLinksMenu() {
        elements.userIsOnLinksMenu();
    }

    @When("Click to {string}")
    public void clickTo(String link) {
        elements.clickTo(link);
    }

    @Then("Check if a new tab opens")
    public void checkIfANewTabOpens() {
        elements.checkIfANewTabOpens();
    }

    @Then("Check if the api message is {string}")
    public void checkIfTheApiMessageIs(String message) {
        elements.checkIfTheApiMessageIs(message);
    }

    @Given("User is on the Broken Links - Images page")
    public void userIsOnTheBrokenLinksImagesPage() {
        elements.userIsOnTheBrokenLinksImagesPage();
    }

    @When("Click to valid link")
    public void clickToValidLink() {
        elements.clickToValidLink();
    }

    @Then("Check that the {string} link is being accessed")
    public void checkThatTheLinkIsBeingAccessed(String link) {
        elements.checkThatTheLinkIsBeingAccessed(link);
    }

    @When("Click to broken link")
    public void clickToBrokenLink() {
        elements.clickToBrokenLink();
    }

    @Then("The error page must be displayed")
    public void theErrorPageMustBeDisplayed() {
        elements.theErrorPageMustBeDisplayed();
    }

    @Then("The valid image should be displayed")
    public void theValidImageShouldBeDisplayed() {
        elements.theValidImageShouldBeDisplayed();
    }

    @Then("The broken image should not be displayed")
    public void theBrokenImageShouldNotBeDisplayed() {
        elements.theBrokenImageShouldNotBeDisplayed();
    }

    @Given("User is on Upload and Download page")
    public void userIsOnUploadAndDownloadPage() {
        elements.userIsOnUploadAndDownloadPage();
    }

    @When("Click to download button")
    public void clickToDownloadButton() {
        elements.clickToDownloadButton();
    }

    @Then("The image must be downloaded")
    public void theImageMustBeDownloaded() {
        elements.theImageMustBeDownloaded();
    }

    @When("Click to upload button")
    public void clickToUploadButton() {
        elements.clickToUploadButton();
    }

    @Then("The image must be uploaded")
    public void theImageMustBeUploaded() {
        elements.theImageMustBeUploaded();
    }

    @Given("User is on the Dynamic Properties page")
    public void userIsOnTheDynamicPropertiesPage() {
        elements.userIsOnTheDynamicPropertiesPage();
    }

    @Then("The Enable After Five Seconds button should be disabled")
    public void theEnableAfterSecondsButtonShouldBeDisabled() {
        elements.theEnableAfterSecondsButtonShouldBeDisabled();
    }

    @When("Wait for {int} seconds")
    public void waitForSeconds(int seconds) {
        elements.waitForSeconds(seconds);
    }

    @Then("The Enable After Five Seconds button should be enabled")
    public void theEnableAfterSecondsButtonShouldBeEnabled() {
        elements.theEnableAfterSecondsButtonShouldBeEnabled();
    }

    @Then("The Color Change button should have a blue background color")
    public void theColorChangeButtonShouldHaveABlueBackgroundColor() {
        elements.theColorChangeButtonShouldHaveABlueBackgroundColor();
    }

    @Then("The Color Change button should change its background color to red")
    public void theColorChangeButtonShouldChangeItsBackgroundColorToRed() {
        elements.theColorChangeButtonShouldChangeItsBackgroundColorToRedd();
    }

    @Then("The Visible After Five Seconds button should not be visible")
    public void theVisibleAfterSecondsButtonShouldNotBeVisible() {
        elements.theVisibleAfterSecondsButtonShouldNotBeVisible();
    }

    @Then("The Color Change button should be visible")
    public void theColorChangeButtonShouldBeVisible() {
        elements.theColorChangeButtonShouldBeVisible();
    }
}
