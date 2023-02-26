package deneme;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;



public class youtubeDeneme extends TestBase {

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
