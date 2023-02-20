package study;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumSoru03 {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void teardown(){
        //9. Sayfayi kapatin
        driver.close();
    }


    @Test
    public void test01() throws InterruptedException {

        //1. “https://www.saucedemo.com” Adresine gidin
        driver.navigate().to("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //4. Login tusuna basin
        driver.findElement(By.xpath("//*[@id='login-button']")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrunElement = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String ilkUrunStr = ilkUrunElement.getText();
        ilkUrunElement.click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_link")).click();

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        driver.findElement(By.className("inventory_item_name")).isDisplayed();
        Thread.sleep(Duration.ofSeconds(2));

        Assert.assertTrue(driver.findElement(By.className("inventory_item_name")).isDisplayed());

    }
}
