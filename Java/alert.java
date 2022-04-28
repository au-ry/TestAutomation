package apptestting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.tree.ExpandVetoException;
import java.time.Duration;

public class alert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        WebElement btn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        WebElement btn2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        WebElement btn3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        WebElement btn4 = driver.findElement(By.xpath("//button[@id='promtButton']"));

        btn1.click();
        String text =driver.switchTo().alert().getText();
        driver.switchTo( ).alert( ).accept();
        System.out.println(text);


        try {
            btn2.click();
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();

        } catch (Exception e) {
            e.printStackTrace();
        }

        btn3.click();
        driver.switchTo().alert().dismiss();

        btn4.click();
        driver.switchTo().alert().sendKeys("Aury");
        driver.switchTo().alert().accept();


        //driver.get("https://the-internet.herokuapp.com/entry_ad");
        //driver.findElement(By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@id='modal']/div[@class='modal']/div[@class='modal-footer']/p")).click();

        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("hot-spot"));
        actions.contextClick(elementLocator).perform();
        driver.switchTo().alert().accept();


    }
}
