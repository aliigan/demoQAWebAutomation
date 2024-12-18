package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickToAlertsFrameAndWindowsButton() {
        elementHelper.scrollByAmount(driver, 200);
        By alertsFrameWindowsMenu = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]" +
                "/div[1]/div[3]/div[1]/div[2]/*[name()='svg'][1]");
        elementHelper.click(wait, alertsFrameWindowsMenu);
    }

    public void userIsOnBrowserWindowsMenu() {
        By browserMenu = By.xpath("//span[normalize-space()='Browser Windows']");
        elementHelper.click(wait, browserMenu);
    }

    public void clickToOpenNewTabButton() {
        By newTabButton = By.xpath("//button[@id='tabButton']");
        elementHelper.click(wait, newTabButton);
    }

    public void aNewTabMustBeOpen() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, "https://demoqa.com/sample");
    }

    public void clickToOpenNewWindowButton() {
        By newWindowButton = By.xpath("//button[@id='windowButton']");
        elementHelper.click(wait, newWindowButton);
    }

    public void aNewWindowMustBeOpen() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String newTabUrl = driver.getCurrentUrl();
        Assert.assertEquals(newTabUrl, "https://demoqa.com/sample");
    }

    public void clickToOpenNewWindowMessageButton() {
        By newWindowMessage = By.xpath("//button[@id='messageWindowButton']");
        elementHelper.click(wait, newWindowMessage);
    }

    public void aNewWindowMessageMustBeOpen() {
        Set<String> allWindows = driver.getWindowHandles();
        boolean isNewWindowOpened = allWindows.size() > 1;
        Assert.assertTrue(isNewWindowOpened, "Yeni pencere açılmadı.");
    }

    public void userIsOnAlertMenu() {
        By alertsMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']");
        elementHelper.click(wait, alertsMenu);
    }

    public void clickToAlertButton() {
        By alertButton = By.xpath("//button[@id='alertButton']");
        elementHelper.click(wait, alertButton);
    }

    public void alertMessageMustBeOpen() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        Assert.assertEquals(alertMessage, "You clicked a button");
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
        elementHelper.click(wait, timedAlert);
    }

    public void theAlertMessageMustBePopUpAfterSeconds(int seconds) {
        elementHelper.sleep(seconds*1000);
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        Assert.assertEquals(alertMessage, "This alert appeared after 5 seconds");
    }

    public void clickToOkButtonAtTimedAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickToConfirmAlertButton() {
        By confirmAlert = By.xpath("//button[@id='confirmButton']");
        elementHelper.click(wait, confirmAlert);
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
        elementHelper.click(wait, promtButton);
    }

    public void writeToThePromtBox(String name) {
//        todo tüm alert çıkan menüler bu şekilde düzenlenecek
        Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());
        promptAlert.sendKeys(name);
    }

    public void clickOkOnThePromtBoxAlert() {
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.accept();
    }

    public void checkThatWritingWasSuccessful(String name) {
        By checkName = By.xpath("//span[@id='promptResult']");
        elementHelper.testWebElementText(checkName, name);
    }

    public void userIsOnFramesMenu() {
        By frameMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
        elementHelper.click(wait, frameMenu);
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

    public void userIsOnNestedFramesMenu() {
        By nestedFramesMenu = By.xpath("//span[normalize-space()='Nested Frames']");
        elementHelper.scrollByAmount(driver, 100);
        elementHelper.click(wait, nestedFramesMenu);
    }

    public void switchToParentFrame() {
        driver.switchTo().frame(1);
        elementHelper.sleep(2000);
    }

    public void frameNameMustBe(String frameName) {
        By frame = By.xpath("/html[1]/body[1]");
        elementHelper.testWebElementText(frame, frameName);
    }

    public void switchToChildFrame() {
        driver.switchTo().frame(0);
    }

    public void userIsOnModalDialogsMenu() {
        By modalDialogs = By.xpath("//span[normalize-space()='Modal Dialogs']");
        elementHelper.scrollByAmount(driver, 200);
        elementHelper.click(wait, modalDialogs);
    }

    public void clickToSmallModalButton() {
        By smallModalButton = By.xpath("//button[@id='showSmallModal']");
        elementHelper.click(wait, smallModalButton);
    }

    public void smallModalMustBeOpen() {
        By smallModalTitle = By.xpath("//div[@id='example-modal-sizes-title-sm']");
        elementHelper.testWebElementText(smallModalTitle, "Small Modal");
    }

    public void clickToCloseButtonFor(String closeButton) {
        String idNum = " ";
        if (closeButton.equals("small modal")){
            idNum = "closeSmallModal";
        }
        if (closeButton.equals("large modal")){
            idNum = "closeLargeModal";
        }
        By closeButton_ = By.xpath("//button[@id='" + idNum + "']");
        elementHelper.click(wait, closeButton_);
    }

    public void modalDialogsPageMustBeDisplayed() {
        By modalDialogsPageTitle = By.xpath("//h1[@class='text-center']");
        elementHelper.testWebElementText(modalDialogsPageTitle, "Modal Dialogs");
    }

    public void clickToLargeModalButton() {
        By largeModalButton = By.xpath("//button[@id='showLargeModal']");
        elementHelper.click(wait, largeModalButton);
    }

    public void largeModalMustBeOpen() {
        By largeModalTitle = By.xpath("//div[@id='example-modal-sizes-title-lg']");
        elementHelper.testWebElementText(largeModalTitle, "Large Modal");
    }


}
