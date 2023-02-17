package calisma;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumSoru08 {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){

        //    go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //    fill the firstname
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("John");

        //    fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Doe");

        //    check the gender
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();

        // Sayfayi bir ekran boyutu asagi kaydirmak icin asagidaki kodlar kullanilir
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, window.innerHeight)");

        //    check the experience
        driver.findElement(By.xpath("//*[@id='exp-1']")).click();

        //    fill the date
        WebElement dateElement = driver.findElement(By.xpath("//*[@id='datepicker']"));
        dateElement.click();
        dateElement.sendKeys("01-01-1990");

        //    choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();

        //    choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();

        //    choose your continent -> Antartica
        Select continentSelect = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
        continentSelect.selectByVisibleText("Antartica");

        //    choose your command  -> Browser Commands
        Select seleniumCommandsSelect = new Select(driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]")));
        seleniumCommandsSelect.selectByVisibleText("Browser Commands");

        //    click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();

    }
}
