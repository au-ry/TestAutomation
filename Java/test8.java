package apptestting;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.print.PrintOptions;

public class test7 {
    public WebDriver driver;
    ArrayList<String> tabs;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(414, 896));

        driver.navigate().to("http://demo-store.seleniumacademy.com/");

        JavascriptExecutor javas = (JavascriptExecutor)driver;
        String google = "window.open('https://www.google.com/')";
        javas.executeScript(google);



        tabs = new ArrayList<String>(driver.getWindowHandles());
        //para que dure mas abierto
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){


        driver.switchTo().window(tabs.get(1)).navigate().to("https://mail.google.com/mail/u/0/?ogbl#inbox");
        driver.switchTo().window(tabs.get(0)).navigate().to("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
    }


    @AfterMethod
    public void tearDown(){

        driver.quit();
        //driver.switchTo().window(tabs.get(0)).close();
        //driver.switchTo().window(tabs.get(1)).close();
    }
}
