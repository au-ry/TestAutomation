package apptestting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/large");
        WebElement table = driver.findElement(By.id("large-table"));
        String script = "arguments[0].scrollIntoView();";
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript(script,table);


    }
}
