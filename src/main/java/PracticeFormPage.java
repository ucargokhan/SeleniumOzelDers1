import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {
    private WebDriver driver;

    private By name = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.cssSelector("input[class='mr-sm-2 form-control']");

    public PracticeFormPage(WebDriver driver){
        this.driver = driver;
    }

    public void setName(String nameText){
        WebElement nameField = driver.findElement(name);
        nameField.click();
        nameField.sendKeys(nameText);
    }

    public void setLastName(String lastNameText){
        WebElement lastNameField = driver.findElement(lastName);
        lastNameField.click();
        lastNameField.sendKeys(lastNameText);
    }

    public void setEmail(String emailText){
        WebElement emailField = driver.findElement(email);
        emailField.click();
        emailField.sendKeys(emailText);
    }
}
