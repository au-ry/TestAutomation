package apptestting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise2
{
    public static void main(String[] args) { //BROWSER COMMANDS
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        String pagina ="https://demoqa.com/browser-windows/";
        driver.get(pagina);
        driver.findElement(By.id("tabButton")).click();


        driver.close();
    }



}
