package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class BookStoreApplicationPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions actions;

    public BookStoreApplicationPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
        this.actions = new Actions(driver);
    }

    By bookStoreApiMenu = By.xpath("//span[normalize-space()='Book Store API']");
    By addNewUserRegisterButton = By.xpath("//button[@id='register']");
    public void clickToBookStoreApplicationButton() {
        elementHelper.sleep(3000);
        elementHelper.scrollByAmount(driver, 700);
        elementHelper.sleep(500);
        By bookStoreAppButton = By.xpath("//h5[normalize-space()='Book Store Application']");
        elementHelper.click(bookStoreAppButton);
    }

    public void userIsOnLoginPage() {
        elementHelper.scrollToElement(bookStoreApiMenu);
        By loginMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
        elementHelper.click(loginMenu);
    }

    public void clickToNewUserButton() {
        elementHelper.scrollToElement(bookStoreApiMenu);
        By newUserButton = By.xpath("//button[@id='newUser']");
        elementHelper.click(newUserButton);
    }

    public void writeNameAs(String name) {
        elementHelper.scrollToElement(addNewUserRegisterButton);
        By firstName = By.xpath("//input[@id='firstname']");
        elementHelper.sendKey(firstName, name);
    }

    public void writeLastNameAs(String surName) {
        By lastName = By.xpath("//input[@id='lastname']");
        elementHelper.sendKey(lastName, surName);
    }

    public void writeUserNameAs(String userName) {
        By userName_ = By.xpath("//input[@id='userName']");
        elementHelper.sendKey(userName_, userName);
    }

    public void writePasswordAs(String password) {
        By password_ = By.xpath("//input[@id='password']");
        elementHelper.sendKey(password_, password);
    }

    public void clickToCaptchaVerificafation() {
//        By captcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
//        elementHelper.click(captcha);
        elementHelper.sleep(5000);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        elementHelper.sleep(3000);
    }

    public void clickToRegisterButton() {
        elementHelper.scrollToElement(addNewUserRegisterButton);
        elementHelper.click(addNewUserRegisterButton);
    }

    public void clickTheOKButtonOnTheSuccessfulRegistrationPopUp() {
//        elementHelper.sleep(1000);
//        actions.sendKeys(Keys.ENTER).perform();
//        elementHelper.sleep(2000);
        elementHelper.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickToBackToLoginButton() {
        elementHelper.scrollByAmount(driver, 200);
        By backToLoginButton = By.xpath("//button[@id='gotologin']");
        elementHelper.click(backToLoginButton);
    }

    public void enterUserNameAs(String userName) {
        By loginUserName = By.xpath("//input[@id='userName']");
        elementHelper.sendKey(loginUserName, userName);
    }

    public void enterPasswordAs(String password) {
        By loginPassword = By.xpath("//input[@id='password']");
        elementHelper.sendKey(loginPassword, password);
    }

    public void clickToLoginButton() {
        By login = By.xpath("//button[@id='login']");
        elementHelper.click(login);
    }

    public void theUserMustHaveSuccessfullyLoggedIn(String expectedUserName) {
        By userNameText = By.xpath("//label[@id='userName-value']");
        elementHelper.testWebElementText(userNameText, expectedUserName);
    }


    public void clickToLogOutButton() {
        By logOutButton = By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']");
        elementHelper.click(logOutButton);
    }

    public void userMustBeOnTheLoginPage() {
        By loginPageTitle = By.xpath("//h1[@class='text-center']");
        elementHelper.testWebElementText(loginPageTitle, "Login");
    }

    public void messageMustBeOnTheLoginPage(String message) {
        By message_ = By.xpath("//p[@id='name']");
        elementHelper.testWebElementText(message_, message);
    }

}
