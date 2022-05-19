import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class WebPage {
    private WebDriver driver;
    public By searchField = By.id("twotabsearchtextbox");

    public By searchButton = By.id("nav-search-submit-button");

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
}
