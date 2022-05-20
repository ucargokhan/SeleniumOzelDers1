import org.junit.jupiter.api.Test;
import org.junit.*;

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

        //ilk ürün labelı tıklanır
        webPage.clickOnElement(webPage.productLocation);

        //3 sn beklenir
        webPage.waitSeconds(3);

        //sepete ekleme butonu tıklanır
        webPage.clickOnElement(webPage.addToCartButton);

        //3 sn beklenir
        webPage.waitSeconds(3);

        //sepete ekleme kontrol et
        webPage.validateIsEquals("Added to Cart", webPage.addToCartSuccessText);

        //3 sn beklenir
        webPage.waitSeconds(3);

        //sepete git tıklanır
        webPage.clickOnElement(webPage.goToCartButton);

    }
}
