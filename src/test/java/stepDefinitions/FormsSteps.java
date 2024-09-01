package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FormsPage;
import util.DriverFactory;

public class FormsSteps {
    WebDriver driver = DriverFactory.getDriver();
    FormsPage forms = new FormsPage(driver);

    @When("Click to forms button")
    public void clickToFormsButton() {
        forms.clickToFormsButton();
    }

    @Given("User is on practise form menu")
    public void userIsOnPractiseFormMenu() {
        forms.userIsOnPractiseFormMenu();
    }

    @When("Write first name {string}")
    public void writeFirstName(String firsName) {
        forms.writeFirstName(firsName);
    }

    @And("Write last name {string}")
    public void writeLastName(String lastName) {
        forms.writeLastName(lastName);
    }

    @And("Write email {string}")
    public void writeEmail(String email) {
        forms.writeEmail(email);
    }

    @And("Select gender")
    public void selectGender() {
        forms.selectGender();
    }

    @And("Write mobile {string}")
    public void writeMobile(String mobile) {
        forms.writeMobile(mobile);
    }

    @And("Select date of birth")
    public void selectDateOfBirth() {
        forms.selectDateOfBirth();
    }

    @And("Select subject {string}")
    public void selectSubject(String subject) {
        forms.selectSubject(subject);
    }

    @And("Select all hobbies on the form")
    public void selectAllHobbiesOnTheForm() {
        forms.selectAllHobbiesOnTheForm();
    }

    @And("Upload a picture at this path {string}")
    public void uploadAPictureAtThisPath(String path) {
        forms.uploadAPictureAtThisPath(path);
    }


    @Then("Check if the image is loaded")
    public void checkIfTheImageIsLoaded() {
        forms.checkIfTheImageIsLoaded();
    }

    @When("Write current address {string}")
    public void writeCurrentAddress(String address) {
        forms.writeCurrentAddress(address);
    }

    @And("Select state {string}")
    public void selectState(String state) {
        forms.selectState(state);
    }

    @And("Select city {string}")
    public void selectCity(String city) {
        forms.selectCity(city);
    }

    @And("Click submit button")
    public void clickSubmitButton() {
        forms.clickSubmitButton();
    }

    @Then("The screen containing the form information should open")
    public void theScreenContainingTheFormInformationShouldOpen() {
        forms.theScreenContainingTheFormInformationShouldOpen();
    }

    @And("Click to close button")
    public void clickToCloseButton() {
        forms.clickToCloseButton();
    }

    @Then("Return to the practice form screen")
    public void returnToThePracticeFormScreen() {
        forms.returnToThePracticeFormScreen();
    }

    @Then("Stay on the form screen")
    public void stayOnTheFormScreen() {
        forms.returnToThePracticeFormScreen();
    }


}
