package apptestting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.support.ui.Select;

public class test3 {
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
        driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");

        driver.findElement(By.name("tripType")).click();

        
    }
   
    @AfterMethod

    public void tearDown() throws IOException {

        driver.quit();
       // File file = new File("C:\\Users\\aury_\\IdeaProjects\\testsproject\\test-output\\Default Suite\\testsproject.html");
        //Desktop desktop = Desktop.getDesktop();
       // if (file.exists()) //checks file exists or not
           // desktop.open(file); //opens the specified file

    }


}
