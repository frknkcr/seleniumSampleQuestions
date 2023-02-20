package deneme;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class AmazonDeneme {

    WebDriver driver;
    ChromeOptions options;

    @Before
    public void setup(){
        options = new ChromeOptions();
        options.addExtensions(new File("uBlock.crx"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        // Sayfayi bir ekran boyutu asagi kaydirmak icin asagidaki kodlar kullanilir
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0, 2000)");
        driver.findElement(By.xpath("//img[@alt='Shop Laptops & Tablets']")).click();

    }
}
