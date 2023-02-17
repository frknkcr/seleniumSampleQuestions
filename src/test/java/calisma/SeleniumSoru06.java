package calisma;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumSoru06 {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown(){
        driver.close();
    }

    @Test
    public void test01(){

        //a. Verilen web sayfasına gidin.
        //https://facebook.com
        driver.get("https://facebook.com");

        //b. Cookies’i kabul edin
        //c. Create an account buton’una basin
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        //d. Radio button elementlerini locate edin ve size uygun olani secin
        Select birthdayDayElement = new Select(driver.findElement(By.name("birthday_day")));
        birthdayDayElement.selectByVisibleText("1");

        Select birthdayMonthElement = new Select(driver.findElement(By.name("birthday_month")));
        birthdayMonthElement.selectByVisibleText("Ağu");

        Select birthdayYearElement = new Select(driver.findElement(By.name("birthday_year")));
        birthdayYearElement.selectByVisibleText("1995");

        driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();

    }

}
