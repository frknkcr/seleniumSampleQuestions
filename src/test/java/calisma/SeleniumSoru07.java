package calisma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumSoru07 {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown(){
        //    close driver
        driver.close();
    }


    @Test
    public void test01(){

        //    Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //    Under the ORIGINAL CONTENTS
        //    click on Alerts
        //    print the URL
        driver.findElement(By.xpath("//*[@id='alerts']")).click();
        System.out.println("Alerts Url: "+driver.getCurrentUrl());

        //    navigate back
        //    print the URL
        driver.navigate().back();
        System.out.println("Main manu Url: "+driver.getCurrentUrl());

        //    Click on Basic Ajax
        //    print the URL
        driver.findElement(By.xpath("//*[@id='basicajax']")).click();
        System.out.println("Basic Ajax Url: "+driver.getCurrentUrl());

        //    enter value 20 and ENTER
        driver.findElement(By.xpath("//*[@id='lteq30']")).sendKeys("20"+ Keys.ENTER);

        //    and then verify Submitted Values is displayed open page
        Assert.assertEquals("Degerler ayni degil","20", driver.findElement(By.id("_valuesubmitbutton")).getText());









    }


}
