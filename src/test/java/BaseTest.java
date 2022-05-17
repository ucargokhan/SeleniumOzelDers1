import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    PracticeFormPage practiceFormPage;

    @BeforeAll
    public void setUp()
    {
        System.out.println("Driver ayağa kaldırılıyor...");
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Driver ayağa kaldırıldı.");

        practiceFormPage = new PracticeFormPage(driver);

        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("İlgili test web sayfası açıldı.");
    }

    @AfterAll
    public void tearDown()
    {
        driver.quit();
        System.out.println("Driver kapatıldı.");
    }

}
