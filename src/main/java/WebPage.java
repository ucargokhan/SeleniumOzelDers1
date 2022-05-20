import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class WebPage {
    private WebDriver driver;
    public By searchField = By.id("twotabsearchtextbox");

    public By searchButton = By.id("nav-search-submit-button");

    public By productLocation = By.cssSelector("div[class='a-section aok-relative s-image-fixed-height']");

    public By addToCartButton = By.id("add-to-cart-button");

    public String addToCartSuccessText = "Added to Cart";

    public By goToCartButton = By.cssSelector("span[id='sw-gtc']>span[class='a-button-inner']>a[class='a-button-text']");

    public WebPage(WebDriver driver){
        this.driver = driver;
    }

    public void waitSeconds(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public void clickOnElement(By elementPath){
        WebElement element = driver.findElement(elementPath);
        element.click();
    }

    public void sendKeysToElement(By elementPath, String keyText){
        WebElement element = driver.findElement(elementPath);
        element.sendKeys(keyText);
    }

    public void hoverOnElement(By elementPath){
        WebElement element = driver.findElement(elementPath);
        Actions action = new Actions(driver);
        action.moveToElement(element).moveToElement(driver.findElement(elementPath)).click().build().perform();

    }

    public void validateIsEquals(String expectedCondition, String actualCondition){
        Assert.assertEquals(expectedCondition,actualCondition);
    }
}
