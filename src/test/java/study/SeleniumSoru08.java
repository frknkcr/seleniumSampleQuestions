package study;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class SeleniumSoru08 extends TestBase {
    @Test
    public void test01(){

        //1."http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");

        //2."Login Portal" a kadar asagi inin
        WebElement loginPortalElement = driver.findElement(By.id("login-portal"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();",loginPortalElement);

        //3."Login Portal" a tiklayin
        String ilkHandle = driver.getWindowHandle();
        loginPortalElement.click();

        //4.Diger window'a gecin
        //5."username" ve "password" kutularina deger yazdirin
        Actions actions =new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys("username").perform();

        //6."login" butonuna basin
        driver.findElement(By.id("login-button")).click();

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin


        //8.Ok diyerek Popup'i kapatin
        //9.Ilk sayfaya geri donun
        //10.Ilk sayfaya donuldugunu test edin



    }
}
