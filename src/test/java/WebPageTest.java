import org.junit.jupiter.api.Test;

public class WebPageTest extends BaseTest
{

    @Test
    public void amazonEndToEnd() throws InterruptedException {

        //3 sn beklenir
        webPage.waitSeconds(3);

        //ürün arama alanına tıklanır.
        webPage.clickOnElement(webPage.searchField);

        //3 sn beklenir
        webPage.waitSeconds(3);

        //ürün arama alanına 'computer' yazılır
        webPage.sendKeysToElement(webPage.searchField, "computer");

        //3 sn beklenir
        webPage.waitSeconds(3);

        //ara butonuna tıklanır
        webPage.clickOnElement(webPage.searchButton);

        //3 sn beklenir
        webPage.waitSeconds(3);

    }
}
