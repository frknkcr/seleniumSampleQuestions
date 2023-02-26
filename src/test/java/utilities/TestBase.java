package utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class TestBase {

    public WebDriver driver;
    public ChromeOptions options;

    @Before
    public void setup(){
        options = new ChromeOptions();
        options.addExtensions(new File("uBlock.crx"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown(){
        //driver.close();
    }

    public void sleep(int saniye){
        try {
            Thread.sleep(Duration.ofSeconds(saniye));
        } catch (InterruptedException e) {

        }
    }
}
