import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PracticeFormPageTest extends BaseTest
{

    @Test
    public void setName(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        practiceFormPage.setName("Gökhan");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void setLastName(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        practiceFormPage.setLastName("Uçar");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void setEmail(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        practiceFormPage.setEmail("denemetest@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
