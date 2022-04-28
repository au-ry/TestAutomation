package apptestting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        String pagina = "https://shop.demoqa.com/";
        driver.get(pagina);
        String title =driver.getTitle();
        String url = driver.getCurrentUrl();
        int largo = driver.getTitle().length();

        System.out.println("El titulo es: "+title+" y el largo es: "+largo);

        if (url.equals(pagina)){
            System.out.println("PAGINA CORRECTA");
        }
        else{
            System.out.println("La pagina esperada era: "+pagina+" y la que obtuvimos fue: "+url);

        }

        int source =driver.getPageSource().length();
        System.out.println("El largo de la pagina es: "+source);


        driver.quit();
    }
}
