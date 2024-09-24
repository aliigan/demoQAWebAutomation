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

    @Given("User is on Date Picker menu")
    public void userIsOnDatePickerMenu() {
        widgets.userIsOnDatePickerMenu();
    }

    @When("Update the date in the select date input with {string}")
    public void updateTheDateInTheSelectDateInputWith(String date) {
        widgets.updateTheDateInTheSelectDateInputWith(date);
    }

    @Then("Date {string} must be selected")
    public void dateMustBeSelected(String date) {
        widgets.dateMustBeSelected(date);
    }

    @When("Click to date picker")
    public void clickToDatePicker() {
        widgets.clickToDatePicker();
    }

    @And("Choose month")
    public void chooseMonth() {
        widgets.chooseMonth();
    }

    @And("Choose year")
    public void chooseYear() {
        widgets.chooseYear();
    }

    @And("Select day")
    public void selectDay() {
        widgets.selectDay();
    }

    @And("Select time")
    public void selectTime() {
        widgets.selectTime();
    }

    @Then("Check that the selected time is {string}")
    public void checkThatTheSelectedTimeIs(String time) {
        widgets.checkThatTheSelectedTimeIs(time);
    }

    @Given("User is on Slider menu")
    public void userIsOnSliderMenu() {
        widgets.userIsOnSliderMenu();
    }

    @When("Move the slider {int} pixels")
    public void moveTheSliderPixels(int pixels) {
        widgets.moveTheSliderPixels(pixels);
    }

    @Then("Check if the shift value has changed")
    public void checkIfTheShiftValueHasChanged() {
        widgets.checkIfTheShiftValueHasChanged();
    }

    @Given("User is on Progress Bar menu")
    public void userIsOnProgressBarMenu() {
        widgets.userIsOnProgressBarMenu();
    }

    @When("Click progress bar start button")
    public void clickProgressBarStartButton() {
        widgets.clickProgressBarStartButton();
    }

    @And("Wait {int} seconds and click to stop button")
    public void waitSecondsAndClickToStopButton(int seconds) {
        widgets.waitSecondsAndClickToStopButton(seconds);
    }

    @Then("The progress bar value must be non-zero")
    public void theProgressBarValueMustBeNonZero() {
        widgets.theProgressBarValueMustBeNonZero();
    }

    @And("Wait until the progress bar is full and click the reset button")
    public void waitUntilTheProgressBarIsFullAndClickTheResetButton() {
        widgets.waitUntilTheProgressBarIsFullAndClickTheResetButton();
    }

    @Then("The progress bar value must be zero")
    public void theProgressBarValueMustBeZero() {
        widgets.theProgressBarValueMustBeZero();
    }

    @Given("User is on Tabs menu")
    public void userIsOnTabsMenu() {
        widgets.userIsOnTabsMenu();
    }

    @When("Click {string} tab")
    public void clickTab(String tab) {
        widgets.clickTab(tab);
    }

    @Then("The text under the origin must be viewable")
    public void theTextUnderTheOriginMustBeViewable() {
        widgets.theTextUnderTheOriginMustBeViewable();
    }

    @Then("The text under the use must be viewable")
    public void theTextUnderTheUseMustBeViewable() {
        widgets.theTextUnderTheUseMustBeViewable();
    }

    @When("Click more tab")
    public void clickMoreTab() {
        widgets.clickMoreTab();
    }

    @Given("User is on ToolTips menu")
    public void userIsOnToolTipsMenu() {
        widgets.userIsOnToolTipsMenu();
    }

    @When("Hover over the button")
    public void hoverOverTheButton() {
        widgets.hoverOverTheButton();
    }

    @And("Hover over the input")
    public void hoverOverTheInput() {
        widgets.hoverOverTheInput();
    }

    @And("Hover over the contrary word")
    public void hoverOverTheContraryWord() {
        widgets.hoverOverTheContraryWord();
    }

    @And("Hover over the {string}")
    public void hoverOverThe(String data) {
        widgets.hoverOverThe(data);
    }

    @Given("User is on Menu Menu")
    public void userIsOnMenuMenu() {
        widgets.userIsOnMenuMenu();
    }

    @When("Hover over {string} and verify that it is visible")
    public void hoverOverAndVerifyThatItIsVisible(String menu) {
        widgets.hoverOverAndVerifyThatItIsVisible(menu);
    }

    @When("Hover over Sub Item One and verify that it is visible")
    public void hoverOverSubItemOneAndVerifyThatItIsVisible() {
        widgets.hoverOverSubItemOneAndVerifyThatItIsVisible();
    }

    @When("Hover over Sub Sub Item Two and verify that is visible")
    public void hoverOverSubSubItemTwoAndVerifyThatIsVisible() {
        widgets.hoverOverSubSubItemTwoAndVerifyThatIsVisible();
    }

    @When("Click {string}")
    public void click(String menu) {
        widgets.click(menu);
    }

    @Then("The redirect url must be {string}")
    public void theRedirectUrlMustBe(String url) {
        widgets.theRedirectUrlMustBe(url);
    }

    @When("Click to Sub Item One")
    public void clickToSubItemOne() {
        widgets.clickToSubItemOne();
    }

    @When("Click to Sub Item Two")
    public void clickToSubItemTwo() {
        widgets.clickToSubItemTwo();
    }

    @When("Click to Sub List")
    public void clickToSubList() {
        widgets.clickToSubList();
    }

    @And("Hover over Sub Item Two and verify that it is visible")
    public void hoverOverSubItemTwoAndVerifyThatItIsVisible() {
        widgets.hoverOverSubItemTwoAndVerifyThatItIsVisible();
    }

    @When("Hover over Sub Sub Item One and verify that is visible")
    public void hoverOverSubSubItemOneAndVerifyThatIsVisible() {
        widgets.hoverOverSubSubItemOneAndVerifyThatIsVisible();
    }

    @Given("User is on Select Menu")
    public void userIsOnSelectMenu() {
        widgets.userIsOnSelectMenu();
    }

    @When("Select value")
    public void selectValue() {
        widgets.selectValue();
    }

    @Then("Value must be selected")
    public void valueMustBeSelected() {
        widgets.valueMustBeSelected();
    }

    @When("Select title")
    public void selectTitle() {
        widgets.selectTitle();
    }

    @Then("Title must be selected")
    public void titleMustBeSelected() {
        widgets.titleMustBeSelected();
    }

    @When("Select color")
    public void selectColor() {
        widgets.selectColor();
    }

    @Then("Color must be selected")
    public void colorMustBeSelected() {
        widgets.colorMustBeSelected();
    }

    @And("Select multiple color")
    public void selectMultipleColor() {
        widgets.selectMultipleColor();
    }

    @Then("Two color must be selected")
    public void twoColorMustBeSelected() {
        widgets.twoColorMustBeSelected();
    }

    @When("Select brand")
    public void selectBrand() {
        widgets.selectBrand();
    }

    @Then("Brand must be selected")
    public void brandMustBeSelected() {
        widgets.brandMustBeSelected();
    }
}
