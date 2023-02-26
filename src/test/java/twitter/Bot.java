package twitter;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Bot extends TestBase {
    @Test
    public void test01(){

        driver.get("https:/www.twitter.com");
        driver.findElement(By.xpath("//div//span//span[text()='Giriş yap']")).click();
        driver.findElement(By.xpath("//div//div//input[@name='text']")).sendKeys("frknkcr25@gmail.com");
        driver.findElement(By.xpath("//div//span//span[text()='İleri']")).click();

        WebElement guvenlikDogrulama = driver.findElement(By.xpath("//h1[@dir='ltr']"));
        if (guvenlikDogrulama.isDisplayed()){
            driver.findElement(By.xpath("//input[@data-testid='ocfEnterTextTextInput']")).sendKeys("@masimovleb");
            driver.findElement(By.xpath("//span[text()='İleri']")).click();
        }

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("25071532frknkcr.");
        driver.findElement(By.xpath("(//span[text()='Giriş yap'])[2]")).click();
        driver.findElement(By.xpath("//*[@aria-label='Diğer menü öğeleri']")).click();
        driver.findElement(By.xpath("//*[text()='Ayarlar ve Destek']")).click();
        driver.findElement(By.xpath("//span[text()='Ayarlar ve gizlilik']")).click();
        driver.findElement(By.xpath("//span[text()='Gizlilik ve güvenlik']")).click();
        driver.findElement(By.xpath("//span[text()='Gördüğün içerik']")).click();
        driver.findElement(By.xpath("//span[text()='İlgi Alanları']")).click();
        int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(size);
        Actions actions = new Actions(driver);
        int count = 0;

        WebElement element = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-kemksi r-ymttw5 r-1yzf0co'])["+1+"]"));
            //actions.sendKeys(Keys.ARROW_DOWN).perform();
        element.click();
        Assert.assertTrue(element.isSelected());




    }
}
