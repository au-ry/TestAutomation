package apptestting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class exercise5 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

        Select select   = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByIndex(5);
        select.selectByValue("10");
        select.selectByVisibleText("Voilet");

        ///imprimir opciones
        List<WebElement> lst = select.getOptions();
        System.out.println("Las opciones son :");
        for(WebElement opciones: lst)
            System.out.println(opciones.getText());

        Select multi = new Select(driver.findElement(By.id("cars")));
        if (multi.isMultiple()) {
            multi.selectByIndex(1);
            multi.selectByIndex(2);

            List<WebElement> lista = multi.getOptions();
            System.out.println("Las opciones son :");

            for (WebElement opciones:lista)
                System.out.println(opciones.getText());
        }

        multi.deselectAll();


        //driver.quit();




    }

}
