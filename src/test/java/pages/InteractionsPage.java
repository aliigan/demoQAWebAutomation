package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class InteractionsPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions actions;

    public InteractionsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    By sortableMenu = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
    By dragableMenu = By.xpath("//span[normalize-space()='Dragabble']");
    public void clickToInteractionsButton() {
        elementHelper.sleep(2000);
        elementHelper.scrollByAmount(driver, 400);
        By interactionsButton = By.xpath("//*[name()='path' and contains(@d,'M880 112H1')]");
        elementHelper.click(interactionsButton);
    }

    public void userIsOnSortableMenu() {
        elementHelper.sleep(100);
        elementHelper.scrollToElement(dragableMenu);
        elementHelper.click(sortableMenu);
    }

    public void ıtemsMustHaveTheFollowingStartingOrder() {

//        //div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']
//        //div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Two']
    }

    public void mustHaveTheFollowingStartingOrder(String item) {
        elementHelper.scrollToElement(sortableMenu);

    }
}
