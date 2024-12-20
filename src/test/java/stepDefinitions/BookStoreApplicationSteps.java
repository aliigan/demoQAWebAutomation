package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BookStoreApplicationPage;
import util.DriverFactory;




public class BookStoreApplicationSteps {
    WebDriver driver = DriverFactory.getDriver();
    BookStoreApplicationPage bookStoreApplication = new BookStoreApplicationPage(driver);

    @Given("Click to book store application button")
    public void clickToBookStoreApplicationButton() {
        bookStoreApplication.clickToBookStoreApplicationButton();
    }

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        bookStoreApplication.userIsOnLoginPage();
    }

    @When("Click to new user button")
    public void clickToNewUserButton() {
        bookStoreApplication.clickToNewUserButton();
    }

    @And("Write name as {string}")
    public void writeNameAs(String name) {
        bookStoreApplication.writeNameAs(name);
    }

    @And("Write last name as {string}")
    public void writeLastNameAs(String surName) {
        bookStoreApplication.writeLastNameAs(surName);
    }

    @And("Write user name as {string}")
    public void writeUserNameAs(String userName) {
        bookStoreApplication.writeUserNameAs(userName);
    }

    @And("Write password as {string}")
    public void writePasswordAs(String password) {
        bookStoreApplication.writePasswordAs(password);
    }

    @And("Click to captcha verificafation")
    public void clickToCaptchaVerificafation() {
        bookStoreApplication.clickToCaptchaVerificafation();
    }

    @And("Click to register Button")
    public void clickToRegisterButton() {
        bookStoreApplication.clickToRegisterButton();
    }

    @And("Click the OK button on the successful registration pop-up")
    public void clickTheOKButtonOnTheSuccessfulRegistrationPopUp() {
        bookStoreApplication.clickTheOKButtonOnTheSuccessfulRegistrationPopUp();
    }

    @And("Click to back to login button")
    public void clickToBackToLoginButton() {
        bookStoreApplication.clickToBackToLoginButton();
    }

    @And("Enter userName as {string}")
    public void enterUserNameAs(String userName) {
        bookStoreApplication.enterUserNameAs(userName);
    }

    @And("Enter password as {string}")
    public void enterPasswordAs(String password) {
        bookStoreApplication.enterPasswordAs(password);
    }

    @And("Click to login button")
    public void clickToLoginButton() {
        bookStoreApplication.clickToLoginButton();
    }

    @Then("The user must have successfully logged in {string}")
    public void theUserMustHaveSuccessfullyLoggedIn(String expectedUserName) {
        bookStoreApplication.theUserMustHaveSuccessfullyLoggedIn(expectedUserName);
    }

    @When("Click to log out button")
    public void clickToLogOutButton() {
        bookStoreApplication.clickToLogOutButton();
    }

    @Then("User must be on the login page")
    public void userMustBeOnTheLoginPage() {
        bookStoreApplication.userMustBeOnTheLoginPage();
    }

    @Then("{string} message must be on the login page")
    public void messageMustBeOnTheLoginPage(String message) {
        bookStoreApplication.messageMustBeOnTheLoginPage(message);
    }

    @Given("User is on book store page")
    public void userIsOnBookStorePage() {
        bookStoreApplication.userIsOnBookStorePage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        bookStoreApplication.clickLoginButton();
    }

    @Then("User must be on the book store page")
    public void userMustBeOnTheBookStorePage() {
        bookStoreApplication.userMustBeOnTheBookStorePage();
    }

    @When("Type {string} in the search box and search")
    public void typeInTheSearchBoxAndSearch(String searchObject) {
        bookStoreApplication.typeInTheSearchBoxAndSearch(searchObject);
    }

    @And("Click first element from list")
    public void clickFirstElementFromList() {
        bookStoreApplication.clickFirstElementFromList();
    }

    @Then("The redirected url must be {string}")
    public void theRedirectedUrlMustBe(String url) {
        bookStoreApplication.theRedirectedUrlMustBe(url);
    }

    @When("Select five rows")
    public void selectFiveRows() {
        bookStoreApplication.selectFiveRows();
    }

    @Then("User must be on the page {string}")
    public void userMustBeOnThePage(String page) {
        bookStoreApplication.userMustBeOnThePage(page);
    }

    @When("Click to next button")
    public void clickToNextButton() {
        bookStoreApplication.clickToNextButton();
    }

    @When("Click to previous button")
    public void clickToPreviousButton() {
        bookStoreApplication.clickToPreviousButton();
    }

    @When("Click to {string} column")
    public void clickToColumn(String column) {
        bookStoreApplication.clickToColumn(column);
    }

    @Then("The author of the first book listed must be {string}")
    public void theAuthorOfTheFirstBookListedMustBe(String author) {
        bookStoreApplication.theAuthorOfTheFirstBookListedMustBe(author);
    }

    @Given("User is on profile menu")
    public void userIsOnProfileMenu() {
        bookStoreApplication.userIsOnProfileMenu();
    }

    @When("Click to login word")
    public void clickToLoginWord() {
        bookStoreApplication.clickToLoginWord();
    }

    @Then("User must be on the profile menu")
    public void userMustBeOnTheProfileMenu() {
        bookStoreApplication.userMustBeOnTheProfileMenu();
    }

    @When("Click to delete all books button")
    public void clickToDeleteAllBooksButton() {
        bookStoreApplication.clickToDeleteAllBooksButton();
    }

    @And("Click to cancel at pop up that appears")
    public void clickToCancelAtPopUpThatAppears() {
        bookStoreApplication.clickToCancelAtPopUpThatAppears();
    }

    @And("Click yes at modal that appears")
    public void clickYesAtModalThatAppears() {
        bookStoreApplication.clickYesAtModalThatAppears();
    }

    @And("Click ok at pop up that appears")
    public void clickOkAtPopUpThatAppears() {
        bookStoreApplication.clickOkAtPopUpThatAppears();
    }

    @When("Click go to book store button")
    public void clickGoToBookStoreButton() {
        bookStoreApplication.clickGoToBookStoreButton();
    }

    @Then("Current address must be {string}")
    public void currentAddressMustBe(String url) {
        bookStoreApplication.currentAddressMustBe(url);
    }

    @When("Click to delete account button")
    public void clickToDeleteAccountButton() {
        bookStoreApplication.clickToDeleteAccountButton();
    }

    @And("Click cancel on the modal message")
    public void clickCancelOnTheModalMessage() {
        bookStoreApplication.clickCancelOnTheModalMessage();
    }


}
