package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;

public class WidgetsPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions actions;

    public WidgetsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
        this.actions = new Actions(driver);
    }

    By verifyColapseFirstTitle = By.xpath("//div[@class='collapse show']/div[@id='section1Content']");
    By secondTitle = By.xpath("//div[@id='section2Heading']");
    By expendedSecondTitle = By.xpath("//div[@class='collapse show']/div[@id='section2Content']");
    By expendedThirdTitle = By.xpath("//div[@class='collapse show']/div[@id='section3Content']");
    By toolTipsMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-6']");
    By datePickerInput = By.xpath("//input[@id='dateAndTimePickerInput']");
    By progressBarStartStopButton = By.xpath("//button[@id='startStopButton']");
    By selectMenuMenu = By.xpath("//span[normalize-space()='Select Menu']");
    By bookStoreApplicationMenu = By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[6]/span[1]/div[1]/div[1]");
    public void clickToWidgetsButton() {
        elementHelper.scrollByAmount(driver, 200);
        elementHelper.sleep(3000);
        By widgetsMenu = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]");
        elementHelper.click(widgetsMenu);
    }

    public void userIsOnAccordianMenu() {
        By accordianMenu = By.xpath("//span[normalize-space()='Accordian']");
        elementHelper.click(accordianMenu);
    }

    public void clickToWhatIsLoremIpsumTitle() {
        Assert.assertTrue(elementHelper.isElementVisible(verifyColapseFirstTitle));
        elementHelper.scrollToElement(secondTitle);
        By firstTitle = By.xpath("//div[@id='section1Heading']");
        elementHelper.click(firstTitle);
    }

    public void whatIsLoremIpsumTitleMustBeCollapsed() {
        Assert.assertFalse(elementHelper.isElementVisible(verifyColapseFirstTitle));
    }

    public void clickToWhereDoesIsComeFromTitle() {
        Assert.assertFalse(elementHelper.isElementVisible(expendedSecondTitle));
        By secondTitle = By.xpath("//div[@id='section2Heading']");
        elementHelper.click(secondTitle);
    }

    public void whereDosIsComeFromTitleMustBeExpanded() {
        Assert.assertTrue(elementHelper.isElementVisible(expendedSecondTitle));
    }

    public void clickToWhyDoWeUseItTitle() {
        Assert.assertFalse(elementHelper.isElementVisible(expendedThirdTitle));
        By scrollUntilSelectMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-8']");
        elementHelper.scrollToElement(scrollUntilSelectMenu);
        elementHelper.scrollByAmount(driver, 200);
        By thirdTitle = By.xpath("//div[@id='section3Heading']");
        elementHelper.click(thirdTitle);
    }

    public void whyDoWeUseItTitleMustBeExpanded() {
        Assert.assertTrue(elementHelper.isElementVisible(expendedThirdTitle));
    }

    public void userIsOnAutoComplateMenu() {
        elementHelper.scrollToElement(toolTipsMenu);
        By autoComplateMenu = By.xpath("//span[normalize-space()='Auto Complete']");
        elementHelper.click(autoComplateMenu);
    }

    public void typeAndSelectTwoItemInTheAutocompleteList(String color) {
        elementHelper.scrollToElement(toolTipsMenu);
        elementHelper.sleep(1000);
        By typeMultipleColorNamesInp = By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']");
        elementHelper.click(typeMultipleColorNamesInp);
        elementHelper.sleep(1000);
        actions.sendKeys(color).perform();
        elementHelper.sleep(500);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(color).sendKeys(Keys.ENTER).perform();
    }

    public void theFirstColorMustBeSelectedAndDisplayedInTheInput() {
        By selectedFirstColor = By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']");
        elementHelper.testWebElementText(selectedFirstColor, "Black");
    }

    public void theSecondColorMustBeSelectedAndDisplayedInTheInput() {
        By selectedSecondColor = By.xpath("//div[contains(text(),'Blue')]");
        elementHelper.testWebElementText(selectedSecondColor, "Blue");
    }


    public void typeAndSelectTheItemInTheAutocompleteList(String color) {
        elementHelper.scrollToElement(toolTipsMenu);
        By typeSingleColorNameInp = By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']");
        elementHelper.click(typeSingleColorNameInp);
        actions.sendKeys(color).perform();
        elementHelper.sleep(1000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    }

    public void theColorMustBeSelectedAndDisplayedInTheInput() {
        By selectedColor = By.xpath("//div[@class='auto-complete__single-value css-1uccc91-singleValue']");
        elementHelper.testWebElementText(selectedColor, "Yellow");
    }

    public void userIsOnDatePickerMenu() {
        By datePickerMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
        elementHelper.scrollToElement(toolTipsMenu);
        elementHelper.click(datePickerMenu);
    }

    public void updateTheDateInTheSelectDateInputWith(String date) {
        elementHelper.scrollToElement(toolTipsMenu);
        By selectDateInput = By.xpath("//input[@id='datePickerMonthYearInput']");
        elementHelper.click(selectDateInput);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.sendKeys(Keys.BACK_SPACE).perform();
        elementHelper.sleep(1000);
        actions.sendKeys(date).perform();
        elementHelper.sleep(1000);
        actions.sendKeys(Keys.ENTER).perform();
        elementHelper.sleep(1000);
    }

    public void dateMustBeSelected(String date) {
        WebElement selectedDate = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
        elementHelper.scrollToElement(toolTipsMenu);
        String dateValue = selectedDate.getAttribute("value");
        Assert.assertEquals(dateValue, date);
    }

    public void clickToDatePicker() {
        elementHelper.click(datePickerInput);
    }

    public void chooseMonth() {
        By clickMonthArea = By.xpath("//span[@class='react-datepicker__month-read-view--selected-month']");
        elementHelper.click(clickMonthArea);
        By clickMonth = By.xpath("//div[@class='react-datepicker__month-dropdown']//div[1]");
        elementHelper.click(clickMonth);
    }

    public void chooseYear() {
        By clickYearArea = By.xpath("//span[@class='react-datepicker__year-read-view--selected-year']");
        elementHelper.click(clickYearArea);
        elementHelper.sleep(1000);
        By clickYear = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[8]");
        elementHelper.click(clickYear);
    }

    public void selectDay() {
        By day = By.xpath("//div[@aria-label='Choose Sunday, January 15th, 2023']");
        elementHelper.click(day);
    }


    public void selectTime() {
        By time = By.xpath("//li[normalize-space()='22:45']");
        elementHelper.click(time);
    }

    public void checkThatTheSelectedTimeIs(String time) {
        WebElement selectedDate = driver.findElement(datePickerInput);
        String dateValue = selectedDate.getAttribute("value");
        Assert.assertEquals(dateValue, time);
    }

    public void userIsOnSliderMenu() {
        elementHelper.scrollToElement(toolTipsMenu);
        By sliderMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']");
        elementHelper.click(sliderMenu);
    }

    public void moveTheSliderPixels(int pixels) {

        boolean testResult = true;

        if (pixels == 0) {
            testResult = false;
        }
        Assert.assertTrue(testResult, "Pixel value must be entered other than 0.");

        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        actions.clickAndHold(slider).moveByOffset(pixels, 0).perform();
    }

    public void checkIfTheShiftValueHasChanged() {
        WebElement sliderValueInp = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));
        String value = sliderValueInp.getAttribute("value");

        boolean result;

        if(!value.equals("25"))
            result = true;
        else
            result = false;

        Assert.assertTrue(result);
    }

    public void userIsOnProgressBarMenu() {
        elementHelper.scrollToElement(toolTipsMenu);
        By progressBarMenu = By.xpath("//span[normalize-space()='Progress Bar']");
        elementHelper.click(progressBarMenu);
    }

    public void clickProgressBarStartButton() {
        elementHelper.scrollToElement(toolTipsMenu);
        elementHelper.click(progressBarStartStopButton);
    }

    public void waitSecondsAndClickToStopButton(int seconds) {
        seconds *= 1000;
        elementHelper.sleep(seconds);
        elementHelper.click(progressBarStartStopButton);
    }

    public void theProgressBarValueMustBeNonZero() {
        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
        String progressBarValue = progressBar.getAttribute("aria-valuenow");
        boolean result = true;

        if (progressBarValue.equals("0"))
            result = false;

        Assert.assertTrue(result);

    }

    public void waitUntilTheProgressBarIsFullAndClickTheResetButton() {
        elementHelper.sleep(11000);
        By resetButton = By.xpath("//button[@id='resetButton']");
        elementHelper.click(resetButton);
    }

    public void theProgressBarValueMustBeZero() {
        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
        String progressBarValue = progressBar.getAttribute("aria-valuenow");
        boolean result = true;

        if (!progressBarValue.equals("0"))
            result = false;

        Assert.assertTrue(result);
    }

    public void userIsOnTabsMenu() {
        elementHelper.scrollToElement(toolTipsMenu);
        By tabsMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-5']");
        elementHelper.click(tabsMenu);
    }

    public void clickTab(String tab) {
        elementHelper.scrollToElement(toolTipsMenu);
        By selectedTab = By.xpath("//a[@id='demo-tab-" + tab + "']");
        elementHelper.click(selectedTab);
    }

    public void theTextUnderTheOriginMustBeViewable() {
        WebElement contentElement = driver.findElement(By.xpath("//p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]"));
        String content = contentElement.getText();
        String uniqueWord = "roots";
        String partialContent = content.substring(0, content.indexOf(uniqueWord) + uniqueWord.length());
        String expectedPartialContent = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots";
        Assert.assertEquals(partialContent, expectedPartialContent);
    }

    public void theTextUnderTheUseMustBeViewable() {
        WebElement contentElement = driver.findElement(By.xpath("//p[contains(text(),'It is a long established fact that a reader will b')]"));
        String content = contentElement.getText();
        String uniqueWord = "established";
        String partialContent = content.substring(0, content.indexOf(uniqueWord) + uniqueWord.length());
        String expectedPartialContent = "It is a long established";
        Assert.assertEquals(partialContent, expectedPartialContent);

    }

    public void clickMoreTab() {
        By selectedTab = By.xpath("//nav[@role='tablist']");
        elementHelper.click(selectedTab);
    }

    public void userIsOnToolTipsMenu() {
        elementHelper.scrollToElement(toolTipsMenu);
        elementHelper.click(toolTipsMenu);
    }

    public void hoverOverTheButton() {
        elementHelper.sleep(1000);
        elementHelper.scrollByAmount(driver, 150);
        WebElement button = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
        actions.moveToElement(button).perform();
        elementHelper.sleep(1000);
        By buttonTooltip = By.xpath("//button[@aria-describedby = 'buttonToolTip']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, buttonTooltip));
    }

    public void hoverOverTheInput() {
        elementHelper.scrollByAmount(driver,200);
        WebElement input = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/input[1]"));
        actions.moveToElement(input).perform();
        By inputToolTip = By.xpath("//input[@aria-describedby = 'textFieldToolTip']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, inputToolTip));
    }

    public void hoverOverTheContraryWord() {
        elementHelper.scrollByAmount(driver, 50);
        WebElement text = driver.findElement(By.xpath("//a[normalize-space()='Contrary']"));
        actions.moveToElement(text).perform();
        elementHelper.sleep(1000);
        By textToolTip = By.xpath("//a[@aria-describedby='contraryTexToolTip']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, textToolTip));
    }

    public void hoverOverThe(String data) {
        WebElement text = driver.findElement(By.xpath("//a[normalize-space()='" + data + "']"));
        actions.moveToElement(text).perform();
        elementHelper.sleep(1000);
        By textToolTip = By.xpath("//a[@aria-describedby='sectionToolTip']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, textToolTip));
    }

}
