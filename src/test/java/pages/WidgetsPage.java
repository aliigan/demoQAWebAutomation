package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
}
