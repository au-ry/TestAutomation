package apptestting;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static org.testng.Assert.assertEquals;

public class Selenium4 {
    WebDriver driver;
    DevTools devTools;
    SoftAssert soft = new SoftAssert();
    int num1 =10;
    int num2 =5;

    @BeforeMethod
   public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.get("http://automationpractice.com/index.php");
        System.out.println(driver.getTitle());

   }


   // para obtener posicion elemento document.getElementById('logInPanelHeading').getBoundingClientRect()
   /*@Test(priority = 2, description ="credentials")
    public void test1(){

        WebElement loginPanel = driver.findElement(By.id("logInPanelHeading"));
        WebElement credentials = driver.findElement(with(By.tagName("span")).above(loginPanel));
        System.out.println(credentials.getText());

    }
    @Test( groups = "test",priority = 1)
    public void test2(){
        List<WebElement> allSocialMedia =driver.findElements(with(By.tagName("img")).near(By.id("footer")));
    for (WebElement socialmedia:allSocialMedia){
        System.out.println(socialmedia.getAttribute("alt"));
    }
    }
    @Test(groups = "test",dependsOnMethods ="test2")
    public void test3(){
    assertEquals(num1-5,num2);

    }
*/
    @Test
    public void test4(){
        WebDriver window = driver.switchTo().newWindow(WindowType.WINDOW);
        window.get("http://automationpractice.com/index.php");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test5(){
        driver.switchTo().newWindow(WindowType.TAB).get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        System.out.println(driver.getTitle());
        WebElement text = driver.findElement(By.id("email_create"));
        WebElement btn = driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
        text.sendKeys("aury@yahoo.com");
        btn.click();

        Set<String> all= driver.getWindowHandles();
        Iterator<String> it = all.iterator();
        String first  =it.next();

        driver.switchTo().window(first);

        WebElement search = driver.findElement(By.id("search_query_top"));
        WebElement btn2 = driver.findElement(By.name("submit_search"));
        search.sendKeys("dress");
        btn2.click();
        System.out.println(driver.getTitle());


        WebElement img = driver.findElement(By.xpath("//div[@id='header_logo']/a/img"));
       Rectangle rec = img.getRect();
        System.out.println(rec.getX());
        System.out.println(rec.getY());
        System.out.println(rec.getWidth());
        System.out.println(rec.getHeight());

    }



    @AfterMethod
    public void tearDown(ITestResult result){

        if(result.isSuccess()){
            //toma la captura
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            try {
                //guarda la captura
                FileUtils.copyFile(scrFile, new File("TEST-"+System.currentTimeMillis()+".png"));
            }
            catch (IOException e)
            {
                //captura cualquier error
                e.printStackTrace();
            }

            driver.quit();

        }}}
