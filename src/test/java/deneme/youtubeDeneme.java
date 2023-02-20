package deneme;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class youtubeDeneme {

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

    @After
    public void teardown(){
        driver.close();
    }

    @Test
    public void youtubeBot() throws InterruptedException {
        driver.get("https://www.youtube.com");
        WebElement element = driver.findElement(By.xpath("//*[@name='search_query']"));
        element.click();
        element.sendKeys("mabel"+ Keys.ENTER);
        driver.findElement(By.xpath("//a[@id='video-title']")).click();
        //driver.findElement(By.xpath("//button[@class='ytp-mute-button ytp-button']")).click();
        Thread.sleep(10000);
        driver.navigate().back();
    }
}
