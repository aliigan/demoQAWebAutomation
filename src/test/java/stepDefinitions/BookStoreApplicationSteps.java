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

    @When("Click to book store application button")
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

}
