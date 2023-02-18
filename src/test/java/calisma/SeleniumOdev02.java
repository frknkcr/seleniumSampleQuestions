package calisma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumOdev02 {

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
        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

        //Type any number in the first input
        String firstInput = "21";
        driver.findElement(By.xpath("//*[@id='number1']")).sendKeys(firstInput);

        //Type any number in the second input
        String secondInput = "12";
        driver.findElement(By.xpath("//*[@id='number2']")).sendKeys(secondInput);

        //Click on Calculate
        driver.findElement(By.id("calculate")).click();

        //Get the result
        //Print the result
        String result = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        System.out.println("Islem sonucu: "+result);

        // islemin dogru oldugunu test et
        int total = Integer.parseInt(firstInput)+Integer.parseInt(secondInput);
        Assert.assertEquals(total, Integer.parseInt(result));
    }
}
