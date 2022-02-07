package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class Activity1 {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(30,TIMEUNIT.SECONDS);

        //a. Open browser
        //b.Navigate to ‘http://alchemy.hguy.co/crm’
        driver.get("https://alchemy.hguy.co/crm/");
        driver.manage().window().maximize();

    }

    @Test
    public void testsetup(){

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
    }

    @Test
    public void activity1Method(){

//c.Get the title of the website.
        String pageTitle=driver.getTitle();
        System.out.println("Page Title is: "+ pageTitle);
        boolean status = Assert.assertEquals(pageTitle,"SuiteCRM");
       //d. Make sure it matches “SuiteCRM” exactly
        if(status==true){
//e.If it matches, close the browser.
            driver.close();
        }
    }

    @AfterClass
    public void afterMethod(){

// clean-up tests
        driver.quit();
    }

}
