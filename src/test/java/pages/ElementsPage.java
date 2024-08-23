package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class ElementsPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions actions;
    
    public ElementsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
        this.actions = new Actions(driver);
    }

    public void userIsOnTextBoxPage() {
        elementHelper.sleep(1000);
        elementHelper.scrollByAmount(driver, 300);
    }

    public void writeFullNameAs(String fullName) {
        By fullName_ = By.xpath("//input[@id='userName']");
        elementHelper.sendKey(fullName_,fullName);
    }

    public void writeEmailAs(String email) {
        By email_ = By.xpath("//input[@id='userEmail']");
        elementHelper.sendKey(email_, email);

    }

    public void writeCurrentAddressAs(String currentAddress) {
        By currentAddress_ = By.xpath("//textarea[@id='currentAddress']");
        elementHelper.sendKey(currentAddress_, currentAddress);
    }

    public void writePermanentAddressAs(String permanentAddress) {
        By permanentAddress_ = By.xpath("//textarea[@id='permanentAddress']");
        elementHelper.sendKey(permanentAddress_, permanentAddress);
    }

    public void clickToSubmitButton() {
        elementHelper.scrollByAmount(driver, 200);
        By submit = By.xpath("//button[@id='submit']");
        elementHelper.click(submit);
    }

    public void checkIfTheRegistrationWasSuccessful() {

    }

    public void clickToElementsButton() {
        elementHelper.sleep(3000);
        elementHelper.scrollByAmount(driver, 200);
        By elements = By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]");
        elementHelper.click(elements);
    }

    public void clickToTextBoxButton() {
        By textBox = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
        elementHelper.click(textBox);
    }
}
