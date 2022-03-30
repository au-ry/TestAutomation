package apptestting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;
import org.testng.reporters.*;

import java.io.File;
import java.io.IOException;

public class test2 {
public WebDriver driver;

            @BeforeMethod

            public void setup() {
            System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            }

            @Test
            public void  testSteps1(){

            //driver.get("https://www.google.com/");
            driver.navigate().to("https://www.goodreads.com/user/sign_in");

            driver.findElement(By.id("user_email")).sendKeys("aury@hotmail.com");
            driver.findElement(By.id("user_password")).sendKeys("pass");
            driver.findElement(By.name("next")).click();
            //Thread.sleep(6000);

}
            @Test
            void testSteps2(){
            driver.navigate().to("https://www.goodreads.com/user/sign_in");

            driver.findElement(By.id("user_email")).sendKeys("Natalie@hotmail.com");
            driver.findElement(By.id("user_password")).sendKeys("Pass12345678");
            driver.findElement(By.name("next")).click();

            }
            @AfterMethod

            public void tearDown() throws IOException {

               driver.quit();
                File file = new File("C:\\Users\\aury_\\IdeaProjects\\testsproject\\test-output\\Default Suite\\testsproject.html");
                Desktop desktop = Desktop.getDesktop();
                if (file.exists()) //checks file exists or not
                    desktop.open(file); //opens the specified file

           }












    }
