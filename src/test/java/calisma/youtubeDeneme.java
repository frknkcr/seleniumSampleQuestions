package calisma;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class youtubeDeneme {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void youtubeBot() throws InterruptedException {
        driver.get("https://www.youtube.com");
        WebElement element = driver.findElement(By.xpath("//input[@name='search_query']"));
        element.click();
        element.sendKeys("gökte yildiz ay misun"+ Keys.ENTER);
        driver.findElement(By.xpath("//a[@id='video-title']")).click();
    }
}
