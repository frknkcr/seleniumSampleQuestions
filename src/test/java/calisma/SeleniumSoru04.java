package calisma;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumSoru04 {

    //1) Bir class oluşturun: YoutubeAssertions

    //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin





    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2) https://www.youtube.com adresine gidin
        driver.get("https://youtube.com");
    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void titleTest(){

        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        Assert.assertEquals("YouTube",driver.getTitle());

    }

    @Test
    public void imageTest(){
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]")).isDisplayed());

    }

    @Test
    public void searchBoxTest(){
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(driver.findElement(By.name("search_query")).isEnabled());

    }

    @Test
    public void wrongTitleTest(){
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertNotEquals("youtube",driver.getTitle());

    }



}
