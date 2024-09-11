package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
}
