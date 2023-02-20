package deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.click();
        firstname.sendKeys("mahmut");
        driver.findElement(By.id("cookieChoiceDismiss")).click();
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.click();
        lastname.sendKeys("yatak");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-3")).click();
        driver.findElement(By.id("datepicker")).sendKeys("2023-02-20");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).click();
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        driver.findElement(By.id("submit")).click();
        driver.close();
        // Sayfayi bir ekran boyutu asagi kaydirmak icin asagidaki kodlar kullanilir
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(1000, 2000)");

    }
}
