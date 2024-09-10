package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public void clickToWidgetsButton() {
        elementHelper.scrollByAmount(driver, 200);
        elementHelper.sleep(3000);
        By widgetsMenu = By.xpath("//*[name()='path' and contains(@d,'M13 13v8h8')]");
        elementHelper.click(widgetsMenu);
    }

    public void userIsOnAccordianMenu() {
        elementHelper.sleep(1000);
        elementHelper.scrollByAmount(driver, 150);
        By accordianMenu = By.xpath("//span[normalize-space()='Accordian']");
        elementHelper.click(accordianMenu);
    }

    public void clickToWhatIsLoremIpsumTitle() {
        By firstTitle = By.xpath("//div[@id='section1Heading']");
        elementHelper.click(firstTitle);
    }

    public void whatIsLoremIpsumTitleMustBeCollapsed() {

        
    }

    public void clickToWhereDoesIsComeFromTitle() {
    }

    public void whereDosIsComeFromTitleMustBeExpanded() {
    }

    public void clickToWhyDoWeUseItTitle() {
    }

    public void whyDoWeUseItTitleMustBeExpanded() {
    }
}
