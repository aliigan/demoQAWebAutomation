package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AlertsFrameWindowsPage;
import util.DriverFactory;

public class AlertsFrameWindowsSteps {

    WebDriver driver = DriverFactory.getDriver();
    AlertsFrameWindowsPage alertsFrameWindows = new AlertsFrameWindowsPage(driver);
    @Given("Click to alerts, frame and windows button")
    public void clickToAlertsFrameAndWindowsButton() {
        alertsFrameWindows.clickToAlertsFrameAndWindowsButton();
    }

    @Given("User is on Browser Windows menu")
    public void userIsOnBrowserWindowsMenu() {
        alertsFrameWindows.userIsOnBrowserWindowsMenu();
    }

    @When("Click to open new tab button")
    public void clickToOpenNewTabButton() {
        alertsFrameWindows.clickToOpenNewTabButton();
    }

    @Then("A new tab must be open")
    public void aNewTabMustBeOpen() {
        alertsFrameWindows.aNewTabMustBeOpen();
    }

    @When("Click to open new window button")
    public void clickToOpenNewWindowButton() {
        alertsFrameWindows.clickToOpenNewWindowButton();
    }

    @Then("A new window must be open")
    public void aNewWindowMustBeOpen() {
        alertsFrameWindows.aNewWindowMustBeOpen();
    }

    @When("Click to open new window message button")
    public void clickToOpenNewWindowMessageButton() {
        alertsFrameWindows.clickToOpenNewWindowMessageButton();
    }

    @Then("A new window message must be open")
    public void aNewWindowMessageMustBeOpen() {
        alertsFrameWindows.aNewWindowMessageMustBeOpen();
    }

    @Given("User is on Alert menu")
    public void userIsOnAlertMenu() {
        alertsFrameWindows.userIsOnAlertMenu();
    }

    @When("Click to alert button")
    public void clickToAlertButton() {
        alertsFrameWindows.clickToAlertButton();
    }

    @Then("Alert message must be open")
    public void alertMessageMustBeOpen() {
        alertsFrameWindows.alertMessageMustBeOpen();
    }

    @When("Click to ok button")
    public void clickToOkButton() {
        alertsFrameWindows.clickToOkButton();
    }

    @Then("User must be on alert page")
    public void userMustBeOnAlertPage() {
        alertsFrameWindows.userMustBeOnAlertPage();
    }

    @When("Click to timed alert button")
    public void clickToTimedAlertButton() {
        alertsFrameWindows.clickToTimedAlertButton();
    }

    @Then("The alert message must be pop up after {int} seconds")
    public void theAlertMessageMustBePopUpAfterSeconds(int seconds) {
        alertsFrameWindows.theAlertMessageMustBePopUpAfterSeconds(seconds);
    }

    @When("Click to ok button at timed alert")
    public void clickToOkButtonAtTimedAlert() {
        alertsFrameWindows.clickToOkButtonAtTimedAlert();
    }

    @When("Click to confirm alert button")
    public void clickToConfirmAlertButton() {
        alertsFrameWindows.clickToConfirmAlertButton();
    }

    @And("Click ok on the alert message")
    public void clickOkOnTheAlertMessage() {
        alertsFrameWindows.clickOkOnTheAlertMessage();
    }

    @Then("Verify that the ok button was clicked")
    public void verifyThatTheOkButtonWasClicked() {
        alertsFrameWindows.verifyThatTheOkButtonWasClicked();
    }

    @And("Click cancel on the alert message")
    public void clickCancelOnTheAlertMessage() {
        alertsFrameWindows.clickCancelOnTheAlertMessage();
    }

    @Then("Verify that the cancel button was clicked")
    public void verifyThatTheCancelButtonWasClicked() {
        alertsFrameWindows.verifyThatTheCancelButtonWasClicked();
    }

    @When("Click to promt box alert button")
    public void clickToPromtBoxAlertButton() {
        alertsFrameWindows.clickToPromtBoxAlertButton();
    }

    @And("Write {string} to the promt box")
    public void writeToThePromtBox(String name) {
        alertsFrameWindows.writeToThePromtBox(name);
    }

    @And("Click ok on the promt box alert")
    public void clickOkOnThePromtBoxAlert() {
        alertsFrameWindows.clickOkOnThePromtBoxAlert();
    }

    @Then("Check that writing {string} was successful")
    public void checkThatWritingWasSuccessful(String name) {
        alertsFrameWindows.checkThatWritingWasSuccessful(name);
    }

    @Given("User is on Frames menu")
    public void userIsOnFramesMenu() {
        alertsFrameWindows.userIsOnFramesMenu();
    }

    @When("Switch to {string} and get the text")
    public void switchToAndGetTheText(String frame) {
        alertsFrameWindows.switchToAndGetTheText(frame);
    }

    @Then("Text must be This is a sample page in first frame")
    public void textMustBeThisIsASamplePageInFirstFrame() {
        alertsFrameWindows.textMustBeThisIsASamplePageInFirstFrame();
    }

    @Then("Text must be This is a sample page in second frame")
    public void textMustBeThisIsASamplePageInSecondFrame() {
        alertsFrameWindows.textMustBeThisIsASamplePageInSecondFrame();
    }

    @Given("User is on Nested Frames menu")
    public void userIsOnNestedFramesMenu() {
        alertsFrameWindows.userIsOnNestedFramesMenu();
    }

    @When("Switch to parent frame")
    public void switchToParentFrame() {
        alertsFrameWindows.switchToParentFrame();
    }

    @Then("Frame name must be {string}")
    public void frameNameMustBe(String frameName) {
        alertsFrameWindows.frameNameMustBe(frameName);
    }

    @When("Switch to child frame")
    public void switchToChildFrame() {
        alertsFrameWindows.switchToChildFrame();
    }

    @Given("User is on Modal Dialogs menu")
    public void userIsOnModalDialogsMenu() {
        alertsFrameWindows.userIsOnModalDialogsMenu();
    }

    @When("Click to small modal button")
    public void clickToSmallModalButton() {
        alertsFrameWindows.clickToSmallModalButton();
    }

    @Then("Small modal must be open")
    public void smallModalMustBeOpen() {
        alertsFrameWindows.smallModalMustBeOpen();
    }

    @When("Click to close button for {string}")
    public void clickToCloseButtonFor(String closeButton) {
        alertsFrameWindows.clickToCloseButtonFor(closeButton);
    }

    @Then("Modal dialogs page must be displayed")
    public void modalDialogsPageMustBeDisplayed() {
        alertsFrameWindows.modalDialogsPageMustBeDisplayed();
    }

    @When("Click to large modal button")
    public void clickToLargeModalButton() {
        alertsFrameWindows.clickToLargeModalButton();
    }

    @Then("Large modal must be open")
    public void largeModalMustBeOpen() {
        alertsFrameWindows.largeModalMustBeOpen();
    }
}
