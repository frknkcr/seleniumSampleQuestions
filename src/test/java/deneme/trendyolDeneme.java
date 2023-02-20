package deneme;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class trendyolDeneme {

    @Test
    public void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.trendyol.com");

        driver.findElement(By.xpath("//*[@src=\"https://cdn.dsmcdn.com/web/production/gender-popup-male.png\"]")).click();

        driver.findElement(By.xpath("//span[text()='Sana Özel']")).click();

        driver.findElement(By.xpath("//span[@class='prdct-desc-cntnr-name']")).click();

        driver.findElement(By.className("add-to-basket-button-text")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//p[text()='Sepetim']")).click();

        driver.findElement(By.className("i-trash")).click();

        driver.findElement(By.xpath("//*[text()='Sil']")).click();

        driver.close();

    }
}
