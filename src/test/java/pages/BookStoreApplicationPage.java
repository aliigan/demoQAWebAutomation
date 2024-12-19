package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;
import java.util.ArrayList;

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
        By bookStoreAppButton = By.xpath("//h5[normalize-space()='Book Store Application']");
        elementHelper.click(wait, bookStoreAppButton);
    }

    public void userIsOnLoginPage() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By loginMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
        elementHelper.click(wait, loginMenu);
    }

    public void clickToNewUserButton() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By newUserButton = By.xpath("//button[@id='newUser']");
        elementHelper.click(wait, newUserButton);
    }

    public void writeNameAs(String name) {
        elementHelper.checkVisible(wait, addNewUserRegisterButton);
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
        elementHelper.checkVisible(wait, addNewUserRegisterButton);
        elementHelper.scrollToElement(addNewUserRegisterButton);
        elementHelper.click(wait, addNewUserRegisterButton);
    }

    public void clickTheOKButtonOnTheSuccessfulRegistrationPopUp() {
        elementHelper.sleep(3000);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public void clickToBackToLoginButton() {
        elementHelper.scrollByAmount(driver, 200);
        By backToLoginButton = By.xpath("//button[@id='gotologin']");
        elementHelper.click(wait, backToLoginButton);
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
        elementHelper.checkVisible(wait, login);
        elementHelper.scrollToElement(bookStoreApiMenu);
        elementHelper.click(wait, login);
    }

    public void theUserMustHaveSuccessfullyLoggedIn(String expectedUserName) {
        By userNameText = By.xpath("//label[@id='userName-value']");
        elementHelper.testWebElementText(userNameText, expectedUserName);
    }


    public void clickToLogOutButton() {
        By pageTitle = By.xpath("//span[@class='-pageInfo']");
        elementHelper.checkVisible(wait, pageTitle);
        elementHelper.scrollToElement(pageTitle);
        By logOutButton = By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']");
        elementHelper.click(wait, logOutButton);
    }

    public void userMustBeOnTheLoginPage() {
        By loginPageTitle = By.xpath("//h1[@class='text-center']");
        elementHelper.testWebElementText(loginPageTitle, "Login");
    }

    public void messageMustBeOnTheLoginPage(String message) {
        By message_ = By.xpath("//p[@id='name']");
        elementHelper.testWebElementText(message_, message);
    }

    public void userIsOnBookStorePage() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By bookStoreMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
        elementHelper.click(wait, bookStoreMenu);
    }

    public void clickLoginButton() {
        By login = By.xpath("//button[@id='login']");
        elementHelper.click(wait, login);
    }

    public void userMustBeOnTheBookStorePage() {
        By userNameTitle = By.xpath("//label[@id='userName-label']");
        elementHelper.testWebElementText(userNameTitle, "User Name :");
    }

    public void typeInTheSearchBoxAndSearch(String searchObject) {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By searchInput = By.xpath("//input[@id='searchBox']");
        elementHelper.sendKey(searchInput, searchObject);
    }

    public void clickFirstElementFromList() {
        elementHelper.sleep(2000);
        elementHelper.scrollByAmount(driver, 400);
        By firstElementAtTheList = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]" +
                "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]");
        elementHelper.click(wait, firstElementAtTheList);
    }

    public void theRedirectedUrlMustBe(String url) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, url);
    }

    public void selectFiveRows() {
        By pagination = By.xpath("//select[@aria-label='rows per page']");
        elementHelper.checkVisible(wait, pagination);
        elementHelper.scrollToElement(pagination);
        elementHelper.scrollByAmount(driver, 100);
        elementHelper.click(wait, pagination);
        elementHelper.sleep(500);
        actions.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).perform();
    }

    public void userMustBeOnThePage(String page) {
        WebElement page_ = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]" +
                "/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/span[1]/div[1]/input[1]"));
        String pageValue = page_.getAttribute("value");
        Assert.assertEquals(pageValue, page);
    }

    public void clickToNextButton() {
        By nextButton = By.xpath("//button[normalize-space()='Next']");
        elementHelper.click(wait, nextButton);
    }

    public void clickToPreviousButton() {
        By previousButton = By.xpath("//button[normalize-space()='Previous']");
        elementHelper.click(wait, previousButton);
    }

    public void clickToColumn(String column) {
        By column_ = By.xpath("//div[contains(text(),'" + column + "')]");
        elementHelper.click(wait, column_);
    }

    public void theAuthorOfTheFirstBookListedMustBe(String author) {
        By author_ = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]" +
                "/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]");
        elementHelper.testWebElementText(author_, author);
    }

    public void userIsOnProfileMenu() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By profileMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']");
        elementHelper.click(wait, profileMenu);
    }

    public void clickToLoginWord() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By loginWord = By.xpath("//a[normalize-space()='login']");
        elementHelper.click(wait, loginWord);
    }

    public void userMustBeOnTheProfileMenu() {
        elementHelper.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, "https://demoqa.com/profile");
    }

    public void clickToDeleteAllBooksButton() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By deleteAllBookButton = By.xpath("//div[@class='text-right button di']//button[@id='submit']");
        elementHelper.click(wait, deleteAllBookButton);
        elementHelper.sleep(2000);
    }

    public void clickToCancelAtPopUpThatAppears() {
        By modalCancelButton = By.xpath("//button[@id='closeSmallModal-cancel']");
        elementHelper.click(wait, modalCancelButton);
    }

    public void clickYesAtModalThatAppears() {
        By modalOkButton = By.xpath("//button[@id='closeSmallModal-ok']");
        elementHelper.click(wait, modalOkButton);
    }

    public void clickOkAtPopUpThatAppears() {
        elementHelper.sleep(4000);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }

    public void clickGoToBookStoreButton() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        elementHelper.sleep(2000);
        By bookStoreAppButton = By.xpath("//button[@id='gotoStore']");
        elementHelper.click(wait, bookStoreAppButton);
    }

    public void currentAddressMustBe(String url) {
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, url);
    }

    public void clickToDeleteAccountButton() {
        elementHelper.checkVisible(wait, bookStoreApiMenu);
        elementHelper.scrollToElement(bookStoreApiMenu);
        By deleteAccountButton = By.xpath("//div[@class='text-center button']//button[@id='submit']");
        elementHelper.click(wait, deleteAccountButton);
    }


    public void clickCancelOnTheModalMessage() {
        By modalCancelButton = By.xpath("//button[@id='closeSmallModal-cancel']");
        elementHelper.click(wait, modalCancelButton);
    }


}
