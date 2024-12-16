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

public class FormsPage {
    
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    ElementHelper elementHelper;
    
    public FormsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        this.elementHelper = new ElementHelper(driver);
    }

    By submit = By.xpath("//button[@id='submit']");

    public void clickToFormsButton() {
        elementHelper.scrollByAmount(driver, 200);
        elementHelper.sleep(3000);
        By formsMenu = By.xpath("//div[@class='home-body']//div[2]//div[1]//div[2]//*[name()='svg']");
        elementHelper.click(formsMenu);
    }

    public void userIsOnPractiseFormMenu() {
        By practiseForm = By.xpath("//span[normalize-space()='Practice Form']");
        elementHelper.click(practiseForm);
    }

    public void writeFirstName(String firstName) {
        By firstName_ = By.xpath("//input[@id='firstName']");
        elementHelper.sendKey(firstName_, firstName);
    }

    public void writeLastName(String lastName) {
        By lastName_ = By.xpath("//input[@id='lastName']");
        elementHelper.sendKey(lastName_, lastName);
        elementHelper.scrollByAmount(driver, 100);
    }

    public void writeEmail(String email) {
        By email_ = By.xpath("//input[@id='userEmail']");
        elementHelper.sendKey(email_, email);
    }

    public void selectGender() {
        By gender = By.xpath("//label[@for='gender-radio-1']");
        elementHelper.sleep(500);
        elementHelper.click(gender);
    }

    public void writeMobile(String mobile) {
        By mobile_ = By.xpath("//input[@id='userNumber']");
        elementHelper.sendKey(mobile_, mobile);
        elementHelper.scrollToElement(submit);
    }

    public void selectDateOfBirth() {
        By clickDateInput = By.xpath("//input[@id='dateOfBirthInput']");
        elementHelper.click(clickDateInput);
        By clickYear = By.xpath("//select[@class='react-datepicker__year-select']");
        elementHelper.click(clickYear);
        //select year
        for(int i = 1; i <= 10; i++){
            actions.sendKeys(Keys.ARROW_UP).perform();
        }
        actions.sendKeys(Keys.ENTER).perform();
        //select day
        elementHelper.sleep(500);
        By selectDay = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]");
        elementHelper.click(selectDay);
        elementHelper.sleep(500);
    }

    public void selectSubject(String subject) {
        By subjects = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]");
        elementHelper.click(subjects);
//        elementHelper.sendKey(subjects, subject);
        actions.sendKeys(subject).perform();
        elementHelper.sleep(1000);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void selectAllHobbiesOnTheForm() {
        By sports = By.xpath("//label[@for='hobbies-checkbox-1']");
        elementHelper.click(sports);
        elementHelper.sleep(500);
        By reading = By.xpath("//label[@for='hobbies-checkbox-2']");
        elementHelper.click(reading);
        elementHelper.sleep(500);
        By music = By.xpath("//label[@for='hobbies-checkbox-3']");
        elementHelper.click(music);
        elementHelper.sleep(500);
    }

    public void uploadAPictureAtThisPath(String path) {
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        uploadElement.sendKeys("C:\\Users\\ahmet\\Downloads\\sampleFile.jpeg");
        elementHelper.sleep(5000);
    }


    public void checkIfTheImageIsLoaded() {
        By uploadedFile = By.xpath("//input[@id='uploadPicture']");
        Assert.assertTrue(elementHelper.isElementPresent(driver, uploadedFile));
    }

    public void writeCurrentAddress(String address) {
        By currentAddress = By.xpath("//textarea[@id='currentAddress']");
        elementHelper.sendKey(currentAddress, address);
    }

    public void selectState(String state) {
        By state_ = By.xpath("//div[contains(text(),'Select State')]");
        elementHelper.click(state_);
        actions.sendKeys(state).perform();
        elementHelper.sleep(400);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void selectCity(String city) {
        By city_ = By.xpath("//div[contains(text(),'Select City')]");
        elementHelper.click(city_);
        actions.sendKeys(city).perform();
        elementHelper.sleep(400);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void clickSubmitButton() {
        elementHelper.click(submit);
    }

    public void theScreenContainingTheFormInformationShouldOpen() {
        By checkName = By.xpath("//td[contains(text(),'Ahmet Ali İĞAN')]");
        elementHelper.testWebElementText(checkName, "Ahmet Ali İĞAN");
    }

    public void clickToCloseButton() {
        elementHelper.sleep(1000);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    public void returnToThePracticeFormScreen() {
        By checkWithStateAndCityLabel = By.xpath("//label[@id='stateCity-label']");
        elementHelper.testWebElementText(checkWithStateAndCityLabel, "State and City");
    }
}
