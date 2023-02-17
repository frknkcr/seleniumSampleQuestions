package calisma;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumSoru01 {
    public static void main(String[] args) {


        /*
        1. http://zero.webappsecurity.com sayfasina gidin
        2. Signin buttonuna tiklayin
        3. Login alanine “username” yazdirin
        4. Password alanine “password” yazdirin
        5. Sign in buttonuna tiklayin
        6. Pay Bills sayfasina gidin
        7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        8. tarih kismina “2020-09-10” yazdirin
        9. Pay buttonuna tiklayin
        10. “The payment was successfully submitted.” mesajinin
        ciktigini test edin
        */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");

        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        WebElement isim=driver.findElement(By.xpath("//input[@id='user_login']"));
        isim.sendKeys("username");

        WebElement password=driver.findElement(By.xpath("//input[@id='user_password']"));
        password.sendKeys("password");

        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.navigate().back();

        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();

        driver.findElement(By.id("pay_bills_link")).click();

        WebElement amount=driver.findElement(By.id("sp_amount"));
        amount.sendKeys("200");

        WebElement date1=driver.findElement(By.id("sp_date"));
        date1.sendKeys("2020-09-10");

        driver.findElement(By.id("pay_saved_payees")).click();
        WebElement acual=driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));

        if (acual.isDisplayed()){
            System.out.println("Mesaj test PASSED");
        }else {
            System.out.println("Mesaj test FAILED");
        }
        driver.close();
    }
}
