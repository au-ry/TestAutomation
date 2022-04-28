package apptestting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filesubmit {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement file = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        file.sendKeys("C://Users//Aury//Downloads//photo5073618685100403203.jpg");

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement file1 = driver.findElement(By.xpath("//input[@id='file-upload']"));
        file1.sendKeys("C://Users//Aury//Downloads//photo5073618685100403203.jpg");

        WebElement btn = driver.findElement(By.xpath("//input[@id='file-submit']"));
        btn.click();



    }

}
