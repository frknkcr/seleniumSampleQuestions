package calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumSoru02 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.google.com/ adresine gidin
        driver.navigate().to("https://www.google.com/");

        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expecdet = "Google";
        String actual = driver.getTitle();

        if (actual.contains(expecdet)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        //5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nutella"+ Keys.ENTER);

        //6- Bulunan sonuc sayisini yazdirin
        String aramaSayisi = driver.findElement(By.id("result-stats")).getText();

        System.out.println("Bulunan sonuc: "+aramaSayisi);

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String[] aramaSayisiArr = aramaSayisi.split(" ");

        int aramaSayisiInt = Integer.parseInt(aramaSayisiArr[1].replaceAll("\\D",""));

        if (aramaSayisiInt>10000000){
            System.out.println("Arama sayisi testi Passed");
        }else {
            System.out.println("Arama sayisi testi Failed");
        }

        //8- Sayfayi kapatin
        driver.close();


    }
}
