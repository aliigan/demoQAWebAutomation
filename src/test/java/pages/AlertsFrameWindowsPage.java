package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class AlertsFrameWindowsPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    ElementHelper elementHelper;

    public AlertsFrameWindowsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickToAlertsFrameAndWindowsButton() {
        elementHelper.scrollByAmount(driver, 200);
        elementHelper.sleep(3000);
        By alertsFrameWindowsMenu = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/*[name()='svg'][1]");
        elementHelper.click(alertsFrameWindowsMenu);
    }

    public void userIsOnBrowserWindowsMenu() {
        By browserMenu = By.xpath("//span[normalize-space()='Browser Windows']");
        elementHelper.click(browserMenu);
    }

    public void clickToOpenNewTabButton() {
        By newTabButton = By.xpath("//button[@id='tabButton']");
        elementHelper.click(newTabButton);
    }

    public void aNewTabMustBeOpen() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, "https://demoqa.com/sample");
    }

    public void clickToOpenNewWindowButton() {
        By newWindowButton = By.xpath("//button[@id='windowButton']");
        elementHelper.click(newWindowButton);
    }

    public void aNewWindowMustBeOpen() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String newTabUrl = driver.getCurrentUrl();
        Assert.assertEquals(newTabUrl, "https://demoqa.com/sample");
    }

    public void clickToOpenNewWindowMessageButton() {
        By newWindowMessage = By.xpath("//button[@id='messageWindowButton']");
        elementHelper.click(newWindowMessage);
    }

    public void aNewWindowMessageMustBeOpen() {
        Set<String> allWindows = driver.getWindowHandles();
        boolean isNewWindowOpened = allWindows.size() > 1;
        Assert.assertTrue(isNewWindowOpened, "Yeni pencere açılmadı.");
    }

    public void userIsOnAlertMenu() {
        By alertsMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']");
        elementHelper.click(alertsMenu);
    }

    public void clickToAlertButton() {
        By alertButton = By.xpath("//button[@id='alertButton']");
        elementHelper.click(alertButton);
    }

    public void alertMessageMustBeOpen() {
      //todo pop up hareketleri sayfa kaynağında görüntülenemiyor. araştırılacak
    }

    public void clickToOkButton() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void userMustBeOnAlertPage() {
        By pageTitle = By.xpath("//h1[@class='text-center']");
        elementHelper.testWebElementText(pageTitle, "Alerts");
    }

    public void clickToTimedAlertButton() {
        By timedAlert = By.xpath("//button[@id='timerAlertButton']");
        elementHelper.click(timedAlert);
    }

    public void theAlertMessageMustBePopUpAfterSeconds(int seconds) {
        //todo pop up hareketleri sayfa kaynağında görüntülenemiyor. araştırılacak
    }

    public void clickToOkButtonAtTimedAlert() {
        elementHelper.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickToConfirmAlertButton() {
        By confirmAlert = By.xpath("//button[@id='confirmButton']");
        elementHelper.click(confirmAlert);
    }

    public void clickOkOnTheAlertMessage() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyThatTheOkButtonWasClicked() {
        By clickOkMessage = By.xpath("//span[@id='confirmResult']");
        elementHelper.testWebElementText(clickOkMessage, "You selected Ok");
    }

    public void clickCancelOnTheAlertMessage() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
}

    public void verifyThatTheCancelButtonWasClicked() {
        By clickCancelMessage = By.xpath("//span[@id='confirmResult']");
        elementHelper.testWebElementText(clickCancelMessage, "You selected Cancel");
    }

    public void clickToPromtBoxAlertButton() {
        By promtButton = By.xpath("//button[@id='promtButton']");
        elementHelper.click(promtButton);
    }

    public void writeToThePromtBox(String name) {
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(name);
        promptAlert.accept();
    }

    public void clickOkOnThePromtBoxAlert() {

    }

    public void checkThatWritingWasSuccessful(String name) {
        elementHelper.sleep(10000);
        By checkName = By.xpath("//span[@id='promptResult']");
        elementHelper.testWebElementText(checkName, name);
    }

    public void userIsOnFramesMenu() {
        By frameMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
        elementHelper.click(frameMenu);
    }

    public void switchToAndGetTheText(String frame) {
        driver.switchTo().frame(frame);
    }

    public void textMustBeThisIsASamplePageInFirstFrame() {
        By firstFrame = By.xpath("//h1[@id='sampleHeading']");
        elementHelper.testWebElementText(firstFrame, "This is a sample page");
        driver.switchTo().defaultContent();
    }

    public void textMustBeThisIsASamplePageInSecondFrame() {
        By secondFrame = By.xpath("//h1[@id='sampleHeading']");
        elementHelper.testWebElementText(secondFrame, "This is a sample page");
        driver.switchTo().defaultContent();
    }
}
