package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;
import java.util.ArrayList;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ElementsPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions actions;

    By search = By.xpath("//input[@id='searchBox']");
    By email = By.xpath("//input[@id='userEmail']");
    
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

    public void checkThatAUserRecordNamedHasBeenCreated(String name) {
        By element = By.xpath("//p[@id='name']");
        elementHelper.testWebElementText(element, name);
    }

    public void userIsOnCheckBoxPage() {
        By checkBoxMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']");
        elementHelper.click(checkBoxMenu);
    }

    public void clickToHomeCheckBox() {
        By homeCheckBox = By.xpath("//span[@class='rct-checkbox']//*[name()='svg']");
        elementHelper.click(homeCheckBox);
    }

    public void expectedMessage(String expected) {
        By checkBoxClickResult = By.xpath("//span[normalize-space()='You have selected :']");
        elementHelper.testWebElementText(checkBoxClickResult,expected);
    }

    public void userIsOnRadioButtonMenu() {
        By radioButtonMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
        elementHelper.click(radioButtonMenu);
    }

    public void clickToYesRadioButton() {
        By radioButtonClick = By.xpath("//label[@for='yesRadio']");
        elementHelper.click(radioButtonClick);
    }

    public void checkThatTheMessageYouHaveSelectedYesAppearsOnTheScreen() {
        By expectedMessage = By.xpath("//p[@class='mt-3']");
        elementHelper.testWebElementText(expectedMessage, "You have selected Yes");
    }

    public void userIsOnWebTablesMenu() {
        By webTablesMenu = By.xpath("//span[normalize-space()='Web Tables']");
        elementHelper.click(webTablesMenu);
    }

    public void clickToAddButton() {
        By addUser = By.xpath("//button[@id='addNewRecordButton']");
        elementHelper.click(addUser);
    }

    public void checkThatTheRegistrationFormIsOpened() {
        elementHelper.sleep(2000);
        By registrationForm = By.xpath("//div[@id='registration-form-modal']");
        elementHelper.testWebElementText(registrationForm, "Registration Form");
    }

    public void writeFirstNameAs(String name) {
        By firstName = By.xpath("//input[@id='firstName']");
        elementHelper.sendKey(firstName, name);
    }

    public void writeSecondNameAs(String secondName) {
        By secondName_ = By.xpath("//input[@id='lastName']");
        elementHelper.sendKey(secondName_, secondName);
    }

    public void writeUserEmailAs(String email) {
        elementHelper.sendKey(this.email, email);
    }

    public void writeAgeAs(String age) {
        By age_ = By.xpath("//input[@id='age']");
        elementHelper.sendKey(age_, age);
    }

    public void writeSalaryAs(String salary) {
        By salary_ = By.xpath("//input[@id='salary']");
        elementHelper.sendKey(salary_, salary);

    }

    public void writeDepartmentAs(String department) {
        By department_ = By.xpath("//input[@id='department']");
        elementHelper.sendKey(department_, department);
    }

    public void clickRegistrationFormSubmitButton() {
        By submit = By.xpath("//button[@id='submit']");
        elementHelper.click(submit);
    }

    public void checkUser(String user) {
        elementHelper.sleep(1000);
        elementHelper.scrollByAmount(driver, 400);
        elementHelper.sendKey(search, user);
        By expectedUser = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]" +
                "/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
        elementHelper.testWebElementText(expectedUser, user);
    }

    public void search(String name) {
        elementHelper.sendKey(search, name);
    }

    public void clickToEditButton() {
        By edit = By.xpath("//span[@id='edit-record-1']//*[name()='svg']");
        elementHelper.click(edit);
    }

    public void updateEmailAs(String email) {
        elementHelper.deleteAll(this.email);
        elementHelper.sleep(500);
        elementHelper.sendKey(this.email, email);
    }

    public void searchFromList(String email) {
        elementHelper.sendKey(search, email);
    }

    public void checkIfYourEmailIsUpdated(String email) {
        //todo should be transferred here with the updated email cucumber
        By checkEmail = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]");
        elementHelper.testWebElementText(checkEmail, email);
    }

    public void clickToDeleteButton() {
        By delete = By.xpath("//span[@id='delete-record-2']//*[name()='svg']");
        elementHelper.click(delete);
    }

    public void listMustBeEmpty() {
        By emtyListLabel = By.xpath("//div[@class='rt-noData']");
        elementHelper.testWebElementText(emtyListLabel, "No rows found");
    }

    public void userIsOnButtonsMenu() {
        By buttonsMenu = By.xpath("//span[normalize-space()='Buttons']");
        By scrroll = By.xpath("//body/div[@id='app']/div[@class='body-height']" +
                "/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        elementHelper.click(buttonsMenu);
        elementHelper.scrollToElement(scrroll);
        elementHelper.sleep(2000);
    }

    public void doubleClickOnTheDoubleClickMeButton() {
        By doubleClickButton = By.xpath("//button[@id='doubleClickBtn']");
        elementHelper.doubleClick(doubleClickButton);
        elementHelper.sleep(2000);
    }

    public void theMessageIsDisplayedOnTheScreen(String message) {
        if (message.equals("You have done a double click")){
            By doubleClickMessage = By.xpath("//p[@id='doubleClickMessage']");
            elementHelper.testWebElementText(doubleClickMessage, message);
        }else if (message.equals("You have done a right click")){
            By rightClickMessage = By.xpath("//p[@id='rightClickMessage']");
            elementHelper.testWebElementText(rightClickMessage, message);
        }else{
            By leftClickMessage = By.xpath("//p[@id='dynamicClickMessage']");
            elementHelper.testWebElementText(leftClickMessage, message);
        }
    }

    public void rightClickOnTheRightClickMeButton() {
        By rightClickButton = By.xpath("//button[@id='rightClickBtn']");
        elementHelper.rightClick(rightClickButton);
    }

    public void leftClickOnTheClickMeButton() {
        By leftClickButton = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]" +
                "/div[1]/div[2]/div[2]/div[3]/button[1]");
        elementHelper.leftClick(leftClickButton);
    }

    public void userIsOnLinksMenu() {
        By links = By.xpath("//div[@class='element-list collapse show']//li[@id='item-5']");
        elementHelper.click(links);
    }

    public void clickTo(String link) {
        elementHelper.scrollByAmount(driver, 300);
        By link_ = By.xpath(link);
        elementHelper.click(link_);
    }

    public void checkIfANewTabOpens() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String newTabUrl = driver.getCurrentUrl();
        Assert.assertEquals(newTabUrl, "https://demoqa.com/");
    }

    public void checkIfTheApiMessageIs(String message) {
        By messageCode = By.xpath("//b[normalize-space()='" + message + "']");
        elementHelper.isElementPresent(driver, messageCode);
        assertTrue(elementHelper.isElementPresent(driver, messageCode));
    }

    public void userIsOnTheBrokenLinksImagesPage() {
        By brokenLinksImagesPage = By.xpath("//div[@class='element-list collapse show']" +
                "//li[@id='item-6']");
        elementHelper.click(brokenLinksImagesPage);
        By elementForScroll = By.xpath("//div[@class='col-12 mt-4 col-md-6']//div[3]");
        elementHelper.scrollToElement(elementForScroll);
    }

    public void clickToValidLink() {
        By validLink = By.xpath("//a[normalize-space()='Click Here for Valid Link']");
        elementHelper.click(validLink);
    }

    public void checkThatTheLinkIsBeingAccessed(String link) {
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, link);
    }

    public void clickToBrokenLink() {
        By brokenLink = By.xpath("//a[normalize-space()='Click Here for Broken Link']");
        elementHelper.click(brokenLink);
    }

    public void theErrorPageMustBeDisplayed() {
        String errorPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(errorPageUrl, "https://the-internet.herokuapp.com/status_codes/500");
    }

    public void theValidImageShouldBeDisplayed() {
        WebElement image = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']//img[1]"));
        Boolean isImageBroken = (Boolean) ((JavascriptExecutor)driver).executeScript(
                "return arguments[0].naturalWidth == 0", image);

        assertFalse(isImageBroken, "The image is not broken.");
    }

    public void theBrokenImageShouldNotBeDisplayed() {
//        By image = By.xpath("//img[2]");
//        Assert.assertFalse(elementHelper.isElementPresent(driver, image));

        WebElement image = driver.findElement(By.xpath("//img[2]"));
        Boolean isImageBroken = (Boolean) ((JavascriptExecutor)driver).executeScript(
                "return arguments[0].naturalWidth == 0", image);

        assertTrue(isImageBroken, "The image is not broken.");

    }

    public void userIsOnUploadAndDownloadPage() {
        By uploadAndDownloadPage = By.xpath("//span[normalize-space()='Upload and Download']");
        elementHelper.scrollByAmount(driver, 200);
        elementHelper.click(uploadAndDownloadPage);
    }

    public void clickToDownloadButton() {
        WebElement downloadButton = driver.findElement(By.xpath("//a[@id='downloadButton']"));
        downloadButton.click();
        elementHelper.sleep(5000);
    }

    public void theImageMustBeDownloaded() {
        String downloadPath = "C:\\Users\\ahmet\\Downloads";
        String fileName = "sampleFile.jpeg";

        boolean isDownloaded = elementHelper.isFileDownloaded(downloadPath, fileName);

        assertTrue(isDownloaded, "The file was not downloaded.");
    }

    public void clickToUploadButton() {
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        uploadElement.sendKeys("C:\\Users\\ahmet\\Downloads\\sampleFile.jpeg");
        elementHelper.sleep(5000);
    }

    public void theImageMustBeUploaded() {
       By uploadedFile = By.xpath("//p[@id='uploadedFilePath']");
       Assert.assertTrue(elementHelper.isElementPresent(driver, uploadedFile));
    }

    public void userIsOnTheDynamicPropertiesPage() {
        By scrollUntilFormsButton = By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]" +
                "/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]" +
                "/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]" +
                "/div[contains(@class,'accordion')]/div[2]/span[1]/div[1]");
        elementHelper.scrollToElement(scrollUntilFormsButton);
        By dynamicPropertiesPage = By.xpath("//span[normalize-space()='Dynamic Properties']");
        elementHelper.click(dynamicPropertiesPage);
    }

    public void theEnableAfterSecondsButtonShouldBeDisabled() {
        By disabledButton = By.xpath("//button[@id='enableAfter' and @disabled and @type='button']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, disabledButton));
//        Assert.assertFalse(elementHelper.isButtonClickable(enabledButton));
    }

    public void waitForSeconds(int seconds) {
        long time = seconds* 1000L;
        elementHelper.sleep(time);
    }

    public void theEnableAfterSecondsButtonShouldBeEnabled() {
        By enabledButton = By.xpath("//button[@id='enableAfter' and @type='button']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, enabledButton));
    }

    public void theColorChangeButtonShouldHaveABlueBackgroundColor() {
        By blueButton = By.xpath("//button[@id='colorChange' and @class='mt-4 btn btn-primary']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, blueButton));
    }


    public void theColorChangeButtonShouldChangeItsBackgroundColorToRedd() {
        By redButton = By.xpath("//button[@id='colorChange' and " +
                "@class='mt-4 text-danger btn btn-primary']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, redButton));

    }


    public void theVisibleAfterSecondsButtonShouldNotBeVisible() {
        By button = By.xpath("//button[@id='visibleAfter']");
//        Assert.assertEquals(element.getText(), "Visible After 5 Seconds" );
        elementHelper.isElementVisible(button);
        System.out.println(elementHelper.isElementVisible(button));
    }

    public void theVisibleAfterFiveSecondsButtonShouldBeVisible() {
        By visible  = By.xpath("//button[@id='visibleAfter' and @type='button' " +
                "and  @class='mt-4 btn btn-primary']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, visible));
    }


}
