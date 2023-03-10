package deneme;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class trendyolDeneme extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://www.trendyol.com");

        driver.findElement(By.xpath("//*[@src=\"https://cdn.dsmcdn.com/web/production/gender-popup-male.png\"]")).click();

        driver.findElement(By.xpath("//span[text()='Sana Özel']")).click();

        driver.findElement(By.xpath("//span[@class='prdct-desc-cntnr-name']")).click();

        driver.findElement(By.className("add-to-basket-button-text")).click();

        sleep(1);

        driver.findElement(By.xpath("//p[text()='Sepetim']")).click();

        driver.findElement(By.className("i-trash")).click();

        driver.findElement(By.xpath("//*[text()='Sil']")).click();

    }
}
