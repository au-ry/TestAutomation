package apptestting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hover {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test(description = "Hover simple")
    public void test1(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions action = new Actions(driver);
        WebElement btn = driver.findElement(By.id("mousehover"));
        action.moveToElement(btn).perform();
        WebElement submenu = driver.findElement(By.linkText("Top"));
        action.moveToElement(submenu).perform();
        submenu.click();
    }
    @Test(description = "hover avanzado")
    public void test2(){
        driver.get("https://demoqa.com/menu/");

        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(By.linkText("Main Item 2"));
        action.moveToElement(menu).perform();

        WebElement submenu = driver.findElement(By.linkText("SUB SUB LIST »"));
        action.moveToElement(submenu).perform();

        WebElement submenu1 = driver.findElement(By.linkText("Sub Sub Item 1"));
        action.moveToElement(submenu1).perform();
        submenu1.click();

    }

    @Test(description = "slider")
    public void test3(){



        driver.get("https://demoqa.com/slider/");


        WebElement slider = driver.findElement(By.tagName("input"));
        WebElement value = driver.findElement(By.id("sliderValue"));

        for (int i = 0; i < 70; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }












    }



    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
